package encapsulation26;

public class Encapsulation {
    // private variables declared these can only be acces by public method of class


    private String name;
    private int rollNo;
    private int age;

    // get method for name to access private variable name
    public String getName() {
        return name;

    }


    // set method for name to access private variable name
    public void setName(String name) {
        this.name = name;
    }


    //get method for roll to access private variable rollno
    public int getRollNo() {
        return rollNo;
    }
    // set method for roll to access private variable

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // set method for age to access private variable age
    public void setAge(int age) {
        this.age = age;
    }
    public class TestEncapsulatiom{

        public void main(String[] args) {
            Encapsulation obj = new Encapsulation();
            //setting values of the variables
            obj.setName("Amit");
            obj.setAge(19);
            obj.setRollNo(51);

            System.out.println("Prime's name: " +
                    obj.getName());
            System.out.println("Prime's age: " +
                    obj.getClass());
            System.out.println("Prime's rollNo: " +
                    obj.getRollNo());
        }
    }
}