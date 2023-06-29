package Service;

import Model.ProfessorCandidato;
import Model.TitulosEnum;

public class CalcularScoreFinal implements PontuacaoCalculoEstrategia {

    private PontuacaoCalculoEstrategia calcularTitulos;
    private PontuacaoCalculoEstrategia calcularEnsinoExperiencia;
    private PontuacaoCalculoEstrategia calcularGestaoExperiencia;
    public CalcularScoreFinal(PontuacaoCalculoEstrategia calcularTitulos, PontuacaoCalculoEstrategia calcularEnsinoExperiencia, PontuacaoCalculoEstrategia calcularGestaoExperiencia) {
        this.calcularTitulos = calcularTitulos;
        this.calcularEnsinoExperiencia = calcularEnsinoExperiencia;
        this.calcularGestaoExperiencia = calcularGestaoExperiencia;

    }

    @Override
    public double calcularScore(ProfessorCandidato professorCandidato) {

        double provaDesempenho = professorCandidato.getPontuacaoDesempenho();
        TitulosEnum provaTitulos = professorCandidato.getPontuacaoTitulos();

        double pontuacaoFinal = provaDesempenho;

        if (provaDesempenho >= 70) {
            pontuacaoFinal =+ provaTitulos;
        }

        return pontuacaoFinal;
    }
}
