package automation.Vehicle;

public class Bicycle extends Vehicle{
    private int currentGear;
    private int nbrOfGears;

    public void setCurrentGear(int nbr){
        this.currentGear = nbr;
    }

    public void setNbrOfGears(int nbr){
        this.nbrOfGears=nbr;
    }

    public void increaseSpeed(int force){
        speed += (int) (force*currentGear/nbrOfGears);
    }
}
