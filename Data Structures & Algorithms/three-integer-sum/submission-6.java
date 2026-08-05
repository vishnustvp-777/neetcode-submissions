class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;

        for(int left = 0; left < n - 2; left++) {

            // skip duplicate values for left
            if(left > 0 && arr[left] == arr[left - 1]) continue;

            int mid = left + 1;
            int right = n - 1;   // reset right for each new left

            while(mid < right) {
                int sum = arr[left] + arr[mid] + arr[right];

                if(sum == 0) {
                    // found a triplet — add it
                    list.add(Arrays.asList(arr[left], arr[mid], arr[right]));

                    mid++;
                    right--;

                    // skip duplicates for mid
                    while(mid < right && arr[mid] == arr[mid - 1]) mid++;
                    // skip duplicates for right
                    while(mid < right && arr[right] == arr[right + 1]) right++;

                } else if(sum < 0) {
                    mid++;       // need bigger sum → move mid right
                } else {
                    right--;     // need smaller sum → move right left
                }
            }
        }

        return list;
    }
}