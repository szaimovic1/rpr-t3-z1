package ba.unsa.etf.rpr.tutorijal03;

public class  MobilniBroj extends TelefonskiBroj {
    private int MobilnaMreza;
    private String broj;

    MobilniBroj(int mobilnaMreza, String broj) {
        MobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }

 /*   @Override
    public String toString(){
        String s = "0" + MobilnaMreza + "/" + broj;                                //ovo ne treba?
        return s;
    }*/

    @Override
    public String ispisi() {
        return "0" + MobilnaMreza + "/" + broj;                                    //moze li ikako return this?
    }
}
