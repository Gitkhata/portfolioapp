package com.jp.app.portfolio.portfolioapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Jeevan Poudel
 */
@Controller
public class AboutController {

    /**
     *
     * @param model
     * @return String name of the view
     */
    @GetMapping("/about")
    public String index(Model model) {
        model.addAttribute("title", "About page");
        return "about";
    }
}
