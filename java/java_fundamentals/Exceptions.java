import java.util.ArrayList;
public class Exceptions{
    public ArrayList<Object> arrayException(){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        for(int i=0;i<myList.size();i++){
            try {
                Integer castedValue = (Integer) myList.get(i);}
            catch (ClassCastException e) {
                System.out.println("At index " + i  +myList.get(i) +"  threw an exception.");
            }

        }
        return myList;

    }
    public static void main(String[] args) {
        Exceptions obj = new Exceptions();
        System.out.println(obj.arrayException());
       
    }

}