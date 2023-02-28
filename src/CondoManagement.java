import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CondoManagement {
    private HashMap<Integer, ArrayList<Integer>> condoMap;

    public CondoManagement() {
        condoMap = new HashMap<>();
    }

    public void setupCondo(int floor, int numRooms) {
        ArrayList<Integer> rooms = condoMap.getOrDefault(floor, new ArrayList<>());
        for (int i = 1; i <= numRooms; i++) {
            rooms.add(i);
        }
        condoMap.put(floor, rooms);
    }

    public void buyCondo(int floor, int room) {
        ArrayList<Integer> rooms = condoMap.get(floor);
        if (rooms != null && rooms.contains(room)) {
            rooms.remove(Integer.valueOf(room));
            System.out.println("Condo " + floor + "-" + room + " has been bought.");
        } else {
            System.out.println("Condo " + floor + "-" + room + " is not available.");
        }
    }

    public void sellCondo(int floor, int room) {
        ArrayList<Integer> rooms = condoMap.get(floor);
        if (rooms != null && !rooms.contains(room)) {
            rooms.add(room);
            System.out.println("Condo " + floor + "-" + room + " has been sold.");
        } else {
            System.out.println("Condo " + floor + "-" + room + " is already available.");
        }
    }

    public void searchCondoOwner(int floor, int room) {
        // implementation for searching condo owner
    }

    public static void main(String[] args) {
        CondoManagement condoManagement = new CondoManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command (setup, buy, sell, search):");
            String command = scanner.next();

            if (command.equalsIgnoreCase("setup")) {
                System.out.println("Enter floor number:");
                int floor = scanner.nextInt();
                System.out.println("Enter number of rooms:");
                int numRooms = scanner.nextInt();
                condoManagement.setupCondo(floor, numRooms);
            } else if (command.equalsIgnoreCase("buy")) {
                System.out.println("Enter floor number:");
                int floor = scanner.nextInt();
                System.out.println("Enter room number:");
                int room = scanner.nextInt();
                condoManagement.buyCondo(floor, room);
            } else if (command.equalsIgnoreCase("sell")) {
                System.out.println("Enter floor number:");
                int floor = scanner.nextInt();
                System.out.println("Enter room number:");
                int room = scanner.nextInt();
                condoManagement.sellCondo(floor, room);
            } else if (command.equalsIgnoreCase("search")) {
                System.out.println("Enter floor number:");
                int floor = scanner.nextInt();
                System.out.println("Enter room number:");
                int room = scanner.nextInt();
                condoManagement.searchCondoOwner(floor, room);
            } else {
                System.out.println("Invalid command. Try again.");
            }
        }
    }
}
