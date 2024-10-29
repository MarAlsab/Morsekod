package tdd;

public class TexttAnalyzer {
    private int rows;

    public TexttAnalyzer() {
        rows = 0;
    }

    public void lineInput(String line) {
        rows++;
    }

    public int getRows() {
        return rows;
    }
}
