/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examencod;

/**
 *
 * @author ddiazcerezo
 */
public class ExamenCOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iN = 11;
        if (metodoMio(iN)) {
            System.out.println("Es numero primo");
        } else {
            System.out.println("NO es numero primo");
        }

        for (int x = 2; x < 1000; x++) {
            if (metodoMio(x)) {
                System.out.print(x + " ");
            }
        }
    }

    public static boolean metodoMio(int variable) {
        return metodoCambiado(variable);
    }
    
/*Para formatear el codigo la manera mas simple seria pulsar simultaneamente SHIFT-ALT-F,para cambiar el nombre de variable o el metodo tendriamos que clicar en refactor y posteriormente introduce,dentro de introduce nos aparecera variable 
    y methodo lo unico que tendriamos que hacer seria clicar en cada uno de ellos y ponerles el nuebo nombre */
    private static boolean metodoCambiado(int variable) {
        final int numero = 2;
        int j = numero;
        boolean aux = true;
        while ((aux) && (j != variable)) {
            if (variable % j == 0) {
                aux = false;
            }
            j++;
        }
        return aux;
    }

}

/* Esto es una locura
 *
 */
