package Model;

public class Service {
	private int idService;
	private String nom;
	
	public Service(int idService, String nom) {
		super();
		this.idService = idService;
		this.nom = nom;
	}

	public int getIdService() {
		return idService;
	}

	public void setIdService(int idService) {
		this.idService = idService;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
