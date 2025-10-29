import java.util.ArrayList;
import java.util.List;

public class Objeto {

	
	public static List<String> listaObjetos(){
		String[] objetos = {
			    "Mesa", "Cadeira", "Lápis", "Caneta", "Livro", "Caderno", "Computador", "Celular",
			    "Mouse", "Teclado", "Monitor", "Carregador", "Fone de ouvido", "Bolsa", "Mochila",
			    "Relógio", "Óculos", "Chave", "Carteira", "Controle remoto", "TV", "Ventilador",
			    "Abajur", "Lampada", "Janela", "Porta", "Tapete", "Travesseiro", "Cobertor",
			    "Toalha", "Sabonete", "Shampoo", "Escova de dentes", "Pasta de dente", "Chuveiro",
			    "Fogão", "Geladeira", "Micro-ondas", "Liquidificador", "Prato", "Copo", "Talher",
			    "Panela", "Frigideira", "Garrafa", "Caneca", "Cortina", "Espelho", "Quadro",
			    "Caixa", "Envelope", "Canivete", "Martelo", "Chave de fenda", "Alicate", "Serrote",
			    "Prego", "Parafuso", "Régua", "Tesoura", "Cola", "Fita adesiva", "Grampeador",
			    "Papel", "Agenda", "Mapa", "Bússola", "Lanterna", "Vela", "Isqueiro", "Fogareiro",
			    "Barraca", "Saco de dormir", "Bota", "Capacete", "Luvas", "Cinto", "Boné",
			    "Guarda-chuva", "Casaco", "Camisa", "Calça", "Meias", "Tênis", "Sapato", "Sandália",
			    "Bicicleta", "Patins", "Skate", "Capacete de ciclismo", "Roda", "Pneu", "Chassi",
			    "Volante", "Banco", "Airbag", "Cinto de segurança", "Buzina", "Farol", "Lanterna traseira",
			    "Combustível", "Óleo", "Filtro de ar", "Bateria", "Motor", "Porta-malas", "Retrovisor",
			    "Rádio", "GPS", "Painel", "Freio", "Embreagem", "Pedal", "Câmbio", "Rodas de liga leve",
			    "Drone", "Câmera", "Tripé", "Microfone", "Caixa de som", "Amplificador", "Violão",
			    "Guitarra", "Baixo", "Bateria (instrumento)", "Teclado musical", "Flauta", "Violino",
			    "Trompete", "Saxofone", "Piano", "Partitura", "Microchip", "Placa-mãe", "HD", "SSD",
			    "Pendrive", "Cartão de memória", "Modem", "Roteador", "Antena", "Cabo HDMI", "Cabo USB",
			    "Controle de videogame", "Console", "Cartucho", "Joystick", "Headset", "CD", "DVD",
			    "Disquete", "Vinil", "Caixa de ferramentas", "Estojo", "Caixa de correio", "Balão",
			    "Balde", "Escada", "Vassoura", "Pá", "Rodo", "Esponja", "Detergente", "Sabão em pó",
			    "Lixeira", "Cesto de roupa", "Prendedor", "Varal", "Ferro de passar", "Cabide",
			    "Tábua de passar", "Relógio de parede", "Calendário", "Termômetro", "Balança",
			    "Rádio relógio", "Despertador", "Cofre", "Bússola digital", "Caderno de anotações",
			    "Manual", "Contrato", "Documento", "Certificado", "Passaporte", "Bilhete", "Ingresso",
			    "Moeda", "Nota", "Cartão de crédito", "Cartão de visita", "Etiqueta", "Adesivo",
			    "Placa", "Letreiro", "Painel solar", "Bateria portátil", "Caixa de som bluetooth",
			    "Relógio inteligente", "Pulseira", "Anel", "Brinco", "Colar", "Pingente", "Broche",
			    "Perfume", "Desodorante", "Creme", "Maquiagem", "Espátula", "Pincel", "Tesoura pequena",
			    "Alicate de unha", "Lixa", "Esmalte", "Secador de cabelo", "Chapinha", "Escova de cabelo",
			    "Creme dental", "Sabonete líquido", "Shampoo seco", "Condicionador", "Toalha de rosto",
			    "Saboneteira", "Cesto de lixo", "Tapete de banheiro", "Espelho pequeno", "Pinça",
			    "Algodão", "Cotonete", "Termômetro corporal", "Curativo", "Atadura", "Seringa",
			    "Gaze", "Álcool", "Desinfetante", "Remédio", "Caixa de primeiros socorros", "Máscara",
			    "Luvas descartáveis", "Caneca térmica", "Garrafa de água", "Squeeze", "Cantil",
			    "Lanterna de cabeça", "Relógio de pulso", "Apito", "Cordão", "Chaveiro", "Documento de identidade",
			    "Carteira de motorista", "Moletom", "Lenço", "Boné de aba reta", "Gorro", "Gravata",
			    "Paletó", "Terno", "Vestido", "Saia", "Blusa", "Chapéu", "Chinelo", "Tênis esportivo",
			    "Jaqueta", "Camisa social", "Blazer", "Casaco de couro", "Luvas térmicas"
			};
		List<String> objetosList = new ArrayList<String>();
		for(String objeto:objetos) {
			objetosList.add(objeto);
		}
		return objetosList;
	}
	
	
}
