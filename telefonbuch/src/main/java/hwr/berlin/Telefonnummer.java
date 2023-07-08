package hwr.berlin;

import java.io.Serializable;

public class Telefonnummer implements Serializable{
    private long nummer;
    private String beschreibung;
    private static final long serialVersionUID = -1L;


    public Telefonnummer(){
        this.nummer = 0;
        this.beschreibung = null;
    }


    public long getNummer() {
        return nummer;
    }


    public void setNummer(long nummer) {
        this.nummer = nummer;
    }


    public String getBeschreibung() {
        return beschreibung;
    }


    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public Telefonnummer  stringToTelefonnummer(String string){
        Telefonnummer nummerAlsTelefonnummer = new Telefonnummer();
        nummer = Long.parseLong(string);
        return nummerAlsTelefonnummer;

    }

    public String telefonnummerToString(){
        String nummerToString = Long.toString(nummer);
        return nummerToString;
    }


    @Override
    public String toString() {
        return  nummer + " : " + beschreibung + "\n";
    }

    
}
