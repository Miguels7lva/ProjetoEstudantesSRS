package interfaces;

public interface CRUD<T> {

    void criar(T obj);

    void atualizar(T obj);

    void remover(int id);

    T buscar(int id);
}