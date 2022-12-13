import java.util.Scanner;

class main {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter the course that you want to select: ");
        String usercourseName = userInput.next();

        Course courses = new Course(usercourseName, 5, 2000.0);
        Module module = new Module("Frontend Developement", 10, "Assignment");
        Module module2 = new Module("Backend Developement", 15, "Assignment");
        courses.addModule(module);
        courses.addModule(module2);
        System.out.println(courses.getCourseName() + " is the coures you are entrolled in");
        for(int i = 0; i < courses.getModuleCount(); i++){
            System.out.println(
                "Module Name: "+ courses.getNumModules()[i].getModuleName() + '\t' + " Module Number: " + courses.getNumModules()[i].getCreditPoints() +
                '\t' + "Assessments: " + courses.getNumModules()[i].getAssessment()

            );

        }
        System.out.println("Courses Created: " + courses.getNumberCoureseCreated());


    }

}
