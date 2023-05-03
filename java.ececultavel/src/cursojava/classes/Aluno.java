package cursojava.classes;

//
/*Classe que representa o Aluno*/

import java.util.Objects;

public class Aluno {

    /*Esses são os atributos don aluno*/
    private String nome;
    private int idade;
    private String dataNascimento;
    private String registroGeral;
    private String numeroCpf;
    private String nomeMae;
    private String nomePai;
    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    private Disciplina disciplina = new Disciplina();

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Aluno () {/*Cria os dados na memória - sendo padrão o Java*/

    }
    public Aluno(String nomePadrao){
        nome = nomePadrao;

    }
    public Aluno (String nomePadrao, int idadePadrao){
        nome = nomePadrao;
        idade = idadePadrao;
    }


    public double getMediaNota(){
        return (disciplina.getNota1() + disciplina.getNota2() + disciplina.getNota3() + disciplina.getNota4()) / 4;
    }

    /*Metodo que retona true para aprovado e false para reprovad.*/
    public boolean getAlunoAprovado(){
        double media = this.getMediaNota();
        if (media >= 70) {
            return true;
        }else {
            return false;
        }
    } public String getAlunoAprovado2(){
        double media = this.getMediaNota();
        if (media >= 70) {
            return "Aluno está aprovado";
        }else {
            return "Aluno está reprovado";
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return getIdade() == aluno.getIdade() && Objects.equals(getNome(), aluno.getNome()) && Objects.equals(getDataNascimento(), aluno.getDataNascimento()) && Objects.equals(getRegistroGeral(), aluno.getRegistroGeral()) && Objects.equals(getNumeroCpf(), aluno.getNumeroCpf()) && Objects.equals(getNomeMae(), aluno.getNomeMae()) && Objects.equals(getNomePai(), aluno.getNomePai()) && Objects.equals(getDataMatricula(), aluno.getDataMatricula()) && Objects.equals(getNomeEscola(), aluno.getNomeEscola()) && Objects.equals(getSerieMatriculado(), aluno.getSerieMatriculado()) && Objects.equals(getDisciplina(), aluno.getDisciplina());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getIdade(), getDataNascimento(), getRegistroGeral(), getNumeroCpf(), getNomeMae(), getNomePai(), getDataMatricula(), getNomeEscola(), getSerieMatriculado(), getDisciplina());
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", dataMatricula='" + dataMatricula + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                ", serieMatriculado='" + serieMatriculado + '\'' +
                ", disciplina=" + disciplina +
                '}';
    }
}
