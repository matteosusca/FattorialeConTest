
public class FattorialeFunz {
	public static int Fattoriale(int n) {
		int fatt=1;
		int i; 
		for (i=1; i<=n; i++) {
			fatt *= i; 
		}
		return fatt;
	}

	public static String Giorno (int giorno, int mese, int anno) {
		String meseString;
		switch (mese) {
		case 1:
			meseString="Gennaio";
			break;
		case 2:
			meseString="Febbraio";
			break;
		case 3:
			meseString="Marzo";
			break;
		case 4:
			meseString="Aprile";
			break;
		case 5:
			meseString="Maggio";
			break;
		case 6:
			meseString="Giugno";
			break;
		case 7:
			meseString="Luglio";
			break;
		case 8:
			meseString="Agosto";
			break;
		case 9:
			meseString="Settembre";
			break;
		case 10:
			meseString="Ottobre";
			break;
		case 11:
			meseString="Novembre";
			break;
		case 12:
			meseString="Dicembre";
			break;
		default:
			meseString="Mese sconosciuto";
			break;
		}
		return "La data immessa è il " + giorno + " " + meseString + " del " + anno;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int giorno=21;
		int mese=11;
		int anno=2001;
		String stringa=Giorno(giorno,mese,anno);
		System.out.print(stringa);
	}
}
