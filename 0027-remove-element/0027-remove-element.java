class Solution {
    public int removeElement(int[] nums, int val) {
        int array[] = nums;
        int n = val;
        int size = array.length;

        for(int i = 0 ; i < size ; i++)
        {
            if(array[i] == n)
            {
                array[i] = Integer.MAX_VALUE;
            }
        }


        int count = 0;
        for(int j = 0; j < size ; j++)
        {
            if(array[j] != Integer.MAX_VALUE)
            {
                array[count] = array[j];
                count++;
            }
        }
        

        for(int k = 0; k < count ; k++)
        {
            System.out.print(array[k] + ",");
        }
        return count;
    }
}