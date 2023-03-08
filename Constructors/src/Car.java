public class Car {
    public String Model;
    public String Color;
    public int noOfSeats;

    public Car(){
        Model = "Test Model";
        Color = "Test Color";
        noOfSeats = 4;
    }
//    public Car(String Model, String Color, int noOfSeats){
//        this.Model=Model;
//        this.Color = Color;
//        this.noOfSeats = noOfSeats;
//    }
    //this keyword is used to refer to the instance of class in Java, which means when the name of the parameter and the name of the instance is same, to identify the instance differently this. keyword is used
    public Car (String pModel, String pColor, int pnoOfSeasts){
       Model = pModel;
       Color = pColor;
       noOfSeats = pnoOfSeasts;
    }
//could use the parameter name differently from the name of the instance or else you could use as this keyword to identify the intance of the class differently
    public void Display(){
        System.out.println("Model is : " + Model);
        System.out.println("Color is : " + Color);
        System.out.println("No Of Seats : " + noOfSeats);
    }
}
