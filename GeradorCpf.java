import java.util.Scanner;

public class GeradorCpf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cpf;
        int multiplica = 1, soma1=0,soma2=0, digito1, digito2, calc1, calc2;

        System.out.print("Digite o seu CPF para saber o digito:");
        cpf = sc.nextLine();

        for(int i=0;i<cpf.length();i++){
            char cpfString = cpf.charAt(i);
            int cpfInt = Character.getNumericValue(cpfString);
            calc1 = cpfInt*multiplica;
            multiplica++;
            soma1+=calc1;
        }
        digito1 = soma1%11;
        String cpfDigit = cpf+digito1;

        multiplica=0;
        for(int i=0;i<cpfDigit.length();i++){
            char cpfString2 = cpfDigit.charAt(i);
            int cpfDigitInt = Character.getNumericValue(cpfString2);
            calc2 = cpfDigitInt*multiplica;
            multiplica++;
            soma2+=calc2;
        }
        digito2 = soma2%11;

        System.out.println("O cpf gerado é: "+cpf+"-"+digito1+digito2);


        sc.close();
        
    }
}
