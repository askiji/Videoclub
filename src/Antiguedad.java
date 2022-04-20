
public enum Antiguedad {
NOVEDAD(3,1),
SEMINOVEDAD(2,2),
ANTIGUAS(1,4);

private int a , b;

Antiguedad(int a, int b) {
	this.a=a;
	this.b=b;
}
public int coste() {
	return a;
}
public int dias() {
	return b;
}

}
