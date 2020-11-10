
public class Developer extends Angajat {

	private nivel nivelAngajat;
	private int salar;

	public Developer(String nume, int varsta, int aniDeExp, int tarifPeOra) {
		super(nume, varsta, aniDeExp, tarifPeOra);
		// TODO Auto-generated constructor stub
	}

	public Developer(String nume, int varsta, int aniDeExp, int tarifPeOra, nivel a) {
		super(nume, varsta, aniDeExp, tarifPeOra);
		this.nivelAngajat = a;
	}

	@Override
	public void calculareSalar() {
		if (nivelAngajat == nivel.nivel1) {
			this.salar = tarifPeOra * 8 + 100;
		} else {
			this.salar = tarifPeOra * 8 + 200;
		}
	}

	public nivel getNivelAngajat() {
		return nivelAngajat;
	}

	public void setNivelAngajat(nivel nivelAngajat) {
		this.nivelAngajat = nivelAngajat;
	}

	public int getSalar() {
		return salar;
	}

	public void setSalar(int salar) {
		this.salar = salar;
	}

	public void rezolvareTask(int nr_task) {
		System.out.println(nume + " rezolva problema " + nr_task);
	}

}
