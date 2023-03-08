public class Facts {
    public static void main(String[] args) {
        int month = 2;
        switch(month){
            //switch statements can have empty body, but the curly brace is mandotory
        }
        final int f = 0;
        switch(month){
            case 1:{
                //every case label should be compile time constant(either the variable should be idendified by final keyword or the csae should be constant
            }
            int g = 0;
            switch(month * 2 ):{

            }
            int h2;
            switch (h2){

            }
        }
    }
}
