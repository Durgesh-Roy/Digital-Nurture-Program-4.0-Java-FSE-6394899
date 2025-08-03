package com.example.service;

import com.example.model.User;
import com.example.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Test
    void testGetUserNameById_returnsName_whenUserExists() {
        UserRepository mockRepo = mock(UserRepository.class);
        when(mockRepo.findById(1L)).thenReturn(new User(1L, "Alice"));
        UserService service = new UserService(mockRepo);
        String name = service.getUserNameById(1L);
        assertEquals("Alice", name);
    }

    @Test
    void testGetUserNameById_returnsNotFound_whenUserDoesNotExist() {
        UserRepository mockRepo = mock(UserRepository.class);
        when(mockRepo.findById(2L)).thenReturn(null);
        UserService service = new UserService(mockRepo);
        String name = service.getUserNameById(2L);
        assertEquals("User not found", name);
    }
}
