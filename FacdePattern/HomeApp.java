import java.util.Scanner;
public class HomeApp {
    public static void main(String[] args){
        HomeInterface home = new HomeInterface();
        Scanner input =  new Scanner(System.in);

        while(true){
            System.out.println("\n==CONTROL PANEL==");
            System.out.println("[1] Turn ON ALL");
            System.out.println("[2] Turn OFF ALL");
            System.out.println("[3] Air Conditioner: Turn ON");
            System.out.println("[4] Air Conditioner: Turn OFF");
            System.out.println("[5] Light: Turn ON");
            System.out.println("[6] Light: Turn OFF");
            System.out.println("[7] TV: Turn ON");
            System.out.println("[8] TV: Turn OFF");
            System.out.println("[0] Exit");
            System.out.println("\nWhat would you like to do: ");
            Integer choice = input.nextInt();



            if(choice==0){
                System.out.println("Exiting Home App...");
                input.close();
                break;
            }

            switch(choice){
                case 1:
                    home.turnOnAll();
                break;
                case 2:
                    home.turnOffAll();
                break;
                case 3:
                    home.turnOnAirConditioning();
                break;
                case 4:
                    home.turnOffAirConditioning();
                break;
                case 5:
                    home.turnOnLight();
                break;
                case 6:
                    home.turnOffLight();
                break;
                case 7:
                    home.turnOnTV();
                break;
                case 8:
                    home.turnOffTV();
                break;
            }
        }
    }
} 