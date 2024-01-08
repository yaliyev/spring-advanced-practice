package az.developia.july30.jwt.jwtsessionapplicationrest.service;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import az.developia.july30.jwt.jwtsessionapplicationrest.model.User;
import az.developia.july30.jwt.jwtsessionapplicationrest.repository.UserRepository;

@Service
public class UserService {
	// implements UserDetailsService
	
	@Autowired
	private UserRepository userRepository;

//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		User user = userRepository.findByUsername(username);
//		if(user == null) {
//			throw new UsernameNotFoundException("User not found");
//		}
//		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), Collections.singleton(new SimpleGrantedAuthority("ROLE_USER")));		
//	}
  
}
