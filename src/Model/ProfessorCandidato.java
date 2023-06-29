package Model;

public class ProfessorCandidato {
    private String nome;
    private String rg;
    private int tempoEnsino;
    private int tempoGestao;
    private double pontuacaoFinal;
    private double pontuacaoDesempenho;
    private TitulosEnum pontuacaoTitulos;
    private ExperienciaEnsino experienciaEnsino;
    private ExperienciaGestao experienciaGestao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getTempoEnsino() {
        return tempoEnsino;
    }

    public void setTempoEnsino(int tempoEnsino) {
        this.tempoEnsino = tempoEnsino;
    }

    public int getTempoGestao() {
        return tempoGestao;
    }

    public void setTempoGestao(int tempoGestao) {
        this.tempoGestao = tempoGestao;
    }

    public double getPontuacaoFinal() {
        return pontuacaoFinal;
    }

    public void setPontuacaoFinal(double pontuacaoFinal) {
        this.pontuacaoFinal = pontuacaoFinal;
    }

    public double getPontuacaoDesempenho(double v) {
        return pontuacaoDesempenho;
    }

    public void setPontuacaoDesempenho(double pontuacaoDesempenho) {
        this.pontuacaoDesempenho = pontuacaoDesempenho;
    }

    public TitulosEnum getPontuacaoTitulos() {
        return pontuacaoTitulos;
    }

    public void setPontuacaoTitulos(TitulosEnum pontuacaoTitulos) {
        this.pontuacaoTitulos = pontuacaoTitulos;
    }

    public ExperienciaEnsino getExperienciaEnsino() {
        return experienciaEnsino;
    }

    public void setExperienciaEnsino(ExperienciaEnsino experienciaEnsino) {
        this.experienciaEnsino = experienciaEnsino;
    }

    public ExperienciaGestao getExperienciaGestao() {
        return experienciaGestao;
    }

    public void setExperienciaGestao(ExperienciaGestao experienciaGestao) {
        this.experienciaGestao = experienciaGestao;
    }

    public ProfessorCandidato(String nome, String rg, int tempoEnsino, int tempoGestao) {
        this.nome = nome;
        this.rg = rg;
        this.tempoEnsino = tempoEnsino;
        this.tempoGestao = tempoGestao;
    }
}