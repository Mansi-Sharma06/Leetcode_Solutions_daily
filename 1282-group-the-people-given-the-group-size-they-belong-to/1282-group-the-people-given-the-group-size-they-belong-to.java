class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
         int n = groupSizes.length;
        
        List<List<Integer>> result = new ArrayList();
        Map<Integer, List<Integer>> mp = new HashMap<>();
        
        for (int i = 0; i < n; ++i) {
            List<Integer> list = mp.computeIfAbsent(groupSizes[i], k -> new ArrayList());
            
            list.add(i);
            
            if (list.size() == groupSizes[i]) {
              result.add(list);
              mp.put(groupSizes[i], new ArrayList());
            }
            
        }
        return result;
    }
}