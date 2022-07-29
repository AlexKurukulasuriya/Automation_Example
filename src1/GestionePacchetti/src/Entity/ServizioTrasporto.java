package Entity;

public class ServizioTrasporto extends Servizi{

	private Citt� partenza;
	private Citt� arrivo;
	
	public ServizioTrasporto(String idServizio,float prezzo,Citt� a,Citt� b) {
		super(idServizio,prezzo);
		setPartenza(a);
		setArrivo(b);
	}

	public Citt� getPartenza() {
		return partenza;
	}

	public void setPartenza(Citt� partenza) {
		this.partenza = partenza;
	}

	public Citt� getArrivo() {
		return arrivo;
	}

	public void setArrivo(Citt� arrivo) {
		this.arrivo = arrivo;
	}

}
