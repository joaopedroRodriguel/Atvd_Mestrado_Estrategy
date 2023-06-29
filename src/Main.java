import Model.ExperienciaEnsino;
import Model.ExperienciaGestao;
import Model.ProfessorCandidato;
import Service.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

            List<ProfessorCandidato> listprofessores = new ArrayList<>();

            PontuacaoCalculoEstrategia calcularGestaoExperiencia = new CalcularGestaoExperiencia();
            PontuacaoCalculoEstrategia calcularEnsinoExperiencia = new CalcularEnsinoExperiencia();
            PontuacaoCalculoEstrategia calcularTitulos = new CalcularTitulos();

            CalcularScoreFinal calcularScoreFinal = new CalcularScoreFinal(calcularTitulos, calcularEnsinoExperiencia, calcularGestaoExperiencia);

            ProfessorCandidato professorCandidato = new ProfessorCandidato("Ryan", "4396027", 3, 5);
            professorCandidato.getPontuacaoTitulos();
            professorCandidato.setExperienciaEnsino(ExperienciaEnsino.IFPB);
            professorCandidato.setExperienciaGestao(ExperienciaGestao.DIRECAO);
            professorCandidato.getPontuacaoDesempenho(90.00);
            listprofessores.add(professorCandidato);

            ProfessorCandidato professorCandidato1 = new ProfessorCandidato("Joao", "2222222", 4, 2);
            professorCandidato1.getPontuacaoTitulos();
            professorCandidato1.setExperienciaEnsino(ExperienciaEnsino.MEDIO);
            professorCandidato1.setExperienciaGestao(ExperienciaGestao.NO_EXPERIENCE);
            professorCandidato1.getPontuacaoDesempenho(40.00);
            listprofessores.add(professorCandidato1);

            ProfessorCandidato professorCandidato2 = new ProfessorCandidato("Karen", "3333333", 5, 2);
            professorCandidato2.getPontuacaoTitulos();
            professorCandidato2.setExperienciaEnsino(ExperienciaEnsino.SUPERIOR);
            professorCandidato2.setExperienciaGestao(ExperienciaGestao.NO_EXPERIENCE);
            professorCandidato2.getPontuacaoDesempenho(70.00);
            listprofessores.add(professorCandidato2);

            ProfessorCandidato professorCandidato3 = new ProfessorCandidato("thiago", "5555555", 5, 2);
            professorCandidato3.getPontuacaoTitulos();
            professorCandidato3.setExperienciaEnsino(ExperienciaEnsino.IFPB);
            professorCandidato3.setExperienciaGestao(ExperienciaGestao.DIRECAO);
            professorCandidato3.getPontuacaoDesempenho(100.00);
            listprofessores.add(professorCandidato3);

            ProfessorCandidato professorCandidato4 = new ProfessorCandidato("thiago", "5555555", 5, 2);
            professorCandidato4.getPontuacaoTitulos();
            professorCandidato4.setExperienciaEnsino(ExperienciaEnsino.SUPERIOR);
            professorCandidato4.setExperienciaGestao(ExperienciaGestao.COORDENACAO);
            professorCandidato4.getPontuacaoDesempenho(50.00);
            listprofessores.add(professorCandidato4);

    }
}