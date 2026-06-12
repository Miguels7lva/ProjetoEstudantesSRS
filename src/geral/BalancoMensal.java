package geral;
import java.util.List;

public class BalancoMensal {

    private String mes;
    private double totalDespesas;

    public BalancoMensal(String mes) {
        this.mes = mes;
    }

    public void calcularTotal(List<DespesaAcademica> despesas) {

        totalDespesas = 0;

        for (DespesaAcademica despesa : despesas) {
            totalDespesas += despesa.getValor();
        }
    }

    public double getTotalDespesas() {
        return totalDespesas;
    }

    @Override
    public String toString() {

        return "Mês: " + mes +
                " | Total de despesas: R$ " +
                totalDespesas;
    }
}