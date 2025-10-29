import java.util.ArrayList;
import java.util.List;

public class Planta {

    public static List<String> listaPlantas() {
        String[] plantas = {
            // 🌸 Flores diversas
            "Rosa", "Tulipa", "Girassol", "Orquídea", "Violeta", "Margarida", "Cravo", "Lírio", 
            "Hibisco", "Camélia", "Jasmim", "Lavanda", "Petúnia", "Begônia", "Amor-perfeito",
            "Dália", "Crisântemo", "Narciso", "Íris", "Açucena", "Gerânio", "Flor-de-lótus",
            "Flor-de-maio", "Gérbera", "Flor-coral", "Azaleia", "Gloxínia", "Fúcsia", "Antúrio",

            // 🌳 Árvores
            "Carvalho", "Pinheiro", "Cedro", "Eucalipto", "Acácia", "Salgueiro", "Bétula", 
            "Oliveira", "Mogno", "Jacarandá", "Pau-brasil", "Manga", "Laranjeira", "Cerejeira", 
            "Macieira", "Pessegueiro", "Abeto", "Figueira", "Sequoia", "Bambuzal",

            // 🌿 Arbustos e plantas ornamentais
            "Hortênsia", "Azaléia", "Buxo", "Hibisco-anão", "Lavanda-anã", "Rhododendron",
            "Bromélia", "Samambaia", "Manjericão", "Alecrim", "Sálvia", "Tomilho", "Orégano",
            "Coentro", "Hortelã", "Erva-doce", "Capim-limão",

            // 🌱 Gramíneas e trepadeiras
            "Grama", "Bambuzinho", "Juncos", "Hera", "Jasmim-do-cabo", "Maracujá", "Trevo", "Feijão-trepador",
            "Uva-trepadeira", "Cipó", "Bougainville", "Glória-da-manhã", "Ipomeia", "Chapéu-de-sol",

            // 🌾 Plantas medicinais e comestíveis
            "Aloe vera", "Camomila", "Calêndula", "Erva-cidreira", "Hortelã-pimenta", "Gengibre",
            "Alface", "Espinafre", "Rúcula", "Salsa", "Cebolinha", "Coentro", "Manjericão-sagrado",
            "Alecrim-do-campo", "Orégano-silvestre",

            // 🌊 Plantas aquáticas e marginais
            "Lírio-d'água", "Nenúfar", "Juncus aquático", "Algas", "Samambaia aquática",
            "Vassourinha-do-brejo", "Eichhornia crassipes", "Rabo-de-raposa", "Taboa"
        };

        List<String> listaPlantas = new ArrayList<>();
        for (String planta : plantas) {
            listaPlantas.add(planta);
        }
        return listaPlantas;
    }
}