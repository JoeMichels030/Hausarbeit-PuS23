package hwr.berlin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Telefonbuch implements Serializable {

    private static final long serialVersionUID = -1L;
    
    FileOutputStream fos;
    ObjectOutputStream oos;
    FileInputStream fis;
    ObjectInputStream ois;
    

    public ArrayList<Kontakt> telefonbuchArray;
    
    //Konstruktor
    //Erstellt ein neues, leeres Telefonbuch
    public Telefonbuch() {
        ArrayList<Kontakt> telefonbuch = new ArrayList<>();
        this.telefonbuchArray = telefonbuch;
    }

    //Erstellt ein neues Telefonbuch aus file
    public Telefonbuch(File file) {
        this.telefonbuchArray = buchLaden(file);
    }

    //Kontakt zu ArrayList<Kontakt> (Telefonbuch) hinzufügen
    public void fuegeKontaktHinzu(Kontakt kontakt) {
        telefonbuchArray.add(kontakt);
    }

    //Kontakt löschen
    public void loescheKontakt(Kontakt kontakt) {
        telefonbuchArray.remove(kontakt);
    }

    public void clearTelefonbuch(){
        for (Kontakt kontakt : telefonbuchArray){
            telefonbuchArray.remove(kontakt);
        }
    }

    //Testmethode zum Überprüfen der geladenen/gespeicherten Werte
    //Kontakte anzeigen
    //Ausgabe Telefonbuch in der Konsole
    public void alleKontakteAnzeigen() {
        for (Kontakt kontakt:telefonbuchArray){
            System.out.println(kontakt.getName());
            System.out.println(kontakt.getAdresse());
            System.out.println(kontakt.getEmail());
            kontakt.nummerAusgeben();
        }
        System.out.println("Alle Kontakte erfolgreich angezeigt!");
    }

    public void sortiere(){
        Collections.sort(telefonbuchArray, new Comparator<Kontakt>(){

            @Override
            public int compare(Kontakt arg0, Kontakt arg1) {
                // TODO Auto-generated method stub
                return arg0.getName().compareToIgnoreCase(arg1.getName());
                //throw new UnsupportedOperationException("Unimplemented method 'compare'");
            }
    });  
    }
    

    //??
    public String alleNameToStrings() {
        return  telefonbuchArray.toString();
    }

    //Buch speichern 
    public void speichern(File outputFile){
        try {
            fos = new FileOutputStream(outputFile, false);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(telefonbuchArray);
            oos.flush();
            oos.close();
            System.out.println("Speichern erfolgreich!");
            //alleKontakteAnzeigen();

        } catch (FileNotFoundException e) {
            
          //  e.printStackTrace();
        } catch (IOException e){
          //  e.printStackTrace();
        }
       
    }

    //Buch laden
    public  ArrayList<Kontakt> buchLaden(File file) {
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            telefonbuchArray = (ArrayList<Kontakt>) obj;
            System.out.println("Telefonbuch erfolgreich geladen!");
        }
            catch (IOException e){
               // e.printStackTrace();
            } catch (ClassNotFoundException e){
               // e.printStackTrace();
            }
    
        try {
            ois.close();
            } catch (IOException e) {
                e.printStackTrace();
        }
        return telefonbuchArray; 
    }

    
}

  
    

