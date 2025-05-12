import br.com.estacio.empresa.model.Assalariado;
import br.com.estacio.empresa.model.Comissionado;

public class App {
    public static void main(String[] args) throws Exception {
        Assalariado funcionario2 = new Assalariado("Lucas", "123456789", 25, 2000.00);
        Comissionado funcionario3 = new Comissionado("Lucas", "123456789", 25, 2000.00, 0.10);

        funcionario2.exibirDados();

        funcionario3.exibirDados();
        
    }
}
