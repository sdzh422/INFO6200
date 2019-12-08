package API;

import edu.neu.csye6200.Person;

public abstract class AbstractEmployeeAPI extends Person{
	public Double wage;
	public abstract Double getWage();
	public abstract void setWage(Double wage);
}
