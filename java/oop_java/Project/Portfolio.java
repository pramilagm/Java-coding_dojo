import java.util.ArrayList;

public class Portfolio extends Project{
    ArrayList<Project> projects = new ArrayList<Project>();
    public Portfolio(){

    }
    public Portfolio(ArrayList<Project> projects){
        this.projects = projects;
    }
   
   
    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }
    public double getPortfoliocost(){
        double result =0.0;
        for(int i =0;i<projects.size();i++){
            result += projects.get(i).getInitialcost();

        }
        return result;
    }
    public void showPortfoliocost(){

        for(int i =0;i<projects.size();i++){
            System.out.println(projects.get(i).getInitialcost());

        }
        System.out.println("Total cost" + getPortfoliocost());
    }
    public void addProjects(Project project){
        projects.add(project);
    }

    

}