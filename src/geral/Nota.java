package geral;

public class Nota {

    private int id;
    private double valor;
    private String observacao;

    public Nota() {
    }

    public Nota(int id, double valor, String observacao) {
        this.id = id;
        this.valor = valor;
        this.observacao = observacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "Nota: " + valor +
                " | Observação: " + observacao;
    }
}