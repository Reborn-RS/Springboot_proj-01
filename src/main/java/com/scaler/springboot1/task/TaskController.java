package com.scaler.springboot1.task;

//import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    List<Task> taskList = new ArrayList<Task>();
    private int nextTaskId = 1;
    @GetMapping("")
    List<Task> getAllTasks(){
        return taskList;
    }

    @PostMapping("")
    Task createTask (@RequestBody Task task){
        task.setId(nextTaskId++);
        taskList.add(task);
        return task;
    }

    @GetMapping("/{id}")
    Task getTaskById (@PathVariable("id") Integer id){
        Task foundTask = taskList.stream().filter(task -> task.getId().equals(id)).findFirst().orElse(null);
        return foundTask;
    }

}
