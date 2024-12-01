public class Primes {
    public static void main(String[] args) {
        int max = Integer.parseInt( args[0] );
        int primes = 0 ; 
        boolean [] arr = new boolean[ max + 1 ];
        for( int i = 0 ; i < arr.length ; i++ ){
            arr[i] = true ;
        }
        System.out.println( "Prime numbers up to " + max + ":" );
        for(int j = 2 ; j < arr.length ; j++ ){
            if( arr[j] == true ){
                System.out.println( j );
                primes ++ ;
                for( int g = ( j + 1 ) ; g < arr.length ; g++ ){
                    if (g % j == 0 ){
                        arr[g] = false ;
                    }
                }
            }
        }
        System.out.println( "There are " + primes + " primes between 2 and "+ max + " (" + ( int )( ( 1.0 * primes / max ) * 100 ) + "% are primes)" );
    }
}