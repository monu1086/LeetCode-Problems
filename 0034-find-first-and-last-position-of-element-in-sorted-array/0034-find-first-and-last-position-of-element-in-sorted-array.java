class Solution {
    public int[] searchRange(int[] arr, int target) {
        int fst = first(arr, target);
        if (fst == -1)
            return new int[] { -1, -1 };
        int lst = last(arr, target);
        return new int[] { fst, lst };
    }

    static int first(int[] arr, int target) {
        int low = 0, high = arr.length - 1, ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] > target)
                high = mid - 1;

            else
                low = mid + 1;
        }
        return ans;
    }

    static int last(int[] arr, int target) {
        int low = 0, high = arr.length - 1, ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if (arr[mid] < target)
                low = mid + 1;

            else
                high = mid - 1;
        }
        return ans;
    }
}