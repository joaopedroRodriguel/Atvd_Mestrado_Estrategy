package Service;

import Model.ExperienciaEnsino;
import Model.ProfessorCandidato;

public class CalcularEnsinoExperiencia implements PontuacaoCalculoEstrategia {
    @Override
    public double calcularScore(ProfessorCandidato professorCandidato) {
        double tempoEnsino = professorCandidato.getTempoEnsino();
        double score = 0;

        if (professorCandidato.getExperienciaEnsino() == ExperienciaEnsino.IFPB) {
            score += Math.min(tempoEnsino, 12);
        } else if (professorCandidato.getExperienciaEnsino() == ExperienciaEnsino.SUPERIOR) {
            score += Math.min(tempoEnsino, 7);
        } else if (professorCandidato.getExperienciaEnsino() == ExperienciaEnsino.MEDIO) {
            score += Math.min(tempoEnsino, 6);
        }

        return score;
    }
}
