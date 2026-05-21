public class C64_SentenciasBucleEtiquetaBuscar {
    public static void main(String[] args) {

        String frase = "trigo tres tristes tigres tragan trigotrigo en un trigaltrigo";
        String palabra = "trigo";

        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;


        int cantidad = 0;
        char letra = 'g';

        // bloque de código llamado buscar
        buscar:
        for (int i = 0; i <= maxFrase; ) { // i++ lo quitamos para evitar recorrer toda la frase
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    i++; // aquí avanzamos  carácter por carácter
                    continue buscar;
                }
            }
            cantidad++;
            i = i + maxPalabra; // para avanzar en la frase y no recorrer carácter por carácter
        }
        System.out.println("frase = " + frase);
        System.out.println("Encontrado " + cantidad + " veces la palabra : " + palabra + " en la frase");
    }
}
