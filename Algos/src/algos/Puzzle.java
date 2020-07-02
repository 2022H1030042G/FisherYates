/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algos;

/**
 *
 * @author adwitiya
 */
public class Puzzle {
    
    
    public static void main(String args[]){
        int c = 0;
        for(int i=1; i<=32; i++){
            c = 0;
            for(int j=1; j<=32; j++){
                if(i*j == 16 || i*j == 32){
                    c++;
                }
            }
            if(c == 1){
                System.out.println("know");
                for(int j=1; j<=32; j++){
                    if(i*j == 16 || i*j == 32)
                        System.out.println("a="+ i + " b=" + j);
                }
            }
            else
                System.out.println("don't know");
        }
        
    }
}
