class Solution {
    public int findClosest(int x, int y, int z) {
        int dxz = Math.abs(x - z);
        int dyz = Math.abs(y - z);

        if(dxz < dyz){
            return 1;
        }
        else if(dyz < dxz){
            return 2;
        }
        else{
            return 0;
        }
    }
}