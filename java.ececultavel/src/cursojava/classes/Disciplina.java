package cursojava.classes;

import java.util.Objects;

public class Disciplina {

    private double nota;
    private String disciplinas;

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getDisciplina() {
        return disciplinas;
    }

    public void setDisciplina(String disciplina) {
        this.disciplinas = disciplina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Disciplina that)) return false;
        return Double.compare(that.getNota(), getNota()) == 0 && Objects.equals(getDisciplina(), that.getDisciplina());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNota(), getDisciplina());
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nota=" + nota +
                ", disciplina='" + disciplinas + '\'' +
                '}';
    }
}


