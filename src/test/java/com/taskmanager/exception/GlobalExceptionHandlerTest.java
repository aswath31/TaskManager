package com.taskmanager.exception;

import com.taskmanager.controller.TaskController;
import com.taskmanager.service.TaskService;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.taskmanager.exception.TaskNotFoundException;

@WebMvcTest(controllers = TaskController.class)
public class GlobalExceptionHandlerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TaskService taskService;

    @Test
    void shouldReturnNotFoundWhenTaskNotExists() throws Exception {
        // Arrange: Mock service to throw the exception
        Mockito.when(taskService.getTaskById(1L))
               .thenThrow(new TaskNotFoundException("Task not found"));

        // Act & Assert
        mockMvc.perform(get("/api/tasks/1"))
                .andExpect(status().isNotFound())
                .andExpect(content().string("Task not found"));
    }
}
