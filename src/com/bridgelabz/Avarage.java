package com.bridgelabz;

class Demo {
    public static void main(String[] args) {
        short[] arr = new short[]{35, 25, 18, 45, 77, 21, 3};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j =i+1; j< arr.length; j++){
if(arr[i]<arr[j]){
count=arr[i];
}
}
}}}