package PageObjects;

public class Pro2 {
    String name;

    public Pro2(String name){
        this.name = name;
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Pro2 a = new Pro2("Apoorv");
        System.out.println(a.name);
    }





}
