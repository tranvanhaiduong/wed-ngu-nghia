package jena;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdfs.assembler.VocabRDFS;
import org.apache.jena.riot.system.Prefixes;
import org.apache.jena.sparql.vocabulary.FOAF;
import org.apache.jena.vocabulary.DC;
import org.apache.jena.vocabulary.RDF;
import org.apache.jena.vocabulary.SKOS;

import org.apache.jena.vocabulary.VCARD;
public class baithi {
	static Model creaModel() {
		// some definitions
		String personURI = "http://www.w3.org/Giangvien/TranThiPhuongChi";
		String lamViecTaiIRI ="http://semanticweb-lear/lamViecTai";
		String KhoaIRI = "http://ww.w3.org/DHKH/Khoa/CNTT";
		String subjectIRI = "http://ww.w3.org/TruongDH";
		String SchoolIRI = "http://ww.w3.org/DHKH";
		String givenName = "Tran Thi";
		String familyName = "Phuong Chi";
		String emailName = "TTPChi@w3.org";
		String fullName = givenName + " " + familyName;
		
		//Sinh viên khoa K42
		String personURIK42 = "http://www.w3.org/Khoa/K42";
		String KhoaK42IRI1 = "http://ww.w3.org/TruongCongVi";
		String givenName1 = "Truong Cong";
		String familyName1 = "Vi";
		String Class1  ="Lớp B";
		String emailName1 = "lnTri1@w3.org";
		String fullName1 = givenName1 + " " + familyName1;
		
		String KhoaK42IRI2 = "http://www.w3.org/TranVanHaiDuong";
		String givenName2 = "Tran Van Hai";
		String familyName2 = "Duong";
		String Class2  =" Lớp F";
		String emailName2 = "tvhDuong3@w3.org";
		String fullName2 = givenName2 + " " + familyName2;
		

	
		//Sinh viên khoa K43
		String personURIK43 = "http://www.w3.org/Khoa/K43";
		String KhoaK43IRI4 = "http://www.w3.org/NguyenKimNgan";
		String givenName4 = "Nguyen Kim";
		String familyName4 = "Ngan";
		String Class4  ="Lớp E";
		String emailName4 = "NKNgan@w3.org";
		String fullName4 = givenName4 + " " + familyName4;
		
		String KhoaK43IRI5 = "http://www.w3.org/VoDinhHuyNgoc";
		String givenName5 = "VoDinh";
		String familyName5 = "HuyNgoc";
		String Class5  ="Lớp A";
		String emailName5 = "VDHNgoc@w3.org";
		String fullName5 = givenName5 + " " + familyName5;
		
		// Sinh viên khoa K44
		String personURIK44 = "http://www.w3.org/Khoa/K44";
		String KhoaK44IRI6 = "http://ww.w3.org/HuynhTienAnh";
		String givenName6 = "Huynh Tien";
		String familyName6 = "Anh";
		String Class6  ="Lớp D";
		String emailName6 = "HuynhTienAnh@w3.org";
		String fullName6 = givenName6 + " " + familyName6;
		
		// create an empty Model
		Model model1 = ModelFactory.createDefaultModel();

		// create the resource
		// and add the properties cascading style
		Resource lmc = model1.createResource(SchoolIRI);
			Property lamViectai=model1.createProperty(lamViecTaiIRI);
		Resource laGiangvien = model1.createResource(KhoaIRI);
			Property subject=model1.createProperty(subjectIRI);
			model1.createResource(SchoolIRI).
				addProperty(subject, model1.createResource(personURIK42)
						.addProperty(VCARD.FN, model1.createResource(KhoaK42IRI1)
							.addProperty(VCARD.NAME, (fullName1))
							.addProperty(RDF.predicate, (Class1))
							.addProperty(VCARD.EMAIL, (emailName1))).
						addProperty(VCARD.FN, model1.createResource(KhoaK42IRI2)
							.addProperty(VCARD.NAME, (fullName2))
							.addProperty(RDF.predicate, (Class2))
							.addProperty(VCARD.EMAIL, (emailName2)))).
				addProperty(subject, model1.createResource(personURIK43).
						addProperty(VCARD.FN, model1.createResource(KhoaK43IRI4)
						.addProperty(VCARD.NAME, (fullName4))
						.addProperty(RDF.predicate, (Class4))
						.addProperty(VCARD.EMAIL, (emailName4))).
					addProperty(VCARD.FN, model1.createResource(KhoaK43IRI5)
						.addProperty(VCARD.NAME, (fullName5))
						.addProperty(RDF.predicate, (Class5))
						.addProperty(VCARD.EMAIL, (emailName5)))).
				addProperty(subject, model1.createResource(personURIK44).
						addProperty(VCARD.FN, model1.createResource(KhoaK44IRI6)
						.addProperty(VCARD.NAME, (fullName6))
						.addProperty(RDF.predicate, (Class6))
						.addProperty(VCARD.EMAIL, (emailName6))));
						
			lmc.addProperty(lamViectai, laGiangvien);
			lmc.addProperty(VCARD.ADR, (personURI));
			lmc.addProperty(VCARD.NAME, (fullName));
			lmc.addProperty( VCARD.EMAIL,(emailName));
			lmc.addProperty(DC.type, FOAF.Person);
			lmc.addProperty(FOAF.based_near,model1.createResource(personURIK42));
			return model1;
	}
///////////////////////////////////////////

	static void createAndPrintModel() {
		Model model1 =creaModel();
		// In nội dung của model dưới dạng mặc định (XML-RDF)
		model1.write(System.out);
	}
	
	public static void main(String[] args) {
		createAndPrintModel();
	}

}
