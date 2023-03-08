public class fallThroughStat {
    public static void main(String[] args) {
        int x = 4;
        switch (x){
            case 1:
                System.out.println("Brother enga?");
            case 2:
                System.out.println("nan anga = ");
                break;
            case 3 :
                System.out.println("adhu enga?");
                break;
            case 4:
                System.out.println("Sutha kudu ponnen");
                //fall through is identified when the statements does not have a break>
            case 5:
                System.out.println("SInna pako");
            case 6:
                System.out.println("Chuooooti paken");
                break;
            case 7:
                System.out.println("Maina kudan");
                break;
        }
    }
}
