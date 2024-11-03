class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        
        for (int i = 0; i < n; i++) {
            int h = n - i; // h is the number of papers with at least citations[i] citations
            if (citations[i] >= h) {
                return h;
            }
        }
        
        return 0;
    }
}
