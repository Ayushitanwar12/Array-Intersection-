import java.util.ArrayList;
public class intersection{
    public static void main(String args[]){
        int arr1[]={10,19,20,30,40,40,50};
        int arr2[]={15,16,17,18,20,25,30,30,40};
        System.out.println(Intersection(arr1,arr2));
    }
    public static  ArrayList<Integer> Intersection(int arr1[],int arr2[]){
        ArrayList<Integer>ans= new ArrayList<>();
        int i=0;
        int j=0;
        while(i<arr1.length && j< arr2.length){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr2[j]<arr1[i]){
                j++;
            }
            else{
                ans.add(arr1[i]);
                i++;
                j++;
            }

            
        }
        return ans;
    }
}