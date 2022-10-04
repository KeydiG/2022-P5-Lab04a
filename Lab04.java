public class Lab04 {

    public static void main (String[] args)
    {
        System.out.println("Lab04a, Student version\n");

        double Principal = 250000;
        double annualRate = 4.85;
        double numYears = 30;
        double monthlyRate = (annualRate/100) /12;
        double numMonths = numYears * 12;

        double numerator = monthlyRate * Math.pow(1+monthlyRate, numMonths);
        double denominator = Math.pow(1+monthlyRate,numMonths)-1;

        double monthlyPayment = (numerator/denominator) * Principal;

        double totalPayments = (monthlyPayment * numMonths);

        double totalInterest = (totalPayments - Principal);



        System.out.println("Principal:\t\t\t$" + Principal);
        System.out.println("Annual Rate:\t\t" + annualRate);
        System.out.println("Number of Years:\t" + numYears);
        System.out.println("Monthly Payment:\t$" + monthlyPayment);
        System.out.println("Total Payments:\t\t$" + totalPayments);
        System.out.println("Total Interest:\t\t$" + totalInterest);



    }
}
