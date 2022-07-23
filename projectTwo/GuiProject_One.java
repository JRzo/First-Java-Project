package projectTwo;

import java.util.*;
import java.util.Scanner;

public class GuiProject_One {

	Boolean surjectiveFunctionCheck(String codomain, String Range) {

		if (codomain.contains(Range)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);
		GuiProject_One gpo = new GuiProject_One();

		System.out.println("What are the domain: example --> a,b,c,d,e ");
		String xValues = input.next();

		System.out.println("What are the Co-domain: example --> a,b,c,d,e   ");
		String coDomainValues = input.next();
		System.out.println("What is the range: example --> a,b,c,d,e  ");
		String rangeValues = input.next();

		Boolean surjectiveN = gpo.surjectiveFunctionCheck(coDomainValues, rangeValues);

		System.out.printf("This function is %s ", (surjectiveN));
	}

}
