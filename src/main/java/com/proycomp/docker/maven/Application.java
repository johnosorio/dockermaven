/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proycomp.docker.maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Prueba de distribucion con docker.
 * @author John Jairo Osorio
 */
@SpringBootApplication
@RestController
public class Application {
    
    @RequestMapping("/")
    public String home(){
        return "Docker is awesome...";
    }
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
