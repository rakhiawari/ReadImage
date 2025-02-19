package com.innovect.dataextraction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ImageExtractionService {

    @Autowired
    ImageEntry imageEntry;

    public String getString() {
        return imageEntry.crackImage();
    }
}
