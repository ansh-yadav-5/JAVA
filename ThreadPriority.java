class A extends Thread{
    public void run(){
        System.out.println("thread A started ");
        for(int i=1; i<=4; i++){
            System.out.println("\t from thread A : i =" + i);
        }
        System.out.println("Exit from A");
    }
}

class B extends Thread {
    public void run(){
        System.out.println("thread B started ");
        for (int j = 1; j <= 4; j++) {
            System.out.println("\t from thread B : j = " + j);
        }
        System.out.println("Exit from B ");
    }
}

class C extends Thread {
    public void run() {
        System.out.println("thread C started ");
        for(int k=1; k<=4; k++){
            System.out.println("\t from Thread C : k = " + k);
        }
        System.out.println(" Exit from C");
    }
}



public class ThreadPriority {
    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();
        threadC.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(threadA.getPriority()+1);
        threadA.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Start thread A");
        threadA.start();
        System.out.println("Start thread B");
        threadB.start();
        System.out.println("Start thread C");
        threadC.start();
        System.out.println("End of main thread ");
    }
}
