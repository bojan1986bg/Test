package glavni;

import java.util.ArrayList;
import java.util.List;

import bojan.Banka;
import bojan.Osoba;
import bojan.Ugovor;

public class Test {

	public static void main(String[] args) {
		
		
		  Osoba o = new Osoba();
		  o.setIme("Ognjen");
		  o.setPrezime("Koroman");
		  o.setJmbg("1234567890123");
		  o.setAdresa("Lomina 2");
		  o.setBrojGodina("19");
		  
		  Osoba x = new Osoba("Tarmi", "Ricmi", "9852203709221", "a", "11");
		  
		  System.out.println(o.toString());
		  //System.out.println(o.validacijaJMBG());
		  
		  Ugovor ugovor1 = new Ugovor(o, x, 700, 7);
		  Ugovor ugovor2 = new Ugovor(o, x, 1500, 8);
		  Ugovor ugovor3 = new Ugovor(o, x, 30000, 6);
		 
		
		  List<Ugovor> listaUgovora = new ArrayList<Ugovor>();
			listaUgovora.add(ugovor1);
			listaUgovora.add(ugovor2);
			listaUgovora.add(ugovor3);
			
		
		Banka banka = new Banka(listaUgovora,"Intesa");
		
		System.out.println(banka.getUkupnaVrednostUgovora());
		banka.najvrednijiUgovor();
		System.out.println(banka.prosecnoTrajanjeUgovora());
		
		
		
		
		
		
		
		
		
		

	}

}
