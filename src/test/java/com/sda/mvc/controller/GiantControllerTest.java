package com.sda.mvc.controller;

import com.sda.mvc.model.GiantModel;
import com.sda.mvc.model.Health;
import com.sda.mvc.view.GiantView;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;

class GiantControllerTest {

    @Test
    void setHealth() {
        //given
        final GiantModel model = mock(GiantModel.class);
        final GiantView view = mock(GiantView.class);
        final GiantController controller = new GiantController(view, model);

        verifyZeroInteractions(model, view);
        //when
        for (Health health : Health.values()) {
            System.out.println(health.toString());
            //then
            controller.setHealth(health);
            verify(model).setHeatlth(health);
        }
    }

    @Test
    void updateView() {
        final GiantModel model = mock(GiantModel.class);
        final GiantView view = mock(GiantView.class);
        final GiantController controller = new GiantController(view, model);

        verifyZeroInteractions(model,view);

        controller.updateView();
        verify(model).equals(controller);
        }
}