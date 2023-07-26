package hwr.berlin;

import java.io.Serializable;

public class Telefonnummer implements Serializable{
    private long nummer;
    private String beschreibung;
    private static final long serialVersionUID = -1L;
    //private static final Telefonnummer[] Kontakt = null;

    //Standard Konstruktor
    public Telefonnummer(){
        this.nummer = 0;
        this.beschreibung = null;
    }

    
    /** 
     * @return long
     */
    //get Telefonnummer
    public long getNummer() {
        return nummer;
    }

    //set Telefonnummer
    public void setNummer(long nummer) {
        this.nummer = nummer;
    }


    //get Beschreibung
    public String getBeschreibung() {
        return beschreibung;
    }

    //set Beschreibung
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    //stringToTelefonnummer
    //wandelt Eingabe (String) aus jTextfield in Telefonnummer um, String wird als long geparst
    public Telefonnummer  stringToTelefonnummer(String string){
        Telefonnummer nummerAlsTelefonnummer = new Telefonnummer();
        try {
        this.nummer = Long.parseLong(string);
        }
        catch (Exception e){
            
        }
        return nummerAlsTelefonnummer;

    }

    public void  textfieldToTelefonnummer(String string){
        //Telefonnummer nummerAlsTelefonnummer = new Telefonnummer();
        try {
        this.nummer = Long.parseLong(string);
        }
        catch (Exception e){
            
        }
        //return nummerAlsTelefonnummer;

    }





    //telefonnummerToString
    //wandelt Telefonnummer in String um
    public String telefonnummerToString(){
        String nummerToString = Long.toString(nummer);
        return nummerToString;
    }

    //Telefonnummer toString, Rückgabe der Telefonnummer als String 
    //Ausgabe
    @Override
    public String toString() {
        return  nummer + "  :   " + beschreibung;
    }




    
}
