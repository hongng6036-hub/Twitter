package com.tts.TechTalentTwitter0701.service;

import com.tts.TechTalentTwitter0701.model.User;
import java.util.List;

public interface UserService {

    User findByUsername(String username);
    List<User> findAll();
    void save(User user);
    User saveNewUser(User user);
    User getLoggedInUser();

}