package cursojava.classes;

//
/*Classe que representa o Aluno*/

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



    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }
    public double getMediaNota(){
        return (nota1 + nota2 + nota3 + nota4) / 4;
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

}
