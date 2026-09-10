import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.time.LocalDate;


    //METODO STATIC É DA CLASSE, NÃO DA INSTÂNCIA, quando o metodo é static não é necessario a instancia/objeto para invocar o metodo
    public static String findDay(int month, int day, int year) {
            return LocalDate.of(year, month, day).getDayOfWeek().name();
            //OU
//            LocalDate data = LocalDate.of(year, month, day);
//            DayOfWeek dw = data.getDayOfWeek();
//            String diaDaSemana = dw.name();
//            return diaDaSemana;



    }




public static void main(String[] args) {
    System.out.println(findDay(9, 10, 2026));
}


