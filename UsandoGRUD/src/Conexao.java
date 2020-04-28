import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class Conexao {

	public static void main(String[] args) throws Exception {
		MongoClient mongoClient = (MongoClient) createConnectionToMyMongoDB();		

		if (mongoClient != null) {
			System.out.println("Conexão obtida com sucesso!");
			((MongoClient) mongoClient).close();
		}
		
		mongoClient.close();
	
	}

	public static MongoClient createConnectionToMyMongoDB() throws Exception {

		MongoClient mongoClient = MongoClients.create();
		System.out.println("servidor conectado com sucesso");

		return (MongoClient) mongoClient;

	}	
	
	
}
