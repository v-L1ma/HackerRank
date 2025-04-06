package com.aula;

import java.io.*;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
    
    for(int i=0; i < n; i++){
        for(int g= (n-1)-i; g > 0; g--){
            System.out.printf(" ");
        }     
                
        for (int j = 0; j <= i; j++) {     
              
            System.out.printf("#");          
        }
               
        System.out.println();
        
        
    }

    }

}

public class Staircase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}

