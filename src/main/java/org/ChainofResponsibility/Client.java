package org.ChainofResponsibility;


/**
 * 客户端
 * @author Administrator
 *
 */
public class Client {

	
	public static void main(String[] args) {
		LoanAmount loan = new LoanAmount();
		loan.setMoney(80);
		LoanAmount loan2 = new LoanAmount();
		loan2.setMoney(120);
		
		Manager manager = new Manager(100);
		Boss boss = new Boss(1000);
		
		manager.setNextHandler(boss);
		
		manager.handlerLoanAmount(loan);
		manager.handlerLoanAmount(loan2);
	}
}
