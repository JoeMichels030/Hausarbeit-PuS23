/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package hwr.berlin;

import java.io.File;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

//import org.testng.collections.Lists;

/**
 *
 * @author joemi
 * @param <CardLayout>
 */
public class GuiBuild<CardLayout> extends javax.swing.JFrame {

    /**
     * Creates new form GuiBuild
     */
    
    public GuiBuild() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cards = new javax.swing.JPanel();
        startWindow = new javax.swing.JPanel();
        butStartBuchLaden = new javax.swing.JButton();
        butStartBuchNeu = new javax.swing.JButton();
        kontaktAnlegen = new javax.swing.JPanel();
        textFieldNameNeu = new javax.swing.JTextField();
        textFieldAdresseNeu = new javax.swing.JTextField();
        textFieldeMailNeu = new javax.swing.JTextField();
        textfieldNummerNeu = new javax.swing.JTextField();
        labelNameNeu = new javax.swing.JLabel();
        labelAdresseNeu = new javax.swing.JLabel();
        labelEMailNeu = new javax.swing.JLabel();
        labelNummerNeu = new javax.swing.JLabel();
        butSpeichernNeu = new javax.swing.JButton();
        butZusNummerNeu = new javax.swing.JButton();
        butCancelNeu = new javax.swing.JButton();
        alleKontakteAnzeigen = new javax.swing.JPanel();
        listNamen = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        butKontaktSuchen = new javax.swing.JButton();
        butKontaktAnzeigen = new javax.swing.JButton();
        butKontaktLoeschen = new javax.swing.JButton();
        detailsName = new javax.swing.JLabel();
        detailsAdresse = new javax.swing.JLabel();
        detailsEmail = new javax.swing.JLabel();
        detailsNummer = new javax.swing.JLabel();
        detailsNameText = new javax.swing.JTextField();
        detailsAdresseText = new javax.swing.JTextField();
        detailsEmailText = new javax.swing.JTextField();
        detailsNummerText = new javax.swing.JTextField();
        butKontaktSpeichern = new javax.swing.JButton();
        menueleiste = new javax.swing.JMenuBar();
        menuTelefonbuch = new javax.swing.JMenu();
        menuLaden = new javax.swing.JMenuItem();
        menuSpeichern = new javax.swing.JMenuItem();
        menuBeenden = new javax.swing.JMenuItem();
        menuKontakt = new javax.swing.JMenu();
        menuNeuerKontakt = new javax.swing.JMenuItem();
        menuAlleKontakteAnzeigen = new javax.swing.JMenuItem();
        menuKontaktSuchen = new javax.swing.JMenuItem();
        menuKontaktLoeschen = new javax.swing.JMenuItem();
        telefonbuch = new Telefonbuch();
       

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cards.setLayout(new java.awt.CardLayout());

