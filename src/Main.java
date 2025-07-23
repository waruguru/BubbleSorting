//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int nums[] = {6, 5, 2, 8, 9, 4};
        int temp = 0;
        //print all values in the array
        System.out.println("Before Sorting");

        for (int num : nums) {
            System.out.print(num + " ");
            /**
             * Two loops fo comparison and 2nd to swap
             */

            for (int i = 0; i < nums.length; i++) {
                //inner loop to swap
                for (int j = 0; j < nums.length - i - 1; j++) {
                    //compare
                    if (nums[j] > nums[j + 1]) {
                        temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;

                    }

                }

            }
        }

        System.out.println();
        System.out.println("After Sorting");

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}