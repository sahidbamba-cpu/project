import java.util.Arrays;

public class IntArray{

    private int[] arr;

    public IntArray(int size){
        arr= new int[size];
    }

    public int size(){

        return arr.length;

    }

    public void set(int element, int index){

        arr[element]= index;
    }

    // Fill array with random numbers 1–6
    public void fillRand() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 6) + 1;
        }
    }

    public int get(int element){
        return arr[element];
    }

    public void clear(){
        arr= new int[0];
        }

    public boolean isEmpty(){
        return arr.length == 0;
        }

    // sort array
    public void sort() {
        Arrays.sort(arr);
    }

    public String toString() {
        return Arrays.toString(arr);
    }
}

