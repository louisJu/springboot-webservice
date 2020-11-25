package com.louis.webservice.web;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class paymentController {

    @GetMapping("/payment")
    public String payment(){
        return "payment";
    }


}
