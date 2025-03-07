package org.lessons.exercise.best_of_the_year.controllers;
import java.util.ArrayList;
import org.lessons.exercise.best_of_the_year.classes.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/movies")
public class MovieController {
    @GetMapping
    public String Movie(Model model){
        model.addAttribute("Movies",getBestMovies());
        return "bestMovies";
    }

    private ArrayList<Movie> getBestMovies(){
        Movie s1 = new Movie(1, "Fantozzi alla riscossa");
        Movie s2 = new Movie(2, "Fantozzi contro tutti");
        Movie s3 = new Movie(3, "Fantozzi in paradiso");
        Movie s4 = new Movie(4, "Fantozzi va in pensione");
        Movie s5 = new Movie(5, "Il secondo tragico Fantozzi");
        Movie s6 = new Movie(6, "Fantozzi subisce ancora");
        Movie s7 = new Movie(7, "Fantozzi 2000 - La clonazione");

        ArrayList<Movie> Movies = new ArrayList<Movie>();
        Movies.add(s1);
        Movies.add(s2);
        Movies.add(s3);
        Movies.add(s4);
        Movies.add(s5);
        Movies.add(s6);
        Movies.add(s7);
        
        return Movies;
    } 
}