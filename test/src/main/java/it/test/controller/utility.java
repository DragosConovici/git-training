public static void main(String[] args) {
    String str1 = "Ciao";
    String str2 = " Mondo";

    // Esempio di concatenazione di stringhe
    String concatenated = concatenateStrings(str1, str2);
    System.out.println("Concatenated: " + concatenated);

    // Esempio di conversione in maiuscolo
    String upperCase = toUpperCase(concatenated);
    System.out.println("Upper Case: " + upperCase);
    //maiuscolo e minuscolo

    // Esempio di verifica se una stringa contiene un'altra stringa prova
    boolean contains = containsSubstring(upperCase, "MONDO");
    System.out.println("Contains 'MONDO2': " + contains);

    // Esempio di sostituzione di una sottostringa
    String replaced = replaceSubstring(upperCase, "CIAOBELLA", "HELLO");
    System.out.println("Replaced: " + replaced);
}
