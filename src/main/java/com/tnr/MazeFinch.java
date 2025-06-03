package com.tnr;

import com.birdbrain.Finch;

public class MazeFinch {
    public static void main(String[] args) {
        Finch myFinch = new Finch();

        // What do I want my finch to do?
        myFinch.setMove("F", 100, 50);
        myFinch.setTurn("L", 90, 100);
        myFinch.setMove("F", 45, 50);
        myFinch.setTurn("L", 90, 100);
        myFinch.setMove("F", 38, 50);
        myFinch.setTurn("R", 90, 100);
        myFinch.setMove("F", 30, 50);





        System.out.println(myFinch.getDistance());

        myFinch.stopAll();
        myFinch.disconnect();
    }
}