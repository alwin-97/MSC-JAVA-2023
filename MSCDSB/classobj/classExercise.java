class MobileStore{
    String Name;
    String Model;
    int RAMSize;
    float Price;
    String Manufacture;

    MobileStore(){
        Name = "";
        Model = "";
        RAMSize = 0;
        Price = 0.0f;
        Manufacture = "";
    }

    MobileStore(String Name, String Model, int RAMSize, float Price,String Manufacture){
        this.Name = Name;
        this.Model = Model;
        this.RAMSize = RAMSize;
        this.Price = Price;
        this.Manufacture = Manufacture;
    }

    void printMobile(){
        System.out.println("Mobile Details\n--------------");
        System.out.println("Name : "+ this.Name);
        System.out.println("Model : "+this.Model);
        System.out.println("RAM : "+this.RAMSize);
        System.out.println("Price : "+this.Price);
        System.out.println("Manufacture : "+this.Manufacture);
    }

    String[] returnManufactureCost(){
        String[] arr = {this.Manufacture,Float.toString(this.Price)};
        return arr;
    }
}

public class classExercise {
    public static void main(String[] args) {
        
    }
}
