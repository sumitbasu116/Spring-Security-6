package co.sumit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.sumit.entity.User;
import co.sumit.service.UserService;


@RestController
public class UserController {

	@Autowired
	private UserService userService;
	@PostMapping("/register")
	public User postMethodName(@RequestBody User user) {
		
		return userService.registerUser(user);
	}
	
	@PostMapping("/login")
	public String login(@RequestBody User user) {
		
		return userService.fetchUserDetail(user);
	}
	
}
