/***********************************************************
 *** Projet de Mme OULMI, Gestion d'une mémoire centrale ***
 **************** Réaliser par NEGRE Xavier ****************
 *** Créer le 22/02/2014, Mis à jour le 24/02/2014 12h54 ***
 ***********************************************************/

package Memoire; // Appel du package Memoire

//Classe Mémoire
abstract class Memoire {
	
	/*** Champs ***/
	
	private int TailleMax;       // Taille max en octet
	
	private boolean FLAG_ENABLE; // Flag informant sur l'espace de la mémoire ( vrai = libre, faux = alloué )
	
	private byte[] Datas;        // Données binaires sour forme de tableau 
	
	private Plage plage;         // Classe Plage
	
	/*** Fin Champs ***/
	
	
	/***** Constructeurs *****/
	
	//Constructeur par defaut
	public Memoire() {
		this.TailleMax = 0;
		this.FLAG_ENABLE = true;
		this.Datas = null;
		this.plage = null;
	}
	
	// Constructeur des variables sans l'initialisation de la classe plage
	public Memoire( int TailleMax , byte[] Datas , boolean FLAG_ENABLE ) {
		this.TailleMax = TailleMax;
		this.FLAG_ENABLE = FLAG_ENABLE;
		this.Datas = Datas;
	}
	
	// Constructeur total avec initialisation de la classe
	public Memoire( int TailleMax , byte[] Datas , boolean FLAG_ENABLE , Plage plage ) {
		this.TailleMax = TailleMax;
		this.FLAG_ENABLE = FLAG_ENABLE;
		this.Datas = Datas;
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
	
	public boolean isFLAG_ENABLE() {
		return FLAG_ENABLE;
	}

	public void setFLAG_ENABLE(boolean fLAG_ENABLE) {
		FLAG_ENABLE = fLAG_ENABLE;
	}
	
	public byte[] getDatas( ) {
		return Datas;
	}
	
	public void setDatas( byte[] Datas ) {
		this.Datas = Datas;
	}

	public Plage getPlage() {
		return plage;
	}

	public void setPlage(Plage plage) {
		this.plage = plage;
	}
		
}
