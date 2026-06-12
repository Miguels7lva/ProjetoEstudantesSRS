package geral;

public class DespesaAcademica {

    private int id;
    private String descricao;
    private double valor;
    private String data;

    private CategoriaDespesa categoria;

    public DespesaAcademica() {
    }

    public DespesaAcademica(int id,
                            String descricao,
                            double valor,
                            String data,
                            CategoriaDespesa categoria) {

        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }

    public CategoriaDespesa getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDespesa categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {

        return "Despesa #" + id +
                " | " + descricao +
                " | R$ " + valor +
                " | Categoria: " + categoria.getNome();
    }
}