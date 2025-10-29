import java.util.ArrayList;
import java.util.List;

public class Material {

    public static List<String> listaMateriais() {
        String[] materiais = {
            "Madeira", "Aço", "Vidro", "Latão", "Borracha", "Plástico", "Cobre", "Bronze",
            "Papel", "Cerâmica", "Concreto", "Marfim", "Areia", "Tecido", "Lã", "Algodão",
            "Poliéster", "Linho", "Cimento", "Ferro fundido", "Carvão", "Grafite", "Pele sintética",
            "Couro", "Porcelana", "Espuma", "Acrílico", "Carbono", "Cristal", "Tinta", "Silicone",
            "Quartzo", "Titânio", "Ouro", "Prata", "Níquel", "Zinco", "Chumbo", "Platina",
            "Argila", "Pedra", "Granito", "Mármore", "Gesso", "Bambu", "Latéx", "Fibra de vidro",
            "Fibra de carbono", "Papelão", "Resina epóxi", "Teflon", "Nylon", "Polipropileno",
            "Polietileno", "Poliestireno", "Espuma acústica", "Espuma densa", "Espuma leve",
            "Concreto armado", "Vidro temperado", "Madeira compensada", "Aço inoxidável",
            "Metal galvanizado", "Cerâmica vitrificada", "Pele animal", "Vidro fosco", "Vidro colorido",
            "Metal escovado", "Metal polido", "Cobre oxidado", "Ferro enferrujado",
            "Tecido sintético", "Tecido grosso", "Tecido fino", "Lona", "Veludo",
            "Camurça", "Borracha natural", "Borracha sintética", "Espuma rígida",
            "Aço carbono", "Metal leve", "Metal pesado", "Silício", "Gelo", "Cera", "Óleo",
            "Petróleo", "Asfalto", "Concreto leve", "Porcelanato", "Vidro líquido", "Metal líquido",
            "Gás comprimido", "Espuma metálica", "Espuma plástica", "Ferro forjado",
            "Papel reciclado", "Tecido impermeável", "Tecido translúcido", "Plástico transparente",
            "Plástico opaco", "Material opaco", "Material translúcido", "Material reflexivo",
            "Material condutor", "Material isolante", "Material maleável", "Material rígido"
        };

        List<String> listaMateriais = new ArrayList<String>();
        for (String material : materiais) {
            listaMateriais.add(material);
        }
        return listaMateriais;
    }
}