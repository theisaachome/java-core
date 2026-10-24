package com.isaachome.study;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

//Handles incoming JSON requests that work on User resource/entity
public class UserController {
	//Store used by controller
    private UserPersistenceService userService = new UserPersistenceService();

    
    //Create a new user
    public String createUser(String userJson) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        
        User user = mapper.readValue(userJson, User.class);
        UserValidator validator = new UserValidator();
        var isValid = validator.validate(user);

        if(!isValid) {
            return "ERROR: Invalid user data.";
        }
        userService.saveUser(user);
        return "SUCCESS";
    } 

}