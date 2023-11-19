package com.example.learnspringframework.game;





public class PacManGame implements  GamingConsole{
    @Override
    public void up() {
        System.out.println("Go upwards");
    }

    @Override
    public void down() {
        System.out.println("Go Downwards");
    }

    @Override
    public void left() {
        System.out.println("Go left Side");
    }

    @Override
    public void right() {
        System.out.println("Go right side");
    }
}
