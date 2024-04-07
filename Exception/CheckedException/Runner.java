package Exception.CheckedException;

public class Runner {

    public static void main(String[] args) {

        Myclass ob=new Myclass();
        try {
            ob.someMethod();
        } catch (CustomException e) {
           System.out.println(e.getMessage());
        }
    }
    
}
