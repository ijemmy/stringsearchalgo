public class BruteForce {
    public static boolean search(String hay, String needle){

        if(needle.length() == 0){
            return true;
        }

        for(int i = 0; i < hay.length(); i++){
            for(int j = 0; j < needle.length(); j++){
                if(hay.charAt(i) != needle.charAt(j)){
                    continue;
                }
                if(j == (needle.length() - 1)){
                    return true;
                }
            }
        }
        return false;
    }
}
