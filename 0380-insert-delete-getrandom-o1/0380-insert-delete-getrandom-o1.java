/**class RandomizedSet {

    public RandomizedSet() {
        
    }
    
    public boolean insert(int val) {
        
    }
    
    public boolean remove(int val) {
        
    }
    
    public int getRandom() {
        
    }
}*/

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */

class RandomizedSet {
  /**
   * Inserts a value to the set. Returns true if the set did not already contain the specified
   * element.
   */
  public boolean insert(int val) {
    if (valToIndex.containsKey(val))
      return false;

    valToIndex.put(val, vals.size());
    vals.add(val);
    return true;
  }

  /** Removes a value from the set. Returns true if the set contained the specified element. */
  public boolean remove(int val) {
    if (!valToIndex.containsKey(val))
      return false;

    final int index = valToIndex.get(val);
    // Following two lines order are important when vals.size() == 1
    valToIndex.put(last(vals), index);
    valToIndex.remove(val);
    vals.set(index, last(vals));
    vals.remove(vals.size() - 1);
    return true;
  }

  /** Get a random element from the set. */
  public int getRandom() {
    final int index = rand.nextInt(vals.size());
    return vals.get(index);
  }

  private Map<Integer, Integer> valToIndex = new HashMap<>(); // {val: index in vals}
  private List<Integer> vals = new ArrayList<>();
  private Random rand = new Random();

  private int last(List<Integer> vals) {
    return vals.get(vals.size() - 1);
  }
}
