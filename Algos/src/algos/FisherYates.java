/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algos;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author adwitiya
 */
public class FisherYates {
        
    public static void main(String args[]){
        int a[] = {1,2,3,12,5,6,18,8};
        int n = a.length;
        Random r = new Random();
        
        for(int i = n-1; i > 0; i--){
            int j = r.nextInt(i+1);
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
