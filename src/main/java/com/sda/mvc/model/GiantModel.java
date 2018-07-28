package com.sda.mvc.model;

public class GiantModel {
    private Health heatlth;
    private Fatigue fatigue;
    private Nourishment nourishment;

    public GiantModel(Health heatlth, Fatigue fatigue, Nourishment nourishment) {
        this.heatlth = heatlth;
        this.fatigue = fatigue;
        this.nourishment = nourishment;
    }

    public Health getHeatlth() {
        return heatlth;
    }

    public void setHeatlth(Health heatlth) {
        this.heatlth = heatlth;
    }

    public Fatigue getFatigue() {
        return fatigue;
    }

    public void setFatigue(Fatigue fatigue) {
        this.fatigue = fatigue;
    }

    public Nourishment getNourishment() {
        return nourishment;
    }

    public void setNourishment(Nourishment nourishment) {
        this.nourishment = nourishment;
    }

    @Override
    public String toString() {
        return "GiantModel{" +
                "heatlth=" + heatlth +
                ", fatigue=" + fatigue +
                ", nourishment=" + nourishment +
                '}';
    }
}
