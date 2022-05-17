package filahapvida;
import java.util.Scanner;

public class FilaHapvida {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        PacienteHap p1 = new PacienteHap();
        
        System.out.println("Digite a maricula do paciente");
        p1.matricula = teclado.nextInt();
        System.out.println("");
    }
}
