class MyHashSet {
    private Bucket[] bucketarray;
    private int keyrange;
    public MyHashSet() {
        this.keyrange=769;
        bucketarray=new Bucket[this.keyrange];
        for(int i=0;i<this.keyrange;i++)
        this.bucketarray[i]=new Bucket();

    }
    public int _hash(int key)
    {
        return(key%this.keyrange);
    }
    public void add(int key) {
        int bucketindex=this._hash(key);
        this.bucketarray[bucketindex].insert(key);
    }
    
    public void remove(int key) {
        int bucketindex=this._hash(key);
        this.bucketarray[bucketindex].delete(key);
    }
    
    public boolean contains(int key) {
        int bucketindex=this._hash(key);
        return this.bucketarray[bucketindex].exists(key);
    }
}
class Bucket
{
    private LinkedList<Integer> container;
    public Bucket()
    {
        container=new LinkedList<Integer>();
    }
    public void insert(Integer key)
    {
        int index=this.container.indexOf(key);
        if(index==-1)
        this.container.addFirst(key);
    }
    public void delete(Integer key)
    {
        this.container.remove(key);
    }
    public boolean exists(Integer key)
    {
        int index=this.container.indexOf(key);
        return (index!=-1);
    }
}
/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
