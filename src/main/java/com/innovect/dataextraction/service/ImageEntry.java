package com.innovect.dataextraction.service;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.springframework.stereotype.Service;

import java.io.File;


@Service
public class ImageEntry {


    public String crackImage() {

        ITesseract image = new Tesseract();
        try {
            String result = image.doOCR(new File("/home/rakhi/Desktop/image.png"));
            return result;
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
            return "Error while reading image";
        }
    }
}
