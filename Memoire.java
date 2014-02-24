package Memoire;

public class Memoire {
	private int TailleMax;
	private byte[] Memoire;
	private boolean FLAG_ENABLE;
	private Plage plage;
	
	/***** Constructeurs *****/
	
	public Memoire() {
		
	}
	
	public Memoire(int TailleMax, byte[] Memoire, boolean FLAG_ENABLE) {
		this.TailleMax = TailleMax;
		this.Memoire = Memoire;
		this.FLAG_ENABLE = FLAG_ENABLE;
	}
	
	public Memoire(int TailleMax, byte[] Memoire, boolean FLAG_ENABLE, Plage plage) {
		this.TailleMax = TailleMax;
		this.Memoire = Memoire;
		this.FLAG_ENABLE = FLAG_ENABLE;
		this.plage = plage;
	}
	
	/***** Fin Constructeurs *****/
	
	/*** Methodes ***/
	
	
	
	/*** Fin Methodes ***/
	
	
	/******* Getters & Setters *******/

	public int getTailleMax() {
		return TailleMax;
	}

	public void setTailleMax(int tailleMax) {
		TailleMax = tailleMax;
	}

	public byte[] getMemoire() {
		return Memoire;
	}

	public void setMemoire(byte[] memoire) {
		Memoire = memoire;
	}

	public boolean isFLAG_ENABLE() {
		return FLAG_ENABLE;
	}

	public void setFLAG_ENABLE(boolean fLAG_ENABLE) {
		FLAG_ENABLE = fLAG_ENABLE;
	}

	public Plage getPlage() {
		return plage;
	}

	public void setPlage(Plage plage) {
		this.plage = plage;
	}
		
}
