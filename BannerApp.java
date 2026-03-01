/**
 * OOPS Banner App
 * UC7: Store Character Pattern in a Static Inner Class
 * Demonstrates Encapsulation, Modularity and SRP
 */
public class BannerApp {

    /**
     * Static Inner Class to store character and its banner pattern
     */
    static class CharacterPatternMap {

        // Instance variables (immutable)
        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern
         * 
         * @param character The character (O, P, S)
         * @param pattern   7-line banner pattern of the character
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter method to retrieve character
         * 
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter method to retrieve pattern
         * 
         * @return 7-line pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to get pattern of a character
     * 
     * @param ch       character to search
     * @param patterns array of CharacterPatternMap objects
     * @return pattern of the character
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] patterns) {
        for (CharacterPatternMap obj : patterns) {
            if (obj.getCharacter() == ch) {
                return obj.getPattern();
            }
        }
        return new String[7]; // default empty pattern
    }

    /**
     * Main method
     */
    public static void main(String[] args) {

        // Define 7-line patterns
        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        String[] P = {
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };

        String[] S = {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };

        // Create objects (Array of Objects)
        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', O),
                new CharacterPatternMap('P', P),
                new CharacterPatternMap('S', S)
        };

        String word = "OOPS";

        // Build banner using StringBuilder
        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                String[] charPattern = getCharacterPattern(word.charAt(i), patterns);
                line.append(charPattern[row]).append("   ");
            }

            System.out.println(line);
        }
    }
}