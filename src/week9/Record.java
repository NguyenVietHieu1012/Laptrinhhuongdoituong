package week9;

import java.io.Serializable;
import java.io.*;
public class Record implements Serializable {
    private String name;
    private double score;

    public Record(String name, double score){
        this.name = name;
        this.score = score;
    }
    public String toString(){
        return "Name: " + name + " , score: " + score;
    }
}
