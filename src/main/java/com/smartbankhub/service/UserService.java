package com.smartbankhub.service;

import com.smartbankhub.entity.User;
import java.util.List;

public interface UserService {

    User createUser(User user);

    User getUserById(Long id);

    User getUserByEmail(String email);

    List<User> getUsersByRole(String role);
}

