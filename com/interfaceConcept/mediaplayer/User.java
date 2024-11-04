package mediaplayer;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a music player:");
        System.out.println("1. MP3 Player");
        System.out.println("2. CD Player");
        System.out.println("3. Streaming Player");
        int choice = scanner.nextInt();

        Playable player;

        switch (choice) {
            case 1:
                player = new MP3Player();
                break;
            case 2:
                player = new CDPlayer();
                break;
            case 3:
                player = new StreamingPlayer();
                break;
            default:
                System.out.println("Invalid choice.");
                scanner.close();
                return;
        }

        while (true) {
            System.out.println("\nControl the player:");
            System.out.println("1. Play");
            System.out.println("2. Pause");
            System.out.println("3. Stop");
            System.out.println("0. Exit");
            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    player.play();
                    break;
                case 2:
                    player.pause();
                    break;
                case 3:
                    player.stop();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid action. Please try again.");
            }
        }
    }
}
