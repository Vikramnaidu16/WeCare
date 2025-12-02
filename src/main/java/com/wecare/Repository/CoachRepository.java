package com.wecare.Repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wecare.Entity.CoachEntity;

@Repository
public interface CoachRepository extends CrudRepository<CoachEntity, Integer>{
	
	public CoachEntity findByMobileNumber(Long mobileNumber);
	
	public List<CoachEntity> findBySpeciality(String specilaity);

}
