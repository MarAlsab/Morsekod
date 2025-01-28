package automation.guessnumber;

public class Randomizer {
    int randomNumber;
    Randomizer(int lowest,int highest){
        randomNumber = (int) (Math.random()*(highest-lowest+1))+lowest;
    }

    public String guess(int number){
        if (number == randomNumber) return "Du vann";
        if (number < randomNumber) return "För lågt";
        return "För högt";
    }
}
