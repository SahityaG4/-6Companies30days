class Solution {
    public void combiBT(int k, int n, int i, List<Integer> combi, List<List<Integer>> ans){
        if(n==0 && k==combi.size()){
            ans.add(new ArrayList<Integer>(combi));
            return;
        }
        for(int j=i; j<=9; j++){
            combi.add(j);
            combiBT(k, n-j, j+1, combi, ans);
            combi.remove(combi.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList();
        combiBT(k, n, 1, new ArrayList<Integer>(), ans);
        return ans;
    }
    
}