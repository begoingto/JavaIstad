import java.util.Scanner;

public class CondoManagement {
    public static void main(String[] args) {
        int floor,room,menuOption,floorBuying,roomBuying, confirmSelling;
        String symbol = "*****************************************************";
        String line= "________________________________________________________________________________________________";
        // mltz stand for Message Less Than Zero
        String mltz = "* Please Enter number greater than zero";
        // mtm stand for Message Try Menu
        String mtm = "* Please try again on option(1-5)";
        Scanner input = new Scanner(System.in);
        System.out.println("=========================Setting Up the Condo=========================");
        /*
          Enter floor and check number of floor cannot less than or equal to zero
         */
        while (true)
        {
            System.out.print("=> Number of Floor: ");
             floor = input.nextInt();
            if (floor <= 0){
                System.out.println(symbol);
                System.out.println(mltz);
                System.out.println(symbol);
            }else {
                break;
            }
        }

        /*
          Enter floor and check number of room cannot less than or equal to zero
         */
        while (true){
            System.out.print("=> Number of Room: ");
            room = input.nextInt();
            if (room <= 0){
                System.out.println(symbol);
                System.out.println(mltz);
                System.out.println(symbol);
            }else {
                break;
            }
        }

        /*
          Setting up Condo
         */
        String[][] building = new String[floor][room];
        System.out.println(symbol);
        System.out.println("You have successfully setting up condo");
        System.out.println(symbol);

        System.out.println("=>Number of Floor: "+ floor + " floors");
        System.out.println("=>Number of Room: "+ room + " rooms");
        System.out.println("Total Condo: "+ floor*room + " condos");

        System.out.print("Please enter to continue...");
        input.nextLine();
        input.nextLine();

        while (true)
        {
            /*
              Welcome to condo Menu System
             */
            System.out.println(line);
            System.out.println("############### Welcome to Mich .CoLtd condo ###############");
            System.out.println("1. Buy Condo");
            System.out.println("2. Sell Condo");
            System.out.println("3. Search Information");
            System.out.println("4. Display Information");
            System.out.println("5. Exit");

            /*
              Check Menu condo choose
             */
            while (true)
            {
                System.out.print("Choose option from (1-5): ");
                menuOption = input.nextInt();
                if (menuOption <= 0 || menuOption > 5)
                {
                    System.out.println(symbol);
                    System.out.println(mtm);
                    System.out.println(symbol);
                }else{
                    break;
                }
            }
            inputMenu:
            switch (menuOption) {
                case 1 -> {
                    System.out.println(line);
                    System.out.println("**************** Buying the condo ****************");
                    /*
                      Buy condo have again and again when condo isn't available
                     */
                    do {
                        /*
                          Check floor buying for buy
                         */
                        do {
                            System.out.print("-> Enter your design floor( 1 - " + floor + " ) : ");
                            floorBuying = input.nextInt();
                            if (floorBuying <= 0 || floorBuying > floor) {
                                System.out.println(symbol);
                                System.out.println("  floor start from 1 - ".toUpperCase() + floor + ". Please try again!!!");
                                System.out.println(symbol);
                            }
                        } while (floorBuying <= 0 || floorBuying > floor);

                        /*
                          Check room buying for buy
                         */
                        do {
                            System.out.print("-> Enter your design room( 1 - " + room + " ) : ");
                            roomBuying = input.nextInt();
                            if (roomBuying <= 0 || roomBuying > room) {
                                System.out.println(symbol);
                                System.out.println("  root start from 1 - ".toUpperCase() + room + ". Please try again!!!");
                                System.out.println(symbol);
                            }
                        } while (roomBuying <= 0 || roomBuying > room);

                        // check room of floor if available break.
                        if (building[floorBuying - 1][roomBuying - 1] != null) {
                            System.out.println(symbol);
                            System.out.println("Condo on floor: " + floorBuying + ", room: " + roomBuying + " doesn't available. please try again!!!");
                            System.out.println(symbol);
                        }
                    } while (building[floorBuying - 1][roomBuying - 1] != null);

                    /*
                      Enter Buyer name
                     */
                    input.nextLine();
                    System.out.print("Enter your name : ");
                    String buyerName = input.nextLine();
                    building[floorBuying - 1][roomBuying - 1] = buyerName.toUpperCase();
                    System.out.println();

                    // Message bough
                    System.out.println(symbol);
                    System.out.println(buyerName + " have been bough floor: " + floorBuying + " , room: " + roomBuying + " successfully.");
                    System.out.println(symbol);
                    System.out.print("Please enter to continue...");
                    input.nextLine();
                }
                case 2 -> {
                    System.out.println("**************** Selling the condo ****************");
                    System.out.print("Enter the floor: ");
                    int floorSell = input.nextInt();
                    System.out.print("Enter the room: ");
                    int roomSell = input.nextInt();
                    if (building[floorSell - 1][roomSell - 1] == null) {
                        System.out.println("cannot sell the condo, cause you don't have ownership.".toUpperCase());
                    } else {
                        System.out.println(">> Selected condo information: ");
                        System.out.println("Floor: " + floorSell + " \t Room: " + roomSell + "\t Belong to: " + building[floorSell - 1][roomSell - 1]);
                        do {
                            System.out.println("\t Enter 1 to confirm and 0 for cancel :");
                            confirmSelling = input.nextInt();
                        } while (confirmSelling < 0 || confirmSelling > 1);
                        System.out.println(symbol);
                        if (confirmSelling == 1) {
                            building[floorSell - 1][roomSell - 1] = null;
                            System.out.println("congratulations!! you have successfully sell your condo".toUpperCase());
                        } else {
                            System.out.println("you have cancelled sell your condo".toUpperCase());
                        }
                        System.out.println(symbol);
                    }
                    System.out.print("Please enter to continue...");
                    input.nextLine();
                    input.nextLine();
                }
                case 3 -> {
                    int floorSearch, searchOption;
                    do {
                        System.out.println("**************** Search information ****************");
                        System.out.println("1. Search by owner's name");
                        System.out.println("2. Search by floor");
                        System.out.println("3. Exit");
                        System.out.print("Enter your option(1-3): ");
                        searchOption = input.nextInt();
                        switch (searchOption) {
                            case 1:
                                System.out.print("=> Enter the owner name to search : ");
                                input.nextLine();
                                String owner = input.nextLine();

                                String searchResult = "";
                                for (int i = 0; i < building.length; i++) {
                                    for (int j = 0; j < building[i].length; j++) {
                                        if (building[i][j] != null) {
                                            if (building[i][j].equals(owner.toUpperCase())) {
                                                searchResult += "\tfloor: " + (i + 1) + ", room: " + (j + 1)+"\n";
                                            }
                                        }
                                    }
                                }
                                System.out.println(symbol);
                                if (searchResult.equals("")) {
                                    System.out.println("Not found owner.");
                                } else {
                                    System.out.println("Owner name: " + owner.toUpperCase() + " stay in :\n" + searchResult);
                                }
                                System.out.println(symbol);
                                System.out.print("Please enter to continue...");
                                input.nextLine();
                                break;
                            case 2:
                                do {
                                    System.out.print("=> Enter the floor (1 - " + floor + ") you want to search : ");
                                    floorSearch = input.nextInt();
                                } while (floorSearch <= 0 || floorSearch > floor);

                                System.out.println(symbol);
                                System.out.print("Floor " + floorSearch + " ");
                                for (int z = 0; z < building[floorSearch - 1].length; z++) {
                                    System.out.print(building[floorSearch - 1][z] + " ");
                                }
                                System.out.println();
                                System.out.println(symbol);
                                System.out.print("Please enter to continue...");
                                input.nextLine();
                                input.nextLine();
                                break;
                            case 3:
                                System.out.println(line);
                                System.out.println(symbol);
                                System.out.println("Exit from Search.");
                                System.out.println(symbol);
                                break inputMenu;
                            default:
                                System.out.println(symbol);
                                System.out.println("Please try with option(1-3)!!!");
                                System.out.println(symbol);
                                break;
                        }
                    } while (true);
                }
                case 4 -> {
                    System.out.println(line);
                    System.out.println(symbol);
                    for (int i = 0; i < building.length; i++) {
                        int fl = building.length - i;
                        System.out.print("*  Floor [" + fl + "] => ");
                        for (int j = 0; j < building[i].length; j++) {
                            System.out.print(building[fl - 1][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println(symbol);
                    System.out.print("Please enter to continue...");
                    input.nextLine();
                    input.nextLine();
                }
                case 5 -> System.exit(0);
            }
        }
    }
}
