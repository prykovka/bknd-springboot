package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.model.NumberRequest;

@RestController
@RequestMapping("/numbers")
public class NumberController {

    @PostMapping("/getNumber")
    public int receiveNumberViaPost(@RequestBody NumberRequest numberRequest) {
        return numberRequest.getNumber();
    }
}
