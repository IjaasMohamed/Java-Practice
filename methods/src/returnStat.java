public class returnStat {
    public static void main(String[] args) {

        int a = maxValue(10,20);
        System.out.println("Maximum is : " +a);

        System.out.println("MAximum is : "+ maxValue(30,40) );

        int f = 100, g=200;
        int c=Maxxi(f,g);
        System.out.println("Maximum is : " +c);

        System.out.println("Maximum is : " + Maxxi(150,70));

    }


    public static int maxValue(int num1, int num2){
        int max;
        if (num1>num2) {
            max = num1;
        }
        else
        {
                max = num2;
            }
        return max;
    }
    public static int Maxxi(int p1, int p2){
        if (p1>p2){
            return p1;
        } else {
            return p2;
        }
    }
}
