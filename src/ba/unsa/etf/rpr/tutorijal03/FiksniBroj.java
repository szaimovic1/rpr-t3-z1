package ba.unsa.etf.rpr.tutorijal03;                                                                          //paket???

enum Grad{
    TRAVNIK, ORASJE, ZENICA, SARAJEVO, LIVNO, TUZLA, MOSTAR,                //mogu li enumu dodijeliti dr. vrijednosti???
    BIHAC, GORAZDE, SIROKIBRIJEG, BRCKO
}

public class FiksniBroj extends TelefonskiBroj {
    private Grad grad;
    private String broj;

    public FiksniBroj(Grad grad, String broj) {                                                             //generate..
        this.grad = grad;
        this.broj = broj;
    }

    @Override
    public String toString(){
        String s;
        if(grad!=Grad.BRCKO)
            s = "03" + grad.ordinal() + "/" + broj;
        else s = "049/" + broj;
        return s;
    }

    @Override
    public String ispisi() {
        System.out.println(this);
    }
}
