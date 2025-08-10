class Solution {
    public boolean reorderedPowerOf2(int n) {
        
        //O(1)time
        //O(1)space
    int[] t = counter(n);

    for (int i = 0; i < 32; i++)
        if (check(t, counter(1 << i))) return true;

    return false;
}

public int[] counter(int n) {
   int[] arr = new int[10];
    while(n > 0){
        arr[n % 10]++;
        n = n / 10;
    }
    return arr;
}

public boolean check(int[] a, int[] b){
    for(int i = 0; i < a.length; i++){
        if(a[i] != b[i]) return false;
    }
    return true;
        
    }
}