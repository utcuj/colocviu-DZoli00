
public class TeamLeader extends Angajat{

	private nivel nivelAngajat;
	private int salar;
	
	public TeamLeader(String nume, int varsta, int aniDeExp, int tarifPeOra) {
		super(nume, varsta, aniDeExp, tarifPeOra);
		// TODO Auto-generated constructor stub
	}
	
	public TeamLeader(String nume, int varsta, int aniDeExp, int tarifPeOra, nivel nivelAngajat) {
		super(nume, varsta, aniDeExp, tarifPeOra);
		// TODO Auto-generated constructor stub
		this.nivelAngajat = nivelAngajat;
	}
	
	@Override
	public void calculareSalar() {
		if( nivelAngajat == nivel.nivel1) {
			this.salar = tarifPeOra * 7 + 200;
		} else {
			this.salar = tarifPeOra* 7 + 300;
		}
	}

	public int getSalar() {
		return salar;
	}

	public void setSalar(int salar) {
		this.salar = salar;
	}

	public nivel getNivelAngajat() {
		return nivelAngajat;
	}

	public void setNivelAngajat(nivel nivelAngajat) {
		this.nivelAngajat = nivelAngajat;
	}
	
	

}
