import utils.StringInverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = input.nextLine();
        StringInverter stringInverter = new StringInverter();
        System.out.print(stringInverter.inverter(palavra));

    }
}
