package Model;

public class Personnel {
private int idPersonnel;
private int idService;
private String nomPersonnel;
private String prenomPersonnel;
private String telephonePersonnel;
private String mailpersonnel;

public Personnel(int _idPersonnel, int _idService, String _nomPersonnel, String _prenomPersonnel,
				String _telephonePersonnel, String _mailPersonnel) 
{
	this.idPersonnel=_idPersonnel;
	this.idService=_idService;
	this.nomPersonnel=_nomPersonnel;
	this.prenomPersonnel=_prenomPersonnel;
	this.telephonePersonnel=_telephonePersonnel;
	this.mailpersonnel=_mailPersonnel;
}
}
