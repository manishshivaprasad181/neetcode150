class ListNode {
   int key;
   int val;

   ListNode prev;
   ListNode next;

   public ListNode(int key, int val) {
       this.key = key;
       this.val = val;
   }
}

class LRUCache {
    int capacity;
    Map<Integer, ListNode> dic;
    ListNode head;
    ListNode tail;
    

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new ListNode(-1,-1);
        tail = new ListNode(-1,-1);
        dic = new HashMap<>();
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!dic.containsKey(key))
            return -1;

        ListNode node = dic.get(key);
        remove(node);
        add(node);
        return node.val;
    }
    
    public void put(int key, int value) { 
        if(dic.containsKey(key)) {
            ListNode nodetobeDeleted = dic.get(key);
            remove(nodetobeDeleted);
        }


        ListNode node = new ListNode(key, value);
        add(node);
        dic.put(key, node);

        if(dic.size()>capacity) {
            ListNode nodetobedeleted = head.next;
             dic.remove(nodetobedeleted.key);
            remove(nodetobedeleted);
            
           
        }
    }
    public void add(ListNode node) {
        ListNode previousEnd = tail.prev;
        previousEnd.next = node;
        node.prev = previousEnd;
        node.next = tail;
        tail.prev = node;
    }
    public void remove(ListNode node) {
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
