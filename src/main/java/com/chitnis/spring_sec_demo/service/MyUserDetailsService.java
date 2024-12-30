package com.chitnis.spring_sec_demo.service;

import com.chitnis.spring_sec_demo.dao.UserRepo;
import com.chitnis.spring_sec_demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo repo;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = repo.findByUsername(username);
        if (user == null) {
            System.out.println("user not found  404");
            throw new UsernameNotFoundException("User not found 404");
        }

        return null;
    }

}