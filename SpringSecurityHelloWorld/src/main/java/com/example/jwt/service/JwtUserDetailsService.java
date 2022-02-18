package com.example.jwt.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// User user=dao.findByUsername(username)
		if ("priya".equals(username)) {
			return new User("priya",
					"$2a$12$G/hrgYErF6BTN.9OOQrdYOKtdPNicpp0Xh/Jvrjw.vqzNFfxGNykm"
					+ "",
					new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}


}