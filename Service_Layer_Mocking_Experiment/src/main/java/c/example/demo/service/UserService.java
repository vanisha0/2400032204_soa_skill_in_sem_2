package c.example.demo.service;

import org.springframework.stereotype.Service;
import c.example.demo.model.User;

@Service
public class UserService {

    public User getUserById(Long id) {
        // Sample service response for this experiment.
        // The controller unit test replaces this service with a Mockito mock.
        return new User(id, "Vanisha", "vanisha@gmail.com");
    }
}
