package pl.sternik.pb.kaczki;

import pl.sternik.pb.kaczki.kwakanie.Niemowa;
import pl.sternik.pb.kaczki.latanie.Latajaca;

public class MandarynkaKaczka extends Kaczka {

	public MandarynkaKaczka(String nazwa) {
		super(nazwa, new Latajaca(), new Niemowa());
	}
}
