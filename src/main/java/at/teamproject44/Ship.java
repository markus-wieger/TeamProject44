package at.teamproject44;

/* Die Klasse Ship erstellt die Schiffe und hat zusätzlich 2 Methoden die einen Treffer (Hit) ausführen und
* die andere Klasse kontrolliert ob Schiff noch am Leben ist!*/

public class Ship {
    private int type;
    private boolean vertical;

    private int health;

    /*Konstruktor: erstellt ein Schiff mit den Attributen:
    * Länge des Schiffes, vertikal oder horizontal und Leben von Schiff*/

    public Ship(int type, boolean vertical) {
        this.type = type;
        this.vertical = vertical;
        this.health = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean isVertical() {
        return vertical;
    }

    /*Hit Klasse: Falls ein Schuss erfolgreich ein Schiff trifft, wird Leben von Schiff um 1 subtrahiert.*/

    public void hit() {
        if (health != 0) {
            health--;
        }
    }

    /*isShipAlive Klasse: Die Klasse kontrolliert ob ein Schiff noch Leben hat oder schon vollständig gesunken ist.*/

    public boolean isShipAlive(){
        if (health > 0){
            return true;
        }
        else
        {
            return false;
        }
    }
}
