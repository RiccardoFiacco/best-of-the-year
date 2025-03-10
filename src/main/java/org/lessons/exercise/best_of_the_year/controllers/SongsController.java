package org.lessons.exercise.best_of_the_year.controllers;
import java.util.ArrayList;
import org.lessons.exercise.best_of_the_year.classes.Song;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/songs")
public class SongsController {

    @GetMapping
    public String songs(Model model){
        model.addAttribute("songs",getBestSongs());
        return "bestSongs";
    }

    @GetMapping("/{id}")
    public String song(Model model, @PathVariable("id") int Id){
        ArrayList<Song> songs = getBestSongs();
        try{
            Song song = songs.get(Id-1); 
            model.addAttribute("canzone", song);
        }catch (NullPointerException e){
            e.printStackTrace();
        }     
        return "song";
    }

    private ArrayList<Song> getBestSongs(){
        Song s1 = new Song(1, "Timeless");
        Song s2 = new Song(2, "The house of rising sun");
        Song s3 = new Song(3, "Giorgio by Moroder");
        Song s4 = new Song(4, "Indo Silver Club");
        Song s5 = new Song(5, "Stained");
        Song s6 = new Song(6, "Creuza de ma");
        Song s7 = new Song(7, "Fragment of time");

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(s1);
        songs.add(s2);
        songs.add(s3);
        songs.add(s4);
        songs.add(s5);
        songs.add(s6);
        songs.add(s7);
        
        return songs;
    } 
}