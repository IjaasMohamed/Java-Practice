package Exercise2;

public class Feet {

        private int feet;
        private int inches;
        public Feet(int feet, int inches){
            this.feet = feet;
            this.inches = inches;
        }
        // Add f1+f2 feet and store in current feet
        public void add(Feet f1, Feet f2){
               int nFeet  =  f1.feet + f2.feet;
               int nInches = f1.inches + f2.inches;
               int nFeetBal = nInches % 12;

                nFeet = nFeet + nFeetBal;
                nInches = nInches / 12;

                this.inches = nInches;
                this.feet = nInches;

//                int feet = f1.feet + f2.feet;
//                int inch = f1.inches + f2.inches;
//
//                int restOffeet = inch %12;
//                feet = feet + restOffeet;
//                inch = inch / 12;
//
//                this.feet = feet;
//                this.inches = inch;

        }
        // Display a Length e.g 5’6”
        public void print() {
                System.out.println(this.feet + "' " + this.inches + "\"");
        }

}
