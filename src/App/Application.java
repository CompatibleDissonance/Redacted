package App;

import ProjectList.ProjectList;
import ProjectList.ProjectListTwo;

//Imports for date
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Exception {
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
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //Streams the inputs for storage
        ProjectList projects = new ProjectList();
        projects.projectInputs(projectName, startDate, jobClassification);
        System.out.println(projectName + " " + startDate + " " + jobClassification);





        //Second input
        Scanner secondInput = new Scanner(System.in);
        System.out.println("Please fill the following form");

        //Second project name input.
        System.out.println("Project name: ");
        String secondProjectName = secondInput.nextLine();

        //Second project job classification
        System.out.println("Job classification: ");
        String secondJobClassification = secondInput.nextLine();


        //Second project start date input.
        Date secondStartDate = null;
        SimpleDateFormat secondDateInput = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.println("Project start date (dd/mm/yy): ");
            String secondDate = secondInput.next();
            if (null != secondDate && secondDate.trim().length() > 0) {
                secondStartDate = dateInput.parse(secondDate);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //second input storage
        ProjectListTwo projectsTwo = new ProjectListTwo();
        projectsTwo.projectInputsTwo(secondProjectName, secondStartDate, secondJobClassification);
        System.out.println(secondProjectName + " " + secondStartDate + " " + secondJobClassification);




        //Compares the two jobs by date.

        //Suggests which of the two jobs should be started first by date.
        //take more inputs later.

    }

}
