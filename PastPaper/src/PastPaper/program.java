package PastPaper;

public class program {
    public static void main(String[] args) {
        int arr[] = new int [] {65, 66, 67, 68};
        char [] charArr = new char[arr.length];

        for (int i = 0 ; i < arr.length ; i++ ){
            charArr[i] = (char) arr[i];
        }
        for (char c : charArr){
            System.out.print(c + "," );
        }
    }
}
