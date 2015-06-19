import java.io.IOException;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;


public class Search {

	private static SolrClient server = new HttpSolrClient("http://localhost:8983/solr/tawi_core");
	
	public static void main(String[] args) throws SolrServerException, IOException{
		search("SNB History");
	}
	
	public static void search(String searchString) throws SolrServerException, IOException{
		SolrQuery query = new SolrQuery();
	    query.setQuery(searchString);
	    QueryResponse response = server.query(query);
	    SolrDocumentList results = response.getResults();
	    for (int i = 0; i < results.size(); ++i) {
	      System.out.println(results.get(i));
	    }
	    System.out.println(query.toString());
	  }
}





