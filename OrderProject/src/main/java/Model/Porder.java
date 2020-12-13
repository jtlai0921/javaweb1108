package Model;

public class Porder {
private Integer id;
private String Desk;
private Integer A;
private Integer B;
private Integer C;
private Integer Sum;
public Porder(String desk, Integer a, Integer b, Integer c) {
	super();
	Desk = desk;
	A = a;
	B = b;
	C = c;
	Sum=A*120+B*135+C*150;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getDesk() {
	return Desk;
}
public void setDesk(String desk) {
	Desk = desk;
}
public Integer getA() {
	return A;
}
public void setA(Integer a) {
	A = a;
}
public Integer getB() {
	return B;
}
public void setB(Integer b) {
	B = b;
}
public Integer getC() {
	return C;
}
public void setC(Integer c) {
	C = c;
}
public Integer getSum() {
	Sum=A*120+B*135+C*150;
	return Sum;
}
public void setSum(Integer sum) {
	Sum = sum;
}
public Porder() {
	super();
}

}
