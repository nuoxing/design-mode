package org.ChainofResponsibility;

/**
 * 抽象处理类
 * @author Administrator
 *
 */
public abstract class Handler {
	
	
	private Handler nextHandler;
	
	protected float money;
	
	public Handler(float money){
		this.money = money;
	}
	
	public Handler getNextHandler() {
		return nextHandler;
	}



	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
	

	public final void handlerLoanAmount(LoanAmount loan){
		if (this.money >= loan.getMoney()){
			this.selfHandler(loan);
		}else {
			if (this.nextHandler != null){
				this.nextHandler.handlerLoanAmount(loan);
			}else{
				System.out.println("没有人处理");
			}
		}
	}
	
	
	
	public abstract  void selfHandler(LoanAmount loan);
	

}
