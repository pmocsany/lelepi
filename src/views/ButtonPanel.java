package views;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class ButtonPanel extends HBox {
    Button calcButton;
    public ButtonPanel() {
        this.initComponent();
        this.addComponent();
    }
    private void initComponent() {
        this.calcButton = new Button("Számít");
        HBox.setMargin(this.calcButton, new Insets(10, 10, 10, 10));
    }
    private void addComponent() {
        this.getChildren().add(this.calcButton);
    }
    public Button getCalcButton() {
        return this.calcButton;
    }
}