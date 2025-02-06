package com.example.mvpdemoapplication;

import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Model {

    String title;
    String subTitle;
    ImageView imageView;

    Model(String title, String subTitle){
        this.title = title;
        this.subTitle = subTitle;
    }



    String getTitle(){
        return  this.title;
    }

    String getSubTitle(){
        return  this.subTitle;
    }

    void setTitle(String title){
        this.title = title;
    }
    void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }
}
