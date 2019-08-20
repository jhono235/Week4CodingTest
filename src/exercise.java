public class exercise {

    public static void opposites(String s){

        int[] chars = s.chars()
                .map(ch -> Character.isUpperCase(ch) ? 25 - ch + 'A' * 2 :
                        Character.isLowerCase(ch) ? 25 - ch + 'a' * 2 : ch)
                .toArray();
        s = new String(chars, 0, chars.length);
        System.out.println(s);



    }

   public static void frequency(String userString){

            final long[] symbols = new long[26];
            for (final char c : userString.toCharArray()) {
                if ((c >= 'a') && (c <= 'z')) {
                    symbols[c - 'a']++;
                } else if ((c >= 'A') && (c <= 'Z')) {
                    symbols[c - 'A']++;
                }
            }
            for (int i = 0; i < 26; i++) {
                System.out.println((char) ('a' + i) + ": " + symbols[i]);
            }
        }






    public static void main(String [] args){
       opposites("acp");

       frequency("Hello there! Apple!");


    }
}
