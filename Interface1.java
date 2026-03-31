 interface Callback {
    void Callback (int param);
    
}

class Client implements Callback{
    public void Callback(int p){
        System.out.println("callback called with " + p);
    }
}



public class Interface1 {
    public static void main(String[] args) {
        Client c = new Client();
        c.Callback(5);
    }
}
