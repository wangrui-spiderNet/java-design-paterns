package com.wr.designpaterns.abstractfactory;

public class ComputerSupply {

	static ComputerProducer ibmproducer,macProducer;
	static Cpu ibmCpu,macCpu;
	static Ram ibmRam,macRam;
	
	public static void main(String[] args) {
		ibmproducer=new IBMProducer();
		macProducer=new MACProducer();
		
		ibmCpu=ibmproducer.creatCpu();
		ibmRam=ibmproducer.creatRam();
		macCpu=macProducer.creatCpu();
		macRam=macProducer.creatRam();
		
		ibmCpu.operate();
		ibmRam.action();
		macCpu.operate();
		macRam.action();
	}
}
