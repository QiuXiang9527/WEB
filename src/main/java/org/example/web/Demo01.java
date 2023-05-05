package org.example.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo01 {
    @GetMapping("/demo")
    void demo(){
        System.out.println("被访问");
    }
}
