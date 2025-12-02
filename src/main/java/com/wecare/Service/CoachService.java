package com.wecare.Service;


import java.util.List;

import com.wecare.DTO.CoachDTO;

public interface CoachService {
	
	public Integer addCoach(CoachDTO coachDTO);
	
	public List<CoachDTO> getAllCoaches();
	
	public CoachDTO getCoachById(Integer coachId);
	
	public void updateCoach(Integer coachId, String coachName);
	
	public void deleteCoach(Integer coachId);
	
	public List<CoachDTO> findBySpeciality(String speciality);

}
