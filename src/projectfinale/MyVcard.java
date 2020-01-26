package projectfinale;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
/**
 * MyVcard est une classe a des attribut : name adresse email telephone
 * et des mothode  getters setters toString htmllines serialisation2 derserialisation2 firstInfo otherInfo clear vcard
 * @author @author labadi tarek  achraf bourassi
 *
 */


public class MyVcard implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String adresse;
	private String email;
	private	String  telephone;
	
	/**
	 * methode qui retourne  la valeur de name 
	 * @return String 
	 */
	
	public String getName() {
		return name;
	}
	/**
	 * methode qui change la valeur de name 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * methode qui retourne la valeur de adrsse 
	 * @return String 
	 */
	public String getAdresse() {
		return adresse;
	}
	/**
	 *  methode qui  change  la valeur de name
	 * @param adresse
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/**
	 *  methode qui retourne  la valeur de email
	 * @return String 
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * methode qui change la valeur de email
	 * @param email
	 */
	
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * methode qui retourne la valeur de telephone
	 * @return String 
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * methode qui change la valeur de telephone
	 * @param telephone
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	/**
	 * constructeur qui initialise les attributs 
	 * @param name
	 * @param adresse
	 * @param email
	 * @param telephone
	 */
	public MyVcard(String name, String adresse, String email, String telephone) {
		
		this.name = name;
		this.adresse = adresse;
		this.email = email;
		this.telephone = telephone;
		

	}
	
	
	
	@Override
	public String toString() {
		return "MyVcard [name=" + name + ", adresse=" + adresse + ", email=" + email + ", telephone=" + telephone
				+ "]";
	}
	
	
	/**
	 * methode qui fait la lecture d'un fichier.ser  et retourne un object de type MyVcard
	 * @param path : adresse de fichier.ser sur le disque dur  
	 * @return MyVcard
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 */

	
		public MyVcard derserialisation2 (String path) throws IOException,  ClassNotFoundException {
		MyVcard x=null;
			FileInputStream fis = new FileInputStream("E:\\projectfinale\\"+path);//    calendarSerialiser.txt
			ObjectInputStream ois = new ObjectInputStream(fis);
			MyVcard p =(MyVcard)ois.readObject();
			x=p;
			System.out.println("deserialisation marche");
			System.out.println("MY OBJECT : "+p);
			
			ois.close();
			return x;
		
	}
	
	
		
		/**
		 * methode qui fait le souvgarde des donnes sur fichier.ser "fichier binaire" sur lae disque dur   
		 * @param x :un object de la classe MyVcard
		 * @param path :adresse ou on trouve le fichier.ser
		 */
		
		public void serialisation2(MyVcard x,String path)  {
		try {
			FileOutputStream fois = new FileOutputStream("E:\\projectfinale\\"+path); // le vv.txt c un fichier sur disque dur 
			ObjectOutputStream os = new ObjectOutputStream(fois);			//    calendarSerialiser.txt
			os.writeObject(x);
			System.out.println("object serialisier");
			os.close();
			System.out.println("fermeture");
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}
	
/**
 * cette methode  genére un fragement html et l'ecrire sur un fichier.html
 * @param x :object de la classe MyVcard
 * @param path : adresse ou on trouve le fichier.html sur le disque dur
 * @throws IOException
 */
	
	public void htmlLines(MyVcard x,String path) throws IOException{
		List<String>htmllines= Arrays.asList("<div class=\"vcard\">","<span class=\"name\">"+x.getName()+"</span>","<span class=\"adresse\">"+x.getAdresse()+"</span>","<span class=\"type\">telephone</span>\t"+x.getTelephone(),"<span classe=\"email\">"+x.getEmail()+"</span>","<div>","<div>");
		
		FileWriter writer = new FileWriter("E:\\projectfinale\\"+path);
		BufferedWriter bw = new BufferedWriter(writer);
		for (String line : htmllines ) {
			bw.write(line);
			bw.newLine();
		}
		bw.close();
		writer.close();
		
	
	}
	

	
			
	
	
	
/**
 * la methode firstInfo qui consiste a lire le fichier.vcf et  prend les elements spécifique des premiers lignes de fichier.vcf
 * @param old : elemrnt spécifique qui on veut 	l'enlever 
 * @param lineNumber
 * @return String 
 * @throws IOException
 * @throws FileNotFoundException
 */
	
@SuppressWarnings("resource")
public String firstInfo(String old,int lineNumber) throws IOException,FileNotFoundException {

	int nbline=0;
	String s = null;
	BufferedReader br = null;
	br = new BufferedReader(new FileReader("sample.vcf"));
	String line;
	while ((line= br.readLine())!= null) {
		nbline++;
	
		if (line.contains(old)) {
			
			
			line = line.replaceAll(old,"");
			line = line.replace(';', ' ');
			line=line.replace(":", "");
			s= line;
		
			
	}
		
		if (nbline==lineNumber) {	
		break;
		}
	}
	
	return s;

}

/**
 * cette methode qui consiste a lire le fichier.vcf et  prend  elements spécifique des autre lignes de fichier.vcf
 * @param first : element spécifique qui on veut 	l'enlever 
 * @param nblines : nombre les ligne sur les fichier.vcf
 * @param x : pour prend le nombre de caractére au niveau de la methode subString 
 * @return String 
 * @throws IOException
 * @throws FileNotFoundException
 */
@SuppressWarnings("resource") 
public String otherInfo(String first,int nblines,int x) throws IOException,FileNotFoundException {
	
	int nbline=0;
	String s = null;
	BufferedReader br = null;
	br = new BufferedReader(new FileReader("sample.vcf"));
	String line;
	
	
	while ((line= br.readLine())!= null) {
		
		nbline++;
		
		if (line.contains(first)) {
			line= line.substring(x);
			line = line.replaceAll(";", " ");
			s= line;			
		}
		
		if (nbline==nblines) {	
		break;
		}
	}
	
	return s;
}
 
/**
 * cette methode utilse la methode firstInfo et otherInfo pour changer la valeur  des attribut name adresse email telephone
 * @param x : object de la classe MyVcard
 * @param lineLimite : nombre de la ligne ou il va s'arreter de lire le fichier.vcf
 * @throws IOException 
 * @throws FileNotFoundException 
 */
public void vcard (MyVcard x,int lineLimite) throws FileNotFoundException, IOException  {
	x.setName(x.firstInfo("FN", lineLimite));
	x.setAdresse(x.otherInfo("ADR", lineLimite,29));
	x.setEmail(x.otherInfo("EMAIL;TYPE=INTERNET:",lineLimite,20));
	x.setTelephone(x.otherInfo("TEL;TYPE=WORK,MSG:",lineLimite,18));
	
}
/**
 * cette methode supprime le contenu des attributs name email adresse telephone 
 * @param x : object de la classe MyVcard
 * 
 */
public void clear (MyVcard x) {
	x.setName(null);
	x.setEmail(null);
	x.setAdresse(null);
	x.setTelephone(null);
	
}


	
	
	
}	
	
	

