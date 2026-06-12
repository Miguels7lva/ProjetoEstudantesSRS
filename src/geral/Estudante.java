package geral;

public class Estudante extends Usuario {

    private String matricula;
    private String curso;

    public Estudante() {
    }

    public Estudante(int id,
                     String nome,
                     String email,
                     String matricula,
                     String curso) {

        super(id, nome, email);

        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Matrícula: " + matricula
                + " | Curso: " + curso;
    }
}