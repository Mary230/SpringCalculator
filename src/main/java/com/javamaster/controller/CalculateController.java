package com.javamaster.controller;

import com.javamaster.service.Calculator;
import com.javamaster.service.Helper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculateController {

    @RequestMapping(value = "/calculate", method = RequestMethod.GET)
    public String calculate(Model model, @RequestParam(value="first") int first, @RequestParam(value="second") int second,
                            @RequestParam(value="sign") char sign){
        int a = Calculator.go(first,second,sign);

        String example = Helper.getExample(first,second,sign);
        model.addAttribute("number", a);
        model.addAttribute("example", example);
        return "answer";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getStartPage(){
        return "startPage";
    }
}
