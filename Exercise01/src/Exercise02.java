class RandNum{
    private int[][] arr = new int[5][5];
    public RandNum(){

        int max = 100;
        int min = 1;
        int range = max - min +1;


        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                this.arr[i][j] = (int) (Math.random() * range) ;
            }
        }
    }

    public int minNum(){
        int mini = 1000;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(mini > this.arr[i][j])
                {
                    mini = this.arr[i][j];
                }
            }
        }
        return mini;
    }

    public int maxNum(){
        int high = minNum();
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(high < this.arr[i][j])
                {
                    high = this.arr[i][j];
                }
            }
        }
        return high;
    }



    public double average(){
        int count = 0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                count = this.arr[i][j] + count;
            }

        }
        return count/25;
    }

    public   void display(RandNum num ){

        System.out.println("---------2D Array--------");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(this.arr[i][j] + "\t");

            }
            System.out.print("\n");
        }

        System.out.println("----minimum, maximum and average of the 25 values----");

        System.out.println("Minimum Number :  "+num.minNum());
        System.out.println("Maximum Number :  "+num.maxNum());
        System.out.println("Average Number :  "+num.average());


    }

    public static void main(String args[]){
        RandNum num = new RandNum();
        num.display(num);

    }

}