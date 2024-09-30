package utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.FaturamentoDiario;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class JsonReader {

    public List<FaturamentoDiario> lerFaturamentos() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        // Acesse o arquivo JSON a partir da pasta resources
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("data/dados.json");

        if (inputStream == null) {
            throw new FileNotFoundException("Arquivo não encontrado");
        }

        // Desserializa o JSON em uma lista de FaturamentoDiario
        return objectMapper.readValue(inputStream, new TypeReference<List<FaturamentoDiario>>() {});
    }
}
