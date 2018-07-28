package com.sda.mvc.controller;

import com.sda.mvc.model.Fatigue;
import com.sda.mvc.model.GiantModel;
import com.sda.mvc.model.Health;
import com.sda.mvc.model.Nourishment;
import com.sda.mvc.view.GiantView;

public class GiantController {

        private GiantView giantView;
        private GiantModel giantModel;

    public GiantController(GiantView giantView, GiantModel giantModel) {
        this.giantView = giantView;
        this.giantModel = giantModel;
    }
    public Health getHealth(){
        return this.giantModel.getHeatlth();
    }
    public Fatigue getFatigue(){
        return  this.giantModel.getFatigue();
    }
    public Nourishment getNourishment(){
        return this.giantModel.getNourishment();
    }

    public void updateView() {
        this.giantView.displayGiant(giantModel);
    }

    public void setHealth(Health heatlth) {
        this.giantModel.setHeatlth(heatlth);
    }
}
