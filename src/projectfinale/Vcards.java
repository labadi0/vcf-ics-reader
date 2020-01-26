package projectfinale;

import java.util.ArrayList;
/**
 * ici on regroupe plusieur object de la classe MyVcard dans un ArrayList
 * @author labadi tarek achraf bourassi
 *
 */
public class Vcards {

private ArrayList<MyVcard> arry;
/**
 * on cree un constructeur pour initialiser les Attributs
 */
public Vcards () {
	arry = new ArrayList<MyVcard>();
}
/**
 * cette methode est utilser pour ajouter des object de la classe MyVcard
 * @param x : object de la classe MyVcard
 */
public void add(MyVcard x) {
	arry.add(x);
}

public String toString() {
	String s = "";
	for (int i = 0;i<arry.size();i++) {
		s = s+arry.get(i)+"\n";
	}
return s;
}




}
