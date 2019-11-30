public class Greeter{
    public String greet(String name){
        return creategreeting(name);
    }
    public String greet(){
        return creategreeting("Hello");
    }
    public String  greet(String firstName, String lastName){
        return creategreeting(firstName + " " + lastName);
    }

    private String creategreeting(String tobegreeted){
        return "Greeting" + tobegreeted + ", welcome to coding dojo";
    }
}