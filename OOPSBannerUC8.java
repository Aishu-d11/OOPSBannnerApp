import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC8 {

    public static Map<Character, String[]> buildCharacterMap() {

        Map<Character, String[]> bannerMap = new HashMap<>();

        bannerMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        bannerMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        bannerMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return bannerMap;
    }

    // Utility Method 2: Display Banner Word
    public static void displayBanner(String word, Map<Character, String[]> bannerMap) {

        int height = 5; 

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {

                char ch = word.charAt(i);
                String[] pattern = bannerMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    // Main Method
    public static void main(String[] args) {

        Map<Character, String[]> bannerMap = buildCharacterMap();

        String message = "OOPS";

        displayBanner(message, bannerMap);
    }
}