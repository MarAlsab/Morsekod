package automation.dice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Player> players = new ArrayList<>();

    public static void main(String[] args) {
        addPlayers();
        boolean gameEnd = false;
        int kastIndex = 0;
        while (!gameEnd) {
            Player player = players.get(kastIndex);
            int sumRound = 0;
            boolean again= true;
            System.out.println("************ Att kasta är: "+player.getName());
            System.out.println("Du har: "+player.getSumTotal());
            while (again){
                int dice = dice();
                System.out.println("Ditt kast blev: "+dice);
                if (dice != 1){
                    sumRound += dice;
                    System.out.println("Din summa i omgången är: "+sumRound);
                    if (sumRound + player.getSumTotal() >= 50){
                        System.out.println(" ###############  DU VANN !!!!!!!!!!!");
                        gameEnd = true;
                        break;
                    }
                    System.out.print("Vill du fortsätta kasta (Ja/Nej)? ");
                    String input = scanner.nextLine();
                    if (input.equals("Nej")) again = false;
                } else {
                    System.out.println(" ************** OTUR EN ETTA ******************");
                    sumRound =0;
                    again = false;
                }
                System.out.println();
            }
            // Addera poängen till banken
            player.setSumTotal(sumRound+player.getSumTotal());
            // Next player
            if (kastIndex < players.size()-1){
                kastIndex++;
            } else kastIndex=0;
        }


    }

    private static int dice() {
        return (int) (Math.random() * 6) + 1;
    }

    private static void addPlayers() {
        String name = "";
        while (!name.equals("stop")) {
            System.out.print("Mata in namn på spelare, avsluta med stop: ");
            name = scanner.nextLine();
            if (!name.equals("stop")) players.add(new Player(name));
        }
        System.out.println("Följande spelare är anmälda:");
        for (Player player : players) {
            System.out.println(player.getName());
        }
    }
}
