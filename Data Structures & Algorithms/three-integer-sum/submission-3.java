class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        int left = 0; 
        int right = n - 1;
        int mid = left + 1;
        int i = 0;
        boolean greaterSum = false;

        while(left < right && mid != left && mid != right) {
            greaterSum = false;
            while(mid < right) {
                int sum = arr[left] + arr[right] + arr[mid];
                if(sum > 0) {
                    greaterSum = true;
                    right--;
                    break;
                }
                else if(sum < 0) {
                    mid++;
                }
                else if(sum == 0) {
                    list.add(new ArrayList<>());
                    list.get(i).add(arr[left]);
                    list.get(i).add(arr[mid]);
                    list.get(i).add(arr[right]);
                    i++;
                    mid++;
                    right--;
                    while(mid < right && arr[mid] == arr[mid - 1]) mid++;
                    while(mid < right && arr[right] == arr[right + 1]) right--;
                }
            }
            if(!greaterSum) {
                left++;
                mid = left + 1;
            }

        }
        return list;

    }
}
