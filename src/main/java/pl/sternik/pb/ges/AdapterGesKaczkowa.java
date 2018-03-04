package pl.sternik.pb.ges;

import pl.sternik.pb.kaczki.*;

public class AdapterGesKaczkowa extends Kaczka{
	
	private Ges ges;
	
	public AdapterGesKaczkowa(Ges ges) {
		super(null, null, null);
		this.ges = ges;
	}
	
	@Override
	public void lataj() {
		ges.latajPoGesiemu();
	}
	
	@Override
	public void plywaj() {
		ges.plywajPoGesiemu();
	}
	
	@Override
	public void kwacz() {
		ges.gegaj();
	}
	
	@Override
	public void wyswietl() {
		ges.wyswietlGes();
	}
}
