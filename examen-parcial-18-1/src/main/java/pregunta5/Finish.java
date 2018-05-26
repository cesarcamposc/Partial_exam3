package pregunta5;

import java.awt.Color;

public abstract class Finish implements PrototypeComputer{
	
	protected Color color;
    protected float price;
    protected String description;

	public abstract Color getColor();
 
    public abstract float getPrice();
 
    public abstract String getDescription();
 
    @Override
    public String toString() {
    	return  this.description + " | " + this.price;
    }
}