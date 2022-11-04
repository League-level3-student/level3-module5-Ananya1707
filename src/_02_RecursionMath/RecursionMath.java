package _02_RecursionMath;

public class RecursionMath {
	static int answer = 0;
	static int answer2 = 1;


    public static int recursiveMultiplication(int number, int times) {
        // If times is 1 
    	if(times == 1) {
            // Return number
    		return number;

    	}

        // Else return number + recursiveMultiplication(number, times-1)
    	else {
    		return number + recursiveMultiplication(number, times-1);
    	}

    }

    // Try this one on your own! 
    // Hint: if numberToDivideBy is bigger than number,
    //       you can't divide anymore
    public static int recursiveDivision(int number, int numberToDivideBy) {
    	if(numberToDivideBy > number) {
    		int finalAnswer = answer;
    		answer = 0;
    		return finalAnswer;
    	}
    	else {
    		number = number - numberToDivideBy;
    		answer++;
    		return recursiveDivision(number, numberToDivideBy);
    	}
        
    }

    // Try this one on your own!
    public static int recursivePower(int number, int power) {
    	if(power == 0) {
    		System.out.println();
    		int finalAnswer = answer2;
    		answer2 = 1;
    		return finalAnswer;
    	}
    	else {
    		answer2 = answer2*number;
    		power--;
    		return recursivePower(number, power);
    	}

    }
}
