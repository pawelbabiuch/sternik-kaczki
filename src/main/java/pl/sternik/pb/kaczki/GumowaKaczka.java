package pl.sternik.pb.kaczki;

import pl.sternik.pb.kaczki.kwakanie.Piskajaca;
import pl.sternik.pb.kaczki.latanie.Nielot;

public class GumowaKaczka extends Kaczka {

	public GumowaKaczka(String nazwa) {
		super(nazwa, new Nielot(), new Piskajaca());
	}
}
