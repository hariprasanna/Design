package org.example.entity;

import org.example.entity.task.Task;

import java.util.HashMap;
import java.util.Map;

public class Sprint {
    Map<String, Task> tasksMap;
    public Sprint() {
        tasksMap = new HashMap<>();
    }


}