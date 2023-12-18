import java.util.HashMap; //import hashMap
public class Set<T> { //Set Class
    private HashMap<T, Boolean> hmap; //have only hashMap variable

    public Set(){
        hmap = new HashMap<>();
    } //constructor

    /** give size of this set
     * return: size of this set in integer
     */
    public int size() {
        return hmap.size();
    }

    /** clear set to empty set
     * effects: change this set to empty (size = 0)
     */
    public void clear(){
        hmap.clear();
    }

    /** check if this set is empty
     * return: true if this set is empty, false if it's not
     */
    public boolean isEmpty(){
        return hmap.isEmpty();
    }

    /** check if this set contains that object
     * @param val check if this value is contained
     * return: true if it contains. otherwise, false
     */
    public boolean contains(T val) {
        return hmap.containsKey(val);
    }

    /** check if this set contains all of object in the input set
     * @param s the input set use to check
     * return: true if it contains all of the input set. otherwise, false
     */
    public boolean containsAll(Set<T> s) {
        for(T key : s.hmap.keySet()){
            if(!this.contains(key)) return false;
        }
        return true;
    }

    /** add one object into this set
     * @param val object you want to put in
     * effects: add one object into this set=
     */
    public void add(T val){
        hmap.put(val,true);
    }

    /** add all of object in input set into this set
     * @param s the set which has all of its objeccts to put in caller
     * effects: add all objects to caller set
     */
    public void addAll(Set<T> s){
        for(T key : s.hmap.keySet()){
            if(!this.contains(key)) hmap.put(key, true);
        }
    }

    /** remove one object out of this set
     * @param val object you want to remove
     * effects: remove the object if it has in this set
     */
    public void remove(T val) {
        hmap.remove(val);
    }

    /** remove all of objects in input set out of the caller set
     * @param s the set which has the objects to check for removing
     * effects: remove all of the object in the input out of the caller
     */
    public void removeAll(Set<T> s){
        for(T key : s.hmap.keySet()){
            if(this.contains(key)) hmap.remove(key);
        }
    }

    /** retain all of objects of the caller by input set
     * @param s the set which has the objects to check for retaining
     * effects: retain objects which have in the input
     */
    public void retainAll(Set<T> s){
        Set newset = new Set();
        for(T key : s.hmap.keySet()){
            if(this.contains(key)) newset.add(key);
        }
        this.clear();
        this.addAll(newset);
    }

    /** The rest are unmentioned methods
     * */
    public boolean equals(Object o){
        return true;
    }

    public int hashCode(){
        return 0;
    }

    public T[] toArray(T[] arr){
        return null;
    }

    /** I implement it additionally for looking
     * results of members in this set through the terminal
     */
    public void printSet(){
        System.out.println("Your set is : " + hmap.keySet());
    }
}
