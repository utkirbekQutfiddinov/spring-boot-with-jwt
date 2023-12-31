package uz.utkirbek.springbootwithjwt.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: utkirbek.
 * Time: 19:21:41
 * Date: July 14, 2023, Friday
 */
@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public HttpEntity<?> getHome(){
        return ResponseEntity.ok( "Welcome to home page");
    }
}
