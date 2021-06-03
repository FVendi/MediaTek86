package Model;

public class Motif {
	private int idMotif;
	private String libelle;
	
	
	public Motif(int idMotif, String libelle) {
		super();
		this.idMotif = idMotif;
		this.libelle = libelle;
	}


	public int getIdMotif() {
		return idMotif;
	}


	public void setIdMotif(int idMotif) {
		this.idMotif = idMotif;
	}


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
}
