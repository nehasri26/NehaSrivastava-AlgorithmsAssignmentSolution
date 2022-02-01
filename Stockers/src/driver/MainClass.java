package driver;

import java.util.Scanner;
import service.StockOperations;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Accept the no of companies N, that the user wants to store records of
		System.out.println("Enter the number of companies");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] sharePrice = new double[N];
		boolean[] stockPriceStatus =  new boolean[N];
		
		for(int i =0; i<N ; i++) {
			//enter the share price(double format) of N companies
			System.out.print("Enter current stock price of the company "); 
			System.out.println(i+1);
			sharePrice[i] = sc.nextDouble();
			
			//enter a boolean value(TRUE, FALSE) of each company, to keep track of the company’s share price compared to yesterday.
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			stockPriceStatus[i] = sc.nextBoolean();			
		} 
		
		StockOperations stocksObj =  new StockOperations(sharePrice);
		
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Enter the operation that you want to perform");
		System.out.println("1. Display the companies stock prices in ascending order");
		System.out.println("2. Display the companies stock prices in descending order");
		System.out.println("3. Display the total no of companies for which stock prices rose today");
		System.out.println("4. Display the total no of companies for which stock prices declined today");
		System.out.println("5. Search a specific stock price");
		System.out.println("6. press 0 to exit");
		System.out.println("-------------------------------------------------------------------");
		
		int input = sc.nextInt();
		
		while(input !=0 ) {
			
			switch(input) {
				case 1:
					stocksObj.displayPricesInAscendingOrder(sharePrice);
					break;
				case 2:
					stocksObj.displayPricesInDescendingOrder(sharePrice);
					break;
				case 3:
					stocksObj.displayNoOfCompsWhoseStocksRose(stockPriceStatus);
					break;
				case 4:
					stocksObj.displayNoOfCompsWhoseStocksDeclined(stockPriceStatus);
					break;
				case 5:
					System.out.println("Enter the key value");
					double key =  sc.nextDouble();
					stocksObj.checkIfStockPricePresent(sharePrice,key);
					break;
				default: System.out.println("Invalid input");	
				
			}
			
			System.out.println("-------------------------------------------------------------------");
			System.out.println("Enter the operation that you want to perform");
			System.out.println("1. Display the companies stock prices in ascending order");
			System.out.println("2. Display the companies stock prices in descending order");
			System.out.println("3. Display the total no of companies for which stock prices rose today");
			System.out.println("4. Display the total no of companies for which stock prices declined today");
			System.out.println("5. Search a specific stock price");
			System.out.println("6. press 0 to exit");
			System.out.println("-------------------------------------------------------------------");
			
			input = sc.nextInt();
			
		}


	}

}
