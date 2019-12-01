public class Project{
    private String name ;
    private String description;
    private double initialcost;

    public String elevatorPitch(){
        return name + " "  + initialcost + " " + description;
       

    }
    public Project() {
       

    }

    public Project(String name) {
        this.name =name;

    }
    public Project(String name, String description) {
        this.name =name;
        this.description = description;

    }
    public Project(String name, Double initialcost, String description ){
        this.name = name;
        this.initialcost = initialcost;
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void setInitialcost(double initialcost) {
        this.initialcost = initialcost;
    }
    public double getInitialcost() {
        return initialcost;
    }


   
    

}