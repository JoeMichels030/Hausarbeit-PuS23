package hwr.berlin;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class GUI extends JFrame implements ActionListener{

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
    JMenuItem laden = new JMenuItem("Telefonnbuch laden");
    JMenuItem speichern = new JMenuItem("Telefonbuch speichern");
    JMenuItem beenden = new JMenuItem("Programm beenden");

    //Einträge in Menu menuKontakt
    JMenuItem neuerKontakt = new JMenuItem("Neuer Kontakt anlegen");
    JMenuItem alleKontakteAnzeigen = new JMenuItem("Alle Kontake anzeigen");
    JMenuItem kontaktSuchen = new JMenuItem("Kontakt suchen");
    JMenuItem kontaktLoeschen = new JMenuItem("Kontakt löschen");


    //Action Listener menuTelefonbuch
    //laden
    laden.addActionListener(new java.awt.event.ActionListener(){
        public void actionPerformed(java.awt.event.ActionEvent e){
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
        });

    //speichern
        speichern.addActionListener(new java.awt.event.ActionListener(){
        public void actionPerformed(java.awt.event.ActionEvent e){
            JFileChooser fc = new JFileChooser(filelocation);
            fc.showSaveDialog(null);

            //TO-DO Methode telefonbuch.buchSpeichern() einbinden                   
            System.out.println("Telefonbuch wurde gespeichert!");                
            }
    
        });

    //Beenden
        beenden.addActionListener(new java.awt.event.ActionListener(){
        public void actionPerformed(java.awt.event.ActionEvent e){

        System.out.println("Programm wurde beendet!");  
        System.exit(0);                
                      
        }
    
        });

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
}
