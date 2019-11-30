import java.util.ArrayList;
import java.util.Arrays;

public class ProjectTest{
    public static void main(String[] args) {
        Project play = new Project();
        String getplay = play.elevatorPitch("CHAR", 89.00, "JDKDK");
        Project sing = new Project("sing");
        Project dance  = new Project("Go dance","move your body move your body");
        String getsing = sing.getName();
        String getnamedes = dance.getNameDescription();
        System.out.println(getplay);
        System.out.println(getsing);
        System.out.println(getnamedes);
        Portfolio list = new Portfolio(new ArrayList<Project>(Arrays.asList(new Project())));
        ArrayList getlist = list.getproject();
        
        list.addlist(new ArrayList<Project>(Arrays.asList(new Project())));

        System.out.println(getlist);
    }
}