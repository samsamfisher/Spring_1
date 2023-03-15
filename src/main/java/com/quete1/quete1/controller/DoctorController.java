package com.quete1.quete1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/1")
    @ResponseBody
    public String page1() {
        return "William Hartnell";
    }

    @GetMapping("/doctor/10")
    @ResponseBody
    public String page2() {
        return "David Tennant";
    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String page3() {
        return "Jodie Whittaker";
    }
}