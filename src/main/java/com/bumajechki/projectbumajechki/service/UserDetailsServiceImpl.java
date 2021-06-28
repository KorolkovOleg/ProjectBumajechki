package com.bumajechki.projectbumajechki.service;

import com.bumajechki.projectbumajechki.domain.User;
import com.bumajechki.projectbumajechki.repositories.UserRepository;
import com.bumajechki.projectbumajechki.security.CustomSecurityUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("Invalid Username and Password");
        }

        return new CustomSecurityUser(user);
    }
}
