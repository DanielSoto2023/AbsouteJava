public class TestCode {
    public static void main(String[] args) {
        int resutl = 10;
        int oldVar = 5;
        int var = resutl + 5  + (oldVar = 7);
        String happy =  "hello" + "yes";

        if (oldVar == 5 && var == 4){
            System.out.println("");
        }
        System.out.println(var);
    }
}
