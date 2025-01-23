package automation.hashmap;

import java.util.Scanner;

public class NameAgeMainWithLogicClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vem vill du veta åldern på? :");
        String name = scanner.nextLine();
        NameAge nameAge = new NameAge();
        System.out.println(nameAge.getAge(name.trim()));
    }
}
