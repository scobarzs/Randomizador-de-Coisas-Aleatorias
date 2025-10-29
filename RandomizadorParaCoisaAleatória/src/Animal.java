
import java.util.ArrayList;
import java.util.List;

public class Animal {

    public static List<String> listaAnimais() {
        String[] animais = {
            "Cachorro", "Gato", "Coelho", "Hamster", "Porquinho-da-índia", "Papagaio", "Periquito", 
            "Canário", "Peixe-dourado", "Tartaruga", "Cágado", "Calopsita", "Pato doméstico", "Galo", "Galinha",
            "Cavalo", "Vaca", "Boi", "Cabra", "Ovelha", "Burro", "Jumento", "Pônei",
            "Leão", "Tigre", "Leopardo", "Pantera", "Guepardo", "Elefante", "Rinoceronte", "Hipopótamo",
            "Girafa", "Zebra", "Antílope", "Búfalo", "Urso-pardo", "Urso-polar", "Gorila", "Chimpanzé",
            "Orangotango", "Macaco", "Lêmure", "Preguiça", "Tamanduá", "Lobo", "Raposa", "Hiena", 
            "Javali", "Veado", "Cervo", "Alce", "Bisão", "Canguru", "Coala", "Dingo",
            "Cobra", "Jiboia", "Sucuri", "Cascavel", "Anaconda", "Jacaré", "Crocodilo", "Lagarto",
            "Camaleão", "Iguana", "Gecko", "Sapo", "Rã", "Perereca", "Salamandra",
            "Águia", "Falcão", "Coruja", "Pomba", "Pardal", "Andorinha", "Beija-flor", "Tucano",
            "Arara", "Papagaio-do-mangue", "Garça", "Flamingo", "Pinguim", "Gaivota", "Avestruz",
            "Ema", "Galo-da-serra", "Corvo", "Urubu", "Canário", "Cardeal", "Maritaca",
            "Peixe-palhaço", "Tubarão", "Golfinho", "Baleia", "Orca", "Lula", "Polvo", "Camarão",
            "Caranguejo", "Lagosta", "Siri", "Estrela-do-mar", "Cavalo-marinho", "Foca", "Leão-marinho",
            "Lontra", "Tartaruga-marinha", "Moreia", "Raia", "Peixe-espada", "Peixe-boi", "Enguia",
            "Formiga", "Abelha", "Vespa", "Borboleta", "Mariposa", "Grilo", "Gafanhoto", "Besouro",
            "Joaninha", "Cupim", "Mosquito", "Mosca", "Libélula", "Caracol", "Lesma", "Aranha", 
            "Escorpião", "Carrapato", "Pulga", "Barata", "Louva-a-deus",
            "Tiranossauro Rex", "Tricerátopo", "Velociraptor", "Pterodátilo", "Estegossauro", "Braquiossauro",
            "Anquilossauro", "Espinossauro", "Megalodon",
            "Dragão", "Fênix", "Grifo", "Basilisco", "Hidra", "Quimera", "Unicórnio", "Pegaso", "Serpente-marinha",
            "Sereia", "Kraken", "Mantícora",
            "Lêmure", "Suricato", "Tatu", "Capivara", "Onça-pintada", "Jaguar", "Panda", "Lobo-guará",
            "Tamanduá-bandeira", "Guaxinim", "Lontra", "Texugo", "Morsa", "Narval", "Ornitorrinco",
            "Bicho-preguiça", "Quati", "Ouriço", "Esquilo", "Castor", "Rato", "Morcego", "Toucan", 
            "Coiote", "Furão", "Panda-vermelho"
        };

        List<String> listaAnimais = new ArrayList<String>();
        for (String animal : animais) {
            listaAnimais.add(animal);
        }
        return listaAnimais;
    }
}