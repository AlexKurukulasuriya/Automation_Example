package Entity;

public class OperatoreRegistrato {
	
	private String nomeSocietÓ;
	private String partitaIva;
	private String username;
	private String password;
	

	public OperatoreRegistrato(String nomeSocietÓ,String partitaIva, String username, String password) {
		this.nomeSocietÓ=nomeSocietÓ;
		this.partitaIva=partitaIva;
		this.username=username;
		this.password=password;
	}

	public String getNomeSocietÓ() {
		return nomeSocietÓ;
	}
	
	public String getPartitaIva() {
		return partitaIva;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setNomeSocietÓ(String nomeSocietÓ) {
		this.nomeSocietÓ=nomeSocietÓ;
	}
	
	public void setPartitaIva(String partitaIva) {
		this.partitaIva=partitaIva;
	}
	
	public void setUsername(String username) {
		this.username=username;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}


	
}
