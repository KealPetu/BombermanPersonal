package backEnd;

public class Nivel {

    private final String nombreDelNivel;
    private final Entidad[] entidades;

    public Nivel(String nombreDelNivel, Entidad[] entidades) {

        this.nombreDelNivel = nombreDelNivel;
        this.entidades = entidades;
    }
}
