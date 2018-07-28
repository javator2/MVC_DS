package com.sda.mvc.model;

public enum Nourishment {
    SATURATE("saturated"), HUNGRY("hungry"), STARVING("starving");

    private String title;

    Nourishment(String title){
        this.title=title;
    }
}
