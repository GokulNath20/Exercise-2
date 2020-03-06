import java.util.Scanner;
public class Exercise2_Predefined_class{
   public static void main(String[] args){
   
   int i,j=0,dude=0,mike=0;
   
   System.out.printf("%-10s %-10s %-20s%n","Number","Square","Cube");
   for(i=0;i<=10;i++){
   
      dude = (int)Math.pow(j,2);
      mike =(int)Math.pow(j,3);
      System.out.printf("%-10d %-10d %-20d %n",i,dude,mike);
      j++;
   }
   
 }
   
}
   
   
   
   