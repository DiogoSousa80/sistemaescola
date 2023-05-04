import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

import javax.swing.*;

public class PrimeiraClasseJava {
    public static void main(String[] args) {
        /*New Aluno (), é uma instância (criação de objeto)*/
        /*aluno1 é uma ferencia para o objetos alunos*/


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

        for (int pos = 1; pos <= 4; pos++){

            String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina?" +pos+  " ? ");
            String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina?" +pos+  " ? ");

            Disciplina disciplina = new Disciplina();
            disciplina.setDisciplina(nomeDisciplina);
            disciplina.setNota(Double.valueOf(notaDisciplina));

            aluno1.getDisciplinas().add(disciplina);
        }


        System.out.println("Nome Aluno:  " + aluno1.getNome());
        System.out.println("Sua Idade: " + aluno1.getIdade());
        System.out.println("Data de Nascimento: " + aluno1.getDataNascimento());
        System.out.println("Seu RG: " + aluno1.getRegistroGeral());
        System.out.println("Seu CPF: " + aluno1.getNumeroCpf());
        System.out.println("Nome da sua Mãe: " + aluno1.getNomeMae());
        System.out.println("Nome do seu Pai: " + aluno1.getNomePai());
        System.out.println("Data da Matricula é : " + aluno1.getDataMatricula());
        System.out.println("Nome da Escola: " + aluno1.getNomeEscola());
        System.out.println("Sua serie: " + aluno1.getSerieMatriculado());
        System.out.println("A média da nota: " + aluno1.getMediaNota());
        System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
        System.out.println("Resultado 2 = " + aluno1.getAlunoAprovado2());


        System.out.println(aluno1);
        System.out.println("Média do aluno " + aluno1.getMediaNota());
        System.out.println("Resultado" + aluno1.getAlunoAprovado2());

    }

}

