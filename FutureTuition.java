public class FutureTuition {

    public static void main(String[] args) {
    
    double fee = 10000.0;
    
    double percentage = 5;
    
    double fourYearsOfTuition = 0.0;
    
    for(int year = 1; year <= 10; year++) {
    
    fee = fee + (fee * percentage)/100;
    
    }
    
    System.out.println("Tuition in ten years is "+fee);
    
    for(int year = 11; year <= 14; year++) {
    
    fee = fee + (fee * percentage)/100;
    
    fourYearsOfTuition = fourYearsOfTuition + fee;
    
    }
    
    System.out.println("The four-year tuition in ten years is "+(fourYearsOfTuition));
    
    }
    
    }
