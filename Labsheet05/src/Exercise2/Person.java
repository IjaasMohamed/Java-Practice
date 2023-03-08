package Exercise2;

public class Person implements ICompute {

    private String name;
    private double basicSal;
    private double otRate;
    private double otHrs;
    private double netSal;

    Person(String name, double basicSal, double otRate, double otHrs){
        this.name = name;
        this.basicSal = basicSal;
        this.otRate = otRate;
        this.otHrs = otHrs;
        this.netSal = netSal;
    }

    public double calculate(){
        return this.netSal = this.basicSal + (this.otHrs*this.otRate);

    }
    public void display(){
        System.out.println("netSal = " + this.netSal);
    }
}
