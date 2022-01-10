package jena;
import java.io.InputStream;

import org.apache.jena.iri.impl.Main;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFactory;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.query.ResultSetRewindable;
import org.apache.jena.rdf.model.Literal;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.util.FileManager;


public class truyvan {
//	public static void main(String[] args) {
//	FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
//	Model model=FileManager.get().loadModel("D://jena-xml/dulieu.rdf");
//	String queryString="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
//			+ "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#>"
//			+ " SELECT * WHERE  {"
//			//+ "?FN vcard:NAME ?x." //Truy vấn tên
//			+ "?FN vcard:ADR ?x." //truy vấn địa chỉ
//			+ " } ";
//	Query query=QueryFactory.create(queryString);
//	QueryExecution qexec= QueryExecutionFactory.create(query, model);
//	try {
//		ResultSet results=qexec.execSelect();
//		while (results.hasNext()) {
//			QuerySolution soln=results.nextSolution();
//			Literal name=soln.getLiteral("x");
//			System.out.println("ADR: "+name);
//		}
//	} finally {
//		qexec.close();
//	}
//}
public static void main(String[] args) {
	FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
	Model model=FileManager.get().loadModel("D://jena-xml/dulieu.rdf");
	String queryString="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
			+ "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#>"
			+ " SELECT * WHERE  {"
			+ "?FN vcard:NAME ?x." 
			//+ "?FN vcard:EMAIL ?y." 
			+ " } ";
	Query query=QueryFactory.create(queryString);
	QueryExecution qexec= QueryExecutionFactory.create(query, model);
	try {
		ResultSet results=qexec.execSelect();
		while (results.hasNext()) {
			QuerySolution soln=results.nextSolution();
			Literal name=soln.getLiteral("x");
			Literal name1=soln.getLiteral("y");
			System.out.println("Họ và tên: "+name);
			//System.out.println("Email"+name1);
		}
	} finally {
		qexec.close();
	}
}
//public static void main(String[] args) {
//	FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
//	Model model=FileManager.get().loadModel("D://jena-xml/dulieu.rdf");
//	String queryString="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
//			+ "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#>"
//			+ " SELECT * WHERE  {"
//			+ "?FN vcard:NAME ?x." 
//			//+ "?FN vcard:EMAIL ?y." 
//			+ " } ";
//	Query query=QueryFactory.create(queryString);
//	QueryExecution qexec= QueryExecutionFactory.create(query, model);
//	try {
//		ResultSet results=qexec.execSelect();
//		while (results.hasNext()) {
//			QuerySolution soln=results.nextSolution();
//			Literal name=soln.getLiteral("x");
//			Literal name1=soln.getLiteral("y");
//			System.out.println("Họ và tên: "+name);
//			//System.out.println("Email"+name1);
//		}
//	} finally {
//		qexec.close();
//	}
//}
//public static void main(String[] args) {
//	FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
//	Model model=FileManager.get().loadModel("D://jena-xml/dulieu.rdf");
//	String queryString="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
//			+ "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#>"
//			+ " SELECT * WHERE  {"
//			+ "?coutry vcard:NAME ?x." 
//			+ "?coutry vcard:ADR ?y." 
//			+ " } ";
//	Query query=QueryFactory.create(queryString);
//	QueryExecution qexec= QueryExecutionFactory.create(query, model);
//	try {
//		ResultSet results=qexec.execSelect();
//		while (results.hasNext()) {
//			QuerySolution soln=results.nextSolution();
//			Literal name=soln.getLiteral("x");
//			Literal name1=soln.getLiteral("y");
//			System.out.println("Họ và tên:"+name);
//			System.out.println("ADR: "+name1);
//		}
//	} finally {
//		qexec.close();
//	}
//}

	// Tìm tên, địa chỉ theo tên thành viên
//	public static void main(String[] args) {
//		FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
//		Model model=FileManager.get().loadModel("D://jena-xml/dulieu.rdf");
//		String queryString="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
//				+ "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#>"
//				+ "PREFIX dc:<http://purl.org/dc/elements/1.1/>"
//				+ "PREFIX j.0:<http://semanticweb-lear/>"
//				+ "PREFIX j.1:<http://xmlns.com/foaf/0.1/>"
//				+ " SELECT * WHERE  {"
//				+ "?FN vcard:NAME ?x."
//				+ "?FN vcard:EMAIL ?y."
//				+ "FILTER(?x =\"Tran Van Hai Duong\")" 
//				+ " } ";
//		Query query=QueryFactory.create(queryString);
//		QueryExecution qexec= QueryExecutionFactory.create(query, model);
//		try {
//			ResultSet results=qexec.execSelect();
//			while (results.hasNext()) {
//				QuerySolution soln=results.nextSolution();
//				Literal name=soln.getLiteral("x");
//				Literal name1=soln.getLiteral("y");
//				System.out.println("Tên thành viên: "+name);
//				System.out.println("Email: "+name1);
//				System.out.println("-------------------------------");
//			}
//		} finally {
//			qexec.close();
//		}
//	}
	
//	public static void main(String[] args) {
//		FileManager.get().addLocatorClassLoader(Main.class.getClassLoader());
//		Model model=FileManager.get().loadModel("D://jena-xml/dulieu.rdf");
//		String queryString="PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
//				+ "PREFIX vcard:<http://www.w3.org/2001/vcard-rdf/3.0#>"
//				+ "PREFIX dc:<http://purl.org/dc/elements/1.1/>"
//				+ "PREFIX j.0:<http://ww.w3.org/>"
//				+ "PREFIX j.1:<http://semanticweb-lear/>"
//				+ "PREFIX j.2:<http://xmlns.com/foaf/0.1/>"
//				+ " SELECT * WHERE  {"
//				+ "?FN vcard:NAME ?x."
//				+ "?FN vcard:EMAIL ?y."
//				+ "?FN rdf:predicate ?z."
//				+ "FILTER(?y =\"TvhDuong@w3.org\")" 
//				+ " } ";
//		Query query=QueryFactory.create(queryString);
//		QueryExecution qexec= QueryExecutionFactory.create(query, model);
//		try {
//			ResultSet results=qexec.execSelect();
//			while (results.hasNext()) {
//				QuerySolution soln=results.nextSolution();
//				Literal name=soln.getLiteral("x");
//				Literal name1=soln.getLiteral("y");
//				Literal name2=soln.getLiteral("z");
//				System.out.println("Tên thành viên: "+name);
//				System.out.println("Email: "+name1);
//				System.out.println(name2);
//				System.out.println("-----------------------");
//			}
//		} finally {
//			qexec.close();
//		}
//	}

}
