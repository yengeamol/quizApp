package com.quizApp.amol.Service;

import java.util.List;
import java.util.Set;

import com.quizApp.amol.Model.User;
import com.quizApp.amol.Model.userRole;


public interface userService {

    public User createUser(User user, Set<userRole> userRoles) throws Exception;
    public User getUser(String username);
    public List<User> deleteUser(Long id);

    public List<User> getAllUsers();
    public User updateUser(Long id,User existUser) throws Exception;
}
