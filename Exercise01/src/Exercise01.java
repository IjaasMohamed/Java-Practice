import java.util.Scanner;


public class Exercise01 {

    public static Scanner sc = new Scanner(System.in);
    public static String responce;
    public static int deluxDoublefixed = 5000;
    public static int standardFamilyfixed = 3000;
    public static int standardSinglefixed = 2000;
    public static int balcony = 500;
    public static int parking = 200;
    public static int tv = 200;
    public static int kitchen = 1000;
    public static int wifi = 100;
    public static int garden = 200;
    public static int ac = 500;

    public static void main(String[] args) {
        System.out.println("Room Charge Calculator \n 1. Delux-Double\n 2. Standard-Family\n 3. Standard-Single\n 4. Quit Enter your choice (1-4) : ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("\n \n Delux Double Fixed Price " + deluxDoublefixed );
                System.out.println("\n Additional Charges");
                System.out.println("Balcony = 500 \n Parking = 200 \n Tv =200 \n Kitchen = 1000 \n Wifi = 100");

                System.out.println("Would u prefer aditional services?");
                responce = sc.nextLine();

                if (responce.toLowerCase().equals("yes")) {
                    System.out.println();

                    System.out.print("Would you prefer balcony? yes/no: ");
                    String balcony = sc.next();
                    boolean balconyConfirmed = confirmExtra(balcony);

                    System.out.print("Would you prefer parking? yes/no: ");
                    String parking = sc.next();
                    boolean parkingConfirmed = confirmExtra(parking);

                    System.out.print("Would you prefer TV? yes/no: ");
                    String tv = sc.next();
                    boolean tvConfirmed = confirmExtra(tv);

                    System.out.print("Would you prefer Kitchen? yes/no: ");
                    String kitchen = sc.next();
                    boolean kitchenConfirmed = confirmExtra(kitchen);

                    // wifi
                    System.out.print("Would you prefer WiFi? yes/no: ");
                    String wifi = sc.next();
                    boolean wifiConfirmed = confirmExtra(wifi);

                    getChargeDeluxDouble(balconyConfirmed, parkingConfirmed, tvConfirmed, kitchenConfirmed, wifiConfirmed);
                } else {
                    System.out.println("\n \n");
                    System.out.println("Total Room Charge : "  + deluxDoublefixed);
                }
                break;
            case 2:
                System.out.println();
                System.out.println("\n \n Standard Family room fixed price: " + standardFamilyfixed );

                kitchen=500;
                System.out.println("\n Additional Charges");
                System.out.println("Parking Charge: " + parking);
                System.out.println("Kitchen Charge: " + kitchen);
                System.out.println("Garden Charge: " + garden);


                System.out.print("Do you need our extra services? Yes/No: ");
                responce = sc.next();

                // condition base on user answer
                if (responce.toLowerCase().equals("yes")) {
                    System.out.println();

                    System.out.print("Would you prefer Parking? yes/no: ");
                    String parking = sc.next();
                    boolean parkingConfirmed = confirmExtra(parking);

                    System.out.print("Would you prefer Kitchen? yes/no: ");
                    String kitchen = sc.next();
                    boolean kitchenConfirmed = confirmExtra(kitchen);

                    System.out.print("Would you prefer Garden? yes/no: ");
                    String garden = sc.next();
                    boolean gardenConfirmed = confirmExtra(garden);

                    // calling the method
                    getChargeStandardFamily(parkingConfirmed, kitchenConfirmed, gardenConfirmed);
                } else {
                    System.out.println("\n \n");
                    System.out.println("Total Room Charge : "  + standardFamilyfixed);
                }
                break;

            case 3:
                System.out.println();
                System.out.println("\n \n Standard Single Fixed Price: " + standardSinglefixed );
                System.out.println("\n Additional Charges");
                System.out.println("Parking Charge: " + parking);
                System.out.println("AC Charge: " + ac);
                System.out.println("WiFi Charge: " + wifi);

                System.out.print("Do you need our extra services? Yes/No: ");
                responce = sc.next();

                if (responce.toLowerCase().equals("yes")) {

                    System.out.print("Would you prefer Parking? yes/no: ");
                    String parking = sc.next();
                    boolean parkingConfirmed = confirmExtra(parking);

                    // kitchen
                    System.out.print("Would you prefer AC? yes/no: ");
                    String ac = sc.next();
                    boolean acConfirmed = confirmExtra(ac);

                    // garden
                    System.out.print("Would you prefer Wifi? yes/no: ");
                    String wifi = sc.next();
                    boolean wifiConfirmed = confirmExtra(wifi);

                    // calling the method
                    getChargeStandardSingle(parkingConfirmed, acConfirmed, wifiConfirmed);
                } else {
                    System.out.println("\n \n");
                    System.out.println("Total Room Charge : "  + standardSinglefixed);
                }

                break;
            case 4:
                System.out.println("See you soon.");
                sc.close();
                break;

            default:
                System.out.println("Input valid input ");
                sc.close();
                break;
        }
    }

    public static boolean confirmExtra(String answer) {
        boolean confirm;
        if (answer.toLowerCase().equals("yes")) {
            confirm = true;
        } else {
            confirm = false;
        }

        return confirm;

    }

    public static int getPrice(boolean action, int price) {

        if (action == true) {
            return price;
        } else {
            price = 0;
            return price;
        }
    }

    public static void getChargeDeluxDouble(boolean balcony, boolean parking, boolean tv, boolean kitchen,
                                            boolean wifi) {

        int getBalconyPrice = getPrice(balcony, 500);
        int getParkingPrice = getPrice(parking, 200);
        int getTvPrice = getPrice(tv, 200);
        int getKitchenPrice = getPrice(kitchen, 1000);
        int getWifiPrice = getPrice(wifi, 100);

        int totalPrice = deluxDoublefixed + getBalconyPrice + getParkingPrice + getTvPrice + getKitchenPrice + getWifiPrice;
        System.out.println();
        System.out.println("Your total Room Charge : "  + totalPrice);
    }

    public static void getChargeStandardFamily(boolean parking, boolean kitchen, boolean garden) {

        int getParkingPrice = getPrice(parking, 200);
        int getKitchenPrice = getPrice(kitchen, 500);
        int getGardenPrice = getPrice(garden, 200);

        int totalPrice = standardFamilyfixed + getParkingPrice + getKitchenPrice + getGardenPrice;
        System.out.println();
        System.out.println("Total Room Charge : "  + totalPrice);
    }

    public static void getChargeStandardSingle(boolean parking, boolean ac, boolean wifi) {

        int getParkingPrice = getPrice(parking, 200);
        int getAcPrice = getPrice(ac, 500);
        int getWifiPrice = getPrice(wifi, 100);

        int totalPrice = standardSinglefixed + getParkingPrice + getAcPrice + getWifiPrice;
        System.out.println();
        System.out.println("Total Room Charge : " + totalPrice);
    }

}




