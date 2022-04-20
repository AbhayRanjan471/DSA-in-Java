package HashMap_Implementation;

import java.util.ArrayList;

public class Map<K , V> { // <keys , value>

	ArrayList<MapNode<K, V>> buckets; // ArrayList will have the address of head
	int size;  // size is basically the no. of entries that we have put into the Map
	int numBuckets;
	public Map() {
		numBuckets = 5;
		buckets = new ArrayList<>();
		//initially adding null inside the bucket
		for (int i = 0; i < numBuckets; i++) {
			buckets.add(null);
		}
	}
	// this function will get the key
	private int getBucketIndex(K key) {
		//first we will find the hashCode then we will compress it and return
		int hashCode = key.hashCode();//// there is already a function .hashCode();
         // A hash function converts the key into an integer, which acts as the index for storing the key in the array.

		//	    Now we will pass this value through the compression
		//		function, which will convert that value within the range of our bucket array’s size.
		return hashCode % numBuckets;
	}
	
	public int size() {
		return size;
	}
	
	public V removeKey(K key) {
		int bucketIndex = getBucketIndex(key);
		MapNode<K, V> head = buckets.get(bucketIndex);
		MapNode<K, V> prev = null;
		while (head != null) {
			if (head.key.equals(key)) {
				size--;
				if (prev == null) {
					buckets.set(bucketIndex, head.next);
				} else {
					prev.next = head.next;
				}
				return head.value;
			}
			prev = head;
			head = head.next;
		}
		return null;
	}
	
	public V getValue(K key) {
		int bucketIndex = getBucketIndex(key);// through this we have got the index
		MapNode<K, V> head = buckets.get(bucketIndex);// using this we have got the head
		//now we will traverse over the LinkedList and check for the key if it is present then we will return its value else we will return null
		while (head != null) {
			if (head.key.equals(key)) {
				return head.value;
			}
			head = head.next;
		}
		return null;
	}

	public double loadFactor() {
		return (1.0 * size)/numBuckets;
	}
	
	private void rehash() {
		System.out.println("Rehashing: buckets" + numBuckets + " size " + size);
		ArrayList<MapNode<K, V>> temp = buckets;
		buckets = new ArrayList<>();
		for (int i = 0; i < 2*numBuckets; i++) { // now the size has become double
			buckets.add(null);
		}
		size = 0;
		numBuckets *= 2;
		for (int i = 0; i < temp.size(); i++) {
			MapNode<K, V> head = temp.get(i);
			while (head != null) {
				K key = head.key;
				V value = head.value;
				insert(key, value);
				head = head.next;
			}
		}
	}

	public void insert(K key, V value) {
		int bucketIndex = getBucketIndex(key);
		MapNode<K, V> head = buckets.get(bucketIndex);// here we have got the head
		// now we will traverse over the LinkedList
		while (head != null) {
//			while traversing over the LinkedList if we get the same key then we will update its value
			if (head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		// if we don't get the key then we will create a new Node and insert it
		head = buckets.get(bucketIndex);
		MapNode<K, V> newElementNode = new MapNode<K, V>(key , value);
		size++;
		newElementNode.next = head; // updated the head
		buckets.set(bucketIndex, newElementNode);
		double loadFactor = (1.0*size)/numBuckets;
		if (loadFactor > 0.7) {
			rehash();
		}
	}
}
// in java we cannot use Array an a generic so we are using an ArrayList
//every entry of a Bucket Array is going to store a linked List
//we will take an ArrayList and treat it as an Array
//each entry of ArrayList will have the head of the LinkedList
