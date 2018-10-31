package ba.unsa.etf.rpr.tutorijal03;

public class  MobilniBroj extends TelefonskiBroj {
    private int MobilnaMreza;
    private String broj;

    public MobilniBroj(int mobilnaMreza, String broj) {
        MobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }

    @Override
    public String toString(){
        String s = "0" + MobilnaMreza + "/" + broj;
        return s;
    }

    @Override
    public String ispisi() {
        System.out.println(this);
    }
}
