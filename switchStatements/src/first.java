public class first {
    public static void main(String[] args) {
        int month = 2;
    //    switch (3-2){
        switch(month){
            case 1 :
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3 :
                System.out.println("March");
                break;
            case 4:
                System.out.print("April");
                break;
            case 5:
                System.out.println("May");
                break;
        }
        String monthAlpha = "merbok";

        switch (monthAlpha) {
            case "January":
                System.out.println("1st month");
            break;
            case "February":
                System.out.println("2nd month");
                break;
            case "March":
                System.out.println("3rd month");
                break;
            default:
                System.out.println("January , February, March only");
        }
    }
}
