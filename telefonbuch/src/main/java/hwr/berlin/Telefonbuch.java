package hwr.berlin;




import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;




public class Telefonbuch implements Serializable{

    private static final long serialVersionUID = -1L;
    //static String filelocation = "telefonbuch/src/main/java/hwr/berlin/Telefonbuch.ser";
    static File file = new File("Telefonbuch.ser");
    FileOutputStream fos = null;
    ObjectOutputStream oos = null;
    FileInputStream fis = null;
    ObjectInputStream ois=null;
    

    public ArrayList<Kontakt> telefonbuchArray;
    
    //Konstruktor
    public Telefonbuch(){
        ArrayList<Kontakt> telefonbuch = new ArrayList<>();
        this.telefonbuchArray = telefonbuch;
    }

    public Telefonbuch(File file){
        //ArrayList<Kontakt> telefonbuch = new ArrayList<>();
        this.telefonbuchArray = buchLaden(file);
    }
    //Kontakt zu ArrayList<Kontakt> hinzufügen
    public void fuegeKontaktHinzu(Kontakt kontakt){
        telefonbuchArray.add(kontakt);
    }

    //Kontakt löschen
    public void loescheKontakt(Kontakt kontakt){
        telefonbuchArray.remove(kontakt);
    }

    //Kontakte anzeigen
    public void alleKontakteAnzeigen(){
        
        for (Kontakt kontakt:telefonbuchArray){
            System.out.println(kontakt.getName());
            System.out.println(kontakt.getAdresse());
            System.out.println(kontakt.getEmail());
            kontakt.nummerAusgeben();
        }
        System.out.println("Alle Kontakte erfolgreich angezeigt!");
    }

    public String alleNameToStrings(){
       
        
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
            System.out.println("Telefonbuch erfolgreich gespeichert!");
            //alleKontakteAnzeigen();

        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }


       

       
    }

    //Buch laden
    public  ArrayList<Kontakt> buchLaden(File file){
 
        try{
        fis = new FileInputStream(file);
        ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        telefonbuchArray = (ArrayList<Kontakt>) obj;
        System.out.println("Telefonbuch erfolgreich geladen!");
        
           
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    
        try {
            ois.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return telefonbuchArray; 
    }



    



}

  
    

