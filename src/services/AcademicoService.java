package services;

import geral.*;

import java.util.ArrayList;
import java.util.Scanner;

public class AcademicoService {

    public void cadastrarEstudante(
            Scanner scanner,
            ArrayList<Estudante> estudantes,
            ArrayList<HistoricoEscolar> historicos) {

        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();

        System.out.print("Curso: ");
        String curso = scanner.nextLine();

        Estudante estudante =
                new Estudante(
                        id,
                        nome,
                        email,
                        matricula,
                        curso
                );

        estudantes.add(estudante);

        HistoricoEscolar historico =
                new HistoricoEscolar(
                        historicos.size() + 1,
                        estudante
                );

        historicos.add(historico);

        System.out.println("Estudante cadastrado!");
    }

    public void cadastrarDisciplina(
            Scanner scanner,
            ArrayList<Disciplina> disciplinas) {

        System.out.print("Código da disciplina: ");
        String codigo = scanner.nextLine();

        System.out.print("Nome da disciplina: ");
        String nomeDisciplina = scanner.nextLine();

        System.out.print("Carga Horária: ");
        int cargaHoraria = scanner.nextInt();
        scanner.nextLine();

        Disciplina disciplina =
                new Disciplina(
                        codigo,
                        nomeDisciplina,
                        cargaHoraria
                );

        disciplinas.add(disciplina);

        System.out.println("Disciplina cadastrada com sucesso!");
    }

    public void realizarMatricula(
            Scanner scanner,
            ArrayList<Estudante> estudantes,
            ArrayList<Disciplina> disciplinas,
            ArrayList<Matricula> matriculas) {

        if(estudantes.isEmpty()) {
            System.out.println("Não existem estudantes cadastrados.");
            return;
        }

        if(disciplinas.isEmpty()) {
            System.out.println("Não existem disciplinas cadastradas.");
            return;
        }

        System.out.println("\n=== ESTUDANTES ===");

        for(int i = 0; i < estudantes.size(); i++) {

            System.out.println(
                    i + " - " +
                            estudantes.get(i).getNome()
            );

        }

        System.out.print("Escolha o estudante: ");
        int indiceEstudante = scanner.nextInt();

        if(indiceEstudante < 0 ||
                indiceEstudante >= estudantes.size()) {

            System.out.println("Estudante inválido!");
            return;
        }

        System.out.println("\n=== DISCIPLINAS ===");

        for(int i = 0; i < disciplinas.size(); i++) {

            System.out.println(
                    i + " - " +
                            disciplinas.get(i).getNome()
            );

        }

        System.out.print("Escolha a disciplina: ");
        int indiceDisciplina = scanner.nextInt();
        scanner.nextLine();

        if(indiceDisciplina < 0 ||
                indiceDisciplina >= disciplinas.size()) {

            System.out.println("Disciplina inválida!");
            return;
        }

        Matricula matricula =
                new Matricula(
                        matriculas.size() + 1,
                        "2026-06-12",
                        "ATIVA",
                        estudantes.get(indiceEstudante),
                        disciplinas.get(indiceDisciplina)
                );

        matriculas.add(matricula);

        System.out.println("Matrícula realizada com sucesso!");
    }

    public void registrarNota(
            Scanner scanner,
            ArrayList<HistoricoEscolar> historicos) {

        if(historicos.isEmpty()) {

            System.out.println(
                    "Nenhum histórico encontrado."
            );

            return;
        }

        System.out.println("\n=== ESTUDANTES ===");

        for(int i = 0; i < historicos.size(); i++) {

            System.out.println(
                    i + " - " +
                            historicos.get(i)
                                    .getEstudante()
                                    .getNome()
            );

        }

        System.out.print("Escolha o estudante: ");
        int indiceHistorico = scanner.nextInt();
        scanner.nextLine();

        if(indiceHistorico < 0 ||
                indiceHistorico >= historicos.size()) {

            System.out.println("Estudante inválido!");
            return;
        }

        System.out.print("Valor da nota: ");
        double valorNota = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Observação: ");
        String observacao = scanner.nextLine();

        Nota nota =
                new Nota(
                        indiceHistorico + 1,
                        valorNota,
                        observacao
                );

        historicos.get(indiceHistorico)
                .adicionarNota(nota);

        System.out.println("Nota registrada!");
    }

    public void consultarHistorico(
            Scanner scanner,
            ArrayList<HistoricoEscolar> historicos) {

        if(historicos.isEmpty()) {

            System.out.println(
                    "Nenhum histórico encontrado."
            );

            return;
        }

        System.out.println("\n=== ESTUDANTES ===");

        for(int i = 0; i < historicos.size(); i++) {

            System.out.println(
                    i + " - " +
                            historicos.get(i)
                                    .getEstudante()
                                    .getNome()
            );

        }

        System.out.print("Escolha o estudante: ");
        int indiceConsulta = scanner.nextInt();
        scanner.nextLine();

        if(indiceConsulta < 0 ||
                indiceConsulta >= historicos.size()) {

            System.out.println("Estudante inválido!");
            return;
        }

        System.out.println(
                historicos.get(indiceConsulta)
        );
    }

    public void listarEstudantes(
            ArrayList<Estudante> estudantes) {

        if(estudantes.isEmpty()) {

            System.out.println(
                    "Nenhum estudante cadastrado."
            );

            return;
        }

        for(Estudante estudante : estudantes) {

            System.out.println(estudante);

        }
    }

    public void listarDisciplinas(
            ArrayList<Disciplina> disciplinas) {

        if(disciplinas.isEmpty()) {

            System.out.println(
                    "Nenhuma disciplina cadastrada."
            );

            return;
        }

        for(Disciplina disciplina : disciplinas) {

            System.out.println(disciplina);

        }
    }

    public void listarMatriculas(
            ArrayList<Matricula> matriculas) {

        if(matriculas.isEmpty()) {

            System.out.println(
                    "Nenhuma matrícula encontrada."
            );

            return;
        }

        for(Matricula matricula : matriculas) {

            System.out.println(matricula);

        }
    }
}