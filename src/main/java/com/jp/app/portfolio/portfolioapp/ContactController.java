package com.jp.app.portfolio.portfolioapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;


/**
 * 
 * @author Jeevan Poudel
 * 
 * 
 */
@Controller
public class ContactController {


    /**
     * 
     * @param model
     * @return String contact page name
     */
    @GetMapping("/contact")
    public String contact(Model model) {

        model.addAttribute("title", "Contact page");
        return "contact";
    }
    
}
