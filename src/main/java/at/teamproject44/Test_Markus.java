package at.teamproject44;

public class Test_Markus {
    private static Ship[] ships;

    public static void main(String[] args) {

        Player player = new Player("Peter");

        Gameboard player1 = new Gameboard(player);
        initializeShips(3);
        player1.placeShipOnBoard(ships[1],2,2,ships[1].isVertical());
        player1.placeShipOnBoard(ships[2],2,1,ships[2].isVertical());
        player1.placeShipOnBoard(ships[0],2,3,ships[0].isVertical());
        player1.hit(2,2);
    }


    private static void initializeShips(int a){
        ships = new Ship[a];
        for (int i = 0; i<a;i++){
            ships[i]=new Ship(2,true);
        }
    }
}
