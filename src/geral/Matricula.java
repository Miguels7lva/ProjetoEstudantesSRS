package geral;

public class Matricula {

    private int id;
    private String dataMatricula;
    private String status;

    private Estudante estudante;
    private Disciplina disciplina;

    public Matricula() {
    }

    public Matricula(int id,
                     String dataMatricula,
                     String status,
                     Estudante estudante,
                     Disciplina disciplina) {

        this.id = id;
        this.dataMatricula = dataMatricula;
        this.status = status;
        this.estudante = estudante;
        this.disciplina = disciplina;
    }

    public int getId() {
        return id;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public String getStatus() {
        return status;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Matrícula #" + id +
                " | Aluno: " + estudante.getNome() +
                " | Disciplina: " + disciplina.getNome() +
                " | Status: " + status;
    }
}