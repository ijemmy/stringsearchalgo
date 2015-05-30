public class BruteForce {
    public static boolean search(String hay, String needle){

        System.out.printf("\nSearch() called hay = %s, needle = %s\n", hay, needle);
        if(needle.length() == 0){
            return true;
        }

        for(int i = 0; i < hay.length(); i++){
            for(int j = 0; j < needle.length(); j++){
                System.out.printf("=comparing %c with %c\n", hay.charAt(i + j), needle.charAt(j));
                if(hay.charAt(i+j) != needle.charAt(j)){
                    System.out.println("==Not the same, break");
                    break;
                }
                if(j == (needle.length() - 1)){
                    System.out.println("==Found, return true");
                    return true;
                }
            }

        }
        return false;
    }
}
