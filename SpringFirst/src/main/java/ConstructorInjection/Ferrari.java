package ConstructorInjection;

public class Ferrari implements Car{
	
	int modelNo;
	float price;
	Engine e;
	public void setE(Engine e) {
		this.e = e;
	}
@Override
public void startEngine() {
	System.out.println("Starting Ferrari");
}
public Ferrari(int modelNo, float price) {
	super();
	this.modelNo = modelNo;
	this.price = price;
}
public int getModelNo() {
	return modelNo;
}
public float getPrice() {
	System.out.println(" the milage of engine is"+ e.getMilage());
	return price;
}


	
}
