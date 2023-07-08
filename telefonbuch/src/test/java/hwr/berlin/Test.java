package hwr.berlin;

import java.io.File;

public class Test {


    public static void main(String args[]){

    final String filelocation = "telefonbuch/src/main/java/hwr/berlin/Telefonbuch_Testklasse.ser";
    final File file = new File(filelocation);

    Telefonbuch testBuch = new Telefonbuch();
    Telefonbuch testBuch2 = new Telefonbuch();
    Telefonbuch testBuch3 = new Telefonbuch();

    Telefonnummer nummer1 = new Telefonnummer();
    nummer1.setNummer(9999999);
    nummer1.setBeschreibung("Arbeit");
    
    Telefonnummer nummer2 = new Telefonnummer();
    nummer2.setNummer(22222222);
    nummer2.setBeschreibung("Home");

    Kontakt testKontakt = new Kontakt("test");
    testKontakt.setAdresse("teststraße");
    testKontakt.setEmail("test@test.com");
    testKontakt.fuegeNrHinzu(nummer1);
    testKontakt.fuegeNrHinzu(nummer2);

    Kontakt testKontakt2 = new Kontakt("test2");
    testKontakt2.setAdresse("straßetest");
    testKontakt2.setEmail("test2@test2.com");
    testKontakt2.fuegeNrHinzu(nummer1);
    testKontakt2.fuegeNrHinzu(nummer2);

    Kontakt testKontakt3 = new Kontakt("Joe");
    testKontakt3.setAdresse("straßetest3");
    testKontakt3.setEmail("test3@test3.com");
    testKontakt3.fuegeNrHinzu(nummer1);
    testKontakt3.fuegeNrHinzu(nummer2);

    testBuch.fuegeKontaktHinzu(testKontakt);
    testBuch.fuegeKontaktHinzu(testKontakt2);
    testBuch.fuegeKontaktHinzu(testKontakt3);
    testBuch.alleKontakteAnzeigen();
    testBuch.speichern(file);

    testBuch2.buchLaden(file);
    testBuch2.alleKontakteAnzeigen();
    
    }
}
