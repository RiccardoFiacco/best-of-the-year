package org.lessons.exercise.best_of_the_year.classes;
import java.io.Serializable;

public class Song implements Serializable{
    private  int id;
    private String titolo;

    public Song(){}

    public Song(int id, String titolo) {
        this.id = id;
        this.titolo = titolo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    };

    @Override
    public String toString() {
        return "Song: id=" + id + ", titolo=" + titolo ;
    }
}
