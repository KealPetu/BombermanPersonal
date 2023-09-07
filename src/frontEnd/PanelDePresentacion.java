package frontEnd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class PanelDePresentacion extends PanelDelJuego {
    private Image banner;

    public PanelDePresentacion() {

        setPreferredSize(new Dimension(TAMAÑO_DE_PANEL_X, TAMAÑO_DE_PANEL_Y));
        banner = new ImageIcon("src/Logo.png").getImage();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
