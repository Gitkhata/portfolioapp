package com.jp.app.portfolio.portfolioapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;


/**
 * @author Jeevan Poudel
 * 
 */
@Controller
public class ProjectController {

    
    /** 
     * @param model
     * @return String
     */
    @GetMapping("/projects")
    public String project(Model model) {

        model.addAttribute("title", "Projects page");
        return "projects";
    }
    
}
