package automation.dice;

public class Player {
    private String name;
    private int sumTotal = 0;

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSumTotal() {
        return sumTotal;
    }

    public void setSumTotal(int sumTotal) {
        this.sumTotal = sumTotal;
    }

}
