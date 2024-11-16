package com.example.College_Student_Interaction_Web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/index")
    public String index() {
        return "index";  // mainHome으로 리다이렉트
    }

    @GetMapping("/")
    public String mainHome() {
        return "mainHome";  // mainHome.html을 반환
    }

    @GetMapping("/profile")
    public String testProfile() {
        return "profile";
    }

    @GetMapping("/viewWriting")
    public String testViewWriting() {
        return "viewWriting";
    }

    @GetMapping("/modifyProfile")
    public String testModifyProfile() {
        return "modifyProfile";
    }
}