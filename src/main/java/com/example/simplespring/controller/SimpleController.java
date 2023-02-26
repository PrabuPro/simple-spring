package com.example.simplespring.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("simple")
public class SimpleController {

    @GetMapping("/get")
    public ResponseEntity<String > simpleGet(){
        return new ResponseEntity<>("Hello from simple spring", HttpStatus.OK);
    }

}
