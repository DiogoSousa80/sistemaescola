import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
    public static void main(String[] args) {
        /*New Aluno (), é uma instância (criação de objeto)*/
        /*aluno1 é uma ferencia para o objetos alunos*/
        Aluno aluno1 = new Aluno(); /*Aqui vai ser o João*/
        aluno1.setNome("João da Silva");
        aluno1.setIdade(28);
        aluno1.setDataNascimento("08/02/1995");
        aluno1.setRegistroGeral("45452151");
        aluno1.setNumeroCpf("888.111.555-98");
        aluno1.setNomeMae("Maria de Fatima");
        aluno1.setNomePai("Raimundo Nonato");
        aluno1.setDataMatricula("01/01/2020");
        aluno1.setNomeEscola("Escola de Programação");
        aluno1.setSerieMatriculado("1 ano");
        aluno1.setNota1(90);
        aluno1.setNota2(80.8);
        aluno1.setNota3(70.6);
        aluno1.setNota4(80);

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
        System.out.println("A média da nota: " + aluno1.getMediaNota ());

        System.out.println("===================================================");
        Aluno aluno2 = new Aluno();/*Aqui será o Diogo*/

        aluno2.setNome("Diogo Sousa");
        aluno2.setIdade(28);
        aluno2.setDataNascimento("08/02/1995");
        aluno2.setRegistroGeral("45452151");
        aluno2.setNumeroCpf("888.111.555-98");
        aluno2.setNomeMae("Maria JOsé");
        aluno2.setNomePai("José Benoni");
        aluno2.setDataMatricula("01/01/2020");
        aluno2.setNomeEscola("Escola de Programação");
        aluno2.setSerieMatriculado("1 ano");

        System.out.println("Nome Aluno:  " + aluno2.getNome());
        System.out.println("Sua Idade: " + aluno2.getIdade());
        System.out.println("Data de Nascimento: " + aluno2.getDataNascimento());
        System.out.println("Seu RG: " + aluno2.getRegistroGeral());
        System.out.println("Seu CPF: " + aluno2.getNumeroCpf());
        System.out.println("Nome da sua Mãe: " + aluno2.getNomeMae());
        System.out.println("Nome do seu Pai: " + aluno2.getNomePai());
        System.out.println("Data da Matricula é : " + aluno1.getDataMatricula());
        System.out.println("Nome da Escola: " + aluno2.getNomeEscola());
        System.out.println("Sua serie: " + aluno2.getSerieMatriculado());

        Aluno aluno3 = new Aluno();/*Aqui seŕa o Pedro*/

        Aluno aluno4 = new Aluno("Maria");

        Aluno aluno5 = new Aluno("José, 50");


    }
}