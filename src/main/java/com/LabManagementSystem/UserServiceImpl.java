package com.LabManagementSystem;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository)
    {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserDto userDto) {
        
        User user = new User(
            
            userDto.getFirstName(), 
			userDto.getLastName(), 
            userDto.getEmail(),
			userDto.getPassword());
		
		return userRepository.save(user);
    }
}