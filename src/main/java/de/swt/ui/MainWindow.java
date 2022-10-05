package de.swt.ui;

import de.swt.events.MainWindowHandler;

import java.awt.*;


public class MainWindow extends Frame {

        MyCanvas canvas = new MyCanvas();

        public MainWindow(){
            setSize(500,300);
            setTitle("Metrik Version 1.0.2");

            add(canvas);
        }


        public void showFrame(){
            this.setVisible(true);
        }

        public void setHandler(MainWindowHandler mainWindowHandler) {
            addWindowListener(mainWindowHandler);
         }
}
