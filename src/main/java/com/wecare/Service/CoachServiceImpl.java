package com.wecare.Service;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecare.DTO.CoachDTO;
import com.wecare.Entity.CoachEntity;
import com.wecare.Repository.CoachRepository;

@Service
public class CoachServiceImpl implements CoachService {
	
	@Autowired
	private CoachRepository coachRepository;


	@Override
	public Integer addCoach(CoachDTO coachDTO) {
		CoachEntity exstingCoach = coachRepository.findByMobileNumber(coachDTO.getMobileNumber());
		if(exstingCoach != null) {
			return 0;
		}else {
			CoachEntity coachEntity = new CoachEntity();
			coachEntity.setCoachId(coachDTO.getCoachId());
			coachEntity.setCoachName(coachDTO.getCoachName());
			coachEntity.setDateOfBirth(coachDTO.getDateOfBirth());
			coachEntity.setGender(coachDTO.getGender());
			coachEntity.setMobileNumber(coachDTO.getMobileNumber());
			coachEntity.setPassword(coachDTO.getPassword());
			coachEntity.setSpeciality(coachDTO.getSpeciality());
			CoachEntity savedCoach = coachRepository.save(coachEntity);
			return savedCoach.getCoachId();
		}
	}


	@Override
	public List<CoachDTO> getAllCoaches() {
		List<CoachEntity> coachsList= (List<CoachEntity>) coachRepository.findAll();
		List<CoachDTO> coachDTOList = new ArrayList<>();
		for (CoachEntity coachentity : coachsList) {
			CoachDTO coachDTO = new CoachDTO();
			coachDTO.setCoachId(coachentity.getCoachId());
			coachDTO.setCoachName(coachentity.getCoachName());
			coachDTO.setDateOfBirth(coachentity.getDateOfBirth());
			coachDTO.setGender(coachentity.getGender());
			coachDTO.setMobileNumber(coachentity.getMobileNumber());
			coachDTO.setPassword(coachentity.getPassword());
			coachDTO.setSpeciality(coachentity.getSpeciality());
			coachDTOList.add(coachDTO);	
		}
		return coachDTOList;
	}


	@Override
	public CoachDTO getCoachById(Integer coachId) {
		Optional<CoachEntity> coachOptional = coachRepository.findById(coachId);
		CoachDTO coachDTO = new CoachDTO();
		coachDTO.setCoachId(coachOptional.get().getCoachId());
		coachDTO.setCoachName(coachOptional.get().getCoachName());
		coachDTO.setDateOfBirth(coachOptional.get().getDateOfBirth());
		coachDTO.setGender(coachOptional.get().getGender());
		coachDTO.setMobileNumber(coachOptional.get().getMobileNumber());
		coachDTO.setPassword(coachOptional.get().getPassword());
		coachDTO.setSpeciality(coachOptional.get().getSpeciality());
		return coachDTO;
	}


	@Override
	public void updateCoach(Integer coachId, String coachName) {
		Optional<CoachEntity> coachOptional = coachRepository.findById(coachId);
		CoachEntity coachEntity = coachOptional.orElseThrow();
		coachEntity.setCoachName(coachName);
		coachRepository.save(coachEntity);
	}


	@Override
	public void deleteCoach(Integer coachId) {
		coachRepository.deleteById(coachId);
		
	}


	@Override
	public List<CoachDTO> findBySpeciality(String speciality) {
		List<CoachEntity> coachesList = coachRepository.findBySpeciality(speciality);
		List<CoachDTO> coachesDTOList = new LinkedList<>();
		for(CoachEntity coach : coachesList) {
			CoachDTO coachDTO = new CoachDTO();
			coachDTO.setCoachId(coach.getCoachId());
			coachDTO.setCoachName(coach.getCoachName());
			coachDTO.setDateOfBirth(coach.getDateOfBirth());
			coachDTO.setGender(coach.getGender());
			coachDTO.setMobileNumber(coach.getMobileNumber());
			coachDTO.setPassword(coach.getPassword());
			coachDTO.setSpeciality(coach.getSpeciality());
			coachesDTOList.add(coachDTO);
		}
		return coachesDTOList;
	}

}
