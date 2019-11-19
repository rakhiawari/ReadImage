package com.innovect.dataextraction.service;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.springframework.stereotype.Service;

import java.io.File;


@Service
public class ImageEntry {


    public  String crackImage() {

        File imagePath=new File("/home/rakhi/Desktop/text.png");
        ITesseract image = new Tesseract();
        image.setDatapath("/home/rakhi/Spring-boot-projects/data-extraction/tessdata");
        image.setLanguage("eng");
        try {
            String result = image.doOCR(imagePath);
            return result;
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
            return "Error while reading image";
        }
    }
}
