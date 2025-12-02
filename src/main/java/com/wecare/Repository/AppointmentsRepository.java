package com.wecare.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wecare.Entity.AppointmentsEntity;

@Repository
public interface AppointmentsRepository extends CrudRepository<AppointmentsEntity, Integer>{
	
	public List<AppointmentsEntity> findByUserId(Integer userId);
	
	public List<AppointmentsEntity> findByCoachId(Integer coachId);

}
