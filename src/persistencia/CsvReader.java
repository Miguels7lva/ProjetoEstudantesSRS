package persistencia;

import geral.Estudante;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvReader {

    public static ArrayList<Estudante> carregarEstudantes() {

        ArrayList<Estudante> estudantes =
                new ArrayList<>();

        try {

            BufferedReader reader =
                    new BufferedReader(
                            new FileReader("estudantes.csv")
                    );

            String linha;

            reader.readLine();

            while ((linha = reader.readLine()) != null) {

                String[] dados =
                        linha.split(",");

                Estudante estudante =
                        new Estudante(
                                Integer.parseInt(dados[0]),
                                dados[1],
                                dados[2],
                                dados[3],
                                dados[4]
                        );

                estudantes.add(estudante);

            }

            reader.close();

            System.out.println(
                    "Estudantes carregados com sucesso!"
            );

        } catch (IOException e) {

            System.out.println(
                    "Arquivo não encontrado."
            );

        }

        return estudantes;
    }
}