package com.shantanu.auth.service;

import com.shantanu.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
