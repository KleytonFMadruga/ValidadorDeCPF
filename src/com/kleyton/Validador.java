package src.com.kleyton;

import java.util.ArrayList;
import java.util.List;

import javax.swing.PopupFactory;

public class Validador{

    public static boolean validarCPF(String cpf){
        String cpfLimpo = cpf.replace("-", "");
        cpfLimpo = cpfLimpo.replace(".", "");
        char[] listaCaractereCPF = cpfLimpo.toCharArray();
        List <Integer> listaNumeroCPF = new ArrayList<Integer>();
        for(char caractere : listaCaractereCPF) listaNumeroCPF.add(Integer.parseInt(String.valueOf(caractere)));
        listaNumeroCPF.stream().forEach(System.out::println);
        return true;
    }

    
}