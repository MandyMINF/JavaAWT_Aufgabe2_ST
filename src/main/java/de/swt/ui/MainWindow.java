package de.swt.ui;

import de.swt.events.MainWindowHandler;
import java.awt.*;

public class MainWindow extends Frame {
    //attributes
    MyCanvas canvas = new MyCanvas();

    /**
     * Constructor of the class Main Window
     */
    public MainWindow(){
        //set up window
        setSize(500,300);
        setTitle("Metrik Version 1.0");

        //add components
        add(canvas);
    }

    /**
     * showFrame()-Method used to set the visibilty of the window true
     */
    public void showFrame(){
        this.setVisible(true);
    }

    /**
     *
     * @param mainWindowHandler
     */
    public void setHandler(MainWindowHandler mainWindowHandler) {
        addWindowListener(mainWindowHandler);
         }
}
