import java.util.ArrayList;
import java.util.List;

public class Veste {

    public static List<String> listaVestes() {
        String[] vestes = {
            "Terno", "Blazer", "Camisa social", "Gravata", "Paletó", "Colete",
            "Calça social", "Saia lápis", "Vestido de gala", "Camisa de botão",
            "Camiseta", "Jeans", "Shorts", "Moletom", "Calça cargo", "Regata", "Blusa de frio",
            "Saia casual", "Vestido casual", "Camisa polo", "Hoodie", "Jaqueta jeans", "Camisa xadrez",
            "Legging", "Calça de moletom", "Top esportivo", "Camiseta de treino", "Shorts esportivo",
            "Tênis esportivo", "Jaqueta esportiva", "Moleton esportivo", "Meia esportiva",
            "Casaco", "Jaqueta", "Trench coat", "Sobretudo", "Capa de chuva", "Parka",
            "Colete acolchoado", "Poncho", "Chapéu de inverno", "Gorro",
            "Boné", "Chapéu", "Cachecol", "Luvas", "Cinto", "Gravata borboleta", "Óculos de sol",
            "Óculos de grau", "Relógio de pulso", "Pulseira", "Colar", "Brinco", "Anel", "Mochila",
            "Bolsa", "Carteira", "Lenço", "Meia", "Sandália", "Tênis casual", "Sapato social",
            "Bota", "Chinelo", "Sapato de salto", "Mocassim",
            "Maiô", "Biquíni", "Sunga", "Short de banho", "Chapéu de palha", "Camiseta regata leve",
            "Saída de praia", "Sandália de dedo", "Óculos de sol verão",
            "Conjunto esportivo", "Conjunto casual", "Conjunto formal", "Conjunto de festa",
            "Roupa de gala", "Roupa de inverno", "Roupa de verão", "Roupa de trabalho",
            "Roupa de dormir", "Pijama", "Roupão", "Uniforme escolar", "Uniforme profissional",
            "Traje típico", "Traje tradicional", "Fantasia"
        };

        List<String> listaVestes = new ArrayList<>();
        for (String veste : vestes) {
            listaVestes.add(veste);
        }
        return listaVestes;
    }
}