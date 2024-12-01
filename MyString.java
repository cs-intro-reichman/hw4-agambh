public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
        
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String lowercase = "" ;
        for(int i = 0 ; i < str.length() ; i++ ){
            if( str.charAt(i) > 64 && str.charAt(i) < 91){
                lowercase += ( (char) (str.charAt(i) + 32) ) ;
            } else{
                lowercase += str.charAt(i) ;
            }
        }
        return lowercase ;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        boolean contains = false ;
        for( int i = 0 ; i < str1.length() ; i++){
            contains = true ;
            for(int j = 0 ; j < str2.length() ; j++){
                if((i+str2.length()-1) >= str1.length()){
                    return false;
                }
                if(str1.charAt(i+j) != str2.charAt(j)){
                    contains = false ; 
                    break;
                }
            }
            if(contains){
                return true;
            }
        }
        return contains;
    }
}
