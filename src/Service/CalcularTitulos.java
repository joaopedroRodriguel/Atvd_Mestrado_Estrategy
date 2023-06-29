package Service;

import Model.ProfessorCandidato;
import Model.TitulosEnum;

public class CalcularTitulos implements PontuacaoCalculoEstrategia {
    @Override
    public double calcularScore(ProfessorCandidato professorCandidato) {
        double score = 0;

        switch (professorCandidato.getPontuacaoTitulos()) {
            case DOUTOR:
                score = TitulosEnum.DOUTOR.getDescricao();
            case MESTRE:
                score = TitulosEnum.MESTRE.getDescricao();
            case ESPECIALISTA:
                score = TitulosEnum.ESPECIALISTA.getDescricao();
        }
        return score;
    }
}
