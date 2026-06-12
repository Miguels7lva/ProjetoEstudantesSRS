import geral.*;
import persistencia.CsvReader;
import persistencia.CsvWriter;
import services.AcademicoService;
import services.FinanceiroService;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Estudante> estudantes = new ArrayList<>();
        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        ArrayList<Matricula> matriculas = new ArrayList<>();
        ArrayList<HistoricoEscolar> historicos = new ArrayList<>();
        ArrayList<DespesaAcademica> despesas = new ArrayList<>();

        AcademicoService academico =
                new AcademicoService();

        FinanceiroService financeiro =
                new FinanceiroService();

        int opcao;

        do {

            exibirMenu();

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    academico.cadastrarEstudante(
                            scanner,
                            estudantes,
                            historicos
                    );
                    break;

                case 2:
                    academico.cadastrarDisciplina(
                            scanner,
                            disciplinas
                    );
                    break;

                case 3:
                    academico.realizarMatricula(
                            scanner,
                            estudantes,
                            disciplinas,
                            matriculas
                    );
                    break;

                case 4:
                    academico.registrarNota(
                            scanner,
                            historicos
                    );
                    break;

                case 5:
                    academico.consultarHistorico(
                            scanner,
                            historicos
                    );
                    break;

                case 6:
                    financeiro.registrarDespesa(
                            scanner,
                            despesas
                    );
                    break;

                case 7:
                    financeiro.gerarBalanco(
                            scanner,
                            despesas
                    );
                    break;

                case 8:
                    academico.listarEstudantes(
                            estudantes
                    );
                    break;

                case 9:
                    academico.listarDisciplinas(
                            disciplinas
                    );
                    break;

                case 10:
                    academico.listarMatriculas(
                            matriculas
                    );
                    break;

                case 11:
                    financeiro.listarDespesas(
                            despesas
                    );
                    break;

                case 12:
                    CsvWriter.salvarEstudantes(
                            estudantes
                    );
                    break;

                case 13:

                    estudantes.clear();

                    estudantes.addAll(
                            CsvReader.carregarEstudantes()
                    );

                    System.out.println(
                            "Dados carregados."
                    );

                    break;

                case 0:
                    System.out.println(
                            "Encerrando sistema..."
                    );
                    break;

                default:
                    System.out.println(
                            "Opção inválida!"
                    );
            }

        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {

        System.out.println("\n===== SISTEMA SRS =====");
        System.out.println("1 - Cadastrar Estudante");
        System.out.println("2 - Cadastrar Disciplina");
        System.out.println("3 - Realizar Matrícula");
        System.out.println("4 - Registrar Nota");
        System.out.println("5 - Consultar Histórico");
        System.out.println("6 - Registrar Despesa");
        System.out.println("7 - Gerar Balanço");
        System.out.println("8 - Listar Estudantes");
        System.out.println("9 - Listar Disciplinas");
        System.out.println("10 - Listar Matrículas");
        System.out.println("11 - Listar Despesas");
        System.out.println("12 - Salvar Estudantes CSV");
        System.out.println("13 - Carregar Estudantes CSV");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");
    }
}