package Memoire;

public class Segment extends Plage {
	/*** Champs ***/
	
	protected List_Segment head; // Tête
	protected List_Segment tail; // Queue
	
	/*** Fin Champs ***/
	
	
	/*** Constructeurs ***/
	
	public Segment( ) {
		super();
		this.head = this.tail = null;
	}
	
	/*** Fin Contructeurs ***/
	
	
	/*** Méthodes ***/
	
	//Ajout en tête
	public void addHeaderSegment( int TailleSegment, int IdStartSegment, int IdEndSegment ) {
		
		//Création d'un nouvel élément dans la liste
		 List_Segment nouveau = new List_Segment( TailleSegment, IdStartSegment, IdEndSegment );
		 
		 if( this.tail == null ) {
			 this.tail = this.head;
			 nouveau.NextSegment = this.tail;
		 }
		 else {
			 nouveau.NextSegment = this.head;
		 }
		 
		 this.head = nouveau;
	}
	
	//Ajout en fin de liste
	public void addFooterSegment( int TailleSegment, int IdStartSegment, int IdEndSegment ) {
		
		// Création d'un nouvel élément dans la liste
		List_Segment nouveau = new List_Segment( TailleSegment, IdStartSegment, IdEndSegment );
		
		if( this.head == null ) {
			this.head = this.tail; // Si la tête de la liste est null alors on place l'élément de fin de liste en tête de liste 
			this.head.NextSegment = nouveau;
		}
		else {
			this.tail.NextSegment = nouveau;
		}
		
		this.tail = nouveau;
	}
	
	//Suppression d'un segment
	public void delete( int IdStartSegment, int IdEndSegment ) {
		List_Segment Current = this.head;
		List_Segment Next = null;
		
		while( ( Current != null ) && ( Current.IdStartSegment.equals( IdStartSegment ) && Current.IdEndSegment.equals( IdEndSegment ) ) ) {
			Next = Current;
			Current.NextSegment = Current.NextSegment;
		}
		
		
		if( Current != null ) {
			if( Current == this.tail )
				this.tail = Next;
			if( Next != null )
				Next.NextSegment = Current.NextSegment;
		}
	}
}

class List_Segment {
	int TailleSegment;        // Taille max de la plage
	
	Integer IdStartSegment;   // Adresse du début de la plage allouée
	
	Integer IdEndSegment;     // Adresse de la fin de la plage allouée
	
	boolean FLAG_FREE;        // Flag informant sur la disponibilité de la plage ( vrai = libre, faux = allouer )
	
	byte[] Datas;             // Données binaires sour forme de tableau
	
	List_Segment NextSegment; // Adresse de la prochaine plage
	
	// Constructeur par defaut
		List_Segment() {
			this.TailleSegment = 0;
			this.IdStartSegment = 0;
			this.IdEndSegment = 0;
			this.FLAG_FREE = true;
			this.Datas = null;
			this.NextSegment = null;
		}
		
		// Constructeur des variables non calculable
		List_Segment( int TailleSegment , int IdStartSegment , int IdEndSegment ) {
			this.TailleSegment = TailleSegment;
			this.IdStartSegment = IdStartSegment;
			this.IdEndSegment = IdEndSegment;
			this.FLAG_FREE = true;
			this.Datas = null;
			this.NextSegment = null;
		}
}
