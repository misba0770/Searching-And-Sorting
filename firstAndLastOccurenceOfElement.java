
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author misba zaidi
 */
public class firstAndLastOccurenceOfElement {

    
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=s.nextInt();
       }
       int x=s.nextInt();
       ArrayList<Integer> ans=find(arr,n,x);
       for(int i=0;i<ans.size();i++){
           System.out.print(ans.get(i)+" ");
       }
    }

    private static ArrayList<Integer> find(int[] arr, int n, int x) {
         int first=findFirst(arr,n,x);
        int last=findLast(arr,n,x);
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(first);
        ans.add(last);
        return ans;
    }

    private static int findFirst(int[] arr, int n, int x) {
         int low=0;
        int high=n-1;
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                res=mid;
                high=mid-1;
            }
            if(arr[mid]<x){
                low=mid+1;
            }
            if(arr[mid]>x){
                high=mid-1;
            }
        }
        return res;
    }

    private static int findLast(int[] arr, int n, int x) {
        int low=0;
        int high=n-1;
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                res=mid;
                low=mid+1;
            }
            if(arr[mid]<x){
                low=mid+1;
            }
            if(arr[mid]>x){
                high=mid-1;
            }
        }
        return res;
    }
    
}
