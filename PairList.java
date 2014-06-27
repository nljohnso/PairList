import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PairList<T, S> {
	
	private ArrayList<Pair<?, ?>> list = new ArrayList<Pair<?, ?>>();
	
	public PairList() {
	}
	
	public PairList(PairList<?, ?> pList) {
		list = pList.getList();
	}
	
	public int getIndex(Pair<?, ?> aPair) {
		for(int i = 0; i < list.size(); i++) {
			if(aPair.equals(list.get(i))) {
				return i;
			}
		}
		return 0;
	}
	
	public Pair<?, ?> get(int index) {
		return list.get(index);
	}
	
	@SuppressWarnings("unchecked")
	public Pair<?, ?> set(int index, Pair<?, ?> aPair) {
		return list.set(index, (Pair<T, S>) aPair);
	}
	
	public boolean add(T t, S s) {
		Pair<T, S> aPair = new Pair<T, S>(t, s);
		return list.add(aPair);
	}
	
	@SuppressWarnings("unchecked")
	public boolean add(Pair<?, ?> aPair) {
		return list.add((Pair<T, S>) aPair);
	}
	
	public void add(int index, Pair<?, ?> aPair) {
		list.add(index, aPair);
	}
	
	public boolean addAll(Collection<? extends Pair<?, ?>> aCollection) {
		return list.addAll(aCollection);
	}
	
	public boolean addAll(int index, Collection<? extends Pair<?, ?>> aCollection) {
		return list.addAll(index, aCollection);
	}
	
	public void clear() {
		list = new ArrayList<Pair<?, ?>>();
	}
	
	public boolean contains(Object o) {
		Pair<?, ?> aPair = (Pair<?, ?>) o;
		for(int i = 0; i < list.size(); i++) {
			if(aPair.equals(list.get(i))) {
				return true;
			}
		}
		return false;
	}
	
	public void ensureCapacity(int minCapacity) {
		list.ensureCapacity(minCapacity);
	}
	
	public boolean isEmpty() {
		if(list.size() == 0) {
			return true;
		}
		return false;
	}
	
	public Iterator<Pair<?, ?>> iterator() {
		return list.iterator();
	}
	
	public ListIterator<Pair<?, ?>> listIterator() {
		return list.listIterator();
	}
	
	public ListIterator<Pair<?, ?>> listIterator(int index) {
		return list.listIterator(index);
	}
	
	public Pair<?, ?> remove(Pair<?, ?> aPair) {
		for(int i = 0; i < list.size(); i++) {
			if(aPair.equals(list.get(i))) {
				return list.remove(i);
			}
		}
		return null;
	}
	
	public Pair<?, ?> remove(int index) {
		return list.remove(index);
	}
	
	public boolean removeAll(Collection<? extends Pair<?, ?>> aCollection) {
		return list.removeAll(aCollection);
	}
	
	public int size() {
		return list.size();
	}
	
	public List<Pair<?, ?>> subList(int fromIndex, int toIndex) {
		return list.subList(fromIndex, toIndex);
	}
	
	public Object[] toArray() {
		return list.toArray();
	}
	
	public void trimToSize() {
		list.trimToSize();
	}
	
	public ArrayList<Pair<?, ?>> getList() {
		return list;
	}
	
	public void setList(ArrayList<Pair<?, ?>> aList) {
		list = aList;
	}
	
	public String toString() {
		String completeString = "";
		for(int i = 0; i < list.size(); i++) {
			if(i == list.size() - 1) {
				completeString = completeString + list.get(i).toString();
			} else {
				completeString = completeString + list.get(i).toString() + ", ";
			}
		}
		
		return completeString;
	}
}
