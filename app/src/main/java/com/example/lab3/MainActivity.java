package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void main(String[] args) {
        Student a =new Student();
        a.fullName = "Manee";
        a.age = 12;
        a.gender = "Female";
        a.gradeLevel= "primary School";
        a.speak();
        a.sleep();
    }
}