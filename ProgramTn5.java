public class ProgramTn5 {
    public static void calculateAvg(String carType, double numOfMiles, double numOfGallons) {
        double avgMiles;
        avgMiles = Math.round(numOfMiles/numOfGallons);
        System.out.println( " Average miles of " + carType + avgMiles + " m/g");
    }
    public static void main (String[] args) {
        //double numOfMiles = 286;
        //double numOfGallons = 9;
        //double avgMiles;
        //avgMiles = Math.round(numOfMiles/numOfGallons);
        //System.out.println(" Average miles of Royale" + avgMiles);
        ProgramTn5 program = new ProgramTn5();
        program.calculateAvg("Royale ", 286, 9);
        program.calculateAvg(" Koopa King ", 412, 40);
        program.calculateAvg(" Pipe Frame ", 361, 18);
        program.calculateAvg(" Bad Wagon ", 161, 11);
        
    }
    
}
