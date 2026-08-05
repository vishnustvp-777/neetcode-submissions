class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        int left = 0;
        int i = 0;

        while(left < n - 2) {

            // skip duplicate values for left — at TOP before anything else
            if(left > 0 && arr[left] == arr[left - 1]) { left++; continue; }

            int mid = left + 1;    // ✅ reset mid for each new left
            int right = n - 1;     // ✅ reset right for each new left

            while(mid < right) {
                int sum = arr[left] + arr[mid] + arr[right];

                if(sum > 0) {
                    right--;       // no break needed — just move right
                }
                else if(sum < 0) {
                    mid++;
                }
                else {
                    list.add(new ArrayList<>());
                    list.get(i).add(arr[left]);
                    list.get(i).add(arr[mid]);
                    list.get(i).add(arr[right]);
                    i++;
                    mid++;
                    right--;
                    // skip duplicates for mid
                    while(mid < right && arr[mid] == arr[mid - 1]) mid++;
                    // skip duplicates for right
                    while(mid < right && arr[right] == arr[right + 1]) right--;
                }
            }

            left++;  // move left after inner loop is fully done
        }

        return list;
    }
}