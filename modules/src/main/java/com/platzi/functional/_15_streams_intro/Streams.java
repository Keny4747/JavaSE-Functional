package com.platzi.functional._15_streams_intro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Streams {

    public static void main(String[] args) {
        List<String> courseList = new ArrayList<>();

        courseList.add("Java");
        courseList.add("FrontEnd");
        courseList.add("BackEnd");
        courseList.add("FullStack");

        for(String course : courseList){
            System.out.println(course);
        }


    }
}
