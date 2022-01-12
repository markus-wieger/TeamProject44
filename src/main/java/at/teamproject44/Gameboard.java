package at.teamproject44;

/*
Index of Gameboard:

    1|2|3|4|5|6|7|8|9|10
  1|_|_|_|_|_|_|_|_|_|_|
  2|_|_|_|_|_|_|_|_|_|_|
  3|_|_|_|_|_|_|_|_|_|_|
  4|_|_|_|_|_|_|_|_|_|_|
  5|_|_|_|_|_|_|_|_|_|_|
  6|_|_|_|_|_|_|_|_|_|_|
  7|_|_|_|_|_|_|_|_|_|_|
  8|_|_|_|_|_|_|_|_|_|_|
  9|_|_|_|_|_|_|_|_|_|_|
 10|_|_|_|_|_|_|_|_|_|_|

 */
public class Gameboard {
    private Player player;
    private Ship[][] board = new Ship[9][9];
    private Ship alreadyHit = new Ship(25, true);

    /*Gameboard:
    Konstruktor für die Klasse Gameboard.
    Erstellt ein neues Objekt vom Typ Gameboard und weißt es einem Spieler zu.
     */
    public Gameboard(Player p) {
        player = p;
    }

    /*place_ship_on_board(Schiffart, x_koordinate, y_koordinate, Ausrichtung_auf_Spielbrett):
    Platziert das Schiff auf dem Spielbrett.
    Ausrichtung: True ist vertikal.
                 False ist horizontal.
     */
    public void placeShipOnBoard(Ship ship, int x, int y, boolean vertical) {
        int length = ship.getType();
        if (x + length - 2 > 9 && vertical) {
            System.out.println("Nicht mehr im Spielbereich");
            return;
        } else if (y + length - 2 > 9 && !vertical) {
            System.out.println("Nicht mehr im Spielbereich");
            return;
        }
        if (vertical) {
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
        if (vertical) {
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
        if (board[x][y] == null) {
            System.out.println("Leider nichts getroffen!");
            return false;
        } else if (board[x][y].equals(alreadyHit)) {
            System.out.println("Feld wurde schon beschossen!");
            return false;
        } else {
            board[x][y].hit();
            if (!board[x][y].isShipAlive()) {
                System.out.println("Ship destroyed!");
            }
            board[x][y] = alreadyHit;
            return true;
        }
    }


}
