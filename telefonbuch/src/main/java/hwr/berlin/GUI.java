
package hwr.berlin;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

//import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
//import java.io.IOException;

public class GUI extends JFrame implements ActionListener{
    JMenuBar menueleiste;

    JMenu menuTelefonbuch;
    JMenu menuKontakt;

    JMenuItem speichern;
    JMenuItem laden;
    JMenuItem beenden;

    JMenuItem neuerKontakt;
    JMenuItem alleKontakteanzeigen;
    JMenuItem kontaktSuchen;
    JMenuItem kontaktLoeschen;
    static String filelocation = "telefonbuch/src/main/java/hwr/berlin/Telefonbuch.ser";
    public static void main(String args[]){
        
        GUI fenster = new GUI();
    
        fenster.initGUI();
    }



public void initGUI(){

    setSize(640, 480);
    setTitle("Telefonbuch App");
   
    initMenu();
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

    }

public void initMenu(){

    JMenuBar menueleiste = new JMenuBar();

    //Einträge in Menüleiste
    JMenu menuTelefonbuch = new JMenu("Telefonbuch");
    JMenu menuKontakt = new JMenu ("Kontakt");
    
    //Einträge in Menu menuTelefonbuch
    JMenuItem laden = new JMenuItem("Telefonbuch laden");
    laden.addActionListener(this);
    JMenuItem speichern = new JMenuItem("Telefonbuch speichern");
    speichern.addActionListener(this);
    JMenuItem beenden = new JMenuItem("Programm beenden");
    beenden.addActionListener(this);

    //Einträge in Menu menuKontakt
    JMenuItem neuerKontakt = new JMenuItem("Neuer Kontakt anlegen");
    JMenuItem alleKontakteAnzeigen = new JMenuItem("Alle Kontake anzeigen");
    JMenuItem kontaktSuchen = new JMenuItem("Kontakt suchen");
    JMenuItem kontaktLoeschen = new JMenuItem("Kontakt löschen");


   
  

    //speichern


    //Beenden


        //TODO ActionListener neuerKontakt, alleKontakteAnzeigen, kontaktSuchen, kontaktLoeschen
        //TODO actionPerformed neuerKontakt, alleKontakteAnzeigen, kontaktSuchen, kontaktLoeschen
        

    menueleiste.add(menuTelefonbuch);
    menueleiste.add(menuKontakt);
    
    menuTelefonbuch.add(laden);
    menuTelefonbuch.add(speichern);
    menuTelefonbuch.add(beenden);

    menuKontakt.add(neuerKontakt);
    menuKontakt.add(alleKontakteAnzeigen);
    menuKontakt.add(kontaktSuchen);
    menuKontakt.add(kontaktLoeschen);

    setJMenuBar(menueleiste);
    
    }



@Override
public void actionPerformed(ActionEvent knopfdruck) {
    // TODO Auto-generated method stub

    if(knopfdruck.getSource()== laden){
        JFileChooser fc = new JFileChooser(filelocation);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Telefonbuch", "ser");
        fc.setAcceptAllFileFilterUsed(false);
        fc.addChoosableFileFilter(filter);
            
        int a = fc.showOpenDialog(null);

        if(a == JFileChooser.APPROVE_OPTION){
            File file = fc.getSelectedFile();

            //TO-DO Methode telefonbuch.buchLaden() einbinden
            System.out.println("Telefonbuch wurde geladen!");

        }

    }

    if(knopfdruck.getSource() == speichern){
        JFileChooser fc = new JFileChooser(filelocation);
        fc.showSaveDialog(null);

        //TO-DO Methode telefonbuch.buchSpeichern() einbinden     
        System.out.println("Telefonbuch wurde gespeichert!");                


    }

    if(knopfdruck.getSource() == beenden){
        System.out.println("Programm wurde beendet");
        System.exit(0);
    }
    throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
}
}