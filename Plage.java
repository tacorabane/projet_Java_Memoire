/***********************************************************
 *** Projet de Mme OULMI, Gestion d'une m�moire centrale ***
 **************** R�aliser par NEGRE Xavier ****************
 *** Cr�er le 22/02/2014, Mis � jour le 24/02/2014 13h54 ***
 ***********************************************************/

package Memoire;

// Classe plage
abstract class Plage {
	/*** Champs ***/
	
	protected List_Plage head; // T�te
	protected List_Plage tail; // Queue
	private Segment segment;
	
	/*** Fin Champs ***/
	
	
	/*** Constructeur ***/
	
	public Plage( ) {
		this.head = this.tail = null;
	}
	
	/*** Fin Constructeur ***/
	
	
	/*** Methodes ***/
	
	//Ajout en t�te
	public void addHeader( int TaillePlage, byte[] Plage, int IdStartPlage, int IdEndPlage ) {
		List_Plage nouveau = new List_Plage( TaillePlage , IdStartPlage , IdEndPlage );
		if( this.tail == null ) {
			//this.tail = nouveau;
			this.tail = this.head;
			nouveau.NextPlage = this.tail;
		}
		else {
			nouveau.NextPlage = this.head;
		}
		
		this.head = nouveau;
	}
	
	//Ajout en fin de liste
	public void AddFooter( int TaillePlage , byte[] Plage , int IdStartPlage , int IdEndPlage ) {
		
		// Cr�ation d'un nouvel �l�ment dans la liste
		List_Plage nouveau = new List_Plage( TaillePlage , IdStartPlage , IdEndPlage );
		
		
		if( this.head == null ) {
			this.head = this.tail; // Si la t�te de la liste est null alors le nouvel �l�ment de la liste se retrouve premier
			this.head.NextPlage = nouveau;
		}
		else
			this.tail.NextPlage = nouveau; // Sinon le nouvel �l�ment se retrouve en queue
		
		this.tail = nouveau; // 
	}
	
	// Suppression d'une plage
	public void delete( int IdStartPlage , int IdEndPlage ) {
		List_Plage Current = this.head;
		List_Plage Next = null;
		
		while( ( Current != null ) && ( Current.IdStartPlage.equals( IdStartPlage ) && Current.IdEndPlage.equals( IdEndPlage ) ) ) {
			Next = Current;
			Current.NextPlage = Current.NextPlage;
		}
		
		if( Current != null ) {
			if( Current == tail )
				tail = Next;
			if( Next != null )
				Next.NextPlage = Current.NextPlage;
		}
	}
	
	/*** Fin Methodes ***/
}

//Classe liste de plage ( Liste cha�n�es d'objets )
class List_Plage {
	int TaillePlage; // Taille max de la plage
	
	Integer IdStartPlage; // Adresse du d�but de la plage allou�e
	
	Integer IdEndPlage; // Adresse de la fin de la plage allou�e
	
	boolean FLAG_FREE; // Flag informant sur la disponibilit� de la plage ( vrai = libre, faux = allouer )
	
	List_Plage NextPlage; // Adresse de la prochaine plage
	
	// Constructeur par defaut
	List_Plage() {
		this.TaillePlage = 0;
		this.IdStartPlage = 0;
		this.IdEndPlage = 0;
		this.FLAG_FREE = true;
		this.NextPlage = null;
	}
	
	// Constructeur des variables non calculable
	List_Plage( int TaillePlage , int IdStartPlage , int IdEndPlage ) {
		this.TaillePlage = TaillePlage;
		this.IdStartPlage = IdStartPlage;
		this.IdEndPlage = IdEndPlage;
		this.FLAG_FREE = true;
		this.NextPlage = null;
	}
}
