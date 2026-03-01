public class BannerAppUC6 {

    // Helper method to build pattern for letter O
   public static String[] getOPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        };
    }
	
	

    // Helper method to build pattern for letter P
    public static String[] getPPattern() {
        return new String[]{
                "*******  ",
                "*      * ",
                "*      * ",
                "*******  ",
                "*        ",
                "*        ",
                "*        "
        };
    }

    // Helper method to build pattern for letter S
    public static String[] getSPattern() {
        return new String[]{
                "  ****** ",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                "       * ",
                " ******  "
        };
    }

    public static void main(String[] args) {

        // Populate patterns using methods
        String[] O = getOPattern();
        String[] P = getPPattern();
        String[] S = getSPattern();

        // Loop-based rendering
        for (int i = 0; i < 7; i++) {
            System.out.println(String.join("   ", O[i], O[i], P[i], S[i]));
        }
    }
}