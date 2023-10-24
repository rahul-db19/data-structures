package com.java;
//Example 1:
//        Input: [1,1] [1,1]
//        Output: [2,2]
//
//        Example 2:
//        Input: [9,9] [9,9]
//        Output: [1,9,8]


public class InterviewArray {
    public static int convertArrayToNum(int[] arr){
        int num1 = 0;
        for(int i=0;i<arr.length;i++){
            num1 = num1*10;
            num1 = num1+arr[i];
        }
        return num1;
    }

    public static int countDigits(int num){
        int numOfDigits=0;
        int temp = num;
        while( temp > 0 )
        {
            if( temp % 10 > 0){
                numOfDigits++;
                temp=temp / 10;
            }
        }
        return numOfDigits;
    }

    public static void arraySum(int n1,int n2){
        int sum = n1+n2;
        //System.out.println(sum);

        int[] arr = new int[countDigits(sum)];
        //System.out.println(countDigits(sum));
        int count=arr.length-1;
        int temp = 0;
        while( sum > 0 ){
            temp = sum % 10;
            arr[count] = temp;
            sum = sum / 10;
            count--;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
//        int[] arr1 = new int[]{5,5};
//        int[] arr2 = new int[]{4,4};
//
//        int num1 = convertArrayToNum(arr1);
//        int num2 = convertArrayToNum(arr2);
//
//        arraySum(num1,num2);

        int[] array1 = {9, 9};
        int[] array2 = {9, 9};

        int[] result = new int[array1.length];

        // Perform element-wise addition.
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] + array2[i];
        }

        // Print the result in the desired format.
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }
}
