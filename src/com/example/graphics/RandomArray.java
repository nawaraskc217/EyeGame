package com.example.graphics;

import java.util.Timer;
import java.util.TimerTask;

public class RandomArray {
    
    private int i = 0;
    private Timer timer;
    private TimerTask task;

    public int sec=0;
    public int min=0;
    public static void main(String[] args) {
        RandomArray tut = new RandomArray();
        tut.runTimer();
    }

    public void runTimer() {
        timer = new Timer();
        task = new TimerTask() {
            @Override
            public void run() {
//                System.out.println("min " + min +": sec "+sec);
                i++;
                sec=i;
                
                if(i==60) {
                	i=0;
                	min=min+1;
                }
                System.out.println();
            }
        };
        timer.schedule(task, 0, 1000);
    }
}
