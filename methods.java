package basics;
public class methods
{


    public void students()
    {
        System.out.println(" in this method explore name is 1. w/o return type and w/o arguments");
    }

    public void passingparameter(String student_name,int emp_age)
    {
        System.out.println(" my emp name is "+student_name);
    }

    public char returnprocess1()
    {
        System.out.println(" this process name is  with return type and w/o arguments\n");
        return  'M';
    }
    public static void main(String[] args)
    {
        methods obj=new methods();

        obj.students();

        obj.passingparameter("abi",20);

        char gender= obj.returnprocess1();
        System.out.println(" current student gender is (M-male,F-female)"+gender);
    }
}
