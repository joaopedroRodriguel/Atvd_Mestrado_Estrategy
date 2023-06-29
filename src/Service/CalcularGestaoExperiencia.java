package Service;

import Model.ProfessorCandidato;

public class CalcularGestaoExperiencia implements PontuacaoCalculoEstrategia{
    @Override
    public double calcularScore(ProfessorCandidato professorCandidato) {
        double tempoGestao = professorCandidato.getTempoGestao();

        double score;
        if (tempoGestao <= 2) {
            score = Math.min(tempoGestao, 2);
        } else {
            score = Math.min(tempoGestao, 15);
        }

        return score;
    }
}
