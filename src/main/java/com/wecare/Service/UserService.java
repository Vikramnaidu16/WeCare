package com.wecare.Service;

import java.util.List;

import com.wecare.DTO.UserDTO;

public interface UserService {
	
	public Integer addUser(UserDTO userDTO);
	
	public List<UserDTO> getAllUsers();
	
	public UserDTO getUserById(Integer userId);
	
	public void updateUser(Integer userId, String emailId);
	
	public void deleteUser(Integer userId);

}
