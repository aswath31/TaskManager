package com.taskmanager.service;

import java.util.List;

import com.taskmanager.dto.TaskRequestDto;
import com.taskmanager.dto.TaskResponseDto;

public interface TaskService {
    TaskResponseDto createTask(TaskRequestDto dto);
    TaskResponseDto getTaskById(Long id);
    List<TaskResponseDto> getAllTasks();
    TaskResponseDto updateTask(Long id, TaskRequestDto dto);
    void deleteTask(Long id);
}