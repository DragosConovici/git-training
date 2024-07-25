
    public static void main(String[] args) {
        String str1 = "Ciao";
        String str2 = " Mondo";

        // Esempio di concatenazione di stringhe
        String concatenated = concatenateStrings(str1, str2);
        System.out.println("Concatenated: " + concatenated);

        // Esempio di conversione in maiuscolo
        String upperCase = toUpperCase(concatenated);
        System.out.println("Upper Case: " + upperCase);

        // Esempio di verifica se una stringa contiene un'altra stringa
        boolean contains = containsSubstring(upperCase, "MONDO");
        System.out.println("Contains 'MONDO': " + contains);

        // Esempio di sostituzione di una sottostringa
        String replaced = replaceSubstring(upperCase, "CIAO", "HELLO");
        System.out.println("Replaced: " + replaced);
    }

    // Metodo per concatenare due stringhe
    public static String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }

    // Metodo per convertire una stringa in maiuscolo
    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    // Metodo per verificare se una stringa contiene un'altra stringa
    public static boolean containsSubstring(String str, String substring) {
        return str.contains(substring);
    }

    // Metodo per sostituire tutte le occorrenze di una sottostringa con un'altra
    public static String replaceSubstring(String str, String oldSubstring, String newSubstring) {
        return str.replace(oldSubstring, newSubstring);
    }
