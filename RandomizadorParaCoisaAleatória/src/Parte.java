import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parte {

    public static List<String> listaPartes() {
        String[] partes = {
            "Região torácica", "Ossos da coxa", "Crânio", "Cotovelo", "Sistema endócrino", 
            "Face", "Cabeça", "Pele", "Região abdominal", "Ossos do pé", 
            "Cabelo", "Sistema urinário", "Região dorsal", "Região craniana", "Sistema linfático",
            "Mão", "Ossos da mão", "Nariz", "Dente", "Ossos do tronco", 
            "Ossos do braço", "Região cervical", "Pé", "Joelho", "Barriga", 
            "Olho", "Ombro", "Ossos da canela", "Região frontal", "Braço", 
            "Região lateral", "Ossos das costelas", "Língua", "Tronco", "Queixo", 
            "Sistema reprodutor masculino", "Unha", "Perna", "Sistema nervoso", "Ossos da perna", 
            "Ossos do antebraço", "Ossos do pescoço", "Sistema muscular", "Sistema digestivo", "Tornozelo",
            "Ossos da coluna", "Ossos do quadril", "Região lombar", "Sistema respiratório", "Sistema reprodutor feminino",
            "Costas", "Peito", "Antebraço", "Calcanhar", "Dedo", 
            "Sistema esquelético", "Região pélvica", "Boca", "Coxa", "Quadril"
        };

        List<String> listaPartes = new ArrayList<String>();
        Collections.addAll(listaPartes, partes);
        Collections.shuffle(listaPartes);
        return listaPartes;
    }
}