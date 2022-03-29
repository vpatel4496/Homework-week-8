package encapsulation26;

public class TestEncapsulation {

    public static void main (String[] args)
        {
            Encapsulate obj = new Encapsulate();
            // Setting values of the variable
            obj.setname("Amit");
            obj.setAge(19);
            obj.setRollNo(51);

            // Displaying values of the variables
            System.out.println("Prime's name: "+ obj.getName());
            System.out.println("Prime's age: "+ obj.getAge());
            System.out.println("Prime's rollNo: "+ obj.getRollNo());

            // Direct access of rollNo is not possible due to encapsulation
            //System.out.println("prime's rollNo : "+ obj.geekName);
        }
    }






