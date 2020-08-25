package day08;

import java.util.ArrayList;
import java.util.Scanner;

/*

	계산식을 입력하면 계산의 결과를 출력해주는 프로그램을 작성하세요.
	
	예제 ) 
	
		계산식을 입력하세요 : 22 - 11
		22 - 11의 결과는 11입니다.

 */

public class Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String exp = sc.nextLine();

//		useSimpleCalculator(exp);
		useCalculator(exp);

	}

	private static void useCalculator(String exp) {

		Ex03.Calculator calc = new Ex03().new Calculator();

		ArrayList<String> expList = calc.parseExpByOperators(exp);

		System.out.println(expList);

		ArrayList<String> answer = calc.calculate(expList, 0, 0);

		System.out.println(answer);

	}

	private static void useCalculator1(String exp) {

		Ex03.Calculator calc = new Ex03().new Calculator();

		ArrayList<String> expList = calc.parseExpByOperators(exp);

		System.out.println(expList);

		for (int i = 0; i < expList.size(); i++) {
			String tempString = expList.get(i);
			if (tempString.length() >= 3 && tempString.charAt(0) >= '0' && tempString.charAt(0) <= '9') {
				ArrayList<String> tempList = calc.parseExpByOperators(tempString);
//				tempList = calc.calculate(tempList, 0);
				for (int j = 0; j < 3; j++) {
					tempList.remove(i - 1);
				}
				tempList.add(i - 1, tempList.get(0));
			}

		}
	}

	public static void useSimpleCalculator(String exp) {

		Ex03.SimpleCalculator calc = new Ex03().new SimpleCalculator();

		ArrayList<String> expList = calc.parseExp(exp);

		int result = calc.calculate(expList);

		calc.printAnswer(expList, result);

	}

	class Calculator {

		public int rep = 0;
		
		public ArrayList<String> calculate(ArrayList<String> tempList, int idx, int depth) {

			rep++;
			if (rep > 9) {
				return null;
			}
			
			if (tempList.size() == 1) {
				System.out.println(1);
				return tempList;
			}

			char tempChar1 = tempList.get(idx).charAt(0);

			if (tempChar1 == '(') {
				System.out.println(2);
				tempList.remove(idx);
				tempList = calculate(tempList, idx, ++depth);

			} else if (tempList.get(idx + 1).charAt(0) == ')') {
				System.out.println(3);
				depth--;
				tempList.remove(idx + 1);

			}

			if (tempChar1 >= '0' && tempChar1 <= '9') {
				System.out.println(3);
				if (idx + 2 <= tempList.size()) {
					System.out.println(4);
					char tempChar2 = tempList.get(idx + 1).charAt(0);

					if (tempList.get(idx + 2).charAt(0) == '(') {
						System.out.println(5);
						tempList = calculate(tempList, idx + 2, ++depth);

					}

					if (tempChar2 == '*' || tempChar2 == '/') {
						System.out.println(6);
						if (tempChar2 == '*') {
							System.out.println(7);
							tempList.add(idx,
									Integer.parseInt(tempList.get(idx)) * Integer.parseInt(tempList.get(idx + 2)) + "");

						} else if (tempChar2 == '/') {
							System.out.println(8);
							tempList.add(idx,
									Integer.parseInt(tempList.get(idx)) / Integer.parseInt(tempList.get(idx + 2)) + "");

						}
						System.out.println(9);
						for (int i = 0; i < 3; i++) {
							tempList.remove(idx + 1);
						}

					} else if (tempChar2 == '+' || tempChar2 == '-') {
						System.out.println(10);
						if (idx + 4 < tempList.size()) {
							System.out.println(11);
							
							System.out.println("idx : " + idx);
							System.out.println("size : " + tempList.size());
							char tempChar3 = tempList.get(idx + 3).charAt(0);
							
							if (tempList.get(idx + 4).charAt(0) == '(') {
								System.out.println(99);
								tempList = calculate(tempList, idx + 4, depth);
							}

							if (tempChar3 == '*' || tempChar3 == '/') {
								System.out.println(12);
								tempList = calculate(tempList, idx + 2, depth);

							}

						}
						
						System.out.println("idx : " + idx);
						System.out.println("size : " + tempList.size());

						if (tempChar2 == '+') {
							System.out.println(13);
							tempList.add(idx,
									Integer.parseInt(tempList.get(idx)) + Integer.parseInt(tempList.get(idx + 2)) + "");

						} else if (tempChar2 == '-') {
							System.out.println(14);
							tempList.add(idx,
									Integer.parseInt(tempList.get(idx)) - Integer.parseInt(tempList.get(idx + 2)) + "");

						}
						System.out.println(15);
						for (int i = 0; i < 3; i++) {
							tempList.remove(idx + 1);
						}

					} else if (tempChar2 == ')') {
						
					}
				}

			}

			System.out.println(tempList);

			return calculate(tempList, idx, depth);

		}

		public ArrayList<String> parseExpByOperators(String exp) {

			ArrayList<String> expList = new ArrayList<String>();

			String temp = "";
			for (int i = 0; i < exp.length(); i++) {

				char ch = exp.charAt(i);

				if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^' || ch == '(' || ch == ')') {
					if (!temp.trim().equals("")) {
						expList.add(temp.trim());
						temp = "";
					}
					expList.add("" + ch);
				} else if (ch >= '0' && ch <= '9') {
					temp += ch;
				}

			}

			if (!temp.trim().equals("")) {
				expList.add(temp.trim());
			}

			return expList;
		}

		public ArrayList<String> parseByParenthesis1(String exp) {

			ArrayList<String> expList = new ArrayList<String>();

			String temp = "";

			int startIdx = 0;

			for (int i = 0; i < exp.length(); i++) {

				char ch = exp.charAt(i);

				if (ch == '(' || ch == ')') {
					if (!temp.trim().equals("")) {
						expList.add(temp.trim());
						temp = "";
					}
					expList.add("" + ch);
				} else {
					temp += ch;
				}

			}

			if (!temp.trim().equals("")) {
				expList.add(temp.trim());
			}

			return expList;

		}

		public ArrayList<String> parseExpByOperators1(String exp) {

			ArrayList<String> expList = new ArrayList<String>();

			String temp = "";
			for (int i = 0; i < exp.length(); i++) {

				char ch = exp.charAt(i);

				if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^') {
					if (!temp.trim().equals("")) {
						expList.add(temp.trim());
						temp = "";
					}
					expList.add("" + ch);
				} else if (ch >= '0' && ch <= '9') {
					temp += ch;
				}

			}

			if (!temp.trim().equals("")) {
				expList.add(temp.trim());
			}

			return expList;
		}

	}

	class SimpleCalculator {

		public ArrayList<String> parseExp(String exp) {

			ArrayList<String> expList = new ArrayList<String>();

			String temp = "";
			for (int i = 0; i < exp.length(); i++) {

				char ch = exp.charAt(i);

				if (ch == '+' || ch == '-') {
					expList.add(temp.trim());
					temp = "";
					expList.add("" + ch);
				} else if (ch >= '0' && ch <= '9') {
					temp += ch;
				}

			}

			expList.add(temp.trim());

			return expList;
		}

		public void printAnswer(ArrayList<String> expList, int result) {

			for (int i = 0; i < expList.size(); i++) {
				System.out.print(expList.get(i) + " ");
			}
			System.out.println(" = " + result);

		}

		public int calculate(ArrayList<String> expList) {

			int result = Integer.parseInt(expList.get(0));

			for (int i = 2; i < expList.size(); i += 2) {

				int tmp = Integer.parseInt(expList.get(i));

				if (expList.get(i - 1).equals("+")) {
					result += tmp;
				} else if (expList.get(i).equals("+")) {
					result -= tmp;
				}

			}

			return result;
		}

	}

}
