package com.heima.schedule.service.impl;

import com.heima.model.schedule.dtos.Task;
import com.heima.schedule.service.TaskService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author
 * @version:1.0
 * @description
 * @create 2024-08-11
 */
@SpringBootTest
class TaskServiceImplTest {
    @Autowired
    private TaskService taskService;
    
    @Test
    void addTask() {
        Task task = new Task();
        task.setTaskType(100);
        task.setPriority(50);
        task.setParameters("task test".getBytes());
        task.setExecuteTime(new Date().getTime() + 500);
        long taskId = taskService.addTask(task);
        System.out.println(taskId);
        
    }
    @Test
    public void cancelTask() {
        taskService.cancelTask(1822633264715132929L);
    }
    @Test
    public void poll() {
        Task task = taskService.poll(100, 50);
        System.out.println(task);
    }
}