        butStartBuchLaden.setText("Telefonbuch laden");
        butStartBuchLaden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butStartBuchLadenActionPerformed(evt);
            }
        });

        butStartBuchNeu.setText("Neues Telefonbuch anlegen");

        javax.swing.GroupLayout startWindowLayout = new javax.swing.GroupLayout(startWindow);
        startWindow.setLayout(startWindowLayout);
        startWindowLayout.setHorizontalGroup(
            startWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startWindowLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(butStartBuchLaden)
                .addGap(128, 128, 128)
                .addComponent(butStartBuchNeu)
                .addContainerGap(416, Short.MAX_VALUE))
        );
        startWindowLayout.setVerticalGroup(
            startWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startWindowLayout.createSequentialGroup()
                .addContainerGap(297, Short.MAX_VALUE)
                .addGroup(startWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butStartBuchLaden)
                    .addComponent(butStartBuchNeu))
                .addGap(83, 83, 83))
        );

        cards.add(startWindow, "cardStartWindow");

        textfieldNummerNeu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldNummerNeuActionPerformed(evt);
            }
        });

        labelNameNeu.setText("Nachname, Vorname");

        labelAdresseNeu.setText("Adresse (Straße, NR, PLZ, Ort)");

        labelEMailNeu.setText("e-Mail Adresse");

        labelNummerNeu.setText("Telefonnummer");

        butSpeichernNeu.setText("Speichern");
        butSpeichernNeu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSpeichernNeuActionPerformed(evt);
            }
        });

        butZusNummerNeu.setText("zusätzliche Telefonnummer");

        butCancelNeu.setText("Zurück");
        butCancelNeu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelNeuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kontaktAnlegenLayout = new javax.swing.GroupLayout(kontaktAnlegen);
        kontaktAnlegen.setLayout(kontaktAnlegenLayout);
        kontaktAnlegenLayout.setHorizontalGroup(
            kontaktAnlegenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kontaktAnlegenLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(kontaktAnlegenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kontaktAnlegenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(labelNummerNeu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                        .addComponent(labelEMailNeu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(kontaktAnlegenLayout.createSequentialGroup()
                        .addGroup(kontaktAnlegenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNameNeu, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAdresseNeu, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kontaktAnlegenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldNameNeu)
                            .addComponent(textFieldAdresseNeu)
                            .addComponent(textFieldeMailNeu)
                            .addComponent(textfieldNummerNeu)
                            .addComponent(butZusNummerNeu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(344, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kontaktAnlegenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kontaktAnlegenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(butSpeichernNeu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butCancelNeu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(464, 464, 464))
        );
        kontaktAnlegenLayout.setVerticalGroup(
            kontaktAnlegenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kontaktAnlegenLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(kontaktAnlegenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kontaktAnlegenLayout.createSequentialGroup()
                        .addGroup(kontaktAnlegenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldNameNeu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNameNeu))
                        .addGap(18, 18, 18)
                        .addGroup(kontaktAnlegenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldAdresseNeu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAdresseNeu))
                        .addGap(18, 18, 18)
                        .addComponent(textFieldeMailNeu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelEMailNeu))
                .addGap(18, 18, 18)
                .addGroup(kontaktAnlegenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfieldNummerNeu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNummerNeu))
                .addGap(18, 18, 18)
                .addComponent(butZusNummerNeu)
                .addGap(38, 38, 38)
                .addComponent(butSpeichernNeu)
                .addGap(18, 18, 18)
                .addComponent(butCancelNeu)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        cards.add(kontaktAnlegen, "cardKontaktAnlegen");

        jList1.setModel(jList1.getModel());
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        listNamen.setViewportView(jList1);

        butKontaktSuchen.setText("Suchen");

        butKontaktAnzeigen.setText("Details anzeigen");

        butKontaktLoeschen.setText("Kontakt Löschen");
        butKontaktLoeschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butKontaktLoeschenActionPerformed(evt);
            }
        });

        detailsName.setText("Name");

        detailsAdresse.setText("Adresse");

        detailsEmail.setText("E-Mail");

        detailsNummer.setText("Telefonnummer");

        detailsNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsNameTextActionPerformed(evt);
            }
        });

        butKontaktSpeichern.setText("Kontakt speichern");
        butKontaktSpeichern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butKontaktSpeichernActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout alleKontakteAnzeigenLayout = new javax.swing.GroupLayout(alleKontakteAnzeigen);
        alleKontakteAnzeigen.setLayout(alleKontakteAnzeigenLayout);
        alleKontakteAnzeigenLayout.setHorizontalGroup(
            alleKontakteAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alleKontakteAnzeigenLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(listNamen, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(alleKontakteAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alleKontakteAnzeigenLayout.createSequentialGroup()
                        .addGroup(alleKontakteAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(detailsName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(detailsAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(detailsEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(alleKontakteAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(detailsNameText)
                            .addComponent(detailsAdresseText)
                            .addComponent(detailsEmailText, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                        .addGap(23, 23, 23))
                    .addGroup(alleKontakteAnzeigenLayout.createSequentialGroup()
                        .addComponent(detailsNummer, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(alleKontakteAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(alleKontakteAnzeigenLayout.createSequentialGroup()
                                .addComponent(detailsNummerText, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE))
                            .addGroup(alleKontakteAnzeigenLayout.createSequentialGroup()
                                .addComponent(butKontaktSpeichern)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(alleKontakteAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butKontaktSuchen, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butKontaktAnzeigen)
                    .addComponent(butKontaktLoeschen))
                .addContainerGap(306, Short.MAX_VALUE))
        );
        alleKontakteAnzeigenLayout.setVerticalGroup(
            alleKontakteAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alleKontakteAnzeigenLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(listNamen, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(alleKontakteAnzeigenLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(alleKontakteAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(detailsName)
                    .addComponent(detailsNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(alleKontakteAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alleKontakteAnzeigenLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butKontaktSuchen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butKontaktAnzeigen))
                    .addGroup(alleKontakteAnzeigenLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(alleKontakteAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(detailsAdresse)
                            .addComponent(detailsAdresseText, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19)
                .addGroup(alleKontakteAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detailsEmail)
                    .addComponent(detailsEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(alleKontakteAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detailsNummer)
                    .addComponent(detailsNummerText, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(alleKontakteAnzeigenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butKontaktLoeschen)
                    .addComponent(butKontaktSpeichern))
                .addGap(51, 51, 51))
        );

        cards.add(alleKontakteAnzeigen, "cardAlleKontakteAnzeigen");

        menuTelefonbuch.setText("Telefonbuch");

        menuLaden.setText("Telefonbuch laden");
        menuLaden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLadenActionPerformed(evt);
            }
        });
        menuTelefonbuch.add(menuLaden);

        menuSpeichern.setText("Telefonbuch speichern");
        menuSpeichern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSpeichernActionPerformed(evt);
            }
        });
        menuTelefonbuch.add(menuSpeichern);

        menuBeenden.setText("Beenden");
        menuBeenden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBeendenActionPerformed(evt);
            }
        });
        menuTelefonbuch.add(menuBeenden);

        menueleiste.add(menuTelefonbuch);

        menuKontakt.setText("Kontakt");

        menuNeuerKontakt.setText("Neuer Kontakt");
        menuNeuerKontakt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNeuerKontaktActionPerformed(evt);
            }
        });
        menuKontakt.add(menuNeuerKontakt);

        menuAlleKontakteAnzeigen.setText("Alle Kontakte anzeigen");
        menuKontakt.add(menuAlleKontakteAnzeigen);

        menuKontaktSuchen.setText("Kontakt suchen");
        menuKontakt.add(menuKontaktSuchen);

        menuKontaktLoeschen.setText("Kontakt löschen");
        menuKontakt.add(menuKontaktLoeschen);
        menuKontakt.setEnabled(false);

        menueleiste.add(menuKontakt);

        setJMenuBar(menueleiste);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butStartBuchLadenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butStartBuchLadenActionPerformed
        //menuLadenActionPerformed lädt das Telefonbuch
        menuLadenActionPerformed(evt);
        }
    //GEN-LAST:event_butStartBuchLadenActionPerformed

    private void textfieldNummerNeuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldNummerNeuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldNummerNeuActionPerformed

    private void butSpeichernNeuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSpeichernNeuActionPerformed
        //Neuer Kontakt erstellen
        Kontakt neuerKontakt = new Kontakt();

        //Test aus Textfeld als Attribute speichern
        neuerKontakt.setName(textFieldNameNeu.getText());
        neuerKontakt.setAdresse(textFieldAdresseNeu.getText());
        neuerKontakt.setEmail(textFieldeMailNeu.getText());

        String neueNummer = textfieldNummerNeu.getText();
        long neu = Long.parseLong(neueNummer);
        neuerKontakt.fuegeNrHinzu(neu);

        //Kontakt hinzufügen
        telefonbuch.fuegeKontaktHinzu(neuerKontakt);
        
        //jListe aktualisieren
        jListFuellen(telefonbuch);

        //Textfelder resetten
        textFieldNameNeu.setText("");
        textFieldAdresseNeu.setText("");
        textFieldeMailNeu.setText("");
        textfieldNummerNeu.setText("");
    } //GEN-LAST:event_butSpeichernNeuActionPerformed

    private void butKontaktLoeschenActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_butKontaktLoeschenActionPerformed
        // TODO add your handling code here:
                //Auswahl index
        int index = jList1.getSelectedIndex();

        //Kontakt auslesen
        Kontakt details = telefonbuch.telefonbuchArray.get(index);
        
        telefonbuch.loescheKontakt(details);
        jListFuellen(telefonbuch);
    } //GEN-LAST:event_butKontaktLoeschenActionPerformed

    private void menuBeendenActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_menuBeendenActionPerformed
        //Programm schließen
        System.out.println("Programm wurde beendet!");
        System.exit(0);
    } //GEN-LAST:event_menuBeendenActionPerformed

    private void jListFuellen(Telefonbuch telefonbuch){
        //Befüllt und aktualisiert die jListe
        DefaultListModel<String> model = new DefaultListModel<>();

        for (Kontakt kontakt:telefonbuch.telefonbuchArray){
             model.addElement(kontakt.getName());
        }
        jList1.setModel(model);
    }

    private void menuLadenActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_menuLadenActionPerformed
        final String filelocation = "telefonbuch/src/main/java/hwr/berlin/Telefonbuch.ser";
        JFileChooser fc = new JFileChooser(filelocation);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Telefonbuch", "ser");  
        fc.setAcceptAllFileFilterUsed(false);
        fc.addChoosableFileFilter(filter);
        int a = fc.showOpenDialog(null);
        
        if (a == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
           
            System.out.println("Telefonbuch wurde geladen!");
            
            telefonbuch.buchLaden(file);
            telefonbuch.alleKontakteAnzeigen();
           
            CardLayout cl = (CardLayout) (cards.getLayout());
            ((java.awt.CardLayout) cl).show(cards, "cardAlleKontakteAnzeigen");

            jListFuellen(telefonbuch);
            menuKontakt.setEnabled(true);
        } 
    }   //GEN-LAST:event_menuLadenActionPerformed

    private void menuSpeichernActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_menuSpeichernActionPerformed
        String filelocation = "telefonbuch/src/main/java/hwr/berlin/";                      // Standard Location für File
        JFileChooser fc = new JFileChooser(filelocation);  
        fc.setSelectedFile(new File(filelocation));                         

        //setze Filter auf Typ "Telefonbuch" mit Endung ".ser"
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Telefonbuch", "ser");  
        fc.setAcceptAllFileFilterUsed(false);
        fc.addChoosableFileFilter(filter);

        int a = fc.showSaveDialog(null);
        
        //bei klick auf "Speichern"
        if (a == JFileChooser.APPROVE_OPTION) {
            File outputFile = fc.getSelectedFile();
            String filename = fc.getSelectedFile().getName().toString();
            
            System.out.println("Überprüfe ob "+filename+" existiert...");
            if (!outputFile.exists()) {
                try {
                    //Neue Datei erstellen mit Endung .ser
                    outputFile.createNewFile();
                    if (!filename.endsWith(".ser")) {
                    filename += ".ser";
                }
                   System.out.println("Datei " + filename + " wurde erfolgreich erstellt");
                
                } catch (IOException e) {
                    System.out.println("Fehler beim erstellen einer neuen Datei");
                    e.printStackTrace();
                }
            }
            //TODO Cancel Button Action1
        
            System.out.println("Versuche zu speichern...");
            telefonbuch.alleKontakteAnzeigen();                 //Bug Hunting

            //Speichern
            telefonbuch.speichern(outputFile);
        }
        System.out.println("Telefonbuch wurde gespeichert!");

    // TODO add your handling code here:
    } //GEN-LAST:event_menuSpeichernActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) { //GEN-FIRST:event_jList1ValueChanged
        
        //Auswahl index
        int index = jList1.getSelectedIndex();

        //Kontakt auslesen
        Kontakt details = telefonbuch.telefonbuchArray.get(index);

        //Textfelder befüllen
        detailsNameText.setText(details.getName());
        detailsAdresseText.setText(details.getAdresse());
        detailsEmailText.setText(details.getEmail());
        detailsNummerText.setText(details.nummern.toString());
    } //GEN-LAST:event_jList1ValueChanged

    private void detailsNameTextActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_detailsNameTextActionPerformed
        // TODO add your handling code here:
    } //GEN-LAST:event_detailsNameTextActionPerformed

    private void butKontaktSpeichernActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_butKontaktSpeichernActionPerformed

        // TODO add your handling code here:
        //UPDATE FILE
        //Wie speichern nur ohne FileChooser
        //get.currentpath, file..
        
    } //GEN-LAST:event_butKontaktSpeichernActionPerformed

    private void menuNeuerKontaktActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_menuNeuerKontaktActionPerformed
        // TODO add your handling code here:
        //Springe zu Card "Neuer Kontakt anlegen"
        CardLayout cl = (CardLayout) (cards.getLayout());
        ((java.awt.CardLayout) cl).show(cards, "cardKontaktAnlegen");
    } //GEN-LAST:event_menuNeuerKontaktActionPerformed

    private void butCancelNeuActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_butCancelNeuActionPerformed
        // TODO add your handling code here:
        //Springe zu Card "Alle Kontakte anzeigen"
        CardLayout cl = (CardLayout) (cards.getLayout());
        ((java.awt.CardLayout) cl).show(cards, "cardAlleKontakteAnzeigen");
        jListFuellen(telefonbuch);
    } //GEN-LAST:event_butCancelNeuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiBuild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiBuild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiBuild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiBuild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiBuild().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel alleKontakteAnzeigen;
    private javax.swing.JButton butCancelNeu;
    private javax.swing.JButton butKontaktAnzeigen;
    private javax.swing.JButton butKontaktLoeschen;
    private javax.swing.JButton butKontaktSpeichern;
    private javax.swing.JButton butKontaktSuchen;
    private javax.swing.JButton butSpeichernNeu;
    private javax.swing.JButton butStartBuchLaden;
    private javax.swing.JButton butStartBuchNeu;
    private javax.swing.JButton butZusNummerNeu;
    private javax.swing.JPanel cards;
    private javax.swing.JLabel detailsAdresse;
    private javax.swing.JTextField detailsAdresseText;
    private javax.swing.JLabel detailsEmail;
    private javax.swing.JTextField detailsEmailText;
    private javax.swing.JLabel detailsName;
    private javax.swing.JTextField detailsNameText;
    private javax.swing.JLabel detailsNummer;
    private javax.swing.JTextField detailsNummerText;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel kontaktAnlegen;
    private javax.swing.JLabel labelAdresseNeu;
    private javax.swing.JLabel labelEMailNeu;
    private javax.swing.JLabel labelNameNeu;
    private javax.swing.JLabel labelNummerNeu;
    private javax.swing.JScrollPane listNamen;
    private javax.swing.JMenuItem menuAlleKontakteAnzeigen;
    private javax.swing.JMenuItem menuBeenden;
    private javax.swing.JMenu menuKontakt;
    private javax.swing.JMenuItem menuKontaktLoeschen;
    private javax.swing.JMenuItem menuKontaktSuchen;
    private javax.swing.JMenuItem menuLaden;
    private javax.swing.JMenuItem menuNeuerKontakt;
    private javax.swing.JMenuItem menuSpeichern;
    private javax.swing.JMenu menuTelefonbuch;
    private javax.swing.JMenuBar menueleiste;
    private javax.swing.JPanel startWindow;
    private javax.swing.JTextField textFieldAdresseNeu;
    private javax.swing.JTextField textFieldNameNeu;
    private javax.swing.JTextField textFieldeMailNeu;
    private javax.swing.JTextField textfieldNummerNeu;
    private Telefonbuch telefonbuch;
    // End of variables declaration//GEN-END:variables
}
