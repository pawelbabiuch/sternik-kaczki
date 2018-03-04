package pl.sternik.pb.kaczki;

import pl.sternik.pb.ges.AdapterGesKaczkowa;
import pl.sternik.pb.ges.Ges;
import pl.sternik.pb.kaczki.kwakanie.Kwakanie;
import pl.sternik.pb.kaczki.kwakanie.Niemowa;
import pl.sternik.pb.kaczki.latanie.Latanie;

public abstract class Kaczka implements Latanie, Kwakanie {
    private final String nazwa;
    private Latanie latanie;
    private Kwakanie kwakanie;


    public Kaczka(String nazwa, Latanie latanie, Kwakanie kwakanie) {
        super();
        this.nazwa = nazwa;
        this.latanie = latanie;
        this.kwakanie = kwakanie;
    }

    public void kwacz() {
        kwakanie.kwacz();
    }

    public void lataj() {
    	latanie.lataj();
    }

    public void wyswietl() {
        System.out.println("Jestem " + nazwa);
    }

    public void plywaj() {
        System.out.println("Pływam sobie");
    }


//    public void nauczLatac() {
//        System.out.println("Nauka latania w toku...");
//        setLatanie(new Latajaca());
//        lataj();
//    }

    public Latanie getLatanie() {
        return latanie;
    }

    public void setLatanie(Latanie latanie) {
        this.latanie = latanie;
    }

    public Kwakanie getKwakanie() {
        return kwakanie;
    }

    public void setKwakanie(Kwakanie kwakanie) {
        this.kwakanie = kwakanie;
    }
    
    public static Kaczka dajKaczke(KaczkaTypy typ, String name) {
    	switch (typ) {
		case Dzika:
			return new DzikaKaczka(name);
		case Drewniana:
			return new DrewnianaKaczka(name);
		case Mandarynka:
			return new MandarynkaKaczka(name);
		case Gumowa:
			return new GumowaKaczka(name);
		case Ges:
			return new AdapterGesKaczkowa(new Ges(name));
		case ZepsutaGumowa:
			GumowaKaczka gumowaKaczka = new GumowaKaczka(name);
			gumowaKaczka.setKwakanie(new Niemowa());
			return gumowaKaczka;
		default:
			return new DzikaKaczka("Kaczka domyslna");
		}
    }
}