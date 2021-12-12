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
        
        //Cálculo de validação do primeiro dígito verificador
        int calculo = 0;
        for(int i = 0; i < 9 ; i ++){
            calculo = listaNumeroCPF.get(i) * (10 - i) + calculo;
        }

        int resto = calculo % 11;
        int digitoVerificador1 = 0;

        if (resto >= 2){
            digitoVerificador1 = 11 - resto;;
        }
        
        System.out.println( "e " + digitoVerificador1);
        return true;
    }

    
}