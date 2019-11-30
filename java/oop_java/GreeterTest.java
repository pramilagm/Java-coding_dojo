public class GreeterTest{
    public static void main(String[] args) {
        Greeter greet = new Greeter();
        String greeter = greet.greet();
        String greeterWithName = greet.greet(" Pramila", "Gharti ");
        System.out.println(greeterWithName);
        if(greeter.equals("Hello World")||greeterWithName.equals("Hello Pramila"))
        {
            System.out.println("Test successful");
        }else{
            System.out.println("Test failed");
        }
    }
}