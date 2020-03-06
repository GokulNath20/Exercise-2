import java.util.Random;

public class Exercise_2_Programming_Question4 {
    public static void main(String[] args){

        Random rd = new Random();
        int i = rd.nextInt(20);
        int j = rd.nextInt(25);
        randomInRange(i,j);
    }
    public static void randomInRange(int first, int second) {

        int range = second-first;
        System.out.println(range);
        if(first>second){
            System.out.println("0");
        }
    }
}
