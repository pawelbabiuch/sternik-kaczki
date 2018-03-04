package pl.sternik.pb.kaczki;

import java.util.ArrayList;
import java.util.List;

import pl.sternik.pb.kaczki.kwakanie.Niemowa;

public class SymulatorFabrykujacy {

	public static void main(String[] args) {

		Kaczka dzika = Kaczka.dajKaczke(KaczkaTypy.Dzika, "Dziwaczka");
		
		dzika.kwacz();
		dzika.lataj();
		dzika.wyswietl();
		
		Kaczka gumowa = Kaczka.dajKaczke(KaczkaTypy.Gumowa, "Zolta");
		Kaczka drewniana = Kaczka.dajKaczke(KaczkaTypy.Drewniana, "Debowa");
		Kaczka mandarynka = Kaczka.dajKaczke(KaczkaTypy.Mandarynka, "Samiec");

		List<Kaczka> kaczki = new ArrayList<Kaczka>();
		kaczki.add(dzika);
		kaczki.add(gumowa);
		kaczki.add(drewniana);
		kaczki.add(mandarynka);
		
		
		for (Kaczka kaczka : kaczki) {
			System.out.println("-------------INNA KACZKA---------------");
			kaczka.wyswietl();
			kaczka.lataj();
			kaczka.plywaj();
			kaczka.kwacz();
		}
		System.out.println("-------------------------------");
		gumowa.kwacz();
		
		gumowa.setKwakanie(new Niemowa());
		
		gumowa.kwacz();
		
		Kaczka gesAdapter = Kaczka.dajKaczke(KaczkaTypy.Ges, "Kacza Ges");
		
		System.out.println("-------------GES---------------");
		gesAdapter.wyswietl();
		gesAdapter.lataj();
		gesAdapter.plywaj();
		gesAdapter.kwacz();
	}
}