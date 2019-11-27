import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;

public class PuzzleJava {
    public ArrayList<Integer> greaterThanTen(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > 10) {
                list.add(arr[i]);
            }

        }
        System.out.println(sum);
        return list;
    }

    public ArrayList<String> longerThanFive(String[] arr) {

        ArrayList<String> list = new ArrayList<String>();
        Collections.shuffle(list);
        System.out.println(list);
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() > 5) {
                list.add(arr[i]);
            }
        }

        return list;
    }

    public ArrayList<Character> alpha() {
        ArrayList<Character> list = new ArrayList<Character>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
        Collections.shuffle(list);

        System.out.println(list);
        for (char letter : list) {

            System.out.println(letter);

        }

        return list;
    }

    public ArrayList<Integer> generateRandom() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random ran = new Random();

        for (int i = 0; i < 10; i++) {
            arr.add(ran.nextInt(45) + 55);
        }
        return arr;

    }

    public ArrayList<Integer> sortRandom(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random ran = new Random();
        
        for (int i=0; i<10;i++){
            arr.add(ran.nextInt(45)+55);
        }
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println(arr.get(0));
        System.out.println(arr.get(arr.size()-1));
        return arr;
    }

    public static void main(String[] args) {
        PuzzleJava obj = new PuzzleJava();
        String [] strArr = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        System.out.println(obj.longerThanFive(strArr));
        System.out.println(obj.alpha());
        
        System.out.println(obj.generateRandom());
        System.out.println(obj.sortRandom());
    }
}       