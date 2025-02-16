//program to remove duplicates in an array
//simply use set
import java.util.*;
public class dup
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter an array of size 10");
      int arr[]=new int[10];
      for(int i=0;i<10;i++)
        {
          arr[i]=sc.nextInt();
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(arr[i]);
        }

        System.out.println("Array after removing duplicates: " + set);
        sc.close();

    }
  }
  
