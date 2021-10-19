import java.util.ArrayList;

public class Basics {
    
    public static void main(String[] args) {
        
        // Note: You just need to uncomment every method to prove it 😀

        // printnums1to255();

        // printoddnums1to255();

        // sigma();

        // int nums[] = {20, 25, 30, 35, 40};
        // iterateArray(nums);

        // int nums[] = {20,100,25, 30,35,40};
        // finMax(nums);

        // oddArray();

        // int nums[] = {2,2,2,5,6,100};
        // average(nums);

        // int nums[] = {2,2,2,5,6,100};
        // int y = 5;
        // morethanY(nums,y);

        // int nums[] = {1, 5, 10, -2};
        // squares(nums);

        // int nums[] = {1, 5, 10, -2, 0, -10};
        // noNegatives(nums);

        // int nums[] = {1, 5, 10, 50 , -2,-17,-15};
        // averageMinMax(nums);
        
        // int nums[] = {1, 5, 10, 7, -2};
        // shiftValues(nums);

    }

// ===========================================Print 1-255================================

    public static void printnums1to255(){
        for( int i = 1; i<256; i++){
            System.out.println(i);
        }
    }

// ===========================================Print odd numbers between 1-255================================

    public static void printoddnums1to255(){
    for( int i = 1; i<256; i+= 2){
        System.out.println(i);
    }
}

// ===========================================Sigma of 255 AKA Sum to 255================================

    public static int sigma(){
        int sum = 0;
        
        for( int i = 1; i<256; i++){
            sum = sum + i;
        }
        System.out.println(sum);
        return sum;
    }



// ===========================================Iterating through an array================================
    
public static void iterateArray(int arr[]){

        for( int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    } 

// ===========================================Find Max================================
    public static int finMax(int arr[]){
        int max = arr[0];

        for( int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
        return max;
    } 

// ===========================================Array with Odd Numbers ================================

    public static ArrayList<Integer> oddArray(){

    ArrayList<Integer> y = new ArrayList<Integer>();

    for(int i = 1; i <= 255; i+= 2) {
            y.add(i);
    }
    System.out.println(y);
    return y;
    }


// ===========================================Get Average================================

public static double average(int arr[]){

    int avg = 0;

        for( int i = 0; i<arr.length; i++){
            avg = avg + arr[i];
        }

        avg = avg / arr.length;

        System.out.println(avg);
    return avg;
    }

// ===========================================Greater Than Y================================

public static ArrayList<Integer> morethanY(int arr[],int y){

    ArrayList<Integer> greaterthanY = new ArrayList<Integer>();

    for( int i = 0; i<arr.length; i++){
        if(arr[i]>y){
            greaterthanY.add(arr[i]);
        }
    }

    System.out.println(greaterthanY);
    return greaterthanY;
    }

// ===================================Square the values==============================

public static ArrayList<Integer> squares(int arr[]){

    ArrayList<Integer> squaresres = new ArrayList<Integer>();

    for( int i = 0; i<arr.length; i++){
            squaresres.add(arr[i]*arr[i]);
    }

    System.out.println(squaresres);
    return squaresres;
    }

// ===================================Eliminate Negative Numbers==============================


public static ArrayList<Integer> noNegatives(int arr[]){

    ArrayList<Integer> noNega = new ArrayList<Integer>();

    for( int i = 0; i<arr.length; i++){
        if(arr[i]>= 0){
        noNega.add(arr[i]);
        }
    }

    System.out.println(noNega);
    return noNega;
    }

// ===================================Max, Min, and Average==============================

public static ArrayList<Integer> averageMinMax(int arr[]){

    int avg = 0;
    int min = arr[0];
    int max = arr[0];

    ArrayList<Integer> avgMinMax = new ArrayList<Integer>();

        for( int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        avgMinMax.add(max);

    // ===================================

        for( int i = 0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        avgMinMax.add(min);

    // ===================================

        for( int i = 0; i<arr.length; i++){
            avg = avg + arr[i];
        }
        avgMinMax.add(avg / arr.length);

    // ===================================


    System.out.println(avgMinMax);
    return avgMinMax;
    }


// ===================================Shifting the Values in the Array==============================


public static ArrayList<Integer> shiftValues(int arr[]){

    ArrayList<Integer> shift = new ArrayList<Integer>();

    for( int i = 1; i<arr.length; i++){
        shift.add(arr[i]);
    }
    shift.add(0);

    System.out.println(shift);
    return shift;
    }







}