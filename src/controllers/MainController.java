package controllers;

import javafx.scene.control.Button;
import models.Lelepi;
import views.MainView;

public class MainController {
    MainView mainView;
    public MainController() {
        this.mainView = new MainView();
        this.handleEvent();
    }
    public MainView getMainView() {
        return this.mainView;
    }
    public void handleEvent() {
        Button calcButton = this.mainView.getButtonPanel().getCalcButton();
        calcButton.setOnAction(event -> {
            onClickCalcButton();
        });
    }
    private void onClickCalcButton() {
        double base = Double.parseDouble(this.mainView.getBaseInputPanel().getValue());
        double heightOne = Double.parseDouble(this.mainView.getHeightOneInputPanel().getValue());
        double heightTwo = Double.parseDouble(this.mainView.getHeightTwoInputPanel().getValue());
        double heightThree = Double.parseDouble(this.mainView.getHeightThreeInputPanel().getValue());
        Double area = Lelepi.calcArea(base, heightOne, heightTwo, heightThree);
        this.mainView.getAreaInputPanel().setValue(area.toString());
    }
}

