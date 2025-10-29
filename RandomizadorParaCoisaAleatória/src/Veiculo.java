import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Veiculo {

    public static List<String> listaVeiculos() {
        String[] veiculos = {
            "Teleférico", "Navio de guerra", "Carro-forte", "Helicóptero", "Trator", "Mini caminhão",
            "Carrinho de golfe", "Carro elétrico", "Iate", "Ônibus espacial", "Snowmobile", "Foguete",
            "Carro de polícia", "Trenó", "Vagão de metrô", "Porta-aviões", "Van", "Triciclo motorizado",
            "Avião comercial", "Micro-ônibus", "Tanque de guerra", "Drone", "Carro híbrido", "Empilhadeira",
            "Carro de corrida", "Caminhão de lixo", "Avião cargueiro", "Segway", "Motocicleta",
            "Caminhão cegonha", "Carrinho elétrico", "Fragata", "Retroescavadeira", "Planador",
            "Carro conversível", "Avião", "Barco", "Canoa", "Carreta", "Helicóptero de combate",
            "SUV", "Balsa", "Carro utilitário", "Caminhão betoneira", "Bonde", "Ônibus",
            "Navio de cruzeiro", "Limusine", "Triciclo", "Ferryboat", "Metrô", "Submarino nuclear",
            "Caminhão", "Cargueiro", "Locomotiva", "Navio pesqueiro", "Patinete", "Carro de luxo",
            "Estação espacial", "Planador ultraleve", "Guindaste", "Carro anfíbio", "Helicóptero de resgate",
            "Colheitadeira", "Bicicleta", "Carro", "Navio", "Caça militar", "Quadriciclo", "Perua",
            "Jet ski", "Carro de apoio técnico", "Bote inflável", "Trem-bala", "Trem", "Módulo lunar",
            "Carro de transporte escolar", "Ônibus espacial", "Caminhão de bombeiros", "Caminhão pipa",
            "Submarino", "Dirigível", "Veículo de exploração", "Carro de passeio", "Caminhão de entrega",
            "Ambulância", "Tanque de guerra", "Droner espacial", "Funicular", "Nave espacial",
            "Carro de corrida", "Pickup", "Carro conversível", "Satélite", "Kart", "Monociclo",
            "Escavadeira", "Trator de esteira", "Navio de cruzeiro", "Carro-forte", "Blindado",
            "Helicóptero de resgate", "Caminhão refrigerado", "Draga", "Caminhão cegonha", "Jato particular",
            "Rover", "Carrinho elétrico", "Triciclo motorizado", "Perua", "Helicóptero de combate",
            "Caminhão de entrega", "Planador", "Limusine", "Caça militar", "Carro de luxo"
        };

        List<String> listaVeiculos = new ArrayList<String>();
        Collections.addAll(listaVeiculos, veiculos);
        return listaVeiculos;
    }
}