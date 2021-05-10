package com.hllbr.tryagain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.parse.Parse;

public class ParseStarterClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parseactivity_main);
        //set log level
        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        Parse.initialize(new Parse.Configuration.Builder(this)
        .applicationId("bxaF7cb6zXk46Jc6mZYo5oU2KnTmrClveQATHwDU")
        .clientKey("Io3FyPoTZN7teWU1L7C5BONLxmIPqpsZYqcjkL7H")
        .server("https://parseapi.back4app.com/")
        .build());
    }
}