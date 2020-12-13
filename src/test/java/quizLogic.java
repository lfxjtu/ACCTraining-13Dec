import java.util.ArrayList;

import static java.lang.Float.max;

public class quizLogic {
    double attentiveMark;
    double nurturerMark;
    double opportunityMark;
    double excitementMark;
    double[][] quizValues = {
            {-0.02, 0.15, 0.77, 0.54},
            {0.26, 0.39, 0.76, 0.74},
            {0.90, 0.69, 0.39, 0.72},
            {0.86, 0.92, 0.51, 0.59},
            {1.88, 2.08, 1.62, 1.14},
            {0.44, 0.16, 0.32, 0.56},
            {3.49, 4.11, 3.33, 2.74},
            {3.20, 4.36, 3.84, 2.60},
    };
    public String calculateQuiz(float[] marks){


        for (int i = 0; i < 8; i ++){
            attentiveMark += quizValues[i][0]*marks[i];
            nurturerMark += quizValues[i][1]*marks[i];
            opportunityMark += quizValues[i][2]*marks[i];
            excitementMark += quizValues[i][3]*marks[i];
        }
        double maxMark = Math.max(attentiveMark, Math.max(nurturerMark,Math.max(opportunityMark,excitementMark)));

        if (maxMark == attentiveMark)
            return "Attentive mindset";
        else if (maxMark == nurturerMark)
            return "Nurturer mindset";
        else if (maxMark == opportunityMark)
            return "Opportunity mindset";
        else if (maxMark == excitementMark)
            return "Excitement mindset";
        else return null;
    }
}
