 import java.util.*;
class Student{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        int min=99999;
        int max=-99999;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int sec_max=-99999;
        for(int i=0;i<n;i++){
            if(arr[i]!=max){
                if(arr[i]>sec_max){
                    sec_max=arr[i];
                }
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int sec_min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]!=min){
                if(arr[i]<sec_min){
                    sec_min=arr[i];
                }
            }
        }
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
        System.out.println("Second Largest element: "+sec_max);
        System.out.println("Second Smallest element: "+sec_min);

    }
}
