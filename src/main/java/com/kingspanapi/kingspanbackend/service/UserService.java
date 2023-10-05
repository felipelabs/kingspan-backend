package com.kingspanapi.kingspanbackend.service;


import com.kingspanapi.kingspanbackend.entity.User;
import com.kingspanapi.kingspanbackend.exception.UseNotFoundException;
import com.kingspanapi.kingspanbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            return userOptional.get();
        } else throw new UseNotFoundException(id);
    }

    public User updateUserById(Long id, User updatedUser) {
        Optional<User> userOptional = userRepository.findById(id);

        if (userOptional.isPresent()) {
            User existingUser = userOptional.get();

            existingUser.setName(updatedUser.getName());
            existingUser.setUsername(updatedUser.getUsername());
            existingUser.setEmail(updatedUser.getEmail());

            return userRepository.save(existingUser);
        } else {
            throw new UseNotFoundException(id);
        }
    }

    public void deleteUserById(Long id) {
        Optional<User> userOptional = userRepository.findById(id);

        if (userOptional.isPresent()) {
            User existingUser = userOptional.get();
            userRepository.delete(existingUser);
        } else {
            throw new UseNotFoundException(id);
        }
    }
}
