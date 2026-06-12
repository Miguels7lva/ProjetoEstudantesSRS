package geral;

public class Professor extends Usuario {

    private String area;

    public Professor() {
    }

    public Professor(int id,
                     String nome,
                     String email,
                     String area) {

        super(id, nome, email);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Área: " + area;
    }
}