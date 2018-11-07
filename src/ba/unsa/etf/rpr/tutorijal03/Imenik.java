package ba.unsa.etf.rpr.tutorijal03;
import java.util.*;
import java.util.Set;
import java.util.TreeSet;

public class Imenik {
    private HashMap<String, TelefonskiBroj> imenik;                             //a ne str, pa br

    Imenik() {
        imenik = new HashMap<String, TelefonskiBroj>();
    }

    public void dodaj(String ime, TelefonskiBroj broj){                       //warning package-private???
        imenik.put(ime, broj);
    }

    public String dajBroj(String ime){
        return imenik.get(ime).ispisi();                                                              //???
    }

    public String dajIme(TelefonskiBroj broj){
        for (HashMap.Entry<String, TelefonskiBroj> me : imenik.entrySet()) {
            if(me.getValue().equals(broj))
                return me.getKey();
        }
        return null;
    }

    public String naSlovo(char s){
        String spisak = new String();                                          //warning??
        int i=1;
        for (HashMap.Entry<String, TelefonskiBroj> x : imenik.entrySet())
            if(x.getKey().charAt(0)==s) {
                spisak+=i + ". " + x.getKey() + " - " + x.getValue().ispisi() + "\n";         //warning?
                i++;
            }
        return spisak;
    }

    public Set<String> izGrada(FiksniBroj.Grad g){                                             //i opet package..
        TreeSet<String> spisak = new TreeSet<String>();
        for (HashMap.Entry<String, TelefonskiBroj> x : imenik.entrySet()) {
            String s = new String(x.getValue().ispisi());                                         //dosta warninga...
            /*FiksniBroj.Grad pozivni = new FiksniBroj.Grad((String)(s[0] + s[1] + s[2]));*/          //nesto pametnije
            int br = Character.getNumericValue(s.charAt(2));
            if(br==g.ordinal())                                                               //but 39 i 49 problem
                spisak.add(x.getKey());
        }
        return spisak;
    }


    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g){
        Comparator<TelefonskiBroj> komparator = (TelefonskiBroj  broj1, TelefonskiBroj  broj2) -> (broj1.ispisi().compareTo(broj2.ispisi()));
        SortedSet<TelefonskiBroj> spisak = new TreeSet(komparator);                       //upozorenje za dodjelu????
        for (HashMap.Entry<String, TelefonskiBroj> x : imenik.entrySet()) {
            String s = new String(x.getValue().ispisi());                                 //redundant????
            int br = Character.getNumericValue(s.charAt(2));
            if(br==g.ordinal())                                                            //Comparable?????????????????
                spisak.add(x.getValue());
        }
        return spisak;
    }
}
