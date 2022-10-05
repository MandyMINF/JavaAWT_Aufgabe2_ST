package de.swt.ui;

import de.swt.events.MainWindowHandler;

import java.awt.*;


public class MainWindow extends Frame {

        MyMenu mymenu;
        MyCanvas canvas = new MyCanvas();

        public MainWindow(){
            setSize(500,300);
            setTitle("Metrik Version 1.0.2");

            mymenu = new MyMenu(this);
            add(canvas);

            mymenu.color1.addActionListener(e -> canvas.setBackground(Color.WHITE));
            mymenu.color2.addActionListener(e -> canvas.setBackground(Color.LIGHT_GRAY));
            mymenu.color3.addActionListener(e -> canvas.setBackground(Color.DARK_GRAY));
        }


        public void showFrame(){
            this.setVisible(true);
        }

        public void setHandler(MainWindowHandler mainWindowHandler) {
            addWindowListener(mainWindowHandler);
         }
}
