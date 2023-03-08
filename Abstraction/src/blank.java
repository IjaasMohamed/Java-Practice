public class blank {
    private int var;


    public int getVar(){
        return var;


    }
    public void setVar(int var){
        if (var >= 1000){
            this.var = var;
        }
        else{
            this.var = 50000;
        }
    }
}
