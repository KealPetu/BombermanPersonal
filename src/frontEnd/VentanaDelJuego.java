package frontEnd;

import javax.swing.*;
import java.awt.*;

public class VentanaDelJuego extends JFrame {
    private PanelDePresentacion panelDePresentacion;

    public VentanaDelJuego() throws HeadlessException {

        panelDePresentacion = new PanelDePresentacion();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setTitle("Bomberman");
        this.setLocationRelativeTo(null);
        this.add(panelDePresentacion);
        this.setVisible(true);

    }
}
