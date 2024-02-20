package com.demo.service;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.StringWriter;
import java.util.Map;


@Service
public class FreeMarkerService {

    private final Configuration freeMarkerConfiguration;

    @Autowired
    public FreeMarkerService(Configuration freeMarkerConfiguration) {
        this.freeMarkerConfiguration = freeMarkerConfiguration;
    }

    public String generateContent(Map<String, Object> model, String templateName) throws Exception {
        //In this method, you load the FreeMarker template using the provided templateName,
        // process it with the model (which contains the data from the form), and return the generated content as a String.

        //Load the template from the configuration
        Template template = freeMarkerConfiguration.getTemplate(templateName);

        //Use a StringWriter to output the processed template
        StringWriter writer = new StringWriter();
        template.process(model, writer);

        //Convert the writer's output to a String and return it
        return writer.toString();
    }


}
