package com.aula;

import java.io.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
     String[] horario = s.split(":");
    
    if(s.contains("AM")){     
           
         if((Integer.parseInt(horario[0])+12)!=24){
            return s.replace("AM", "");
         } else {
            System.out.println("Hora"+ (Integer.parseInt    (horario[0])+12));
            String HorarioFinal =  ( "00" + ":" + horario[1] + ":" + horario[2].replace("AM", " "));
            
            return HorarioFinal;
         }
         
    } else {
        
        if(Integer.parseInt(horario[0])!=12){
            
            
            String HorarioFinal =  ((Integer.parseInt(horario[0])+12) + ":" + horario[1] + ":" + horario[2].replace("PM", " "));
            
            return HorarioFinal;
            
                        
        } else { System.out.println("Hora"+ (Integer.parseInt    (horario[0])+12));
            String HorarioFinal =  ( horario[0] + ":" + horario[1] + ":" + horario[2].replace("PM", " "));
            
            return HorarioFinal;
        }      
        
    }
    }

}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


