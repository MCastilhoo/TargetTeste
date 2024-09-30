import model.FaturamentoDiario;
import utils.Calculator;
import utils.JsonReader;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JsonReader jsonReader = new JsonReader();

        try {
            List<FaturamentoDiario> faturamentos = jsonReader.lerFaturamentos();

            double menorFaturamento = Calculator.calcularMenorFaturamento(faturamentos);
            double maiorFaturamento = Calculator.calcularMaiorFaturamento(faturamentos);
            double mediaMensal = Calculator.calcularMediaMensal(faturamentos);
            int diasComFaturamentoSuperiorAMedia = Calculator.calcularDiasAcimaDaMedia(faturamentos, mediaMensal);

            System.out.println("Menor valor de faturamento: " + menorFaturamento);
            System.out.println("Maior valor de faturamento: " + maiorFaturamento);
            System.out.println("Número de dias com faturamento superior à média mensal: " + diasComFaturamentoSuperiorAMedia);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
