package src.com.kleyton;

import java.util.ArrayList;
import java.util.List;


public class Validador{

    public static boolean validarCPF(String cpf){
        String cpfLimpo = cpf.replace("-", "");
        cpfLimpo = cpfLimpo.replace(".", "");
        char[] listaCaractereCPF = cpfLimpo.toCharArray();
        List <Integer> listaNumeroCPF = new ArrayList<Integer>();
        for(char caractere : listaCaractereCPF) listaNumeroCPF.add(Integer.parseInt(String.valueOf(caractere)));
        int calculo = 0;

        //Cálculo de validação do primeiro dígito verificador
        for(int i = 0; i < 10 ; i ++){
            calculo = listaNumeroCPF.get(i) * (10 - i) + calculo;
        }
        System.out.println("." + calculo);
        return true;
    }

    
}