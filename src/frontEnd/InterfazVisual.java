package frontEnd;
import javax.swing.*;

public class InterfazVisual {
    JFrame ventanaDelJuego;
    PanelDelJuego panel;
    public InterfazVisual() {

        ventanaDelJuego = new JFrame();
        panel = new PanelDelJuego();
        ventanaDelJuego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaDelJuego.setResizable(false);
        ventanaDelJuego.add(panel);
        ventanaDelJuego.pack();
        ventanaDelJuego.setTitle("Bomberman DB (Dimentional Breach)");
        ventanaDelJuego.setLocationRelativeTo(null);
        ventanaDelJuego.setVisible(true);
    }
}
