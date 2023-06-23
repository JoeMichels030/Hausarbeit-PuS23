package hwr.berlin;

import java.io.File;

public class Test {


    public static void main(String args[]){

    final String filelocation = "telefonbuch/src/main/java/hwr/berlin/Telefonbuch.ser";
    final File file = new File(filelocation);

    Telefonbuch testBuch = new Telefonbuch();
    Telefonbuch testBuch2 = new Telefonbuch();

    Kontakt testKontakt = new Kontakt("test");
    testKontakt.setAdresse("teststraße");
    testKontakt.setEmail("test@test.com");
    testKontakt.fuegeNrHinzu(12223455);
    testKontakt.fuegeNrHinzu(213423525);

    Kontakt testKontakt2 = new Kontakt("test2");
    testKontakt2.setAdresse("straßetest");
    testKontakt2.setEmail("test2@test2.com");
    testKontakt2.fuegeNrHinzu(999999999);
    testKontakt2.fuegeNrHinzu(888888888);

    testBuch.fuegeKontaktHinzu(testKontakt);
    testBuch.fuegeKontaktHinzu(testKontakt2);
    
    testBuch.alleKontakteAnzeigen();
    testBuch.buchSpeichern(file);

    testBuch2.buchLaden(file);
    testBuch2.alleKontakteAnzeigen();
    
    }
}
