package packCodeWars;

public class Money {
	
	/*Mr. Scrooge has a sum of money 'P' that wants to invest, 
	 * and he wants to know how many years 'Y' this sum has to be kept 
	 * in the bank in order for this sum of money to amount to 'D'.

	The sum is kept for 'Y' years in the bank where interest 'I' 
	is paid yearly, and the new sum is re-invested yearly after paying tax 'T'

	Note that the principal is not taxed but only the year's accrued interest
	 */
	
	  public static int calculateYears(double principal, double interest,  double tax, double desired) {
		    // your code
		  int years = 0;
		  double money = principal;
		  while(money<desired){
			double beneficio = money * interest;
			double impuestos = beneficio * tax;
			  money += beneficio;
			  money -= impuestos;
			  years++;
		  }
		  
		  return years;
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Money money = new Money();
System.out.println(money.calculateYears(1000, 0.05, 0.18, 1100));
		
	}

}
