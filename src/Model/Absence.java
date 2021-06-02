package Model;
import java.sql.Date;


public class Absence {
private int idpersonnel;
private Date datedebut;
private int idmotif;
private Date datefin;


public Absence(int _idpersonnel, Date _datedebut, int _idmotif, Date _datefin) {
	this.idpersonnel=_idpersonnel;
	this.datedebut=_datedebut;
	this.idmotif=_idmotif;
	this.datefin=_datefin;
}
}
