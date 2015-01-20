/**
 * 
 */
package my;

/**
 * @author Siddharth
 * Period 4
 * Program 1.11
 * Program calculates the population and displays the result as a floored double
 */
public class Program1_11 {
	/**
	 * Description: calculates the number of births per year 
	 * Input: takes the birth rate as input 
	 * Return: returns the number of births per year as a double
	 */
	public static double getNumberOfBirthsPerYear(double birthRate) {
		double NumberOfBirthsPerYear = birthRate * 365 * 24 * 60 * 60; 
		return NumberOfBirthsPerYear;
	}
	/**
	 * Description: calculates the number of deaths per year
	 * Input: takes the death rate as input
	 * Return: returns the number of deaths per year as a double
	 */
	public static double getNumberOfDeathsPerYear(double deathRate) {
		double NumberOfDeathsPerYear = deathRate * 365 * 24 * 60 * 60;
		return NumberOfDeathsPerYear;
	}
	/**
	 * Description: calculates the number of immigrants per year
	 * Input: takes the immigrant rate as input
	 * Return: returns the number of immigrants per year as a double
	 */
	public static double getNumberOfImmigrantsPerYear(double immigrantRate) {
		double NumberOfImmigrantsPerYear = immigrantRate * 365 * 24 * 60 * 60;
		return NumberOfImmigrantsPerYear;
	}
	/**
	 * Description: calculates the population after one year
	 * Input: takes the start population, the number of births per year,the number of immigrants per year as input.
	 * Return: returns the population after one year as a double
	 * @param startPopulation
	 * @param NumberOfBirthsPerYear
	 * @param NumberOfDeathsPerYear
	 * @param NumberOfImmigrantsPerYear
	 * @return populationAfterOneYear
	 */
	
	public static double getPopulationAfterOneYear(double startPopulation,
			double NumberOfBirthsPerYear,
			double NumberOfDeathsPerYear,
			double NumberOfImmigrantsPerYear) {
		  	double populationAfterOneYear = startPopulation + NumberOfBirthsPerYear - NumberOfDeathsPerYear + NumberOfImmigrantsPerYear;
		  	return populationAfterOneYear;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startPopulation = 312032486;
		double birthRate = 1.0/7.0;
		double deathRate = 1.0/13.0;
		double immigrantRate = 1.0/45.0;
		long newPop = startPopulation;
		for(int i = 0; i < 5; i = i + 1 ) {
			newPop = Math.round(getPopulationAfterOneYear(newPop,
					 getNumberOfBirthsPerYear(birthRate), 
					 getNumberOfDeathsPerYear(deathRate), 
					 getNumberOfImmigrantsPerYear(immigrantRate)));
			System.out.format("%d%n", newPop);
		}

	}

}
