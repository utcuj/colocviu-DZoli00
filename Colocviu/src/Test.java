import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int nrAngajati;
		 nrAngajati = input.nextInt();

		 System.out.println("Compania are " + nrAngajati + " de angajati");
		System.out.println();

		Companie comp = new Companie("National");

		TeamLeader tm1 = new TeamLeader("Ioan", 31, 8, 50, nivel.nivel2);
		TeamLeader tm2 = new TeamLeader("Anghel", 22, 1, 30, nivel.nivel1);

		Manager mng1 = new Manager("George", 45, 25, 100, nivel.nivel2);

		Developer dev1 = new Developer("Stefan", 23, 2, 20, nivel.nivel1);
		Developer dev2 = new Developer("Avram", 48, 15, 35, nivel.nivel2);
		Developer dev3 = new Developer("Andrei", 25, 7, 50, nivel.nivel2);
		Developer dev4 = new Developer("Cosmin", 27, 7, 35, nivel.nivel1);
		Developer dev5 = new Developer("Daniel", 54, 20, 40, nivel.nivel2);

		// developerii 1 si 2 rezolva taskurile 12 si 74
		dev1.rezolvareTask(12);
		dev2.rezolvareTask(74);

		comp.setMng(mng1);

		mng1.addAngajat(comp, tm1);
		mng1.addAngajat(comp, tm2);
		mng1.addAngajat(comp, dev1);
		mng1.addAngajat(comp, dev2);
		mng1.addAngajat(comp, dev3);
		mng1.addAngajat(comp, dev4);
		mng1.addAngajat(comp, dev5);

		comp.afisareAngajati();

		System.out.println();

		mng1.stergereAngajat(comp, dev1);

		Echipa eco_team = mng1.createEchipa(comp, "Eco Team");
		Echipa rescue = mng1.createEchipa(comp, "Rescue");
		input.close();

		eco_team.setProiect("Australian wildfire");
		rescue.setProiect("Google maps erros");

		mng1.addDeveloper(eco_team, dev1);
		mng1.addDeveloper(eco_team, dev2);
		mng1.addDeveloper(eco_team, dev3);

		mng1.addDeveloper(rescue, dev4);
		mng1.addDeveloper(rescue, dev5);

		mng1.addTmLeader(eco_team, tm1);
		mng1.addTmLeader(rescue, tm2);

		eco_team.afisareEchipa();
		rescue.afisareEchipa();

		// mng1.addDeveloper(comp, "Eco Team", dev1);

		System.out.println();

		System.out.println("Team leaderul echipe eco_team este: " + eco_team.getTm().getNume());
		eco_team.delTeamLeader();
		System.out.println("Team leaderul echipe eco_team este: " + eco_team.getTm());
		eco_team.setTm(tm2);
		System.out.println("Team leaderul echipe eco_team este: " + eco_team.getTm().getNume());

		System.out.println();
		
		comp.addProiect("Facebook");
		comp.addProiect("Instagramm");
		comp.addProiect("Google");
		comp.addProiect("Youtube");
		
		comp.afisProect();
		

		tm2.calculareSalar();
		tm1.calculareSalar();
		mng1.calculareSalar();
		dev1.calculareSalar();
		dev2.calculareSalar();
		
		comp.addProiectManager(2);
		
		eco_team.afisarePoriect();
		rescue.afisarePoriect();
		
		System.out.println("Managerul lucreaza pe proiectul " + mng1.getProitect());
		

		System.out.println("Salariile pentru team leaderi de nivel 1 si nivel 2 sunt :" + tm2.getSalar() + " si "
				+ tm1.getSalar());
		System.out.println("Salariile pentru developeri de nivel 1 si nivel 2 sunt :" + dev1.getSalar() + " si "
				+ dev2.getSalar());
		System.out.println("Salariul unui manager de nivel2 este: " + mng1.getSalar());
	}

}
