
/**
 *
 * @author Nalo
 */
public class PotenciaRecursiva {

    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }
}
