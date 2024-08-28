package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloController {
    
    @GetMapping("/")
    public String showHello() {
        return "Hello World";
    }
    

}
