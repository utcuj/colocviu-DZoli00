enum nivel {
	nivel1, nivel2
};

public abstract class Angajat {

	String nume;
	int varsta;
	int aniDeExp;
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	int tarifPeOra;
	
	public Angajat(String nume, int varsta, int aniDeExp, int tarifPeOra) {
		this.nume = nume;
		this.varsta = varsta;
		this.aniDeExp = aniDeExp;
		this.tarifPeOra = tarifPeOra;
	}
	
	public abstract void calculareSalar();
	
	
}
