import java.util.HashMap;

class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            hm.put(ele, hm.getOrDefault(ele, 0) + 1);
        }

        int ans = -1;
        for (int key : hm.keySet()) {
            if (hm.get(key) == key) {
                ans = Math.max(ans, key);
            }
        }

        return ans;
    }
}
