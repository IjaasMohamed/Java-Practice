

public class manualExceptionMain {
    public static void main(String[] args) {
        String stuId = "1254";
        try {
            stuId = "124";
            if (!stuId.startsWith("IT")) {
  //              throw new manualException("java.lang");
  //          } catch(manualException e){
  //              System.out.println(e);
            }
        }
    }
}
