package projectfinale;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
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

import javax.management.Descriptor;
/***
 * Time est une classe a des attributs : summary , location , description, start de type "Time", end de type "Time" 
 * @author labadi tarek achraf bourassi
 *
 */

public class MyCalendar implements Serializable {
/**
 * 
 */
private static final long serialVersionUID = 1L;
private String summary;
private String location ;
private String description;
private Time start ;
private Time end ;
/**
 * constructeur qui initialise les attribut
 * @param summary : String
 * @param location:String
 * @param description:String
 * @param start:Time
 * @param end: Time
 */
public MyCalendar(String summary, String location, String description,Time start,Time end) {
	this.start= start;
	this.end=end;
	this.summary = summary;
	this.location = location;
	this.description = description;
}
/**
 * methode qui retourne la valeur d'attribut summary
 * @return String 
 */
public String getSummary() {
	return summary;
}
/**
 * methode qui change la valeur d'attribut summary
 * @param summary : String 
 */
public void setSummary(String summary) {
	this.summary = summary;
}
/**
 *  methode qui retourne la valeur d'attribut location
 
 * @return String 
 */
public String getLocation() {
	return location;
}
/**
 * methode qui change la valeur d'atribut location
 * @param location :String 
 */
public void setLocation(String location) {
	this.location = location;
}
/**
 *  methode qui retourne la valeur d'attribut description

 * @return String 
 */
public String getDescription() {
	return description;
}
/**
 * methode qui change la valeur d'attribut description
 * @param description : String 
 */
public void setDescription(String description) {
	this.description = description;
}
/**
 * methode qui retourne la valeur d'attribut start de type "Time "
 * @return : Time
 */
public Time getStart() {
	return start;
}
/**
 * methode qui change la valeur d'attribut start
 * @param start : Time
 */
public void setStart(Time start) {
	this.start = start;
}
/**
 *  * methode qui retourne la valeur d'attribut end de type "Time "

 * @return Time
 */
public Time getEnd() {
	return end;
}
/**
 * methode qui change la valeur d'attribut end de type "Time"
 * @param end : Time
 */
public void setEnd(Time end) {
	this.end = end;
}
@Override
public String toString() {
	return "MyCaledar [summary=" + summary + ", location=" + location + ", description=" + description + ", start="
			+ start + ", end=" + end + "]";
}
/**
 * methode qui consiste a lire le fichier.ics et prend les elements spécifique
 * @param info : contenu de la ligne 
 * @param lineNumber : le nombre de la ligne ou il s'arrete de lire le fichier 
 * @return String 
 * @throws IOException
 * @throws FileNotFoundException
 */

@SuppressWarnings("resource")
public String getInfo(String info,int lineNumber) throws IOException , FileNotFoundException  {
	int nbline=0;
	String s = null;
	BufferedReader br = null;
	br = new BufferedReader(new FileReader("calendar.ics"));
	String line;
	while ((line= br.readLine())!= null) {
	nbline++;
		if (line.contains(info)) {
		line = line.replaceAll(info, "");
		line = line.replace(':', ' ');
		line=line.replaceAll(";", " ");
		line=line.replace('(', ' ');
		line=line.replace(')', ' ');
		
		s= line;
	}
		if (nbline==lineNumber) {	
			break;
			}
		
	}
	return s;
	
}
/**
 * cette methode utlise la methode getInfo pour changer la valeur des attributs  summry description location 
 * @param x : object de la classe MyCalendar 
 * @param lineNumber : nombre de la ligne ou il va s'arreter de lire le fichier.ics 
 * @throws IOException
 */

public void calendar(MyCalendar x,int lineNumber) throws IOException  {
	x.setSummary(x.getInfo("SUMMARY",lineNumber));
	x.setLocation(x.getInfo("LOCATION",lineNumber));
	x.setDescription(x.getInfo("DESCRIPTION",lineNumber));
}
/**
 * cette methode suprime le contenu des attributs summry location description start end  
 * @param x object de la classe MyCalendar
 */
public void clear (MyCalendar x) {
	x.setDescription(null);
	x.setLocation(null);
	x.setSummary(null);
	x.setStart(null);
	x.setEnd(null);
}
/**
 * methode qui fait la lecture d'un fichier.ser  et retourne un object de type MyCalendar
 * @param path : adresse de fichier.ser sur le disque dur 
 * @return : object de la classe MyCalendar 
 * @throws IOException
 * @throws ClassNotFoundException
 */

public MyCalendar derser (String path) throws IOException,  ClassNotFoundException  {
	MyCalendar x=null;
		FileInputStream fis = new FileInputStream("E:\\projectfinale\\"+path);//    calendarSerialiser.txt
		ObjectInputStream ois = new ObjectInputStream(fis);
		MyCalendar p =(MyCalendar) ois.readObject();
		x=p;
		System.out.println("deserialisation marche");
		System.out.println("MY OBJECT : "+p);
		
		ois.close();
		return x;
	
}
/**
 * methode qui fait le souvgarde des donnes sur fichier.ser "fichier binaire" sur lae disque dur 
 * @param x : object de la classe MyCalendar 
 * @param path : adresse ou on trouve le fichier.ser
 */

public void seria(MyCalendar x,String path) {
	try {
		FileOutputStream fois = new FileOutputStream("E:\\projectfinale\\"+path); 
		ObjectOutputStream os = new ObjectOutputStream(fois);			
		os.writeObject(x);
		System.out.println("object serialisier");
		os.close();
		System.out.println("fermeture");
	} catch (IOException e) {
		e.printStackTrace();
	}
	

}


/**
 * cette methode genére un fragment html
 * @param x : object de la classe MyCalendar
 * @param path : adresse ou on trouve le fichier.html sur le disque dur
 * @throws Exception
*/


public static void htmlLinesCalendar( MyCalendar x,String path) {
	String html = "<div class=\"vevent\">\r\n" + 
			"<span class=\"icalendar\">ICalendar</span>\r\n" + 
			"<div class=\"summary\">\r\n" + 
			"<span class=\"type\">Summary: </span>"+ x.getSummary()+"\r\n" + 
			"</div>\r\n" + 
			"<div class=\"secondname\">\r\n" + 
			"<span class=\"type\">Start Date: </span>"+ x.getStart()+"\r\n" + 
			"</div>\r\n" + 
			"<div class=\"title\">\r\n" + 
			"<span class=\"type\">End Date: </span>"+ x.getEnd()+"\r\n" + 
			"</div>\r\n" + 
			"<div class=\"adr\">\r\n" + 
			"<span class=\"type\">Location: </span>"+ x.getLocation()+"\r\n" + 
			"</div>\r\n" + 
			"</div>";
	
	try {
		BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\projectfinale\\"+ path));
		writer.write(html);
		writer.close();
	} catch (IOException e) {
		System.err.println(e.getMessage());
	}
}






}


































