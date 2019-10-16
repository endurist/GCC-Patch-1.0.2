package skeleton.answers;

public class Question2 {

    public static int riskAndReward(int[] risk, int[] bonus, int[] trader) {
        // array length
        int len = risk.length;
        int overallBonus = 0;
        int eachBonus = 0;
        
        for (int i = 0; i < len; i++) {
        	for (int j = 0; j < len; j++) {
        		if (trader[i] >= risk[j] && bonus[j] > eachBonus)
        			eachBonus = bonus[j];
        	}
        	overallBonus += eachBonus;
        	eachBonus = 0;
        }
        
        return overallBonus;
    }
}
