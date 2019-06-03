package org.ChainofResponsibility;

/**
 * 老板
 * @author Administrator
 *
 */
public class Boss extends Handler{

	public Boss(float money) {
		super(money);
	}

	@Override
	public void selfHandler(LoanAmount loan) {
		System.out.println("我是老板，我能处理的金额限度为："+this.money);
		
	}

}
