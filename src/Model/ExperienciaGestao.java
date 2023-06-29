package Model;

public enum ExperienciaGestao {
    DIRECAO(15),
    COORDENACAO(10),
    NO_EXPERIENCE(0);

    private final int descricao;

    private ExperienciaGestao(int descricao) {
        this.descricao = descricao;
    }

    public int getDescricao() {
        return descricao;
    }
}
