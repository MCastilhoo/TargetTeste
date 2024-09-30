import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> faturamento = Map.of(
                "SP" , 67836.43, "RJ", 36678.66,
                "MG" , 29229.88, "ES", 27165.48,
                "Outros", 19849.53
        );

        double faturamentoTotal = 0.0;
        for (double valor : faturamento.values()) {
            faturamentoTotal += valor;
        }

        for (Map.Entry entry : faturamento.entrySet()) {
            String estado  = entry.getKey().toString();
            double valor = (double)entry.getValue();
            double percentual = (valor / faturamentoTotal) * 100;
            System.out.printf("%s: %.2f%%\n", estado, percentual);
        }

    }
}
