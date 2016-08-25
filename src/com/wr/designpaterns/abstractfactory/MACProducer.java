package com.wr.designpaterns.abstractfactory;

public class MACProducer implements ComputerProducer {

	@Override
	public Cpu creatCpu() {
		// TODO Auto-generated method stub
		return new MACCpu();
	}

	@Override
	public Ram creatRam() {
		// TODO Auto-generated method stub
		return new MACRam();
	}

}
