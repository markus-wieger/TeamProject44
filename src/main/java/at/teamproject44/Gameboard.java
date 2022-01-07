package at.teamproject44;

public class Gameboard {
    private Player player;
    Ship[][] board = new Ship[9][9];

    /*Gameboard:
    Konstruktor für die Klasse Gameboard.
    Erstellt ein neues Objekt vom Typ Gameboard und weißt es einem Spieler zu.
     */
    public Gameboard(Player p) {
        player = p;
    }

    /*place_ship_on_board(Schiffart, x_koordinate, y_koordinate, Ausrichtung_auf_Spielbrett):
    Platziert das Schiff auf dem Spielbrett.
    Ausrichtung: True ist horizontal.
                 False ist vertikal.
     */
    public void placeShipOnBoard(Ship ship, int x, int y, boolean alignment) {
        int length = ship.getType();
        if (x+length-2>9&&alignment) {
            System.out.println("Nicht mehr im Spielbereich");
            return;
        }else if(y+length-2>9&&!alignment){
            System.out.println("Nicht mehr im Spielbereich");
            return;
        }
        if (alignment) {
            for (int i = 0; i < length; i++) {
                if (board[x + i][y] != null) {
                    System.out.println("Platz schon belegt");
                    return;
                }
            }
        } else {
            for (int i = 0; i < length; i++) {
                if (board[x][y + i] != null) {
                    System.out.println("Platz schon belegt");
                    return;
                }
            }
        }
        if (alignment) {
            for (int i = 0; i < length; i++) {
                board[x + i][y] = ship;
            }
        } else {
            for (int i = 0; i < length; i++) {
                board[x][y + i] = ship;
            }
        }


    }


    public boolean hit(int x, int y) {
    return true;
    }


}
