public class Avarage {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4};
        int count=0;
        for (int i=0; i< arr.length; i++){
            count=count+arr[i];
        }
        float avr=count/ arr.length;
        System.out.println (avr);
    }
}
