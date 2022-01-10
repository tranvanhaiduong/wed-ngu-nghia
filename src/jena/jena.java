package jena;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.vocabulary.VCARD;


public class jena {
			public static void main(String[] args) {
				//tạo một model
				Model model = ModelFactory.createDefaultModel();
				
				//tạo ra resource trong model
				String nvtIRI = 	"http://semanticwed-learn/nvt";
				Resource nvt = model.createResource(nvtIRI);
				
				//bổ sung statment cho resource
				nvt.addProperty(VCARD.FN,"Name");
				
				//xử lý
				model.write(System.out);
			}

}
