package com.wecare.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wecare.DTO.CoachDTO;
import com.wecare.Service.CoachService;

@RestController
@CrossOrigin
@RequestMapping(value = "/coach")
public class CoachController {
	
	@Autowired
	private CoachService coachService;
	
	
	@PostMapping(value = "/addcoach")
	public ResponseEntity<Integer> addCoach(@RequestBody CoachDTO coachDTO) {
		Integer CoachId = coachService.addCoach(coachDTO);
		return new ResponseEntity<>(CoachId,HttpStatus.OK);
	}
	
	@GetMapping(value = "/allcoaches")
	public ResponseEntity<List<CoachDTO>> getAllCoaches(){
		List<CoachDTO> coachesList = coachService.getAllCoaches();
		return new ResponseEntity<>(coachesList,HttpStatus.OK);
	}
	
	@GetMapping(value = "/coachprofile/{coachId}")
	public ResponseEntity<CoachDTO> getCoachById(@PathVariable Integer coachId){
		CoachDTO coachDTO = coachService.getCoachById(coachId);
		return new ResponseEntity<>(coachDTO,HttpStatus.OK);
	}
	
	@PutMapping(value = "/updatecoach/{coachId}")
	public void updateCoach(@PathVariable Integer coachId, @RequestBody CoachDTO coachDTO) {
		coachService.updateCoach(coachId, coachDTO.getCoachName());
	}
	
	@DeleteMapping(value = "/deletecoach/{coachId}")
	public void deleteCoach(@PathVariable Integer coachId) {
		coachService.deleteCoach(coachId);
	}
	
	@GetMapping(value = "/coachesbasedonspeciality/{speciality}")
	public ResponseEntity<List<CoachDTO>> findBySpeciality(@PathVariable String speciality){
		List<CoachDTO> coachesDTOList = coachService.findBySpeciality(speciality);
		return new ResponseEntity<>(coachesDTOList,HttpStatus.OK);
	}

}
