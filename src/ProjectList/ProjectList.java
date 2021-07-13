package ProjectList;

import java.util.Date;
import java.text.ParseException;


public class ProjectList {

    private String projectName;
    private Date date;
    private String jobClassification;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getJobClassification() {
        return jobClassification;
    }

    public void setJobClassification(String jobClassification) {
        this.jobClassification = jobClassification;
    }

    public void projectInputs(String savedName, Date savedDate, String savedClassification) throws ParseException {
        this.projectName = savedName;
        this.date = savedDate;
        this.jobClassification = savedClassification;
    }
}
