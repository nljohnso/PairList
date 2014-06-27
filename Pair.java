
public class Pair<T, S> {
	
	private T value1 = null;
	private S value2 = null;

	public Pair(T t, S s) {
		value1 = t;
		value2 = s;
	}
	
	public void setValue1(T t) {
		value1 = t;
	}
	
	public void setValue2(S s) {
		value2 = s;
	}
	
	public T getValue1() {
		return value1;
	}
	
	public S getValue2() {
		return value2;
	}
	
	public boolean equals(Pair<?, ?> obj) {
        if(this.getValue1().equals(obj.getValue1())) {
        	if(this.getValue2().equals(obj.getValue2())) {
        		return true;
        	}
        }
        return false;
	}
	
	public String toString() {
		return "(" + value1.toString() + " : " + value2.toString() + ")";
	}

}
