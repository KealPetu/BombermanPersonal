package backEnd;

import frontEnd.VentanaDelJuego;

import java.util.HashMap;

public class BombermanJuego implements Runnable {
    private EstadoDelJuego estadoInicial,
                            estadoActual;
    private HashMap<Integer, Nivel> niveles;

    private VentanaDelJuego ventanaDelJuego;

    public BombermanJuego() {

        niveles = new HashMap<>();
    }

    public Nivel construirNivel(String nombreDelNivel, int mapa, Entidad...entidades) {

        Nivel nivel;
        nivel = new Nivel(nombreDelNivel, entidades);
        niveles.put(mapa, nivel);
        return niveles.get(mapa);
    }

    public void verificarEstadoActual(){

        switch (estadoActual) {

            case PRESENTACION:
                presentarBanner();
                estadoActual = EstadoDelJuego.MENU;
                break;

            case MENU:
                presentarMenu();
                break;

            case PAUSA:
                pausarJuego();
                break;

            case GAME_PLAY:
                iniciarNivel();
                break;

            case SELECCION_DE_NIVEL:
                seleccionarNivel();
                break;

            case GAME_OVER:
                terminarNivel();
                break;

            case NIVEL_SUPERADO:
                desbloquearNivel();
                guardarPartida();
                estadoActual = EstadoDelJuego.TRANSICION_DE_NIVELES;
                break;

            case TRANSICION_DE_NIVELES:
                cargarNivel();
                break;
        }
    }


    private void guardarPartida() {

    }

    public void comprobarColisionConEntidad(Entidad entidad1, Entidad entidad2){

    }

    private void iniciarNivel() {

        cargarJugador();
    }

    private void cargarJugador() {

    }

    private void cargarNivel() {

    }

    private void desbloquearNivel() {

    }

    private void terminarNivel() {

    }

    private void seleccionarNivel() {

    }

    private void pausarJuego() {

    }

    private void presentarMenu() {

    }

    private void presentarBanner() {

    }

    @Override
    public void run() {

    }

    public void iniciarJuego() {

        ventanaDelJuego = new VentanaDelJuego();
        estadoInicial = EstadoDelJuego.PRESENTACION;
        estadoActual = estadoInicial;
    }
}
