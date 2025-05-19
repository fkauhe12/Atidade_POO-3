import br.com.estacio.empresa.model.Assalariado;
import br.com.estacio.empresa.model.Comissionado;
import br.com.estacio.empresa.model.Horista;


public class App {
    public static void main(String[] args) throws Exception {
        Horista funcionario1 = new Horista("Lucas", "123456789", 25, 20.00, 40);
        Assalariado funcionario2 = new Assalariado("Felipe", "123456789", 20, 2000.00);
        Comissionado funcionario3 = new Comissionado("Kauhe", "123456789", 21, 5000.00, 0.10);
        
        funcionario1.exibirDados();
        System.out.println();
        funcionario2.exibirDados();
        System.out.println();
        funcionario3.exibirDados();
        
        
    }
}
