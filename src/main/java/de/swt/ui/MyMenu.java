package de.swt.ui;

import java.awt.*;

public class MyMenu extends MenuBar {

    private final Frame frame;
    private MyCanvas canvas = new MyCanvas();
    private MenuBar mbar;
    private Menu settings, subMenu;
    public MenuItem color1, color2, color3;

    public MyMenu (Frame frame) {
        super();
        //initialisation
        this.frame = frame;
        mbar = new MenuBar();
        settings = new Menu("Settings");

        subMenu = new Menu("Background");

        color1 = new MenuItem("Default [White]");
        color2 = new MenuItem("Light Grey");
        color3 = new MenuItem("Dark Grey");


        //build menu
        settings.addSeparator();
        settings.add(subMenu);

        subMenu.add(color1);
        subMenu.add(color2);
        subMenu.add(color3);

        mbar.add(settings);

        frame.setMenuBar(mbar);
    }

}
