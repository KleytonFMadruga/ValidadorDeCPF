package src.com.kleyton;

import java.util.ArrayList;
import java.util.List;


public class Validador{

    public static boolean validarCPF(String cpf){
        //Retira máscara do CPF.
        String cpfLimpo = cpf.replace("-", "");
        cpfLimpo = cpfLimpo.replace(".", "");

        //Transforma um CPF String em uma lista de inteiros.
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

        if (listaNumeroCPF.get(9) != digitoVerificador1){
            System.out.println("false");
            return false;

        } else{

            int calculo2 = 0;
            for(int i = 0; i < 10 ; i ++){
                calculo2 = listaNumeroCPF.get(i) * (11 - i) + calculo2;
            }

            resto = calculo2 % 11;
            int digitoVerificador2 = 0;

            if (resto >= 2){
                digitoVerificador2 = 11 - resto;;
            }

            if (listaNumeroCPF.get(10) != digitoVerificador2){
                System.out.println("false" + digitoVerificador2);
                return false;
            }

        }
        return true;
    }
   
}