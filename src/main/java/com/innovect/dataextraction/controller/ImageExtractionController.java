package com.innovect.dataextraction.controller;

import com.innovect.dataextraction.service.ImageExtractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/extract")
public class ImageExtractionController {

    @Autowired
    ImageExtractionService imageExtractionService;

    @RequestMapping("/getString")
    public String getString() {
        String temp= imageExtractionService.getString();
        return temp;
    }
}
