class Box{
    double width , height , depth;

    Box(){
        width = 0.0; height = 0.0; depth =0.0;
    }

    Box(double width , double height , double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume(){
        return width*height*depth;
    }
}

class BoxWeight extends Box{
    double weight;
    BoxWeight(double w, double h, double d, double m){
        super(w,h,d);
        weight = m;
    }
}



public class Makebox {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of my box 1 is " + vol);
        System.out.println();
        
        vol = mybox2.volume();
        System.out.println("Volume of my box 2 is " + vol);
        System.out.println("weight of mybox2 is  " + mybox2.weight);
    }
}
