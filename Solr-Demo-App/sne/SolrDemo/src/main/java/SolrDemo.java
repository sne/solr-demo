import java.io.IOException;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.apache.solr.common.SolrInputDocument;

public class SolrDemo {

	private static String solrServerUrl = "http://localhost:8983/solr/sne_core/";
	
	/**
	 * https://cwiki.apache.org/confluence/display/solr/Using+SolrJ
	 * @throws IOException 
	 * @throws SolrServerException 
	 */
	public static void postDocument() throws SolrServerException, IOException {
		SolrClient solr = new HttpSolrClient(solrServerUrl);
		
		SolrInputDocument document = new SolrInputDocument();
		document.addField("id", "552199");
		document.addField("name", "Gouda cheese wheel");
		document.addField("price", "49.99");
		UpdateResponse response = solr.add(document);
		 
		solr.commit();
	}
}