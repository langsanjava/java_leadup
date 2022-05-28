package com.sanliang.lead.javase;
	
	public class switch_Grammar{
	public static void main(String[]args){
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.println("欢迎使用简单计算器，可以计算+；-；*；/；%的运算");
		System.out.print("请输入第一个数字");
			int num=s.nextInt();
		System.out.print("请输入运算符");
			String operator=s.next();
		System.out.print("请输入第二个数字");
			int num2=s.nextInt();
		
		switch (operator){
			case "*":
				System.out.println(num*num2);
				break;
			case "+":
				System.out.println(num+num2);
				break;
			case "-":
				System.out.println(num-num2);
				break;
			case "/":
				System.out.println(num/num2);
				break;
			case "%":
				System.out.println(num%num2);
				break;
			default:
				System.out.println("请正确输入");
		
						}
					}	}




	/*case "%":
				System.out.println(num-[num/num2]*num2);
				
				break;*/
	
	










