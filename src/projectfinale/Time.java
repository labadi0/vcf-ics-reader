package projectfinale;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;

/**
 * Time est une classe a des attributs : year mounth day  hour minute seconde et des methodes getters setters infoTime mounthly startEndTime
 *
 * @author LABADI TAREK ACHRAF BOURASSI
 *
 */
public class Time implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String year;
	private String month;
	private String day;
	private  String hour ;
	private String minute;
	private String seconde;

	/**
	 * constructeur qui initialise les attributs
	 * @param year : String 
	 * @param month : String
	 * @param day: String
	 * @param hour: String
	 * @param minute: String
	 * @param seconde: String
	 */

	public Time( String year, String month, String day,	String hour, String minute, String seconde) {

	this.year = year;
	this.month = month;
	this.day = day;
	this.hour = hour;
	this.minute = minute;
	this.seconde = seconde;
}
/**
 * methode qui retourne la valeur d'attribut year 
 * @return String 
 */
	
public String getYear() {
	return year;
}
/***
 * methode qui change la valeur d'attribut year 
 * @param year : String 
 */

public void setYear(String year) {
	this.year = year;
}
/**
 *  * methode qui retourne la valeur d'attribut mounth  

 * @return String 
 */
public String getMonth() {
	return month;
}
/**
 * methode qui change la valeur d'attribut mounth
 * @param month
 */
public void setMonth(String month) {
	this.month = month;
}
/**
 *   methode qui retourne la valeur d'attribut day

 * @return
 */
public String getDay() {
	return day;
}
/**
 * methode qui change la valeur d'attribut 
 * @param day
 */
public void setDay(String day) {
	this.day = day;
}
/**
 *  methode qui retourne la valeur d'attribut hour 

 * @return String 
 */
public String getHour() {
	return hour;
}
/**
 * methode qui change la valeur d'attribut hour
 * @param hour
 */
public void setHour(String hour) {
	this.hour = hour;
}
/**
 *  methode qui retourne la valeur d'attribut minute  

 * @return String 
 */
public String getMinute() {
	return minute;
}
/**
 * methode qui change la valeur d'attribut minute
 * @param minute
 */
public void setMinute(String minute) {
	this.minute = minute;
}
/**
 *   methode qui retourne la valeur d'attribut seconde 
 * @return String 
 */
public String getSeconde() {
	return seconde;
}
/**
 * methode qui change la valeur d'attribut seconde
 * @param seconde
 */
public void setSeconde(String seconde) {
	this.seconde = seconde;
}


public String toString () {
	return "  "+day+"/"+month+"/"+year+ ", At "+hour+"h:"+minute+":"+seconde;                            
}

/**
 *  la methode firstInfo qui consiste a lire le fichier.ics et  prend les elements spécifique" jour , mois , année , heure , minute , seconde" des  fichier.ics
 * 
 * @param se : String , le contenu de la ligne
 * @param start , le nombre d'ou on commmence le comptage "subString " 
 * @param end  , le nombre d'ou on s'arret le comptage "subString "
 * @param lineNumber , le nombre de la ligne d'ou on s'arret de le lire le fichier.ics
 * @return String 
 * @throws IOException
 * @throws FileNotFoundException
 */

@SuppressWarnings("resource")

public String infoTime(String se,int start,int end,int lineNumber) throws IOException , FileNotFoundException {
	int nbline=0; 	
	String s = null;
	BufferedReader br = null;
	br = new BufferedReader(new FileReader("calendar.ics"));
	String line;
	while ((line= br.readLine())!= null) {
		nbline++;
		if (line.contains(se)) {
		line = line.replace(':', ' ');
		line = line.replaceAll(se, "");
		line = line.substring(start, end);
		s= line;
	}
		if (nbline==lineNumber) {	
			break;
			}
		
	}
	return s;
}

/**
 * c'est une methode qui prend en parametre un nombre de mois  et nous donne le nom de mois  
 * @param month : le nombre de mois
 * @return String 
 */

public String mounthly(String month ) {
	String monthString ="";
	switch (month) {
case "1":  monthString = "January";
break;
case "2":  monthString = "February";
break;
case "3":  monthString = "March";
break;
case "4":  monthString = "April";
break;
case "5":  monthString = "May";
break;
case "6":  monthString = "June";
break;
case "7":  monthString = "July";
break;
case "8":  monthString = "August";
break;
case "9":  monthString = "September";
break;
case "10": monthString = "October";
break;
case "11": monthString = "November";
break;
case "12": monthString = "December";
break;
default: monthString = "Invalid month";
break;
	
	}
	
	
	return monthString;
	
}

/**
 * 
 * @param t : object de la classe Time 
 * @param x : il represente la date de debut ou la date de fin 
 * @param numberOfLines ou il s'arette de lire le fichier.ics
 * @throws Exception
 */
public void startEndTime(Time t,String x,int numberOfLines) throws Exception {
	t.setDay(t.infoTime(x,7, 9,numberOfLines));
	t.setYear(t.infoTime(x,0, 5,numberOfLines));
	t.setMonth(t.infoTime(x,5, 7,numberOfLines));
	t.setHour(t.infoTime(x,10, 12,numberOfLines));
	t.setMinute(t.infoTime(x,12, 14,numberOfLines));
	t.setSeconde(t.infoTime(x,14, 16,numberOfLines));
}


































}

