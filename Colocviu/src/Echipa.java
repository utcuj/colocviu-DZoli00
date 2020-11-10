
public class Echipa {

	private String nume;
	private TeamLeader tm;
	Developer[] dev = new Developer[10];
	private int contord;
	private String proiect;

	public String getProiect() {
		return proiect;
	}

	public void setProiect(String proiect) {
		this.proiect = proiect;
	}

	public Echipa(String nume) {
		this.nume = nume;
	}

	public void addTmLeader(TeamLeader tm) {
		this.tm = tm;
	}

	public void addDev(Developer d) {
		dev[contord++] = d;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public void delTeamLeader()
	{
		this.tm = null;
	}

	public TeamLeader getTm() {
		return tm;
	}

	public void setTm(TeamLeader tm) {
		this.tm = tm;
	}

	public void afisareEchipa() {
		System.out.println("Team leaderul " + tm.getNume() + " are uramtorii subordonati:");
		for (int i = 0; i < contord; ++i) {
			System.out.print(dev[i].getNume() + " ");
		}
		System.out.println();
	}

	public void afisarePoriect() {
		System.out.println("Angajatii echipe " + nume + " se lucreaza pe proiectul " + proiect);
	}
}
