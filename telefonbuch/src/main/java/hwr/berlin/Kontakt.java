package hwr.berlin;

import java.io.Serializable;
import java.util.ArrayList;

public class Kontakt implements Serializable {

    private static final long serialVersionUID = -1L;

    private String name;
    private String adresse;
    private String email;
    protected ArrayList<Telefonnummer> nummern;

    //Konstruktor
    public Kontakt() {
        ArrayList<Telefonnummer> nummern = new ArrayList<>();
        this.nummern = nummern;
        this.name = null;
        this.adresse = null;
        this.email = null;
    }

    public Kontakt(String name) {
        ArrayList<Telefonnummer> nummern = new ArrayList<>();
        this.nummern = nummern;
        this.name = name;
    }

    public ArrayList<Telefonnummer> getNummern() {
        return nummern;
    }

    public void setNummern(ArrayList<Telefonnummer> nummern) {
        this.nummern = nummern;
    }

    public String getName() {
        return name;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getEmail() {
        return email;
    }

    //Setter Methoden
    public void setName(String name) {
        this.name = name;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Telefonnummer zu ArrayList<Long> hinzufügen
    public void fuegeNrHinzu(Telefonnummer telefonnummer) {
        nummern.add(telefonnummer);
    }

    //beim laden aus Datei Telefonbuch.ser
    public void fuegeNrHinzu(String nummerString) {

        Telefonnummer l = new Telefonnummer();
        l = l.stringToTelefonnummer(nummerString);
        nummern.add(l);
    }

    public void nummerAusgeben() {
        for(Telefonnummer nummer: nummern){
            System.out.println(nummer);
        }
    }


    public String nummernToString(){
        String nummerToString = "";

        for (Telefonnummer nummer: nummern){
            nummerToString += nummer.telefonnummerToString() + " : "+nummer.getBeschreibung() +" \n" ;
            
        }
        return nummerToString;
    }

    // toString
   // @Override
    public String NummerArraytoString1() {
        return nummern + " \n";
    }
}
