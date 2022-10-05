package de.swt.ui;

import de.swt.events.MouseWindowHandler;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class MyCanvas extends Canvas {
    //attributes
    private final MouseWindowHandler _mousehandler = new MouseWindowHandler();
    public boolean isset = false;
    public float radius;

    /**
     * Constructor of the class MyCanvas.
     */
    public MyCanvas() {
        addMouseListener(_mousehandler);
    }

    /**
     * clear()-Method used to clear the canvas.
     */
    public void clear(){
        getGraphics().clearRect(0,0,500,300);
    }

    public void setRadius (float radius) {
        this.radius = radius;
        isset = true;
    }
    /**
     * paint()-Method used to paint circles on the canvas.
     * @param g
     */

    @Override
    public void paint(Graphics g) {

        Ellipse2D ellipse;
        ellipse = new Ellipse2D.Float(
                _mousehandler.MouseX, _mousehandler.MouseY, //Koordinaten
                radius, radius); //Size
        Graphics2D g2d = (Graphics2D)g;
        if (_mousehandler.startProgram) {
            g2d.draw(ellipse);
            g2d.drawString("Koordinate: " + _mousehandler.MouseX + "," + _mousehandler.MouseY,_mousehandler.MouseX,_mousehandler.MouseY);
        }
    }

}
