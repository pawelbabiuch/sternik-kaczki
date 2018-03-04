package pl.sternik.pb.kaczki;

import pl.sternik.pb.kaczki.kwakanie.Kwakanie;
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
    
}