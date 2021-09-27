import java.util.Scanner;

/**
 * A program that determines the price of a custom-made toy.
 *
 * Purdue University -- CS18000 -- Fall 2021 -- Homework 04 -- Challenge
 *
 * @author Purdue CS
 * @version August 23, 2021
 */

public class ToySeller {

    private static String welcomeMessage = "Welcome to the Custom Toy Builder!\nOur store can custom-design " +
            "3 different types of toys.";
    private static String startMessage = "Which would you like to create? (Enter a number)\n" +
            "1. Superman figurine\n" +
            "2. Robotic cyclops\n" +
            "3. Cat-shaped lamp\n" +
            "4. EXIT";
    private static String endProgram = "Thanks for using the Custom Toy Builder!";

    private static String sizeQuestion = "What size toy would you like? (Enter S, M, or L)";
    private static String supermanQ1 = "Do you want Superman to talk? (Enter Y or N)";
    private static String supermanQ2 = "Do you want to add a cape? (Enter Y or N)";
    private static String roboticCyclopsQ1 = "Do you want the Robotic Cyclops to move? (Enter Y or N)";
    private static String roboticCyclopsQ2 = "What color eye do you want? (Enter 1, 2, or 3)\n" +
            "1. Red\n" +
            "2. Yellow\n" +
            "3. Blue";
    private static String catLampQ1 = "What color Cat-shaped Lamp do you want? (Enter 1, 2, 3, or 4)\n" +
            "1. Gold\n" +
            "2. Pink\n" +
            "3. Blue\n" +
            "4. No Color";
    private static String catLampQ2 = "Do you want the Cat-shaped Lamp to glow? (Enter Y or N)";

    private static String supermanCost = "Your Superman figurine costs";
    private static String roboticCyclopsCost = "Your Robotic Cyclops costs";
    private static String catLampCost = "Your Cat-shaped Lamp costs";


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalPrice = 0;

        // TODO: Write your implementation below
        System.out.println(welcomeMessage);
        System.out.println(startMessage);
        int numberChosen = scan.nextInt();
        scan.nextLine();

        String toyType;

        switch(numberChosen){
            case 1:
                toyType = "Superman figurine";
                break;
            case 2:
                toyType = "Robotic cyclops";
                break;
            case 3:
                toyType = "Cat-shaped lamp";
                break;
            case 4:
                System.out.println(endProgram);
                return;
            default:
                return;
        }

        System.out.println(sizeQuestion);
        String toySize = scan.nextLine();

        switch(toySize){
            case "s":
                totalPrice += 5;
                break;
            case "S":
                totalPrice += 5;
                break;
            case "m":
                totalPrice += 10;
                break;
            case "M":
                totalPrice += 10;
                break;
            case "l":
                totalPrice += 15;
                break;
            case "L":
                totalPrice += 15;
                break;
            default:
                return;
        }

        if(numberChosen == 1){
            System.out.println(supermanQ1);
            String willSupermanTalk = scan.nextLine();

            switch(willSupermanTalk.toLowerCase()){
                case "y":
                    totalPrice += 8;
                    break;
                case "n":
                    totalPrice += 4;
                    break;
                default:
                    return;
            }

            System.out.println(supermanQ2);
            String haveCape = scan.nextLine();

            switch(haveCape.toLowerCase()){
                case "y" :
                    totalPrice += 5;
                    break;
                case "n":
                    totalPrice += 0;
                    break;
                default:
                    return;
            }
            System.out.printf("%s $%d!\n", supermanCost, totalPrice);
        } else if(numberChosen == 2){
            System.out.println(roboticCyclopsQ1);
            String doesMove = scan.nextLine();

            switch(doesMove.toLowerCase()){
                case "y":
                    totalPrice += 5;
                    break;
                case "n":
                    totalPrice += 3;
                    break;
                default:
                    return;
            }

            System.out.println(roboticCyclopsQ2);
            int eyeColor = scan.nextInt();
            scan.nextLine();

            switch(eyeColor){
                case 1:
                    totalPrice += 5;
                    break;
                case 2:
                    totalPrice += 6;
                    break;
                case 3:
                    totalPrice += 7;
                    break;
                default:
                    return;
            }
            System.out.printf("%s $%d!\n", roboticCyclopsCost, totalPrice);
        } else if(numberChosen == 3){
            System.out.println(catLampQ1);
            int catLampColor = scan.nextInt();
            scan.nextLine();

            switch(catLampColor){
                case 1:
                    totalPrice += 10;
                    break;
                case 2:
                    totalPrice += 7;
                    break;
                case 3:
                    totalPrice += 7;
                    break;
                case 4:
                    totalPrice += 5;
                    break;
                default:
                    return;
            }

            if(catLampColor == 1 || catLampColor == 2 || catLampColor == 3) {
                System.out.println(catLampQ2);
                String catLampGlow = scan.nextLine();

                switch (catLampGlow.toLowerCase()) {
                    case "y":
                        totalPrice += 10;
                        break;
                    case "n":
                        totalPrice += 0;
                        break;
                    default:
                        return;
                }
            }
            System.out.printf("%s $%d!\n", catLampCost, totalPrice);
        }

        System.out.println(endProgram);

    }
}
