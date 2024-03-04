package Recursion;

import java.util.ArrayList;

public class Linear_Search {
    public static void main(String[] args) {
        int []arr = {1,22,6,3,6,7,8};
        System.out.println(find(arr,6,0));
        System.out.println(findIndex(arr,6,0));
        System.out.println(findIndex_from_Last(arr,6,arr.length-1));
        find_All_Index(arr,6,0);
        System.out.println(list);
    }
    public static boolean find(int[]arr, int target, int index){
        if(index==arr.length-1){
            return false;
        }
        return arr[index]==target || find(arr,target,index+1);
    }
    public static int  findIndex(int[]arr, int target, int index){
        if(index==arr.length-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else {
            return findIndex(arr,target,index+1);
        }
    }
    public static int  findIndex_from_Last(int[]arr, int target, int index){
        if(index==-1){
            return -1;       // ye list ke end me jo element hoga uska index btayega
        }                    // {1,22,6,3,6,7,8} target=6 toh ,output=4 last vale 6 ka index print hua
        if(arr[index]==target){
            return index;
        }
        else {
            return findIndex_from_Last(arr,target,index-1);
        }
    }
    static ArrayList<Integer> list=new ArrayList<>();
    public static void  find_All_Index(int[]arr, int target, int index){
        if(index==arr.length){
            return ;
        }
        if(arr[index]==target){
            list.add(index);
        }
             find_All_Index(arr,target,index+1);
    }

}
