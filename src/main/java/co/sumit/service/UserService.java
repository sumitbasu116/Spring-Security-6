package co.sumit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.sumit.entity.User;
import co.sumit.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User registerUser(User user) {
		User savedUser = userRepository.save(user);
		return savedUser;
	}
	
	public String fetchUserDetail(User user) {
		List<User> byUsername = userRepository.findByUsername(user.getUsername());
		
		if(byUsername!=null&&!byUsername.isEmpty()) {
			return "success";
		}
		return "failure";
	}
	
}
