package org.lessons.exercise.best_of_the_year.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/") 
    public String home(Model model){
        model.addAttribute("name", "riccardo");
        return "home";
    }
}
