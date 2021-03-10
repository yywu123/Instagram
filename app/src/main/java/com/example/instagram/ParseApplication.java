package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("iAnu3tUGHskjIMSkX3D6tY7NE2u8XxompA1Bn1NV")
                .clientKey("yUfRWoEcLSFp7EU4ut3ybb6wWkBQVOtRPHTpJ8Zo")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
