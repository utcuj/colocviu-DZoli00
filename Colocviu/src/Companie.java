
public class Companie {

	private String nume;
	private Manager mng;
	Angajat[] ang = new Angajat[20];
	private int contora;
	private String[] proiect= new String[10];
	
	
	Echipa[] echi = new Echipa[5];
	//private int contore;

	public Companie(String nume) {
		this.nume = nume;
	}

	public Companie(String nume, Manager mng) {
		this.nume = nume;
		this.mng = mng;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public Manager getMng() {
		return mng;
	}

	public void setMng(Manager mng) {
		this.mng = mng;
	}

	public void addAngajat(Angajat ang1) {
		for( int i = 0 ; i < 20 ; ++i) {
			if(ang[i] == null) {
				ang[i] = ang1;
				return;
			}
		}
	}
	
	public void stergereAngajat(Angajat ang1) {
			for( int i = 0 ; i < 20 ; ++i) {
				if( ang[i] == ang1) {
					ang[i] = null;
				}
			}
	}
	
	public void addProiect(String name) {
		proiect[contora++] = name;
	}
	
	public void afisProect() {
		System.out.println("Proiectele din companie:");
		for( int i = 0 ; i < contora ; ++i) {
			System.out.println(proiect[i]);
		}
	}

	public void addEchipa(Echipa e) {
		for (int i = 0 ; i < 5 ; ++ i) {
			if( echi[i] == null) {
				echi[i] = e;
				return;
			}
		}
	
	}
	
	public void stergeEchipe( Echipa e, int nr) {
		for (int i = 0 ; i < echi.length; ++ i) {
			if( echi[i] == e) {
				echi[nr] = null;
			}
		}
	}
	
	public void afisareAngajati() {
		System.out.println("Angajatii la companie sunt:");
		for( int i = 0 ; i < 20 ; ++i) {
			if( ang[i] != null && ang[i] instanceof Developer) {
				System.out.println(ang[i].getNume() + "lucraeza ca si developer" );
			} else {
				if( ang[i] instanceof TeamLeader) {
					System.out.println(ang[i].getNume() + "lucraeza ca si team leader" );
				}
			}
		
		}
		System.out.println(mng.getNume() + " lucreaza ca si manager");
	}
	
	public void addProiectManager(int nr) {
		mng.addPoriectManager(proiect[nr]);
	}
}
