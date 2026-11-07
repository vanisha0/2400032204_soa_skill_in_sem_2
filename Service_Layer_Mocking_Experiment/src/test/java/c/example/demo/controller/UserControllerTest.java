package c.example.demo.controller;

import c.example.demo.model.User;
import c.example.demo.service.UserService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@WebMvcTest(UserController.class)
class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    // Replace the real UserService bean with a Mockito mock.
    @MockitoBean
    private UserService userService;

    @Test
    void testGetUser() throws Exception {

        // Arrange: define the mock service response.
        User user = new User(1L, "Vanisha", "vanisha@gmail.com");

        when(userService.getUserById(1L)).thenReturn(user);

        // Act and assert: call the controller and verify its response.
        mockMvc.perform(get("/api/users/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.username").value("Vanisha"))
                .andExpect(jsonPath("$.email").value("vanisha@gmail.com"));
    }
}
