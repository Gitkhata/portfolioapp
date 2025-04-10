package com.jp.app.portfolio.portfolioapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;


/**
 * @author Jeevan Poudel
 */
@Controller
public class IndexController {

    
    /** 
     * @param model
     * @return String
     */
    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("title", "Home page");
        return "index";
    }
    
}
