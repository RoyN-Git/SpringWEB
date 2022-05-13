package com.roytest.beans;

import javax.persistence.Entity;

public enum Topic {
    Project1("Math"),
    Project2("English"),
    Project3("Software");

        private String name;
        Topic(String name){
            this.name=name;
        }

        public String getName(){
            return name;
    }
}
