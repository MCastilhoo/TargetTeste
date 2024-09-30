package utils;

import model.FaturamentoDiario;

import java.util.List;

public class Calculator {

    public static double calcularMenorFaturamento(List<FaturamentoDiario> faturamentos) {
        double menorFaturamento = Double.MAX_VALUE;

        for (FaturamentoDiario faturamento : faturamentos) {
            double valor = faturamento.getValor();
            if (valor > 0 && valor < menorFaturamento) {
                menorFaturamento = valor;
            }
        }

        // Retorna 0 se não houver dias com faturamento
        return menorFaturamento == Double.MAX_VALUE ? 0 : menorFaturamento;
    }

    public static double calcularMaiorFaturamento(List<FaturamentoDiario> faturamentos) {
        double maiorFaturamento = Double.MIN_VALUE;

        for (FaturamentoDiario faturamento : faturamentos) {
            double valor = faturamento.getValor();
            if (valor > maiorFaturamento) {
                maiorFaturamento = valor;
            }
        }

        // Retorna 0 se não houver dias com faturamento
        return maiorFaturamento == Double.MIN_VALUE ? 0 : maiorFaturamento;
    }

    public static double calcularMediaMensal(List<FaturamentoDiario> faturamentos) {
        double somaFaturamentos = 0.0;
        int diasComFaturamento = 0;

        for (FaturamentoDiario faturamento : faturamentos) {
            double valor = faturamento.getValor();
            if (valor > 0) { // Considera apenas os dias com faturamento
                somaFaturamentos += valor;
                diasComFaturamento++;
            }
        }

        return diasComFaturamento > 0 ? somaFaturamentos / diasComFaturamento : 0;
    }

    public static int calcularDiasAcimaDaMedia(List<FaturamentoDiario> faturamentos, double mediaMensal) {
        int diasComFaturamentoSuperiorAMedia = 0;

        for (FaturamentoDiario faturamento : faturamentos) {
            double valor = faturamento.getValor();
            if (valor > mediaMensal) {
                diasComFaturamentoSuperiorAMedia++;
            }
        }

        return diasComFaturamentoSuperiorAMedia;
    }
}
