package Memoire;

public class Segment extends Plage {
	/*** Champs ***/
	
	protected List_Segment head; // T�te
	protected List_Segment tail; // Queue
	
	/*** Fin Champs ***/
	
	
	/*** Constructeurs ***/
	
	public Segment( ) {
		super();
		this.head = this.tail = null;
	}
	
	/*** Fin Contructeurs ***/
	
	
	/*** M�thodes ***/
	
	//Ajout en t�te
	public void addHeaderSegment( int TailleSegment, int IdStartSegment, int IdEndSegment ) {
		
		//Cr�ation d'un nouvel �l�ment dans la liste
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
		
		// Cr�ation d'un nouvel �l�ment dans la liste
		List_Segment nouveau = new List_Segment( TailleSegment, IdStartSegment, IdEndSegment );
		
		if( this.head == null ) {
			this.head = this.tail; // Si la t�te de la liste est null alors on place l'�l�ment de fin de liste en t�te de liste 
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
	
	Integer IdStartSegment;   // Adresse du d�but de la plage allou�e
	
	Integer IdEndSegment;     // Adresse de la fin de la plage allou�e
	
	boolean FLAG_FREE;        // Flag informant sur la disponibilit� de la plage ( vrai = libre, faux = allouer )
	
	byte[] Datas;             // Donn�es binaires sour forme de tableau
	
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
