package com.innovect.dataextraction.service;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.tess4j.util.ImageHelper;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@Service
public class ImageEntry {


    public  String crackImage() {

        File imagePath=new File("/home/rakhi/Desktop/bill3.jpeg");
        ITesseract imageFile = new Tesseract();
        imageFile.setDatapath("/home/rakhi/Spring-boot-projects/data-extraction/tessdata");
        imageFile.setLanguage("eng");
        BufferedImage image  = null;
        try {
            image = ImageIO.read(imagePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        image=ImageHelper.convertImageToGrayscale(image);
        try {
            String result = imageFile.doOCR(image);
            return result;
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
            return "Error while reading image";
        }
    }
}
