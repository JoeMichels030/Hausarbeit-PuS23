package hwr.berlin;

import java.io.Serializable;
import java.util.ArrayList;




public class Kontakt implements Serializable{

    private static final long serialVersionUID = -1L;

    protected  String name;
    protected String adresse;
    protected String email;
    protected ArrayList<Long> nummern;


    //Konstruktor
    public Kontakt(){
        this.name = null;
        this.adresse = null;
        this.email = null;
        this.nummern = null;
    }

    public Kontakt(String name){
        ArrayList<Long> nummern = new ArrayList<>();
        this.nummern = nummern;
        this.name = name;

    }

    public ArrayList<Long> getNummern() {
        return nummern;
    }

    public void setNummern(ArrayList<Long> nummern) {
        this.nummern = nummern;
    }

    //Getter Methoden
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
    
    public void fuegeNrHinzu(long telefonnummer){
        this.nummern.add(telefonnummer);
    }

    //beim laden aus Datei Telefonbuch.ser
    public void fuegeNrHinzu(String nummerString){
        long l = Long.parseLong(nummerString);
        this.nummern.add(l);
    }

    public void nummerAusgeben(){
        for(long nummer: nummern){
            System.out.println(nummer);
        }
    }
    // toString
    @Override
    public String toString() {
        return "[name=" + name + ", adresse=" + adresse + ", email=" + email + ", nummern=" + nummern + "]";
    }

    


    
}
