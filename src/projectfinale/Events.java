package projectfinale;

import java.util.ArrayList;
/**
 * cette methode regroupe des object de la classe MyCalendar 
 * @author labadi tarek achraf bourassi
 *
 */
public class Events {
private ArrayList<MyCalendar>event;
/**
 * ici on cree un constructeur pour initiliser les donnes 
 */
public Events() {
	event=new ArrayList<MyCalendar>();
}
/**
 * cette methode est utilser pour ajouter des object de la classe MyCalendar 
 * @param x : object de la classe MyCalendar 
 */
public void add(MyCalendar x) {
	event.add(x);
}
public String toString() {
	String s ="";
	for (int i=0;i<event.size();i++) {
		s =s+ event.get(i)+"\n";
	}
	return s;
}
	
}
