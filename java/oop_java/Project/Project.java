public class Project{
    private String name ;
    private String description;
    private double initialcost;

    public String elevatorPitch(String name, Double initialcost, String description){
        return name + " " + initialcost + " " + description;
       

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
    public String getName(){
        return name;
    }
    public String getNameDescription(){
        return name + " " + description;
    }
    public String  projectString(){
        return  "I am pramila" ;
    }
    public Object  getnamedesCost(){
        return name + initialcost +description;
    }

}