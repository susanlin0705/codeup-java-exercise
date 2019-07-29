import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean convo = true;
        do {
            System.out.println("Ask me questions");
            String input = scan.nextLine();
            if (input.endsWith("?")) {
                System.out.println("sure!");
            } else if (input.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (input.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else if (input.equals("fine")) {
                convo =false;
            } else {
                    System.out.println("Whatever!");
            }

        }while(convo);


    }
}
