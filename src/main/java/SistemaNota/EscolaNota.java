package SistemaNota;

import SalaAula.Aluno;
import SalaAula.Disciplina;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class EscolaNota {

    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<Aluno>();

        for (int qtd = 1; qtd <= 2; qtd++) {

            String nome = JOptionPane.showInputDialog("Nome do Aluno:  " + qtd + " ?");
            String numeroMatricula = JOptionPane.showInputDialog("Digite sua matricula: ");
            String nomeEscola = JOptionPane.showInputDialog("Nome da faculdade: ");
            String serieMatriculado = JOptionPane.showInputDialog("Qual periodo está cursando: ");

            Aluno aluno = new Aluno();

            aluno.setNome(nome);
            aluno.setNumeroMatricula(numeroMatricula);
            aluno.setNomeEscola(nomeEscola);
            aluno.setSerieMatriculado(serieMatriculado);


            for (int pos = 1; pos <= 4; pos++) {
                String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + pos + " ?");
                String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina? ");

                Disciplina disciplina = new Disciplina();
                disciplina.setDisciplina(nomeDisciplina);
                disciplina.setNota(Double.valueOf(notaDisciplina));

                aluno.getDisciplina().add(disciplina);

            }

            int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");

            if (escolha == 0) {

                int continuarRemover = 0; /* Opção SIM é ZERO */

                while (continuarRemover == 0) {

                    String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, ou 4 ?");
                    aluno.getDisciplina().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
                    continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
                }

            }

            alunos.add(aluno);
            for (Aluno aluno1 : alunos) {

                System.out.println(aluno.toString()); /* Descrição do obejeto na memoria */
                System.out.println("Media do Aluno: " + aluno.getMediaNota());
                System.out.println("Resultado = " + aluno.getAlunoAprovado());
                System.out.println("----------------------------------------------------------------------------------");
            }
        }

    }
}
