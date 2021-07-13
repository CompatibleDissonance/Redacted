package App;

import ProjectList.ProjectList;

//Imports for date
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import ProjectList.ProjectList;

import java.util.Scanner;
public class Application {
    public static void main (String[] args) throws Exception {
        //Requests 3 user input fields be filled.
        Scanner input = new Scanner(System.in);
        System.out.println("Please fill the following form");

        //Project name input.
        System.out.println("Project name: ");
        String projectName = input.nextLine();

        //Project job classification
        System.out.println("Job classification: ");
        String jobClassification = input.nextLine();


        //Project start date input.
        Date startDate = null;
        SimpleDateFormat dateInput = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.println("Project start date (dd/mm/yy): ");
            String date = input.next();
            if (null != date && date.trim().length() > 0) {
                startDate = dateInput.parse(date);
            }
        } catch(ParseException e) {
            e.printStackTrace();
        }

        //Streams the inputs for storage
            ProjectList projects = new ProjectList();
            projects.projectInputs(projectName, startDate, jobClassification);


        //Compares the two jobs by date.
        //Suggests which of the two jobs should be started first by date.
        //take more inputs later.

    }

}
