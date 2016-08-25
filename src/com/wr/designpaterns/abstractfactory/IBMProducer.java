package com.wr.designpaterns.abstractfactory;

public class IBMProducer implements ComputerProducer {

	@Override
	public Cpu creatCpu() {
		// TODO Auto-generated method stub
		return new IBMCpu();
	}

	@Override
	public Ram creatRam() {
		// TODO Auto-generated method stub
		return new IBMRam();
	}

}
