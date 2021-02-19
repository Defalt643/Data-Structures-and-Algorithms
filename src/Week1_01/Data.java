package Week1_01;
public class Data<T> {
	T first ;
	T second;
	public Data(T first,T second) {
		this.first=first;
		this.second=second;
	}public T getFirst() {
		return first;
	}public T getSecond() {
		return second;
	}
}
