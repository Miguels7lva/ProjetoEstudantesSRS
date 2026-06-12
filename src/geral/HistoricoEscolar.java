package geral;
import java.util.ArrayList;
import java.util.List;

public class HistoricoEscolar {

    private int id;

    private Estudante estudante;

    private List<Nota> notas;

    public Estudante getEstudante() {
        return estudante;
    }

    public HistoricoEscolar() {
        notas = new ArrayList<>();
    }

    public HistoricoEscolar(int id, Estudante estudante) {
        this.id = id;
        this.estudante = estudante;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(Nota nota) {
        notas.add(nota);
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public double calcularMedia() {

        if (notas.isEmpty()) {
            return 0;
        }

        double soma = 0;

        for (Nota nota : notas) {
            soma += nota.getValor();
        }

        return soma / notas.size();
    }

    @Override
    public String toString() {

        StringBuilder texto = new StringBuilder();

        texto.append("\n=== HISTÓRICO ESCOLAR ===\n");
        texto.append("Aluno: ")
                .append(estudante.getNome())
                .append("\n");

        for (Nota nota : notas) {
            texto.append(nota).append("\n");
        }

        texto.append("Média: ")
                .append(calcularMedia());

        return texto.toString();
    }
}