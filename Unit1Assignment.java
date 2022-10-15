import java.util.Scanner;

public class Unit1Assignment {

	static Scanner in = new Scanner(System.in);

	static int score = 0;

	public static void main(String[] args) {
		runGame();
		int n = 1000;
		while(n > 0) {
			playAgain();
			n--;
		}

	}

	public static void playAgain() {
		System.out.println("Do you want to play again?");
		System.out.println("(Enter y for yes and n for no)");
		String q = in.nextLine();
		if(q.equalsIgnoreCase("y")) {
			System.out.println("Okay! Have fun!");
			runGame();
		} else if(q.equalsIgnoreCase("n")) {
			System.out.println("Okay! Thanks for playing!");
		}
	}

	public static void runGame() {
		intro();
		space();
		q1();
		space();
		q2();
		space();
		q3();
		space();
		q4();
		space();
		q5();
		space();
		q6();
		space();
		q7();
		space();
		q8();
		space();
		q9();
		space();
		q10();
		space();
		q11();
		space();
		q12();
		space();
		q13();
		space();
		q14();
		space();
		q15();
		space();
		endScore();
	}

	public static void intro() {
		System.out.println("Welcome to the quiz of Clone Wars general information! (Hit enter to continue)");
		in.nextLine();
		System.out.println("There are two kinds of questions in this quiz:");
		System.out.println("multiple choice and short answer. (Hit enter to continue)");
		in.nextLine();
		System.out.println("For multiple choice questions, your answer will only be registered");
		System.out.println("if you enter the choice letter of what you think is the correct answer,");
		System.out.println("so if you think it's choice b, then just input the letter b.");
		System.out.println("(Hit enter to begin)");
		in.nextLine();
	}

	public static void q1() {
		System.out.println("Question 1: What was the name of the clone trooper that lost his grip");
		System.out.println("while scaling the walls of the Citadel and fell into an electromine?");
		System.out.println("a) Longshot");
		System.out.println("b) Kix");
		System.out.println("c) Charger");
		System.out.println("d) Crosspiece");

		String m = in.nextLine();

		if(m.equals("a")) {
			System.out.println("Sorry, wrong answer! Next question!");
		} else if(m.equals("b")) {
			System.out.println("Sorry, wrong answer! Next question!");
		} else if(m.equals("c")) {
			System.out.println("Congratulations! That's correct!");
			score = score+1;
		} else if(m.equals("d")) {
			System.out.println("Sorry, wrong answer! Next question!");
		}
		space();
		System.out.println("Your current score is "+score);
		System.out.println("(Hit enter to continue)");
		in.nextLine();
	}

	public static void q2() {
		System.out.println("Question 2: What was the name of Darth Maul's");
		System.out.println("first apprentice who was enhanced by the Nightsisters?");
		System.out.println("a) Osi Sobeck");
		System.out.println("b) Savage Opress");
		System.out.println("c) Asajj Ventress");
		System.out.println("d) Darth Plagueis");
		space();

		String m = in.nextLine();

		if(m.equals("a")) {
			System.out.println("Sorry, wrong answer! Next question!");
		} else if(m.equals("b")) {
			System.out.println("Congratulations! That's correct!");
			score = score+1;
		} else if(m.equals("c")) {
			System.out.println("Sorry, wrong answer! Next question!");
		} else if(m.equals("d")) {
			System.out.println("Sorry, wrong answer! Next question!");
		}
		space();
		System.out.println("Your current score is "+score);
		System.out.println("(Hit enter to continue)");
		in.nextLine();
	}

	public static void q3() {
		System.out.println("Question 3: What was the name of the bounty hunter");
		System.out.println("that Obi-Wan Kenobi disguised himself as to infiltrate");
		System.out.println("the Separatist kidnapping plot?");
		System.out.println("a) Cad Bane");
		System.out.println("b) Boba Fett");
		System.out.println("c) Embo");
		System.out.println("d) Rako Hardeen");
		space();

		String m = in.nextLine();

		if(m.equals("a")) {
			System.out.println("Sorry, wrong answer! Next question!");
		} else if(m.equals("b")) {
			System.out.println("Sorry, wrong answer! Next question!");
		} else if(m.equals("c")) {
			System.out.println("Sorry, wrong answer! Next question!");
		} else if(m.equals("d")) {
			System.out.println("Congratulations! That's correct!");
			score = score+1;
		}
		space();
		System.out.println("Your current score is "+score);
		System.out.println("(Hit enter to continue)");
		in.nextLine();

	}

