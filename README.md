
Erstellen Sie ein Java-Programm „Telefonbuch“ zur Verwaltung Ihrer in einer Datei
gespeicherten Kontakte. Das Hauptfenster soll zwei Menüs enthalten:
Telefonbuch Kontakt
Versehen Sie die Menüpunkte im Menü „Telefonbuch“ mit den folgenden
Ereignissen:
1. Laden – Gespeichertes Telefonbuch (alle Kontakte) unter Verwendung von
JFileChooser einlesen.
2. Speichern – das Telefonbuch (alle Kontakte) unter Verwendung von
JFileChooser speichern.
3. Beenden – das Programm wird beendet.
Versehen Sie die Menüpunkte im Menü „Kontakt“ mit den folgenden Ereignissen:
1. Neuer Kontakt
2. Alle Kontakte anzeigen
3. Kontakt suchen
4. Kontakt löschen
Für die Implementierung des Telefonbuchs soll ein ArrayList<Kontakt> Objekt
verwendet werden:
ArrayList<Kontakt> telefonbuch = new ArrayList <Kontakt>();
Die Klasse Kontakt beschreibt einen Kontakt mit Namen, Adresse, E-Mail und
mindestens zwei Telefonnummern. Die Liste von Telefonnummern kann erweitert
werden.
Beim Speichern des neuen Kontakts soll der Kontakt dem Telefonbuch hinzugefügt
werden.

1. Nach dem Start des Programms wird das Hauptfenster mit dem vollständigen
Menu sichtbar. Das UML- Klassendiagramm ist vorhanden.
Das MenuItem Beenden funktioniert einwandfrei.
MenuItems Laden und Speichern sind unter Verwendung von JFileChooser
implementiert.
MenuItem Neuer Kontakt funktioniert einwandfrei.
2. Für die Verwaltung von Kontakten wird ArrayList verwendet.
3. MenuItem Speichern funktioniert einwandfrei (Interface Serializable).
4. MenuItem Laden funktioniert einwandfrei (Interface Serializable).
5. MenuItem Alle Kontakte anzeigen funktioniert einwandfrei.
6. Das Objekt CardLayout wird verwendet.
7. MenuItem Kontakt suchen ist implementiert.
8. MenuItem Kontakt löschen ist implementiert.
9. Der Zusammenhang zwischen den MenuItems Laden/Speichern/Kontakt wird
durch die Implementierung der Methode MenuItem->setEnabled (true oder
false) berücksichtigt.
10. Beim Selektieren (oder Doppelklick) eines Kontakts in der Liste von allen
Kontakten (P. 5) werden seine gespeicherten Daten angezeigt und können
verändert werden
