public class Primes {
    public static void main(String[] args) {
        int max = Integer.parseInt( args[0] );
        boolean [] arr = new boolean[ max + 1 ];
        for( int i = 0 ; i < arr.length ; i++ ){
            arr[i] = true ;
        }
        for(int j = 2 ; j< arr.length; j++ ){
            if( arr[j] == true ){
                System.out.println(j);
                for(int g = (j+1); g < arr.length ; g++){
                    if(g % j ==0){
                        arr[g] = false ;
                    }
                }
            }
        }
    }
}