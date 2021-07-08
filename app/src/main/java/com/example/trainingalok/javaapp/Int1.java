package com.example.trainingalok.javaapp;

import android.util.Log;

public interface Int1 {
    void hi();
    default void all(){
        System.out.println("first");
    }
}
