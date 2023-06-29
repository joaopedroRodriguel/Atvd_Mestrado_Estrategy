package Model;

public enum ExperienciaGestao {
    NO_EXPERIENCE(0),
    DIRECAO(15),
    COORDENACAO(10);
    private final int descricao;
    private ExperienciaGestao(int descricao) {
        this.descricao = descricao;
    }
    public int getDescricao() {
        return descricao;
    }
}
