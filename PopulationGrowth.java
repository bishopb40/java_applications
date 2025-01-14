import java.text.NumberFormat;

public class PopulationGrowth {
    public static void main(String[] args) {
        double currentPopulation = 8000000000.0; 
        double growthRate = 0.01; 

        NumberFormat formatter = NumberFormat.getInstance();
        formatter.setGroupingUsed(true);

        System.out.println("Year\tPopulation\tIncrease");
        System.out.println("----\t---------\t-------");

        for (int year = 1; year <= 75; year++) {
            double populationIncrease = currentPopulation * growthRate;
            currentPopulation += populationIncrease;

            System.out.println(year + "\t" + formatter.format(currentPopulation) + "\t" + formatter.format(populationIncrease));

            if (year == 1 && currentPopulation > 2 * 8000000000.0) {
                System.out.println("Population would double in the first year.");
            }
        }
    }
}