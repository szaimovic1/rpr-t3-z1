package ba.unsa.etf.rpr.tutorijal03;

public class Program {

    public static void main(String[] args) {
	    FiksniBroj f = new FiksniBroj(FiksniBroj.Grad.SARAJEVO, "567-654");
	    FiksniBroj f1 = new FiksniBroj(FiksniBroj.Grad.SARAJEVO, "765-654");
	    if(f.equals(f1))
	    	System.out.println(f.ispisi());
	    else System.out.println(f.ispisi() + " i " + f1.ispisi());

        Imenik i = new Imenik();
        i.dodaj("Maus", new MedunarodniBroj("432", "1234567"));
		i.dodaj("Miki", new MedunarodniBroj("345", "1234087"));
		i.dodaj("Nihad", new MobilniBroj(60, "982-467"));
		i.dodaj("Sia", new MobilniBroj(61, "675-123"));             //061????
		System.out.println();
		System.out.println(i.dajBroj("Sia"));
		System.out.println();
		System.out.println(i.dajIme(new MobilniBroj(60, "982-467")));     //zasto nije ok???
		System.out.println();
		System.out.println(i.naSlovo('M'));
		System.out.println();
    }
}
