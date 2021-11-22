package src.com.kleyton;

public class Validador{

    public static boolean validarCPF(String cpf){
        String resultado = cpf.replace("-", "");
        resultado = resultado.replace(".", "");
        System.out.println(resultado);
        return true;
    }

    
}