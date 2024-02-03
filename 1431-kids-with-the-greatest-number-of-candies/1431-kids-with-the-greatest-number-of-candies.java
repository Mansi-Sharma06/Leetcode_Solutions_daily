class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for (int c : candies) {
            max = Math.max(max, c);
        }

        ArrayList<Boolean> result = new ArrayList<>();
        for (int c : candies) {
            result.add(c + extraCandies >= max);
        }
        
        return result;
        
        //     if (c + extraCandies < max) {
        //         arrayList.add(false);
        //         continue;
        //     }
        //     arrayList.add(true);
        // }
        // return arrayList;
    }
}