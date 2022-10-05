package de.swt.ui;

import de.swt.events.MainWindowHandler;

import java.awt.*;

public class RadiusDialog extends Frame {

    private MainWindowHandler mwh = new MainWindowHandler();
    public TextField textWidth;

    public RadiusDialog() {
        this.setSize(300, 100);
        this.setTitle("Radius");
        this.addWindowListener(mwh);
        this.setLayout(new FlowLayout());
        //this.setVisible(true);

        Label label1 = new Label("Enter Radius: ");

        textWidth = new TextField();
        textWidth.setSize(50, 20);
        textWidth.setBackground(Color.LIGHT_GRAY);

        add(label1);
        add(textWidth);
    }

    public float getRadiusInput() {
        String s = textWidth.getText();
        return Float.parseFloat(s);
    }

    public void openRadiusDialog () {
        this.setVisible(true);
    }


}
