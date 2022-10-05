package de.swt.ui;

import java.awt.*;

public class MyMenu extends MenuBar {

    private final Frame frame;
    private MyCanvas canvas = new MyCanvas();
    private MenuBar mbar;
    private Menu settings, subMenu, circle;
    public MenuItem color1, color2, color3, size1;

    public MyMenu (Frame frame) {
        this.frame = frame;
        mbar = new MenuBar();
        settings = new Menu("Settings");
        circle = new Menu("Circle");
        subMenu = new Menu("Background");
        color1 = new MenuItem("Default [White]");
        color2 = new MenuItem("Light Grey");
        color3 = new MenuItem("Dark Grey");
        size1 = new MenuItem("Set Circle Radius");

        //build menu
        settings.addSeparator();
        settings.add(subMenu);
        circle.addSeparator();
        subMenu.add(color1);
        subMenu.add(color2);
        subMenu.add(color3);
        circle.add(size1);
        mbar.add(settings);
        mbar.add(circle);
        frame.setMenuBar(mbar);
    }

}
