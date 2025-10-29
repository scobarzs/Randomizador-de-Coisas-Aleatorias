import java.util.ArrayList;
import java.util.List;

public class Qualquer {

	public static List<String> listaTudo(){
		List<String> tudo = new ArrayList<String>();
		tudo.addAll(Objeto.listaObjetos());
		tudo.addAll(Estrutura.listaEstruturas());
		tudo.addAll(Animal.listaAnimais());
		tudo.addAll(Parte.listaPartes());
		tudo.addAll(Veiculo.listaVeiculos());
		tudo.addAll(Planta.listaPlantas());
		tudo.addAll(Veste.listaVestes());
		return tudo;
	}
	
}
