package Entity;

public class OperatoreRegistrato {
	
	private String nomeSociet�;
	private String partitaIva;
	private String username;
	private String password;
	

	public OperatoreRegistrato(String nomeSociet�,String partitaIva, String username, String password) {
		this.nomeSociet�=nomeSociet�;
		this.partitaIva=partitaIva;
		this.username=username;
		this.password=password;
	}

	public String getNomeSociet�() {
		return nomeSociet�;
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
	
	public void setNomeSociet�(String nomeSociet�) {
		this.nomeSociet�=nomeSociet�;
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
