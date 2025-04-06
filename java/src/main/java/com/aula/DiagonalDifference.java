package com.aula;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int sum1 = 0;
    int sum2 = 0;
    int tamanhoArray = arr.size();
    
    for (int i = 0; i < tamanhoArray; i++) {
        
        for (int j = 0; j < tamanhoArray; j++) {
            if(i==j){
                sum1 += arr.get(i).get(j);
            }
        }
    }
    
    for (int i = tamanhoArray; i >= 0; i--) {
    
        for (int j = 0; j < tamanhoArray; j++) {
            if (i == tamanhoArray - 1 - j){
                sum2 += arr.get(i).get(j);
                System.out.println(arr.get(i).get(j));
            }
        }
    }
    
    if(sum1>sum2){
        return (sum1-sum2);
    } else return (sum2-sum1);
    }

}

public class DiagonalDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
