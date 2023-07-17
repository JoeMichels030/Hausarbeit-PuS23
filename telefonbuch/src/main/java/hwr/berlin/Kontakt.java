package hwr.berlin;

import java.io.Serializable;
import java.util.ArrayList;

public class Kontakt implements Serializable {

    private static final long serialVersionUID = -1L;

    //Attribute
    private String name;
    private String adresse;
    private String email;
    protected ArrayList<Telefonnummer> nummern;

    //Standardkonstruktor
    public Kontakt() {
        ArrayList<Telefonnummer> nummern = new ArrayList<>();
        this.nummern = nummern;
        this.name = null;
        this.adresse = null;
        this.email = null;
    }

    //Erstellt einen neuen Kontakt mit "name" 
    public Kontakt(String name) {
        ArrayList<Telefonnummer> nummern = new ArrayList<>();
        this.nummern = nummern;
        this.name = name;
    }

    //get Telefonnummern als ArrayList
    public ArrayList<Telefonnummer> getNummern() {
        return nummern;
    }

    //set Telefonnummern
    public void setNummern(ArrayList<Telefonnummer> nummern) {
        this.nummern = nummern;
    }

    //getName als String
    public String getName() {
        return name;
    }

    //getAdresse als String
    public String getAdresse() {
        return adresse;
    }

    //getEmail als String
    public String getEmail() {
        return email;
    }

    //setName als String
    public void setName(String name) {
        this.name = name;
    }

    //setAdresse als String
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    //setEmail als String
    public void setEmail(String email) {
        this.email = email;
    }

    //Telefonnummer zu ArrayList<Long> hinzufügen
    public void fuegeNrHinzu(Telefonnummer telefonnummer) {
        nummern.add(telefonnummer);
    }

    //beim laden aus Datei Telefonbuch.ser
    //Eingabe String -> Telefonnummer
    //Telefonnummer zu ArrayList Telefonnummer hinzufügen
    public void fuegeNrHinzu(String nummerString) {

        Telefonnummer l = new Telefonnummer();
        l = l.stringToTelefonnummer(nummerString);
        nummern.add(l);
    }

    //Testmethode
    //Gibt alle Telefonnummern eines Kontakts in der Konsole aus
    public void nummerAusgeben() {
        for(Telefonnummer nummer: nummern){
            System.out.println(nummer);
        }
    }



    //Ausgabe in jTextArea
    //Format: " nummer : beschreibung " \n
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
