package com.example.controller;

import com.example.config.DBConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBController {
    @Autowired
    private DBConnector dbConnector;

    @GetMapping("/showdb")
    public String showDB(){
        return dbConnector.configure();
    }
}
