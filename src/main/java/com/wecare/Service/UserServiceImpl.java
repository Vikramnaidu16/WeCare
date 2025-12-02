package com.wecare.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecare.DTO.UserDTO;
import com.wecare.Entity.UserEntity;
import com.wecare.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public Integer addUser(UserDTO userDTO) {
		UserEntity userEntity = new UserEntity();
		userEntity.setUserId(userDTO.getUserId());
		userEntity.setUserName(userDTO.getUserName());
		userEntity.setPassword(userDTO.getPassword());
		userEntity.setCity(userDTO.getCity());
		userEntity.setCountry(userDTO.getCountry());
		userEntity.setDateOfBirth(userDTO.getDateOfBirth());
		userEntity.setEmailId(userDTO.getEmailId());
		userEntity.setGender(userDTO.getGender());
		userEntity.setMobileNumber(userDTO.getMobileNumber());
		userEntity.setPinCode(userDTO.getPinCode());
		userEntity.setState(userDTO.getState());
		userRepository.save(userEntity);
		UserEntity newUserEntity = userRepository.findByMobileNumber(userDTO.getMobileNumber());
		return newUserEntity.getUserId();
		
	}

	@Override
	public List<UserDTO> getAllUsers() {
		List<UserEntity> usersList = (List<UserEntity>) userRepository.findAll();
		List<UserDTO> userDTOList = new ArrayList<>();
		for(UserEntity userEntity: usersList) {
			UserDTO userDTO = new UserDTO();
			userDTO.setCity(userEntity.getCity());
			userDTO.setCountry(userEntity.getCountry());
			userDTO.setDateOfBirth(userEntity.getDateOfBirth());
			userDTO.setEmailId(userEntity.getEmailId());
			userDTO.setGender(userEntity.getGender());
			userDTO.setMobileNumber(userEntity.getMobileNumber());
			userDTO.setPassword(userEntity.getPassword());
			userDTO.setPinCode(userEntity.getPinCode());
			userDTO.setState(userEntity.getState());
			userDTO.setUserId(userEntity.getUserId());
			userDTOList.add(userDTO);
		}
		return userDTOList;
	}

	@Override
	public UserDTO getUserById(Integer userId) {
		Optional<UserEntity> userEntity = userRepository.findById(userId);
		UserDTO userDTO = new UserDTO();
		userDTO.setCity(userEntity.get().getCity());
		userDTO.setCountry(userEntity.get().getCountry());
		userDTO.setDateOfBirth(userEntity.get().getDateOfBirth());
		userDTO.setEmailId(userEntity.get().getEmailId());
		userDTO.setGender(userEntity.get().getGender());
		userDTO.setMobileNumber(userEntity.get().getMobileNumber());
		userDTO.setPassword(userEntity.get().getPassword());
		userDTO.setPinCode(userEntity.get().getPinCode());
		userDTO.setState(userEntity.get().getState());
		userDTO.setUserId(userEntity.get().getUserId());
		userDTO.setUserName(userEntity.get().getUserName());
		return userDTO;
	}

	@Override
	public void updateUser(Integer userId, String emailId) {
		Optional<UserEntity> userOptional = userRepository.findById(userId);
		UserEntity userEntity = userOptional.orElseThrow();
		userEntity.setEmailId(emailId);
		userRepository.save(userEntity);
	}

	@Override
	public void deleteUser(Integer userId) {
		userRepository.deleteById(userId);
		
	}

}
