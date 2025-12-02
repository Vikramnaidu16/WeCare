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

import com.wecare.DTO.UserDTO;
import com.wecare.Service.UserService;

@RestController
@CrossOrigin
@RequestMapping(value = "user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/adduser")
	public ResponseEntity<Integer> addUser(@RequestBody UserDTO userDTO){
		Integer userId = userService.addUser(userDTO);
		return new ResponseEntity<>(userId, HttpStatus.OK);
	}
	
	@GetMapping(value = "allusers")
	public ResponseEntity<List<UserDTO>> getAllUsers(){
		List<UserDTO> usersList = userService.getAllUsers();
		return new ResponseEntity<>(usersList, HttpStatus.OK);
	}
	
	@GetMapping(value = "/userprofile/{userId}")
	public ResponseEntity<UserDTO> getUserById(@PathVariable Integer userId){
		UserDTO userDTO = userService.getUserById(userId);
		return new ResponseEntity<>(userDTO, HttpStatus.OK);
	}
	
	@PutMapping(value = "/updateuser/{userId}")
	public void updateUser(@PathVariable Integer userId, @RequestBody UserDTO userDTO) {
		userService.updateUser(userId, userDTO.getEmailId());
	}
	
	@DeleteMapping(value = "/deleteuser/{userId}")
	public void deleteUser(@PathVariable Integer userId) {
		userService.deleteUser(userId);
	}

}
