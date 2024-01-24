package com.example.demo.controller;

import com.example.demo.entity.Task;
import com.example.demo.service.TaskService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "Task Manager")
public class TaskController {
    @Autowired
    TaskService taskService;
    @Operation(summary = "Get Specific Task")
    @GetMapping("/task/{taskid}")
    public ResponseEntity<Task> getTask(@PathVariable Long taskid)
    {
        return new ResponseEntity<>(taskService.getTask(taskid), HttpStatus.OK);
    }
    @Operation(summary = "Create Task",description = "")
    @PostMapping("/task")
    public ResponseEntity<Task> createTask(@RequestBody Task task)
    {
        taskService.saveTask(task);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @Operation(summary = "Delete specific Task")
    @DeleteMapping("/task/{taskid}")
    public ResponseEntity<HttpStatus> deleteTask(@PathVariable Long taskid)
    {
        taskService.deleteTask(taskid);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @Operation(summary = "Get all Tasks in DB")
    @GetMapping("/tasks")
    public ResponseEntity<List<Task>> getTasks()
    {
        return new ResponseEntity<>(taskService.getTasks(),HttpStatus.OK);
    }


}
