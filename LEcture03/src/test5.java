public class test5 {
    int age;

    public int re(int age){
        int f = this.age = age;
        return f;
    }
    test5(test5 t){
    this.age = t.age;
    }

    public static void main(String[] args) {
        test5 tk = new test5(tk);
        tk.age = 5;
    }
}
