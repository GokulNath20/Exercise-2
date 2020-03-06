import java.lang.*;
public class Exercise_2_Programming_Question3 {
    public static void main(String[] args){
        PrintReverse("raed hcum os uoy evol I");
    }

    public static void PrintReverse(String x){

        String reverse = "";
        for(int i=x.length()-1;i>=0;i--) {
            reverse = reverse + x.charAt(i);
        }
        System.out.println(reverse);
    }
}

