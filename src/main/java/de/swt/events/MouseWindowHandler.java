package de.swt.events;

import de.swt.ui.MyCanvas;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseWindowHandler extends MouseAdapter {

    public int MouseX, MouseY;
    private int counter = 0;
    public boolean startProgram = false;

    @Override
    public void mouseClicked(MouseEvent evt){
        super.mouseClicked(evt);
        if(evt.getClickCount() == 2) {
            startProgram = true;
            MouseX = evt.getX();
            MouseY = evt.getY();
            MyCanvas canvas = (MyCanvas) evt.getSource();
            if(counter < 2) {
                canvas.paint(canvas.getGraphics());
                counter++;
            } else {
                canvas.clear();
                counter = 0;
            }
        }
    }
}
