package pregunta5;

import java.awt.Color;

public abstract class Processor implements PrototypeComputer{
	
	protected ProcessorType type;
    protected ProcessorFrequency frequency;
    protected float price;

	public abstract ProcessorType getType();
 
    public abstract ProcessorFrequency getFrecuency();
 
    public abstract float getPrice();
 
    @Override
    public String toString() {
        return this.type.toString() + " | " + this.frequency.toString() + " | " + this.price;
    }
}