package com.jp.app.portfolio.portfolioapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;


/**
 * @author Jeevan Poudel
 */
@Controller
public class ResumeController {

    
    /** 
     * @param model
     * @return String
     */
    @GetMapping("/resume")
    public String resume(Model model) {

        model.addAttribute("title", "Resume page");
        return "resume";
    }
    
}
