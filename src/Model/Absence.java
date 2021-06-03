package Model;
import java.sql.Date;


public class Absence {
	private int idPersonnel;
	private Date dateDebut;
	private int idMotif;
	private Date dateFin;
	
	public Absence(int idPersonnel, Date dateDebut, int idMotif, Date dateFin) {
		super();
		this.idPersonnel = idPersonnel;
		this.dateDebut = dateDebut;
		this.idMotif = idMotif;
		this.dateFin = dateFin;
	}

	public int getIdpersonnel() {
		return idPersonnel;
	}

	public void setIdpersonnel(int idpersonnel) {
		this.idPersonnel = idpersonnel;
	}

	public Date getdateDebut() {
		return dateDebut;
	}

	public void setdateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public int getidMotif() {
		return idMotif;
	}

	public void setidMotif(int idMotif) {
		this.idMotif = idMotif;
	}

	public Date getdateFin() {
		return dateFin;
	}

	public void setdateFin(Date dateFin) {
		this.dateFin = dateFin;
	}	
}
