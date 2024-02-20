package com.demo.controller;


import com.demo.service.FreeMarkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Controller
public class TaskController {

    private final FreeMarkerService freeMarkerService;

    @Autowired
    public TaskController(FreeMarkerService freeMarkerService) {
        this.freeMarkerService = freeMarkerService;
    }

    @GetMapping("/")
    public String showForm() {
        System.out.println("showing form...");
        return "taskForm";
    }

    @PostMapping("/submitTask")
    public String submitTask(@RequestParam String taskName, @RequestParam String taskDescription, @RequestParam String dueDate, @RequestParam String priority, Model model) {
        //We create a dataModel Map containing the form data, then use FreeMarkerService to generate the content.
        //The generated content is added to the model under the attribute "content".

        //Prepare the model data
        Map<String, Object> dataModel = new HashMap<>();
        dataModel.put("taskName", taskName);
        dataModel.put("taskDescription", taskDescription);
        dataModel.put("dueDate", dueDate);
        dataModel.put("priority", priority);

        //Generate content using FreeMarker
        try {
            String content = freeMarkerService.generateContent(dataModel, "taskTemplate.ftl");
            model.addAttribute("content", content);
        } catch (Exception e) {
            e.printStackTrace();
            return "errorPage";
        }
        return "generatedTemplate";
    }
}
