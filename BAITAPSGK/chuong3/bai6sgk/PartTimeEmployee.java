package bai6sgk;

public class PartTimeEmployee extends Employee{
    private int hoursPerWeek;

    public PartTimeEmployee() {
        super();
    }
    
    public PartTimeEmployee(int hoursPerWeek, String employerName, String dateHired, String name, int age, char gender) {
        super(employerName, dateHired, name, age, gender);
        this.hoursPerWeek = hoursPerWeek;
    }
    
    public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
    public String toString() {
        return super.toString() + "hoursPerWeek=" + hoursPerWeek;
    }
    
}