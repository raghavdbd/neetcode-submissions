class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        int start = 0;
        int end = arr.length - 1;
        int floor = -1;

        // Find floor of x
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] <= x) {
                floor = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        int left = floor;
        int right = floor + 1;

        List<Integer> res = new ArrayList<>();

        while (k-- > 0) {

            if (left < 0) {
                res.add(arr[right++]);
            } else if (right >= arr.length) {
                res.add(0, arr[left--]);
            } else {

                if (Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)) {
                    res.add(0, arr[left--]);
                } else {
                    res.add(arr[right++]);
                }
            }
        }

        return res;
    }
}