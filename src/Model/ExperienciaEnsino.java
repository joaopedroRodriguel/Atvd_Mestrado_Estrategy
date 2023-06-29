package Model;

public enum ExperienciaEnsino {
    NO_EXPERIENCE(0),

    MEDIO(6),

    SUPERIOR(7),

    IFPB(12);
    private final int valor;

    private ExperienciaEnsino(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
