	import java.io.IOException;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.common.SolrInputDocument;
public class Create {
	
	public static void main(String[] args) throws SolrServerException, IOException{
		createSNBHistoryBooks();
	  }

	public static void createSNBHistoryBooks() throws SolrServerException, IOException{
		SolrClient server = new HttpSolrClient("http://localhost:8983/solr/tawi_core");
	    for(int i=0;i<1000;++i) {
	      SolrInputDocument doc = new SolrInputDocument();
	      doc.addField("cat", "book");
	      doc.addField("id", "book-" + i);
	      doc.addField("name", "SNB History " + i);
	      server.add(doc);
	    }
	    server.commit();
	}
}


