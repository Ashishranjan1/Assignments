
abstract class P1 {
	private int empid;
	private String empname;
    
	abstract double getSalary();
	abstract void setSalary(double incInterest);
	
	public int GetEmpId() {
		return empid;
	}

	public String GetEmpname() {
		return empname;
	}

	public P1(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}

}

class SalariedEmployee extends P1
{
	private double weeklyRate;
	private int numberOfHoursWeek;
	
	public SalariedEmployee(int empid, String empname, double weeklyRate, int numberOfHoursWeek) {
		super(empid, empname);
		this.weeklyRate = weeklyRate;
		this.numberOfHoursWeek = numberOfHoursWeek;
	}
	
	public double getWeeklyRate() {
		return weeklyRate;
	}
	public void setWeeklyRate(double weeklyRate) {
		this.weeklyRate = weeklyRate;
	}
	
	public double getSalary() {
		return weeklyRate * numberOfHoursWeek;
	}
	public void setSalary(double incInterest)
	{ 
		this.weeklyRate +=this.weeklyRate*incInterest/100;
		
	}
	
}
class HourlyEmployee extends P1
{
	
	private double hourlyRate;
	private int numberOfHoursWeek;
	
	public HourlyEmployee(int empid, String empname, double hourlyRate, int numberOfHoursWeek) {
		super(empid, empname);
		this.hourlyRate = hourlyRate;
		this.numberOfHoursWeek = numberOfHoursWeek;
	}
	public double getSalary() {
		return hourlyRate*numberOfHoursWeek;
	}
	public void setSalary(double incInterest)
	{
		this.hourlyRate +=this.hourlyRate*incInterest/100;
		
	}
	
}
class CommissionEmployee extends P1
{
	private double percentageOfSales;
	private int weeklySale;
	
	public CommissionEmployee(int empid, String empname, double percentageOfSales, int weeklySale) {
		super(empid, empname);
		this.percentageOfSales = percentageOfSales;
		this.weeklySale = weeklySale;
	}
	public double getSalary() {
		return percentageOfSales*weeklySale;
	}
	public void setSalary(double percentageOfSales)
	{
		this.weeklySale=(int)(this.weeklySale*percentageOfSales/100);
		
	}
	public double getPercentageOfSales() {
		return percentageOfSales;
	}
	public void setPercentageOfSales(double percentageOfSales) {
		this.percentageOfSales = percentageOfSales;
	}
	
}