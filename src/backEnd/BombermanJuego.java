package backEnd;


import frontEnd.InterfazVisual;

import java.util.HashMap;

public class BombermanJuego {
    private EstadoDelJuego estadoInicial,
                            estadoActual;
    private InterfazVisual ventana;

    private HashMap<Integer, Nivel> niveles;

    public BombermanJuego() {

        estadoInicial = EstadoDelJuego.PRESENTACION;
        estadoActual = estadoInicial;
        niveles = new HashMap<>();
    }

    public Nivel construirNivel(String nombreDelNivel, int mapa, Entidad... entidades) {

        Nivel nivel;
        nivel = new Nivel(nombreDelNivel, entidades);
        niveles.put(mapa, nivel);
        return niveles.get(mapa);
    }

    public void iniciarJuego() {
        ventana = new InterfazVisual();
    }
}
