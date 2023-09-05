import backEnd.*;

public class Main {
    public static void main(String[] args) {

        BombermanJuego bomberman = new BombermanJuego();

        Nivel nivel1 = bomberman.construirNivel (
                "Nivel de prueba",
                0,
                new Balloon(10, 10),
                new Bono(20, 20)
        );

        bomberman.iniciarJuego();
    }
}