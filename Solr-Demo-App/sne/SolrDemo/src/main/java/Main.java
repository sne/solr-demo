import java.io.IOException;

import org.apache.solr.client.solrj.SolrServerException;

public class Main {

	public static void main(String[] args) throws SolrServerException, IOException {
		System.out.println("Started...");
		
		SolrDemo.postDocument();
		
		System.out.println("Finished.");
	}
}