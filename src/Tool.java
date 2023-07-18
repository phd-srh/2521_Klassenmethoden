public class Tool {
    // ACHTUNG, nicht zuhause nachmachen
    public static int statischeZahl = 17;   // Klassenvariable !!
    private static int interneStatischeZahl = 3;
    // Normalerweise sollten auch (statische) Klassenvariablen private sein!!
    // Einzige Ausnahme für public: Konstanten !!!!!
    // (normalerweise gibt es hier einen Coding Style)
    public static final int EINE_KONSTANTE_STATISCHE_ZAHL = 7;
    // statt: eineKonstanteStatischeZahl = 7;

    // für private statische Klassenvariablen können wir auch
    // statische Getter und Setter einsetzen
    public static int getInterneStatischeZahl() {
        return interneStatischeZahl;
    }

    public static void setInterneStatischeZahl(int interneStatischeZahl) {
        // this kann im statischen Kontext nicht verwendet werden,
        // weil Klassenmethoden ohne Objekt aufgerufen werden,
        // d.h. es existiert u.U. kein Objekt!
        Tool.interneStatischeZahl = interneStatischeZahl;
    }

    // Methoden mit dem Modifier "static" sind Klassenmethoden
    // = Methoden, die ohne Objekt schon nutzbar sind!
    public static boolean isPrim(int zahl) {
        for (int teiler=2; teiler < zahl; teiler++) {
            if (zahl % teiler == 0)
                return false; // ist keine Primzahl
        }
        return true; // hey, eine echte Primzahl
    }

    public static int nochEineKlassenmethode() {
        return 42;
    }

    // Methoden ohne den Modifier "static" sind Instanzmethoden
    // = Methoden sind gebunden an ein Objekt, und können ohne
    //   Objekt gar nicht genutzt werden
    public boolean isNotStatic() {
        return true;
    }
}
