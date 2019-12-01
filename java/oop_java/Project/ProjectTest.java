import java.util.ArrayList;
import java.util.Arrays;

public class ProjectTest{
    public static void main(String[] args) {
        Project project1 = new Project();
        Project project2 = new Project("Project1");
        Project project3 = new Project("Project2","This is a project3 description");
        System.out.println(project1.elevatorPitch());
        System.out.println(project2.elevatorPitch());
        System.out.println(project3.elevatorPitch());
        project1.setInitialcost(2000);
        project2.setInitialcost(1000);
        project3.setInitialcost(3000);
        Portfolio portfolio1 = new Portfolio();
        portfolio1.addProjects(project1);
        portfolio1.addProjects(project2);
        portfolio1.addProjects(project3);
        portfolio1.showPortfoliocost();





    }
}