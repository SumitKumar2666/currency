	import java.text.NumberFormat;


	public class Money {
/*By Sumit Kumar*/
		
		public static void main(String[] args) {

			NumberFormat money = NumberFormat.getCurrencyInstance();

			NumberFormat percent = NumberFormat.getPercentInstance();

			
			double initialValue, total, interestRate;

			initialValue = 5000;

			interestRate = .20;			

			total = initialValue + initialValue*interestRate;

	
			System.out.println(money.format(total));

		}

	}