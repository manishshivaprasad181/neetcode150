class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int num:nums)
            hm.put(num, hm.getOrDefault(num, 0)+1);

        PriorityQueue<Integer> heap = new PriorityQueue<>((n1,n2)->hm.get(n1)-hm.get(n2));

        for(int n:hm.keySet()) {
            heap.add(n);
            if(heap.size()>k)
                heap.poll();
        }

        int[] top =new int[k];
        for(int i = k-1;i>=0;i--)
            top[i] = heap.poll();

        return top;

    }
}
