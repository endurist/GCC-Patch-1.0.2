package skeleton.answers;

public class Question1 {

    public static double calculateTotalPayment(double initialLevelOfDebt, double interestPercentage, double repaymentPercentage) {
        double totalPayment = 0;
        double deposite = initialLevelOfDebt * 0.1;
        
        // monthly repayment, this should be a minimum of $50
        double monthlyRepayment = initialLevelOfDebt * repaymentPercentage / 100.0;
        // make sure the minimum repayment is 50
        if (monthlyRepayment < 50)
        	monthlyRepayment = 50;
        
        int numOfMonth = 0;
        
        double currentDebt = initialLevelOfDebt;
        double currentInterest = initialLevelOfDebt * interestPercentage / 100.0;
        while (currentDebt > 50) {
        	currentDebt = currentDebt + currentInterest - monthlyRepayment;
        	currentInterest = currentDebt * interestPercentage / 100.0;
        	numOfMonth++;
        }
        totalPayment = numOfMonth * monthlyRepayment + currentDebt + deposite;
        double fraction = totalPayment % 1;
        totalPayment -= fraction;
        
        return totalPayment;
    }

}
