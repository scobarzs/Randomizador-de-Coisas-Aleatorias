import java.util.ArrayList;
import java.util.List;

public class Estrutura {

	public static List<String> listaEstruturas() {
		String[] estruturas = { "Casa", "Prédio", "Barraco", "Cabana", "Mansão", "Apartamento", "Sobrados", "Chalé",
				"Bangâlo", "Castelo", "Fortaleza", "Palácio", "Templo", "Igreja", "Catedral", "Mosteiro", "Convento",
				"Mesquita", "Sinagoga", "Santuário", "Capela", "Hospital", "Posto de saúde", "Escola", "Universidade",
				"Faculdade", "Biblioteca", "Museu", "Teatro", "Cinema", "Estádio", "Ginásio", "Quadra esportiva",
				"Arena", "Piscina", "Clube", "Shopping", "Centro comercial", "Supermercado", "Mercado", "Feira", "Loja",
				"Restaurante", "Lanchonete", "Padaria", "Café", "Bar", "Pub", "Hotel", "Pousada", "Albergue", "Resort",
				"Hostel", "Garagem", "Estacionamento", "Oficina", "Posto de gasolina", "Lava-rápido", "Hangar",
				"Aeroporto", "Heliponto", "Estação de trem", "Estação de metrô", "Rodoviária", "Porto",
				"Terminal marítimo", "Fábrica", "Galpão", "Armazém", "Depósito", "Usina", "Siderúrgica", "Refinaria",
				"Mina", "Poço de petróleo", "Central elétrica", "Barragem", "Represa", "Dique", "Ponte", "Viaduto",
				"Passarela", "Túnel", "Farol", "Torre", "Arranha-céu", "Farol marítimo", "Moinho", "Forte", "Quartel",
				"Base militar", "Bunker", "Delegacia", "Presídio", "Penitenciária", "Tribunal", "Prefeitura",
				"Câmara municipal", "Congresso", "Palácio do governo", "Embaixada", "Consulado", "Correio",
				"Agência bancária", "Caixa eletrônico", "Banco central", "Bolsa de valores", "Laboratório",
				"Centro de pesquisa", "Observatório", "Planetário", "Zoológico", "Aquário", "Parque", "Praça",
				"Jardim botânico", "Cemitério", "Mausoléu", "Monumento", "Obelisco", "Estátua", "Memorial",
				"Museu histórico", "Fazenda", "Sítio", "Chácara", "Rancho", "Celeiro", "Estábulo", "Curral",
				"Cabana de caça", "Granja", "Galpão de ferramentas", "Casa de máquinas", "Estufa", "Horta", "Pomar",
				"Casa na árvore", "Barraca", "Tenda", "Viveiro", "Cabine", "Casebre", "Abrigo", "Alojamento", "Refúgio",
				"Base de pesquisa", "Centro de convenções", "Auditório", "Salão de festas", "Centro comunitário",
				"Abrigo público", "Creche", "Asilo", "Orfanato", "Centro de detenção", "Casa de repouso",
				"Casa noturna", "Boate", "Cassino", "Arena de eventos", "Pavilhão", "Galeria de arte", "Ateliê",
				"Estúdio", "Sala de gravação", "Sala de cinema", "Laboratório químico", "Usina nuclear",
				"Usina hidrelétrica", "Usina solar", "Usina eólica", "Subestação elétrica", "Antena de telecomunicação",
				"Estação de rádio", "Estação de TV", "Torre de transmissão", "Antena parabólica", "Servidor de dados",
				"Data center", "Centro logístico", "Posto policial", "Base aérea", "Farol de controle", "Casamata",
				"Fortificação antiga", "Ruína", "Templo antigo", "Ponte de pedra", "Aqüeduto", "Cisterna", "Poço",
				"Fonte", "Tanque", "Reservatório", "Caixa d’água", "Canal", "Esgoto", "Tubulação", "Silo",
				"Estação de tratamento de água", "Estação de tratamento de esgoto", "Incinerador",
				"Usina de reciclagem", "Centro de coleta seletiva", "Lixão", "Aterro sanitário", "Cabine telefônica",
				"Quiosque", "Banca de jornal", "Coreto", "Abrigo de ônibus", "Ponto de táxi", "Parada de ônibus",
				"Portaria", "Guarita", "Cancela", "Torre de observação", "Mirante", "Farol de vigia", "Casa flutuante",
				"Barco-casa", "Navio", "Submarino", "Base submarina", "Plataforma marítima", "Estrutura offshore",
				"Domo geodésico", "Estação espacial", "Colônia lunar", "Base marciana", "Observatório espacial",
				"Laboratório subaquático", "Tenda de campanha", "Abrigo de montanha", "Choupana", "Cabana de pescador",
				"Torre de controle", "Casarão antigo", "Ruína histórica", "Estalagem", "Cocheira", "Galpão agrícola" };
		List<String> listaEstruturas = new ArrayList<String>();
		for (String est : estruturas) {
			listaEstruturas.add(est);
		}
		return listaEstruturas;
	}

}
