package org.duke.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("duke")
public class UserController {

    @GetMapping( value = "desc")
    public String getUser(){
        return "duke is a great man";
    }
}
