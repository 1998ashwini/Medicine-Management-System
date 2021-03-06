package com.example.demo.exception;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class MedicinesNotFoundException extends Exception{
	private static final long serialVersionUID = 1L;

    public MedicinesNotFoundException(String message) {
        super(message);
     File htmlFile = new File("/BookError");
     try {
		Desktop.getDesktop().browse(htmlFile.toURI());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }

}


