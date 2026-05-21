public class C116_Tarea14_MayorOcurrencia {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 4, 5, 5, 5, 6, 7};

        int numero=0;
        int ocurrenciasAuxiliar, ocurrencias =0;
        int elementoAuxiliar=0, elemento=0;

        for (int j : a) {
            numero = j ;
            ocurrenciasAuxiliar =0;
            for (int i =0; i<a.length;i++) {
                if (numero == a[i]){
                    elementoAuxiliar = j;
                    ocurrenciasAuxiliar++;
                }
            }
            if (ocurrenciasAuxiliar>ocurrencias){
                ocurrencias = ocurrenciasAuxiliar ;
                elemento = elementoAuxiliar;
            }
        }
        System.out.println(" La mayor ocurrencia es = " + ocurrencias);
        System.out.println(" El elemento que más se repite es : "+ elemento);
    }
}

/**
 * Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9). Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo y también imprimir la cantidad de veces que aparece en el arreglo.
 *
 * Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}
 *
 * Como resultado debería imprimir lo siguiente:
 *
 * La mayor ocurrencias es: 3
 * El elemento que mas se repite es: 5
 * En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una ocurrencia de 3 veces.
 */