	public static void q4() {
		System.out.println("Question 4: What Jedi Master was killed by his");
		System.out.println("clone troopers during the Umbaran Campaign after");
		System.out.println("betraying the Republic?");
		System.out.println("a) Pong Krell");
		System.out.println("b) Adi Gallia");
		System.out.println("c) Depa Billaba");
		System.out.println("d) Agen Kolar");
		space();

		char m = in.next().charAt(0);

		if(m == ('a')) {
			System.out.println("Congratulations! That's correct!");
			score = score+1;
		} else if(m == ('b')) {
			System.out.println("Sorry, wrong answer! Next question!");
		} else if(m == ('c')) {
			System.out.println("Sorry, wrong answer! Next question!");
		} else if(m == ('d')) {
			System.out.println("Sorry, wrong answer! Next question!");
		}  
		space();
		System.out.println("Your current score is "+score);
		System.out.println("(Hit enter to continue)");
		in.nextLine();

	}

	public static void q5() {
		System.out.println("Question 5: Which droid in D-Squad was the only");
		System.out.println("member of the team to perish during a mission?");
		System.out.println("a) QT-KT");
		System.out.println("b) M5-BZ");
		System.out.println("c) R4-P17");
		System.out.println("d) AZ-3");
		space();

		String m = in.nextLine();

		if(m.equals("a")) {
			System.out.println("Sorry, wrong answer! Next question!");
		} else if(m.equals("b")) {
			System.out.println("Congratulations! That's correct!");
			score = score+1;
		} else if(m.equals("c")) {
			System.out.println("Sorry, wrong answer! Next question!");
		} else if(m.equals("d")) {
			System.out.println("Sorry, wrong answer! Next question!");
		}
		space();
		System.out.println("Your current score is "+score);
		System.out.println("(Hit enter to continue)");
		in.nextLine();

	}

	public static void q6() {
		System.out.println("Question 6: How long was the longest episode");
		System.out.println("in the entire TV show in minutes? (When answering ");
		System.out.println("this question just input the number)");
		space();

		int m = in.nextInt();

		if(m != 25) {
			System.out.println("Sorry, wrong answer! Next question!");
		} else {
			System.out.println("Congratulations! That's correct!");
			score = score + 1;
		}
		space();
		System.out.println("Your current score is "+score);
		System.out.println("(Hit enter to continue)");
		in.nextLine();
	}

	public static void q7() {
		System.out.println("Question 7: What planet is Hondo Ohnaka's");
		System.out.println("Stronghold located on?");
		space();

		String m = in.nextLine();

		if(m.equalsIgnoreCase("Florrum")) {
			System.out.println("Congratulations! That's correct!");
			score = score+1;
		} else {
			System.out.println("Sorry, wrong answer! Next question!");
		}
		space();
		System.out.println("Your current score is "+score);
		System.out.println("(Hit enter to continue)");
		in.nextLine();

	}

	public static void q8() {
		System.out.println("Question 8: What is the official");
		System.out.println("language of the planet Ryloth?");
		space();
		
		String m = in.nextLine();

		if(m.equalsIgnoreCase("Twi'leki")) {
			System.out.println("Congratulations! That's correct!");
			score = score+1;
		} else if(m.equalsIgnoreCase("Twileki")) {
			System.out.println("Congratulations! That's correct!");
			score = score+1;
		} else {
			System.out.println("Sorry, wrong answer! Next question!");
		}
		space();
		System.out.println("Your current score is "+score);
		System.out.println("(Hit enter to continue)");
		in.nextLine();

	}

	public static void q9() {
		System.out.println("Question 9: Name the Twi'lek child");
		System.out.println("who 'sidetracked' Boil and Waxer on");
		System.out.println("a patrol during the liberation of Ryloth.");
		space();
		
		String m = in.nextLine();

		if(m.equalsIgnoreCase("Numa")) {
			System.out.println("Congratulations! That's correct!");
			score = score+1;
		} else {
			System.out.println("Sorry, wrong answer! Next question!");
		}
		space();
		System.out.println("Your current score is "+score);
		System.out.println("(Hit enter to continue)");
		in.nextLine();

	}

