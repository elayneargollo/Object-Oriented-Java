import java.util.LinkedHashMap;
import java.util.Map;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class JogadorDAO {

	static MongoCollection<Document> jogadores;
	Document doc;

	public JogadorDAO() throws Exception {
		this.doc = new Document();
		
		MongoClient con = Conexao.createConnectionToMyMongoDB();
		MongoDatabase bancoDeDados = con.getDatabase("jogoMemoria");
		jogadores = bancoDeDados.getCollection("jogador"); 
	}

	public void inserir(Jogador jogador) throws Exception {		
		doc.put("nomeJogador", jogador.getNomeJogador());
		doc.put("pontuacao", jogador.getPontuacao());
		jogadores.insertOne(doc);
	}


	public void update(Jogador jogador) throws Exception {
		
		if (procurarJogador(jogador)) {

			Document found = (Document) jogadores.find(new Document("nomeJogador", jogador.getNomeJogador())).first();

			if (found != null) {
				System.out.println("found user");

				Bson updatevalue = new Document("pontuacao", jogador.getPontuacao()); // procura pela chave e seta o novo valor
				Bson updateoperation = new Document("$set", updatevalue); // ele atualiza de fato
				jogadores.updateOne(found, updateoperation); // atualiza um unico documento

			}
		}
	}


	public void mostrar() throws Exception {
		
		Map<String, String> mapCache = buscaOrdenada();

		for (String key : mapCache.keySet()) { 
			System.out.println(key + "\t\t\t" + mapCache.get(key) + "\n");
		}
	}

	private static Map<String, String> buscaOrdenada() {
		Map<String, String> result = new LinkedHashMap<String, String>();

		FindIterable<Document> docs = jogadores.find().sort(new BasicDBObject("pontuacao", -1)); 
		
		for (Document doc : docs) {
			result.put(((doc.getString("nomeJogador"))), (doc.getString("pontuacao")));
		}

		return result;
	}
	
	public boolean isMaior(Jogador jogador) {
		FindIterable<Document> iterable = jogadores.find(doc.append("nomeJogador", jogador.getNomeJogador()));
		MongoCursor<Document> cursor = iterable.iterator();

		while (cursor.hasNext()) {

			int pontosNoBanco = Integer.parseInt(cursor.next().getString("pontuacao"));
			int pontosAtual = Integer.parseInt(jogador.getPontuacao());

			if (pontosNoBanco < pontosAtual) {
				return true;
			}
		}

		return false;
	}
	
	public boolean procurarJogador(Jogador jogador) {
		FindIterable<Document> iterable = jogadores.find(doc.append("nomeJogador", jogador.getNomeJogador()));
		MongoCursor<Document> cursor = iterable.iterator();

		while (cursor.hasNext()) {
			return true;
		}
		return false;
	}

}
