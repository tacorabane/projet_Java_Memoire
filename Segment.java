package Memoire;

public class Segment {
	protected List_Segment head;
	protected List_Segment tail;
}

class List_Segment {
	int TailleSegment; // Taille max de la plage
	
	Integer IdStartSegment; // Adresse du début de la plage allouée
	
	Integer IdEndSegment; // Adresse de la fin de la plage allouée
	
	boolean FLAG_FREE; // Flag informant sur la disponibilité de la plage ( vrai = libre, faux = allouer )
	
	List_Segment NextSegment; // Adresse de la prochaine plage
	
	// Constructeur par defaut
		List_Segment() {
			this.TailleSegment = 0;
			this.IdStartSegment = 0;
			this.IdEndSegment = 0;
			this.FLAG_FREE = true;
			this.NextSegment = null;
		}
		
		// Constructeur des variables non calculable
		List_Segment( int TailleSegment , int IdStartSegment , int IdEndSegment ) {
			this.TailleSegment = TailleSegment;
			this.IdStartSegment = IdStartSegment;
			this.IdEndSegment = IdEndSegment;
			this.FLAG_FREE = true;
			this.NextSegment = null;
		}
}