	public static void q10() {
		System.out.println("Question 10: Who was the clone commander who led the 212th");
		System.out.println("Battalion alongside Jedi General Obi-Wan Kenobi?");
		space();
		
		String m = in.nextLine();

		if(m.equalsIgnoreCase("Commander Cody") || m.equalsIgnoreCase("Clone Marshal Commander Cody") 
				|| m.equalsIgnoreCase("Clone Marshal Commander CC-2224") || m.equalsIgnoreCase("Commander CC-2224")
				|| m.equalsIgnoreCase("CC-2224") || m.equalsIgnoreCase("Cody")) {
			System.out.println("Congratulations! That's correct!");
			score = score+1;
		} else {
			System.out.println("Sorry, wrong answer! Next question!");
		}
		space();
		System.out.println("Your current score is "+score);
		System.out.println("(Hit enter to continue)");
		in.nextLine();

	}

	public static void q11() {
		System.out.println("Question 11: What planet were all the clones of Jango Fett");
		System.out.println("born, raised, and trained on?");
		space();
		
		String m = in.nextLine();

		if(m.equalsIgnoreCase("Kamino")) {
			System.out.println("Congratulations! That's correct!");
			score = score+1;
		} else {
			System.out.println("Sorry, wrong answer! Next question!");
		}
		space();
		System.out.println("Your current score is "+score);
		System.out.println("(Hit enter to continue)");
		in.nextLine();

	}

	public static void q12() {
		System.out.println("Question 12: What was the name of General Grievous'");
		System.out.println("Subjugator-class heavy cruiser that boasted two");
		System.out.println("mega-ion cannons on either side of it?");
		space();
		
		String m = in.nextLine();

		if(m.equalsIgnoreCase("Malevolence") || m.equalsIgnoreCase("the Malevolence")) {
			System.out.println("Congratulations! That's correct!");
			score = score+1;
		} else {
			System.out.println("Sorry, wrong answer! Next question!");
		}
		space();
		System.out.println("Your current score is "+score);
		System.out.println("(Hit enter to continue)");
		in.nextLine();

	}

	public static void q13() {
		System.out.println("Question 13: Who was the Jedi Master who");
		System.out.println("personally oversaw the production of clones");
		System.out.println("on the planet Kamino?");
		space();
		
		String m = in.nextLine();

		if(m.equalsIgnoreCase("Shaak Ti") || m.equalsIgnoreCase("Master Shaak Ti")
				|| m.equalsIgnoreCase("Jedi Master Shaak Ti")) {
			System.out.println("Congratulations! That's correct!");
			score = score+1;
		} else {
			System.out.println("Sorry, wrong answer! Next question!");
		}
		space();
		System.out.println("Your current score is "+score);
		System.out.println("(Hit enter to continue)");
		in.nextLine();
		
	}
	
	public static void q14() {
		System.out.println("Question 14: What was the name of the lightsaber");
		System.out.println("wielded by Pre Vizsla during the Clone Wars?");
		space();
		
		String m = in.nextLine();
		
		if(m.equalsIgnoreCase("Darksaber") || m.equalsIgnoreCase("the Darksaber")) {
			System.out.println("Congratulations! That's correct!");
			score = score+1;
		} else {
			System.out.println("Sorry, wrong answer! Next question!");
		}
		space();
		System.out.println("Your current score is "+score);
		System.out.println("(Hit enter to continue)");
		in.nextLine();
	}
	
	public static void q15() {
		System.out.println("Question 15: What was the name of the order");
		System.out.println("issued by Chancellor Palpatine to the clones");
		System.out.println("that decisively ended the Clone Wars?");
		space();
		
		String m = in.nextLine();
		
		if(m.equalsIgnoreCase("Order 66")) {
			System.out.println("Congratulations! That's correct!");
			score = score+1;
		} else {
			System.out.println("Sorry, wrong answer!");
		}
		space();
		System.out.println("(Hit enter to continue)");
		in.nextLine();
	}


	public static void endScore() {
		System.out.println("You completed the quiz! Here are your results!");
		System.out.println("(Hit enter to continue)");
		in.nextLine();
		System.out.println("Your score was "+score+"!");
		System.out.println("(Hit enter to continue)");
		in.nextLine();
		if(score == 15) {
			System.out.println("Perfect score! The Force is strong with this one!");
		} else if(score < 15) {
			System.out.println("Ooohhh, nice try. Better luck next time!");
		}	
	}

	public static void space() {
		System.out.println();
		System.out.println();
	}



}