import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PrimeiraClasseJava {
    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<Aluno>();

        for (int qtd = 0; qtd <= 1; qtd ++) {


            String nome = JOptionPane.showInputDialog("Qual o nome do aluno? ");
            String idade = JOptionPane.showInputDialog("Qual a idade? ");
            String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento? ");
            String rg = JOptionPane.showInputDialog("Qual seu registro geral (RG)? ");
            String cpf = JOptionPane.showInputDialog("Qual seu CPF? ");
            String mae = JOptionPane.showInputDialog("Qual O nome da sua mãe? ");
            String pai = JOptionPane.showInputDialog("Qual O nome da seu pai? ");
            String matricula = JOptionPane.showInputDialog("Qual a data de matrícula?");
            String escola = JOptionPane.showInputDialog("Qual sua instituição de ensino?");
            String serie = JOptionPane.showInputDialog("Qual sua serie?");



            Aluno aluno1 = new Aluno();
            aluno1.setNome(nome);
            aluno1.setIdade(Integer.valueOf(idade));
            aluno1.setDataNascimento(dataNascimento);
            aluno1.setRegistroGeral(rg);
            aluno1.setNumeroCpf(cpf);
            aluno1.setNomeMae(mae);
            aluno1.setNomePai(pai);
            aluno1.setDataMatricula(matricula);
            aluno1.setNomeEscola(escola);
            aluno1.setSerieMatriculado(serie);

            for (int pos = 1; pos <= 4; pos++) {

                String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina ?" + pos + " ? ");
                String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina ?" + pos + " ? ");

                Disciplina disciplina = new Disciplina();
                disciplina.setDisciplina(nomeDisciplina);
                disciplina.setNota(Double.valueOf(notaDisciplina));

                aluno1.getDisciplinas().add(disciplina);
            }

            int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ? ");

            if (escolha == 0) {


                int continuarRemover = 0;
                int posicao = 1;

                while (continuarRemover == 0) {
                    String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4 ?");
                    aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
                    posicao++;
                    continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover");
                }

            }
            alunos.add(aluno1);

        }

        for (Aluno aluno : alunos) {


            System.out.println(aluno);
            System.out.println("Média do aluno " + aluno.getMediaNota());
            System.out.println("Resultado" + aluno.getAlunoAprovado2());
            System.out.println("===========================================================================");
        }




    }

}

