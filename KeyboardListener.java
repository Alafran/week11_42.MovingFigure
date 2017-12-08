package movingfigure;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardListener implements KeyListener {

    private Figure figure;
    private Component component;

    public KeyboardListener(Component component, Figure figure) {
        this.component = component;
        this.figure = figure;
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
            this.figure.move(-1, 0);
        } else if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.figure.move(1, 0);
        } else if (ke.getKeyCode() == KeyEvent.VK_UP) {
            this.figure.move(0, -1);
        } else if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            this.figure.move(0, 1);
        }

        this.component.repaint();
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

}
