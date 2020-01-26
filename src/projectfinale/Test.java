package projectfinale;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;



public class Test  {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws Exception {
		/**
		 * ici on cree des 2 object de la classe MyVcard et  5 object de la classe MyCalendar et 5 object la classe Time
		 *
		 */
		MyVcard v1 =  new MyVcard ("","","","");
		MyVcard v2 = new MyVcard("", "", "", "");
		v1.vcard(v1, 11);
		v2.vcard(v2, 22);		
		Vcards vs = new Vcards();
		vs.add(v1);
		vs.add(v2);
/*
		System.out.println(vs.toString());
		v1.serialiser(v1);
		v1.clear(v1);
		v1 = v1.deserialisation();
		System.out.println(v1);
		v1.htmlLines(v1);	
		*/
		Time startup = new Time("","","","","","");
		Time endup = new Time ("","","","","","");
		Time startup2 = new Time("","","","","","");
		Time endup2 = new Time ("","","","","","");
		Time startup3 = new Time("","","","","","");
		Time endup3 = new Time ("","","","","","");
		
		Time startup4 = new Time("","","","","","");
		Time endup4 = new Time ("","","","","","");
		Time startup5 = new Time("","","","","","");
		Time endup5 = new Time ("","","","","","");

		MyCalendar c = new MyCalendar("", "", "", startup, endup);
		startup.startEndTime(startup, "DTSTART", 26);
		endup.startEndTime(endup, "DTEND", 26);
		c.calendar(c, 26);
//*********************************************************
		MyCalendar c2 = new MyCalendar("", "", "", startup2, endup2);
		startup2.startEndTime(startup2, "DTSTART", 49);
		endup2.startEndTime(endup2, "DTEND", 49);
		c2.calendar(c2, 49);
//************************************************************************		
		
		MyCalendar c3 = new MyCalendar("", "", "", startup3, endup3);
		startup3.startEndTime(startup3, "DTSTART", 67);
		endup3.startEndTime(endup3, "DTEND", 67);
		c3.calendar(c3, 67);
		
		
//************************************************************************
		
		MyCalendar c4 = new MyCalendar("", "", "", startup4, endup4);
		startup4.startEndTime(startup4, "DTSTART", 87);
		endup4.startEndTime(endup4, "DTEND", 87);
		c4.calendar(c4, 87);
	//**********************************************************************	
		MyCalendar c5 = new MyCalendar("", "", "", startup5, endup5);
		startup5.startEndTime(startup5, "DTSTART", 107);
		endup5.startEndTime(endup5, "DTEND", 107);
		c5.calendar(c5, 107);
		//********************************************************	
		Events event = new Events();
		event.add(c);
		event.add(c2);
		event.add(c3);
		event.add(c4);
		event.add(c5);
		
	
			
		
		
		
		
		
		
		
		
		
		
		
			if (args.length==0) {
		    System.out.println("Voici les parametres que vous pouvez utiliser :");
		    System.out.println("Pour afficher les fichiers vcf et ics tapez : -d");
		    System.out.println("Pour afficher le fichier vcf tapez : -i NOM_DE_FICHIR.vcf -a");
		    System.out.println("Pour afficher le fichier ics tapez : -i NOM_DE_FICHIR.ics -a");
		    System.out.println("Pour effectuer la serialisation tapez :-i NOM_DE_FICHIR.vcf/ics -o ");
		    System.out.println("Pour generer le fragment HTML tapez :-i NOM_DE_FICHIR.vcf/ics -h ");
		    System.out.println("pour affichier le mode graphique tapez : gui");
		}
			
		
		
		for(int i=0;i<args.length;i++) {
		
		    if (args[i].equals("-d"))
		    { 
		    	
		    	
		    	searchfiles("E:\\projectfinale\\directory");
		    }
		    try {
		     if ((args[i].equals("-i")&&args[i+1].equals("sample.vcf"))&&args[i+2].equals("-a"))
		    { 
		    	 
		        System.out.println(vs.toString());
		    }
		    }catch(ArrayIndexOutOfBoundsException ex) {
		    	
		    }
		    
		    
		    
		    
		    if (args[i].equals("-i")&&args[i+1].equals("sample.vcf")&&args[i+2].equals("-o"))
		    { 
		    	v1.serialisation2(v1, "thenewVcard.ser");
		    	v2.serialisation2(v2, "thenewVcard2.ser");
		    	System.out.println("serialisation marche");
		    }
		     if (args[i].equals("-i")&&args[i+1].equals("sample.vcf")&&args[i+2].equals("-h"))
		    {
		    		v1.htmlLines(v1,"hcard.html");
		    		v2.htmlLines(v2, "hcard2.html");
		    }
		     if ((args[i].equals("-i")&&args[i+1].equals("calendar.ics"))&&args[i+2].equals("-a"))
		     {
		    	System.out.println(event.toString());;
		     }
		     if (args[i].equals("-i")&&args[i+1].equals("calendar.ics")&&args[i+2].equals("-o"))
		     {
		    		    	 
				    c.seria(c, "c.ser");
					c2.seria(c2, "c2.ser");
					c3.seria(c3, "c3.ser");
					c4.seria(c4, "c4.ser");
					c5.seria(c5, "c5.ser");
		    	 
			     }
		     if (args[i].equals("-i")&&args[i+1].equals("calendar.ics")&&args[i+2].equals("-h"))
		     {
		    	System.out.println("fraguement HTml");
		    	c.htmlLinesCalendar(c, "c.html");
				c2.htmlLinesCalendar(c2, "c2.html");
				c3.htmlLinesCalendar(c3, "c3.html");
				c4.htmlLinesCalendar(c4, "c4.html");
				c5.htmlLinesCalendar(c5, "c5.html");
		     }
		     if(args[i].equals("gui"))
		     {
		    	 projectfinale.Gui.main(args);
		     }
		     
		   
		     
		     
		     
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	public static void searchfiles(String dirc) {
		File file ;
		String list[];
		file = new File (dirc);
		if (file.isDirectory()) {
			list = file.list();
			for (int i=0;i<list.length;i++) {
				searchfiles(dirc + File.separatorChar + list[i]);
			}
			
			
		}
		else {
			System.out.println(file.toString()+"\n");
		}
	}

}
