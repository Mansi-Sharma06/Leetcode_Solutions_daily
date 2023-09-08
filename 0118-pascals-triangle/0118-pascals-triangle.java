class Solution {
  public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> result = new ArrayList<>();
      if(numRows==0)  return result;
      
      List<Integer> row = new ArrayList<>();
      row.add(1);
      result.add(row);
      
      List<Integer> prevRow = row;
      
      for(int i = 1; i < numRows; i++){
          List<Integer> currentRow = new ArrayList<>();
          currentRow.add(1);
          for(int j = 1; j < i; j++){
              currentRow.add(prevRow.get(j) + prevRow.get(j-1));
          }
          currentRow.add(1);
          result.add(new ArrayList<>(currentRow));
          prevRow = currentRow;
      }
      return result;
      
      
      
//     List<List<Integer>> ans = new ArrayList<>();

//     for (int i = 0; i < numRows; ++i) {
//       Integer[] temp = new Integer[i + 1];
//       Arrays.fill(temp, 1);
//       ans.add(Arrays.asList(temp));
//     }

//     for (int i = 2; i < numRows; ++i)
//       for (int j = 1; j < ans.get(i).size() - 1; ++j)
//         ans.get(i).set(j, ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));

//     return ans;
  }
}
