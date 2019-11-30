import java.util.ArrayList;

public class Portfolio{
    ArrayList<Project> list = new ArrayList<Project>();
    public ArrayList<Project> getproject(){

        return list;
    }
    public void setproject(ArrayList<Project> list){
        this.list =list;
    }
    public Portfolio(ArrayList<Project> list){
        this.list = list;
    }
    public void addlist(ArrayList<Project> list){
        this.list.addAll(list);
    }

}