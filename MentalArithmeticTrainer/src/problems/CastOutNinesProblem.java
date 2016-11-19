package problems;

import java.util.Random;



//generates random problem 
//checks if user solved it correctly
//encapsulates link to help resources (how to solve such problems) 
// https://en.wikipedia.org/wiki/Mental_calculation#Casting_out_nines
public class CastOutNinesProblem {

	//problem can be of 4 types, all solved with same method though
	enum ProblemVariant {
		SUM_PROBLEM, SUBTRACTION_PROBLEM,
		MULTIPLY_PROBLEM, DIVIDE_PROBLEM;  
		
		private static Random randomGen = new Random();
		private static ProblemVariant[] EnumAsArray = values();
		private static int thisEnumSize = EnumAsArray.length;
		
		
		public static ProblemVariant getRandom() {
			return (EnumAsArray[randomGen.nextInt(thisEnumSize)]);
		}
	}
	
	//link to webpage describing IN DETAIL kind of problem, how to solve it, ETC
	public static final String problemDescriptionWebLink = "https://en.wikipedia.org/wiki/Mental_calculation#Casting_out_nines";
	
	//BRIEF description HOW TO SOLVE
	//name of respective file in project resource folder
	public static final String problemHowToSolveDescr = "CastOutNines_Description.htm";
	
	//EXAMPLE OF SOLUTION
	//name of respective file in project resource folder
	public static final String problemSolutionExample = "CastOutNines_Example.png";
	
	
	
//	returns String of one of the following   
//	231 + 673 = 904
//	34 * 89 = 3026
//	507 - 89 = 399 
//	89234 / 16 = 5572
//  rightmost result might be correct or wrong randomly
//	incorrect result is very close to correct one
//	magnitude of left operands is configurable
	public String generateProblem() {
		//TODO magnitude of left operands is configurable	

	 	
		
		//		
//		generateSumProblem
//		generateSubtactionProblem
//		generateMultiplyProblem
//		generateDivideProblem
		
		return null;
	}
	
	
	//TODO delete this main used only for test purpose
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(ProblemVariant.getRandom().name());
		}
	}
	
	
}
