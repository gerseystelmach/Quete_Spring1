package com.wildcodeschool.myProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {
    /* Rota criada para este método. Todas as requetes feitas para esta URL, será gerenciada por este método*/
    @GetMapping("/doctor/1")
    @ResponseBody
    public String indexDoc1() {
        return "William Hartnell";
    }

    @GetMapping("/doctor/10")
    @ResponseBody
    public String indexDoc10() {
        return "David Tennant";
    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String indexDoc13() {
        return "Jodie Whittaker";
    }
}
