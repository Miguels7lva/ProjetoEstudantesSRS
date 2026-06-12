package geral;
public class Administrador extends Usuario {

    private String cargo;

    public Administrador() {
    }

    public Administrador(int id,
                         String nome,
                         String email,
                         String cargo) {

        super(id, nome, email);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Cargo: " + cargo;
    }
}