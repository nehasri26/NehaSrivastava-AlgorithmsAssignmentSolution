package service;

public class StockOperations {
	
	public StockOperations(double[] stockPrices) {
		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		mergeSortImplementation.sort(stockPrices,0,stockPrices.length-1);
		
	}
	
	public void displayPricesInAscendingOrder(double[] stockPrices) {
		System.out.println("Stock prices in ascending order are :");
		for(int i=stockPrices.length-1; i>=0; i--) {
			System.out.print(stockPrices[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
	
	public void displayPricesInDescendingOrder(double[] stockPrices) {
		System.out.println("Stock prices in descending order are :");
		
		for(int i=0; i< stockPrices.length; i++) {
			System.out.print(stockPrices[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
	
	public void displayNoOfCompsWhoseStocksRose(boolean[] stockPriceStatus) {
		int count =0;
		for(int i=0; i<stockPriceStatus.length ; i++) {
			if(stockPriceStatus[i] == true)
				count++;
		}
		System.out.print("Total no of companies whose stock price rose today : ");
		System.out.println(count);
	}
	
	public void displayNoOfCompsWhoseStocksDeclined(boolean[] stockPriceStatus) {
		int count =0;
		for(int i=0; i<stockPriceStatus.length ; i++) {
			if(stockPriceStatus[i] == false)
				count++;
		}
		System.out.print("Total no of companies whose stock price declined today : ");
		System.out.println(count);
	}
	
	public void checkIfStockPricePresent(double[] stockPrices, double key) {
		
		int l = 0;
		int r = stockPrices.length - 1;
		int mid = l + (r - l) / 2;
		while (l <= r) 
		{
			
			if (key > stockPrices[mid]) 
			{
				r = mid - 1;
			}		
			else if (key < stockPrices[mid]) 
			{
				l = mid + 1;
			} 
			else 
			{
				System.out.print("Stock of value ");
				System.out.print(key);
				System.out.println(" is present");
				break;
			}
			mid = l + (r - l) / 2;
		}
		if (l > r) 
		{
			System.out.println("Value not found");
		}
	}
	
}
