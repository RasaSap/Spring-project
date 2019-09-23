package paketasSav1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllFactors {
    public static void main(String[] args) {
        int n=10;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < Math.sqrt(n); i++){
            if(n%i == 0){
                list.add(i);
                list.add(n/i);
        }
        }
        for (int val: list){
            System.out.println(val);
        }

        Collections.sort(list);
        System.out.println("------------------");
        for (int val: list){
            System.out.println(val);
        }

        System.out.println("-----------------------");

       /* for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                if (values[i] > values[j]) {
                    int temp = values[i];
                    values[i] = values[j];
                    values[j] = temp;
                }
            }
        }*/

       for (int i=2; i<=10;i++){
           for(int j=1; j < Math.sqrt(i); j++){
               if(i%j==0){
                   System.out.println(i+" sk. daliklis" + i);
                   System.out.println(i+" sk. daliklis" + i/j);
               }
           }
       }
        }


    }

