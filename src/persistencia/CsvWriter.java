package persistencia;

import geral.Estudante;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CsvWriter {

    public static void salvarEstudantes(
            ArrayList<Estudante> estudantes) {

        try {

            FileWriter writer =
                    new FileWriter("estudantes.csv");

            writer.write(
                    "id,nome,email,matricula,curso\n"
            );

            for (Estudante e : estudantes) {

                writer.write(
                        e.getId() + "," +
                                e.getNome() + "," +
                                e.getEmail() + "," +
                                e.getMatricula() + "," +
                                e.getCurso() + "\n"
                );

            }

            writer.close();

            System.out.println(
                    "Estudantes salvos com sucesso!"
            );

        } catch (IOException e) {

            System.out.println(
                    "Erro ao salvar arquivo."
            );

        }
    }
}