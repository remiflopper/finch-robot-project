package com.tnr;

import com.birdbrain.Finch;

public class MazeFinch {
    public static void main(String[] args) {
        Finch myFinch = new Finch();

        // What do I want my finch to do?
        myFinch.setMove("F", 105, 60);
        myFinch.setTurn("L", 90, 60);
        myFinch.setMove("F", 40, 50);
        myFinch.setTurn("L", 90, 60);
        myFinch.setMove("F", 35, 40);
        myFinch.setTurn("R", 90, 60);
        myFinch.setMove("F", 45, 60);
        myFinch.setTurn("R", 90, 50);
        myFinch.setMove("F", 110, 60);
        myFinch.setTurn("R", 80, 60);
        myFinch.setMove("F", 8, 60);
        myFinch.setTurn("R", 80, 60);
        myFinch.setMove("F", 2, 60);
        myFinch.setTurn("L", 90, 60);
        myFinch.setMove("F", 50, 40);
        myFinch.setTurn("L", 45, 40);
        myFinch.setMove("F", 26, 40);






        System.out.println(myFinch.getDistance());

        myFinch.stopAll();
        myFinch.disconnect();
    }
}