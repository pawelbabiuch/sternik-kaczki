package pl.sternik.pb.kaczki;

import java.util.ArrayList;
import java.util.List;

import pl.sternik.pb.ges.AdapterGesKaczkowa;
import pl.sternik.pb.ges.Ges;
import pl.sternik.pb.kaczki.kwakanie.Niemowa;

public class Symulator {

	public static void main(String[] args) {

		Kaczka dzika = new DzikaKaczka("dziwaczka");
		
		dzika.kwacz();
		dzika.lataj();
		dzika.wyswietl();
		
		Kaczka gumowa = new GumowaKaczka("żółta");
		Kaczka drewniana = new DrewnianaKaczka("Dębowa");
		Kaczka mandarynka = new MandarynkaKaczka("samiec");

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
		
		Ges ges = new Ges("dzika");
		Kaczka gesAdapter = new AdapterGesKaczkowa(ges);
		
		System.out.println("-------------GES---------------");
		gesAdapter.wyswietl();
		gesAdapter.lataj();
		gesAdapter.plywaj();
		gesAdapter.kwacz();
	}
}