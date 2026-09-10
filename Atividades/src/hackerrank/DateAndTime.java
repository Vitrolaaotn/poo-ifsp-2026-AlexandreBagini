package

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.time.LocalDate;





class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */


    //METODO STATIC É DA CLASSE, NÃO DA INSTÂNCIA, quando o metodo é static não é necessario a instancia/objeto para invocar o metodo
    public static String findDay(int month, int day, int year) {
            return LocalDate.of(year, month, day).getDayOfWeek().name();
            //OU
//            LocalDate data = LocalDate.of(year, month, day);
//            DayOfWeek dw = data.getDayOfWeek();
//            String diaDaSemana = dw.name();
//            return diaDaSemana;



    }

}


public static void main(String[] args) {
    System.out.println(Result.findDay(9, 10, 2026));
}


