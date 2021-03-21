package com.codepath.instagramclone;

import com.parse.Parse;
import com.parse.ParseObject;

import android.app.Application;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("YnOkCXmFbXh5OtVaUMCbWt61T2cIkubvCU85CDTk")
                .clientKey("UJ6QWMMe7FA260qnF06NZ9e3MtEjNlxrcBjw87Rg")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
