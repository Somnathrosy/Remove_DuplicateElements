public class Remove_RepeatedElement {
    static int Remove(int... arr){

        /*If the array has 0 or 1 elements, there are no duplicates to remove.
        The method returns the length of the array unchanged.*/

        int n = arr.length;
        if (n == 0 || n == 1)
            return n;

       int i =0;
       for (int j =1;j<arr.length;j++){
           if(arr[i]!=arr[j]){
               i++;
               arr[i]=arr[j];
           }
       }
       return i;
    }
    public static void main(String[] args) {
        int [] arr = new int[]{1,1,2,2,3,3,3,4,5,6,6,6,7,8,9};
        int k = Remove(arr);
        System.out.println("The array after removing duplicates");
        for (int i =0;i<=k;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
