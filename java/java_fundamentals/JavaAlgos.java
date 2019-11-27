import java.util.ArrayList;
public class JavaAlgos{
    public Integer greaterThan(int [] arr,int y){
        int count =0;
        for (int i =0;i<arr.length; i++){
            if(arr[i]>y){
                count++;
            }
        }
        return count;
    }
    public ArrayList<Integer> squareValues(int [] arr){
        ArrayList<Integer> thisArr = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            arr[i]= arr[i] *arr[i];
            thisArr.add(arr[i]);

        }
        return thisArr;
    }
    public ArrayList<Integer> eliminataeNegative(int [] arr){
        ArrayList<Integer> thisArr = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                thisArr.add(0);
            }
            else{
                thisArr.add(arr[i]);
            }
        }
        return thisArr;
    }
    public ArrayList<Integer> minMaxAvg(int [] arr){
        ArrayList<Integer>thisArr = new ArrayList<Integer>();
        int sum =arr[0];
        int min = arr[0];
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            
            if(arr[i]>max){
                max = arr[i];
               
            }
            if(arr[i]<min){
                min = arr[i];
            }
            sum +=arr[i];
        }
        int avg =sum/arr.length;
        thisArr.add(max);
        thisArr.add(min);
        thisArr.add(avg);
        return thisArr;
    }
    public ArrayList<Integer> shiftArray(int [] arr){
        ArrayList<Integer>thisArr = new ArrayList<Integer>();
        for(int i=1;i<arr.length;i++){
            thisArr.add(arr[i]);
        }
        thisArr.add(0);
        return thisArr;
    }

    public static void main(String[] args) {
        // Write a method that prints all the numbers from 1 to 255
        for(int i=1;i<256;i++){
            System.out.println(i);
        }
        //  Write a method that prints the numbers from 0 to 255, but this time print the sum of
        //  the numbers that have been printed so far.
        int sum =0;
        for(int i=0; i<256; i++){
            sum +=i;
            System.out.println("New number:"+ i +" Sum :" +sum);
        }
       /*  Given an array X, say [1,3,5,7,9,13], write a method that would iterate through each member of the array and print each value on the screen. 
        Being able to loop through each member of the array is extremely important. */
        int [] x ={1,3,5,7,9,13};
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
       /*  Find Max
        Write a method (sets of instructions) that takes any array and prints the maximum value in the array. Your method should also work with a given array that has all negative
        numbers (e.g. [-3, -5, -7]), or even a mix of positive numbers, negative numbers and zero.
        */
        int[] arr ={-3,-7,-5};
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
          
        }
        System.out.println(max);

        // Find Average
        int [] myArr ={ 2,10,3};
        int newsum =0;
        for(int i=0; i<myArr.length; i++){
            newsum +=myArr[i];
        }
        int avg = newsum/myArr.length;
        System.out.println(avg);
        // Array with Odd Numbers
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for(int i=1;i<256;i++){
            if(i%2==1){
                myArray.add(i);
            }
            
        }
        System.out.println(myArray);
        JavaAlgos count = new JavaAlgos();
        int [] givenArr = {4,5,6,7};
        int y = 6;
        int val = count.greaterThan(givenArr, y);
        System.out.println(val);

        // Square the values

        System.out.println(count.squareValues(givenArr));
        // negative
        int [] arrnegative = {1,5,10,-2};
        System.out.println(count.eliminataeNegative(arrnegative));
        // Max, Min, and Average
        System.out.println(count.minMaxAvg(arrnegative));
        // shift Array
        System.out.println(count.shiftArray(arrnegative));





    }
}
