package warmups;

public class Animals implements Comparable{
    public String name;
    
    public Animals(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public static void eat() {
        System.out.println("Animal eat");
    }

    public static void sleep() {
        System.out.println("Animal sleep");
    }
    
    public int compareTo(Object obj){
        Animals catty = (Animals)obj;
        return this.getName().compareTo(catty.getName());
    }
    
    public String toString(){
        return name;
    }
}
