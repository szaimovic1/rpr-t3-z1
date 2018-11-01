package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {
    public enum Grad{
        TRAVNIK("030"), ORASJE("031"), ZENICA("032"),
        SARAJEVO("033"), LIVNO("034"), TUZLA("035"),
        MOSTAR("036"), BIHAC("037"), GORAZDE("038"),
        SIROKIBRIJEG("039"), BRCKO("049");

        private String pozivni;
        Grad(String s){
            pozivni=s;
        }

        @Override
        public String toString(){
            return pozivni;                                                     //umjesto getera?????
        }

        //@Override
        public boolean equals(Grad g) {
            return (this.pozivni.equals(g.pozivni));
        }
    }
    private Grad grad;
    private String broj;

    FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        return (grad.pozivni + "/" + broj);                                                //moze i sa ordinal()
    }

    //@Override
    public int hashCode() {
        return broj.hashCode();
    }

    //@Override
    public boolean equals(FiksniBroj br){
        return (grad.equals(br.grad) && broj.equals(br.broj));
    }
}
