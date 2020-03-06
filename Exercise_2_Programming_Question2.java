public class Exercise_2_Programming_Question2 {
    public static int sum=0;
    public static void main(String[] args){

        count1("I Am the Professional Killer you ever seen Before Akil,Aiman and Chang");
    }

    public static void count1(String x){

        for(int i=0;i<x.length();i++){
            if(x.charAt(i)==('A')){
                sum++;
        }
      }
      System.out.println("Character \'A\' is found "+sum+" times");
    }
}
