package com.wecare.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wecare.Entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer>{
	
	public UserEntity findByMobileNumber(Long mobileNumber);

}
