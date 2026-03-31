import java.util.Scanner;

class Product{
    String ProductName;
    int quantity,rate;
    static int totalAmount;

    Product(String pn, int qty, int r){
        ProductName = pn;
        quantity = qty;
        rate = r;
        totalAmount += quantity*rate; 
    }

    void display(){
        System.out.printf("%20s%12d \n" , ProductName , quantity*rate);
    }
}

public class Purchase{
    public static void main(String[] args){
        Product[] item = new Product[2];
        Scanner input = new Scanner(System.in);
        for(int i=0;i<2;i++){
            System.out.println("Enter Product name, quantity , rate");
            String pn = input.next();
            int qty = input.nextInt();
            int rate = input.nextInt();
            item[i] = new Product(pn,qty,rate);
        }
        System.out.println("Details is ");
        System.out.printf("%20s%12s \n","Product name","Amount");
        for (int i = 0; i < 2; i++) {
            item[i].display();
        }
        System.out.println("-------------------");
        System.out.println("Total Purchase is " + Product.totalAmount);
    }
}