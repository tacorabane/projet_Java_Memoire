package Memoire;

public class Plage {
	protected List_Plage head;
	protected List_Plage tail;
	
	public Plage() {
		this.head = this.tail = null;
	}
	
	//Ajout en tête
	public void addHeader(int TaillePlage, byte[] Plage, int IdStartPlage, int IdEndPlage) {
		List_Plage nouveau = new List_Plage(TaillePlage, Plage, IdStartPlage, IdEndPlage);
		if(this.tail == null)
			this.tail = nouveau;
		else
			nouveau.NextPlage = this.head.NextPlage;
		
		this.head = nouveau;
	}
	
	//Ajout en fin de liste
	public void AddFooter(int TaillePlage, byte[] Plage, int IdStartPlage, int IdEndPlage) {
		List_Plage nouveau = new List_Plage(TaillePlage, Plage, IdStartPlage, IdEndPlage);
		
		if(this.head == null)
			this.head = nouveau;
		else
			nouveau.NextPlage = this.tail.NextPlage;
		
		this.tail = nouveau;
	}
	
	//Suppression
	public void delete(int IdStartPlage, int IdEndPlage) {
		List_Plage Current = this.head;
		List_Plage Next = null;
		
		while( (Current != null) && (Current.IdStartPlage.equals(IdStartPlage) && Current.IdEndPlage.equals(IdEndPlage))) {
			Next = Current;
			Current = Current.NextPlage;
		}
		
		
	}
}

class List_Plage {
	int TaillePlage;
	byte[] Plage;
	Integer IdStartPlage;
	Integer IdEndPlage;
	boolean FLAG_FREE;
	Plage NextPlage;
	
	List_Plage() {
		this.TaillePlage = 0;
		this.Plage = null;
		this.IdStartPlage = 0;
		this.IdEndPlage = 0;
		this.FLAG_FREE = true;
		this.NextPlage = null;
	}
	
	List_Plage(int TaillePlage, byte[] Plage, int IdStartPlage, int IdEndPlage) {
		this.TaillePlage = TaillePlage;
		this.Plage = Plage;
		this.IdStartPlage = IdStartPlage;
		this.IdEndPlage = IdEndPlage;
		this.FLAG_FREE = true;
		this.NextPlage = null;
	}
}
