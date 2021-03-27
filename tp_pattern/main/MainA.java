package tp_pattern.main;

import java.util.ArrayList;

import tp_pattern.obj.Developpeur;
import tp_pattern.obj.Langage;
import tp_pattern.obj.Societe;

public class MainA {
	public static void main(String[] args) {
		
		
		Societe s1 = new Societe("1", "Mattel");
		
		s1.toStringSoc();
		
		
		s1.addDev(new Developpeur("Mbaba", "1"));
		s1.addDev(new Developpeur("Dembe", "2"));
		
		ArrayList<Developpeur> devs =  (ArrayList<Developpeur>) s1.getListDevellopeur();
		for(Developpeur dev : devs) {
			dev.toStringDev();
		}
		
		
		Developpeur dev1 = s1.getDev(0);
		
		dev1.toStringDev();
		
		
		dev1.setlang(new Langage("1","java"));
		
		
		
		dev1.toStringDev();
		
		
		
		
		System.out.println("******************");
		dev1.getlang().toStringLang();
		
		
		
		
		
		
		
		
	}		
}
