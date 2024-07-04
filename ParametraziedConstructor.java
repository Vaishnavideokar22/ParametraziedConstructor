class Emp{
    String name;
    int age;
    int emp_id;
    String address;

    Emp(String Name, int Age, int Emp_id,String Address){
        this.name = Name;
        this.age = Age;
        this.emp_id = Emp_id;
        this.address = Address;
    }

}
public class ParametraziedConstructor {
    public static void main(String[] args) {
        
        Emp e1 = new Emp("Rani", 22, 789, "Rahuri");
        System.out.println(e1.name);
        System.out.println(e1.age);
        System.out.println(e1.emp_id);
        System.out.println(e1.address);
    }
}
