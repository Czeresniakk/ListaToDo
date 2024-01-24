package com.example.demo.service;

import com.example.demo.entity.Task;

import java.util.List;

public interface TaskService {

    Task getTask(Long taskid);
    Task saveTask(Task task);
    void deleteTask(Long id);
    List<Task> getTasks();



}
