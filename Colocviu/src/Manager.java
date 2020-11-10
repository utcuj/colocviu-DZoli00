
public class Manager extends Angajat {

	private nivel nivelAngajat;
	private int salar;
	private String proiect;
	
	public String getProitect() {
		return proiect;
	}

	public void setProitect(String proitect) {
		this.proiect = proitect;
	}

	private Companie comp;
	Echipa[] echi = new Echipa[10];
	private int contore;

	public Manager(String nume, int varsta, int aniDeExp, int tarifPeOra) {
		super(nume, varsta, aniDeExp, tarifPeOra);
		// TODO Auto-generated constructor stub
	}

	public Manager(String nume, int varsta, int aniDeExp, int tarifPeOra, nivel nivelAngajat) {
		super(nume, varsta, aniDeExp, tarifPeOra);
		// TODO Auto-generated constructor stub
		this.nivelAngajat = nivelAngajat;
	}

	@Override
	public void calculareSalar() {
		if (nivelAngajat == nivel.nivel1) {
			this.salar = tarifPeOra * 6 + 200;
		} else {
			this.salar = tarifPeOra * 6 + 300;
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
	
	public void addCompanie( Companie comp) {
		this.comp = comp;
	}
	
	public void addAngajat(Companie comp, Angajat a) {
		comp.addAngajat(a);
	}
	
	public void stergereAngajat(Companie comp, Angajat a) {
		comp.stergereAngajat(a);
		System.out.println(a.getNume() + " este sters din companie");
	}
	
	/*public void addAngajat(Angajat a) {
		this.comp.addAngajat(a);
	}*/

	public Echipa createEchipa(Companie comp, String nume) {
		Echipa e = new Echipa(nume);
		echi[contore++] = e;
		comp.addEchipa(e);
		//this.comp.addEchipa(e);
		return e;
	}
	
	public void addDeveloper(Echipa e, Developer dev) {
		int i;
		for( i = 0 ; i < contore ; i ++) {
			if( echi[i] == e)
				break;
		}
		e.addDev(dev);
		echi[i] = e;
		
	}
	
	public void addTmLeader(Echipa e, TeamLeader Tm) {
		int i;
		for( i = 0 ; i < contore ; i ++) {
			if( echi[i] == e)
				break;
		}
		e.addTmLeader(Tm);
		echi[i] = e;
	}
	
	public void addPoriectManager(String nume) {
		this.proiect = nume;
	}
}
