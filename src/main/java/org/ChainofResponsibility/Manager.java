package org.ChainofResponsibility;

/**
 * 经理
 * @author Administrator
 *
 */
public class Manager extends Handler{

	public Manager(float money) {
		super(money);
	}

	@Override
	public void selfHandler(LoanAmount loan) {
		System.out.println("我是经理，我能处理的金额限度为："+this.money);
		
	}

}
