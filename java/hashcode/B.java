package com.hashcode;

public class B extends A{
int k;

public B(int i, int k) {
	super(i);
	this.k = k;
}
@Override
public boolean equals(Object ob){
	return super.equals(ob)&&this.k == ((B)ob).k;
}
@Override
public int hashCode(){
	return super.hashCode()+this.k;
}
}