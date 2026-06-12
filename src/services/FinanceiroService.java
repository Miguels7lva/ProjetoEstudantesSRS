package services;

import geral.*;

import java.util.ArrayList;
import java.util.Scanner;

public class FinanceiroService {

    public void registrarDespesa(
            Scanner scanner,
            ArrayList<DespesaAcademica> despesas) {

        System.out.print("ID da despesa: ");
        int idDespesa = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.print("Valor: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Data: ");
        String data = scanner.nextLine();

        System.out.print("Categoria: ");
        String nomeCategoria = scanner.nextLine();

        CategoriaDespesa categoria =
                new CategoriaDespesa(
                        idDespesa,
                        nomeCategoria
                );

        DespesaAcademica despesa =
                new DespesaAcademica(
                        idDespesa,
                        descricao,
                        valor,
                        data,
                        categoria
                );

        despesas.add(despesa);

        System.out.println("Despesa registrada!");
    }

    public void gerarBalanco(
            Scanner scanner,
            ArrayList<DespesaAcademica> despesas) {

        if(despesas.isEmpty()) {

            System.out.println(
                    "Nenhuma despesa cadastrada."
            );

            return;
        }

        System.out.print("Informe o mês: ");
        String mes = scanner.nextLine();

        BalancoMensal balanco =
                new BalancoMensal(mes);

        balanco.calcularTotal(despesas);

        System.out.println(
                "\n=== BALANÇO MENSAL ==="
        );

        System.out.println(balanco);
    }

    public void listarDespesas(
            ArrayList<DespesaAcademica> despesas) {

        if(despesas.isEmpty()) {

            System.out.println(
                    "Nenhuma despesa cadastrada."
            );

            return;
        }

        for(DespesaAcademica despesa : despesas) {

            System.out.println(despesa);

        }
    }
}