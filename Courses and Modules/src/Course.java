public class Course{
    private String courseName;
    private double coursePrice;
    private Module[] numModules = new Module[20];//Array Module consisting 20 elements
    private int numberOfDays;
    private int moduleCount = 0;
    private int numberCoureseCreated = 0;

    
    //Constructor 
    public Course(String courseName, int numberOfDays, double coursePrice){
        setCourseName(courseName);
        setNumberOfDays(numberOfDays);
        setCoursePrice(coursePrice);
        getNumberCoureseCreated();
    }
    

    //Getters and setters
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public double getCoursePrice() {
        return coursePrice;
    }
    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }
    public Module[] getNumModules() {
        return numModules;
    }
    public void setNumModules(Module[] numModules) {
        this.numModules = numModules;
    }
    public int getNumberOfDays() {
        return numberOfDays;
    }
    public void setNumberOfDays(int numberOfDays) {
        if(numberOfDays >= 1 && numberOfDays <= 10){
            this.numberOfDays = numberOfDays;
        }
        else{
            System.out.println("This is course takes more that 10 days to complete");
        }
    }
    
    public int getModuleCount() {
        return moduleCount;
    }
    public void setModuleCount(int moduleCount) {
        this.moduleCount = moduleCount;
    }

    //Method to see how many courses are created
    public int getNumberCoureseCreated() {
        return numberCoureseCreated++;
    }
    public void setNumberCoureseCreated(int numberCoureseCreated) {
        this.numberCoureseCreated = numberCoureseCreated;
    }


    //Method to add modules to the array
    public void addModule(Module addModule){
        if(moduleCount < numModules.length){ 
            numModules[moduleCount] = addModule;
            moduleCount++;
        }
        else{
            System.out.println("Cannot add more modules");
        }
    }

}