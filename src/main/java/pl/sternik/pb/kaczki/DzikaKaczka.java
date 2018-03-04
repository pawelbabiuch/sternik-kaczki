package pl.sternik.pb.kaczki;

import pl.sternik.pb.kaczki.kwakanie.Kwaczka;
import pl.sternik.pb.kaczki.latanie.Latajaca;

public class DzikaKaczka extends Kaczka {

	public DzikaKaczka(String nazwa) {
		super(nazwa, new Latajaca(), new Kwaczka());	
	}

}
