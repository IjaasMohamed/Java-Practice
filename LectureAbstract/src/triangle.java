public class triangle extends Shape {

    private int length;
    private int breadth;

    public void setLength(int length){
        this.length = length;
    }
    public void setBreadth(int breadth){
        this.breadth = breadth;
    }

    public int getArea(){
        int area = ( length * breadth ) / 2 ;
        return area;
    }
}