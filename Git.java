package com.git;

public class Git {
	private void studentname() {
		System.out.println("abi");
	}

	private void studentid() {
		System.out.println(12);
	}

	private void studentnumber() {
		System.out.println(9876543211l);
	}

	public void location(){
		Syste.out.println("chennai");
	}
      int i=10;
	intj=20;
	
	public static void main(String[] args) {
		Git s=new Git();
		s.studentname();
		s.studentid();
		s.studentnumber();
		s.location();

		List<Object> s=new ArrayList<>();
	
	   s.add("saranya");//String->0
	   s.add(12);//int-1
	   s.add('A');//char-2
	   s.add(true);//boolean-3
	   s.add(0.1);//float-4
	   s.add(9876543212l);//long-5
	   System.out.println("s Object:-"+s);
	   
	   
	 Object object = s.get(1);
	 System.out.println("get:-"+object);
	 
	 int size = s.size();
	 System.out.println("size:-"+size);
		System.out.println(i+","+i)

		
	}
}
