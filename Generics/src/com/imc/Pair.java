package com.imc;

public class Pair<K,V> {
	private K Key ;
	private V Value;
	public Pair(K Key, V Value) {
		this.Key=Key;
		this.Value=Value;	
	}
	public K getKey() {
		return Key;
	}
	public void setKey(K key) {
		Key = key;
	}
	public V getValue() {
		return Value;
	}
	public void setValue(V value) {
		Value = value;
	}
	public static void main(String[] args) {
		Pair<Integer , String> p1 = new Pair<Integer, String>(1,"Mahesh Chary");
		Pair<Integer, String>p2 = new Pair<Integer, String>(2,"Mahi");
		Boolean same = Util.compare(p1, p2);
		System.out.println(same);
		System.out.println(p1.getKey()+" "+p1.getValue());
		System.out.println(p2.getKey()+" "+p2.getValue());
		
	}
}
