package frontEnd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

public abstract class PanelDelJuego extends JPanel implements KeyListener, MouseListener {
    protected final int TAMAÑO_DE_CELDA = 16,
            ESCALADO_DE_CELDA = 5,
            TAMAÑO_DE_CELDA_FINAL = TAMAÑO_DE_CELDA * ESCALADO_DE_CELDA,
            RELACION_DE_ASPECTO_X = 16,
            RELACION_DE_ASPECTO_Y = 9,
            TAMAÑO_DE_PANEL_X = TAMAÑO_DE_CELDA_FINAL * RELACION_DE_ASPECTO_X,
            TAMAÑO_DE_PANEL_Y = TAMAÑO_DE_CELDA_FINAL * RELACION_DE_ASPECTO_Y;

    public PanelDelJuego() {
        setPreferredSize(new Dimension(TAMAÑO_DE_PANEL_X, TAMAÑO_DE_PANEL_Y));
        setBackground(Color.BLACK);
        setDoubleBuffered(true);
        addKeyListener(this);
        setFocusable(true);
    }
}
