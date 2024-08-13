package com.OOP;

import java.util.Scanner;
class Stocks{
	String shareName;
	int shareQuantity,price;	
	
	Stocks(String shareName, int shareQuantity, int price) {
	        this.shareName = shareName;
	        this.shareQuantity = shareQuantity;
	        this.price = price;
	}
	int calculateStockValue() {
		return this.shareQuantity * this.price;
	}
}

public class Portfolio {
	Stocks [] stock;
	
	static int numberOfStocks;
	static Scanner sc = new Scanner(System.in);
	
	//Take input of Stocks infromation 
	void input(){
		stock = new Stocks[numberOfStocks];
		
		for (int i = 0; i < numberOfStocks; i++) {
            System.out.println("Enter the Name of Stock " + (i + 1) + ":");
            String shareName = sc.next();
            System.out.println("Enter The Number of Shares :");
            int shareQuantity = sc.nextInt();
            System.out.println("Enter the Price of Share : ");
            int price = sc.nextInt();
            stock[i] = new Stocks(shareName, shareQuantity, price);
        }
	}
	//Display Portfolio Report 
	void displayPortfolioReport() {
		int totalValue = 0;
		System.out.println("Portfolio Report : ");
		for(int i = 0; i< numberOfStocks; i++) {
			int stockValue = stock[i].calculateStockValue();
			totalValue += stockValue;
			System.out.println("Stock Name : "+stock[i].shareName+
								", Quantitiy : "+ stock[i].shareQuantity+
								", Price : "+ stock[i].price+
								", Total Value : "+ stockValue);
		}
		System.out.println("Total Portfolio Value : "+ totalValue);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter The number of Stocks : ");
		numberOfStocks = sc.nextInt();
		
		Portfolio portfolio = new Portfolio();
		portfolio.input();
		portfolio.displayPortfolioReport();
	}
}
