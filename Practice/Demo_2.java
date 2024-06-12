package Practice;

public class Demo_2 {
    public static void main(String[] args) {
        int nums[][] = new int[3][4];
        int random = 0;

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                //random returns a double value so it is typecasted to int value
                nums[i][j] = (int)(Math.random()*10);
                //System.out.print(nums[i][j]);
                //System.out.println();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Printing the array with the enhanced for loop: ");
        System.out.println();
        for(int n[]:nums)
        {
            for(int m: n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
