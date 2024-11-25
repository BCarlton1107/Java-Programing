import java.util.ArrayList;
import java.util.Scanner;

public class  Duplicates{
    public static int[] eliminateDuplicate(int[] nums){

        ArrayList<Integer> temp = new ArrayList<>();

        int x, i;

        for(i = 0;i<nums.length;i++){

            x = 0;

            for(int j = 0;j<temp.size();j++){

                if(nums[i] == temp.get(j)){
                    x = 1;
                }

            }

            if(x == 0){
                temp.add(nums[i]);
            }
        }

        int ans[] = new int[temp.size()];

        for(i = 0;i<temp.size();i++){
            ans[i] = temp.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter ten numbers:\n");

        int nums[] = new int[10];

        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }

        int a[] = eliminateDuplicate(nums);

        System.out.print("The distinct numbers are: ");

        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        System.out.println();
    }
}
