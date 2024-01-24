package com.example.demo.service;

import com.example.demo.entity.Task;
import com.example.demo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImplementation implements TaskService {

    @Autowired
    TaskRepository taskRepository;

    @Override
    public Task getTask(Long id) {

        return taskRepository.findById(id).get();
    }

    @Override
    public Task saveTask(Task task) {
        taskRepository.save(task);
        return task;
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    @Override
    public List<Task> getTasks() {
        return (List<Task>) taskRepository.findAll();
    }


}
