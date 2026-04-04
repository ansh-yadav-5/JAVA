class TwinPrime{
    int value;
    TwinPrime(int value){
        this.value = value;
    }
    public boolean isPrime(int value){
        for(int i=2 ; i <= value/2 + 1 ; i++){
            if (value % i == 0) 
                return false;
            
        }
        return true;
        

    }
}




public class TestTwinPrime {
    public static void main(String[] args) {
        TwinPrime p1 = new TwinPrime(100);
        for(int i=2; i<=1000; i++){
            if (p1.isPrime(i)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }




    }
}
