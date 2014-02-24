/***********************************************************
 *** Projet de Mme OULMI, Gestion d'une m�moire centrale ***
 **************** R�aliser par NEGRE Xavier ****************
 *** Cr�er le 22/02/2014, Mis � jour le 24/02/2014 12h54 ***
 ***********************************************************/

package Memoire; // Appel du package Memoire

//Classe M�moire
public class Memoire {
	
	/*** Champs ***/
	
	private int TailleMax; // Taille max dans l'unit� quotidienne ( Ko, Mo, Go, ... )
	
	private byte[] Memoire; // Contenu de la m�moire en binaire ( A voir )
	
	private boolean FLAG_ENABLE; // Flag informant sur l'espace de la m�moire ( vrai = libre, faux = allou� )
	
	private Plage plage; // Classe Plage
	
	/*** Fin Champs ***/
	
	
	/***** Constructeurs *****/
	
	//Constructeur par defaut
	public Memoire() {
		this.TailleMax = 0;
		this.Memoire = null;
		this.FLAG_ENABLE = true;
		this.plage = null;
	}
	
	// Constructeur des variables sans l'initialisation de la classe plage
	public Memoire( int TailleMax , byte[] Memoire , boolean FLAG_ENABLE ) {
		this.TailleMax = TailleMax;
		this.Memoire = Memoire;
		this.FLAG_ENABLE = FLAG_ENABLE;
	}
	
	// Constructeur total avec initialisation de la classe
	public Memoire( int TailleMax , byte[] Memoire , boolean FLAG_ENABLE , Plage plage ) {
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
