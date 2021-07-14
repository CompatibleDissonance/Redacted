package ProjectList;

import java.text.ParseException;
import java.util.Date;


public class ProjectListTwo {

    private String secondProjectName;
    private Date secondDate;
    private String secondJobClassification;



    public void projectInputsTwo(String savedNameTwo, Date savedDateTwo, String savedClassificationTwo) throws ParseException {
        this.secondProjectName = savedNameTwo;
        this.secondDate = savedDateTwo;
        this.secondJobClassification = savedClassificationTwo;
    }

    public String getSecondProjectName() {
        return secondProjectName;
    }

    public void setSecondProjectName(String secondProjectName) {
        this.secondProjectName = secondProjectName;
    }

    public Date getSecondDate() {
        return secondDate;
    }

    public void setSecondDate(Date secondDate) {
        this.secondDate = secondDate;
    }

    public String getSecondJobClassification() {
        return secondJobClassification;
    }

    public void setSecondJobClassification(String secondJobClassification) {
        this.secondJobClassification = secondJobClassification;
    }
}
