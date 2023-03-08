package Exercise2;

public class Box implements ICompute {
    private int length, width, height;
    private int volume;

    Box(){
        System.out.println("Default Constructor for box class called");
    }
    Box(int length, int width, int height){
        super();
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double calculate(){
        return this.volume = this.length * this.width * this.height;
    }
    public void display(){
        System.out.println("volume = " + this.volume);
    }

}
