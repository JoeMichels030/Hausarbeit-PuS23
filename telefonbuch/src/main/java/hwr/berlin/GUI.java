
package hwr.berlin;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;


import java.awt.CardLayout;

import java.awt.Dimension;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class GUI extends JFrame implements ActionListener{
  
    //MenuBar
    JMenuBar menueleiste;
    
    //Menu
    JMenu menuTelefonbuch;
    JMenu menuKontakt;

    //MenuItems Telefonbuch
    JMenuItem speichern;
    JMenuItem laden;
    JMenuItem beenden;

    //MenuItems Kontakt
    JMenuItem neuerKontakt;
    JMenuItem alleKontakteAnzeigen;
    JMenuItem kontaktSuchen;
    JMenuItem kontaktLoeschen;

    //Panels mit Buttons
    JPanel startPanel;
    JButton butBuchLaden;
    JButton butNeuesBuch;
    
    
    static String filelocation = "telefonbuch/src/main/java/hwr/berlin/";
    Telefonbuch buch;

   


    public static void main(String args[]){
        
        GUI fenster = new GUI();
    
        fenster.initGUI();
    }



public void initGUI(){

    //setSize(640, 480);
    setPreferredSize(new Dimension(800,600));
    setTitle("Telefonbuch App");
   
    initMenu();
    initMainWindow();
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    pack();

    }

public void initMenu(){

    JMenuBar menueleiste = new JMenuBar();

    //Einträge in Menüleiste
    JMenu menuTelefonbuch = new JMenu("Telefonbuch");
    JMenu menuKontakt = new JMenu ("Kontakt");
    
    //Einträge in Menu menuTelefonbuch
    laden = new JMenuItem("Telefonbuch laden");
    speichern = new JMenuItem("Telefonbuch speichern");
    beenden = new JMenuItem("Programm beenden");
   

    //Einträge in Menu menuKontakt
    neuerKontakt = new JMenuItem("Neuer Kontakt anlegen");
    alleKontakteAnzeigen = new JMenuItem("Alle Kontake anzeigen");
    kontaktSuchen = new JMenuItem("Kontakt suchen");
    kontaktLoeschen = new JMenuItem("Kontakt löschen");


    laden.addActionListener(this);    
    speichern.addActionListener(this);
    beenden.addActionListener(this);

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

public void initMainWindow(){

    JButton butBuchLaden = new JButton("Buch laden");
    butBuchLaden.setPreferredSize(new Dimension(50,30));
    butBuchLaden.addActionListener(this);

    JButton butNeuesBuch = new JButton("Neues Buch anlegen");
    butNeuesBuch.setPreferredSize(new Dimension(50,30));
    butNeuesBuch.addActionListener(this);
    
    CardLayout cl = new CardLayout();
    
    
    JPanel startPanel = new JPanel();
    JPanel kontaktAnlegenPanel = new JPanel();
    JPanel alleKontakteAnzeigenPanel = new JPanel();
    JPanel kontaktSuchenPanel = new JPanel();


    
    getContentPane();
    setLayout(cl);

    GridLayout gl = new GridLayout(10, 10,10,20);    
    startPanel.setLayout(gl);
    startPanel.add(butBuchLaden);
    startPanel.add(butNeuesBuch);


    add("Start",startPanel);
    add("Kontakt anlegen",kontaktAnlegenPanel);
    add("Kontakt Suchen",kontaktSuchenPanel);
    add("Alle Kontakte anzeigen",alleKontakteAnzeigenPanel);
    add("Kontakt suchen",kontaktSuchenPanel);

    }

@Override
public void actionPerformed(ActionEvent knopfdruck) {
    
    //Menü Telefonbuch laden
    if(knopfdruck.getSource() == laden){
        JFileChooser fc = new JFileChooser(filelocation);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Telefonbuch", "ser");
        fc.setAcceptAllFileFilterUsed(false);
        fc.addChoosableFileFilter(filter);
            
        int a = fc.showOpenDialog(null);

        if(a == JFileChooser.APPROVE_OPTION){
            File file = fc.getSelectedFile();
            buch = new Telefonbuch(file);
            buch.alleKontakteAnzeigen();

            //TO-DO Methode telefonbuch.buchLaden() einbinden
            System.out.println("Telefonbuch wurde geladen!");

        }

    }

    //Menü Telefonbuch speichern
    if(knopfdruck.getSource() == speichern){
        JFileChooser fc = new JFileChooser(filelocation);

        //Filter für Telefonbuch
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Telefonbuch", "ser");
        fc.setAcceptAllFileFilterUsed(false);
        fc.addChoosableFileFilter(filter);
        fc.showSaveDialog(null);

        
        File file = fc.getSelectedFile();
        buch.buchSpeichern(file);
        System.out.println("Telefonbuch wurde gespeichert!");                


    }

    //Menü Telefonbuch beenden
    if(knopfdruck.getSource() == beenden){
        System.out.println("Programm wurde beendet");
        System.exit(0);
    }

    //Menü Kontakt neuer Kontakt
    if(knopfdruck.getSource() == neuerKontakt){
        //show(,"Kontakt anlegen");

    }
    
    //startPanel Buttons
    if (knopfdruck.getSource() == butBuchLaden){


    }

        //TODO ActionListener neuerKontakt, alleKontakteAnzeigen, kontaktSuchen, kontaktLoeschen
        //TODO actionPerformed neuerKontakt, alleKontakteAnzeigen, kontaktSuchen, kontaktLoeschen
    
    }

}