package at.teamproject44;

public class Ship {
    private int type;
    private boolean vertical;

    private int health;

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

    public void setVertical(boolean vertical) {
        this.vertical = vertical;
    }

    public void hit() {
        if (health != 0) {
            health--;
        }
    }

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
