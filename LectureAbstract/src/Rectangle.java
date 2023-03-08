public class Rectangle {


        private int length;
        private int breadth;

        public void setLength(int length){
            this.length = length;
        }
        public void setBreadth(int breadth){
            this.breadth = breadth;
        }

        public int getArea(){
            int area = ( length * breadth )  ;
            return area;
        }

}
