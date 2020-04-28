import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int i=1;
       while(in.hasNext()){
           System.out.println(i+" "+in.nextLine());
           i++;
       }
       in.close();
    }
}


