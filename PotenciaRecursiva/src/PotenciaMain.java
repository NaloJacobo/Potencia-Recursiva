
/**
 *
 * @author Nalo
 */
public class PotenciaMain {
    
    PotenciaRecursiva p1 = new PotenciaRecursiva();
    
    public static void main(String[] args) {
        int base = 2;
        int exponente = 5;
        int resultado = PotenciaRecursiva.potencia(base, exponente);
        System.out.println(base + " elevado a la " + exponente + " es igual a " + resultado);
    }
}
