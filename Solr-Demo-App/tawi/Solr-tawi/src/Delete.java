import java.io.IOException;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;


public class Delete {

	private static SolrClient server = new HttpSolrClient("http://localhost:8983/solr/tawi_core");
	
	public static void main(String[] args) throws SolrServerException, IOException{
		deleteByName("SNB History");
	}
	
	public static void deleteById(String id) throws SolrServerException, IOException{
	    server.deleteById(id);
	    server.commit();
	  }
	
	public static void deleteByName(String query) throws SolrServerException, IOException{
	    server.deleteByQuery(query);
	    server.commit();
	  }
}





