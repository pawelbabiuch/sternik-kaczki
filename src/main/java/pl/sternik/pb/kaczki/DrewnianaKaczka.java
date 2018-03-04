package pl.sternik.pb.kaczki;

import pl.sternik.pb.kaczki.kwakanie.Niemowa;
import pl.sternik.pb.kaczki.latanie.Nielot;

public class DrewnianaKaczka extends Kaczka {

	public DrewnianaKaczka(String nazwa) {
		super(nazwa, new Nielot(), new Niemowa());
	}
}
