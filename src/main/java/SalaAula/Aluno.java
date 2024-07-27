package SalaAula;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Aluno {

    private String nome;
    private String numeroMatricula;
    private String nomeEscola;
    private String serieMatriculado;

    private List <Disciplina> disciplina = new ArrayList<Disciplina>();

    public List<Disciplina> Disciplina() {
        return disciplina;
    }

    public void setDisciplinas(List<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }

    public double getMediaNota() {
        double somaNotas = 0.0;

        for (Disciplina disciplina : disciplina){
            somaNotas += disciplina.getNota();
        }
        return somaNotas/disciplina.size();
    }

    public String getAlunoAprovado() {
        double media = this.getMediaNota();

        if (media >= 70) {
            return "Aluno Aprovado";

        }else if  (media >= 50) {
            return "Aluno de recuperação";

        }else{
            return "Aluno reprovado";
        }
    }
}