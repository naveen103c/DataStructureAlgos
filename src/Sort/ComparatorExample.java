package Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Project implements Comparable<Project> {

    public String getProjectName() {
        return ProjectName;
    }
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }
    public double getProjectRating() {
        return ProjectRating;
    }
    public void setProjectRating(double ProjectRating) {
        this.ProjectRating = ProjectRating;
    }
    public int getProjectYear() {
        return ProjectYear;
    }
    public void setProjectYear(int ProjectYear) {
        this.ProjectYear = ProjectYear;
    }
    private String ProjectName;
    private double ProjectRating;
    private int ProjectYear;

    public Project(String ProjectName, double ProjectRating, int ProjectYear) {
        this.ProjectName = ProjectName;
        this.ProjectRating = ProjectRating;
        this.ProjectYear = ProjectYear;
    }
    @Override
    public int compareTo(Project t) {
        return this.ProjectYear - t.ProjectYear;
    }
}
class RatingCompare implements Comparator<Project>{
    @Override
    public int compare(Project t1, Project t2) {
        if(t1.getProjectRating()<t1.getProjectRating()) return -1;
        else if(t1.getProjectRating()>t1.getProjectRating()) return 1;
        else return 0;
    }
}
class nameCompare implements Comparator<Project>{
    @Override
    public int compare(Project t1, Project t2) {
        return t1.getProjectName().compareTo(t2.getProjectName());
    }
}

public class ComparatorExample {

    public static void main(String[] args) {
        ArrayList<Project> list = new ArrayList<Project>();
        list.add(new Project("ReLAPs", 8.3, 2018));
        list.add(new Project("KAPs", 8.1, 2017));
        list.add(new Project("Visit Portal", 6.9, 2020));
        list.add(new Project("CKYC", 9.5, 2021));
        list.add(new Project("NOMS", 7.8, 2020));
        System.out.println("Sorting by Rating");
        RatingCompare rat=new RatingCompare();
        Collections.sort(list, rat);
        for(Project pr:list)
        System.out.println(pr.getProjectRating()+"  "+pr.getProjectName());
        
        System.out.println("Sorting by Name");
        nameCompare namecompare=new nameCompare();
        Collections.sort(list, namecompare);
        for(Project pr:list)
        System.out.println(pr.getProjectName()+"  "+pr.getProjectYear());
        
          System.out.println("Sorting by Year");
        Collections.sort(list);
        for(Project pr:list)
        System.out.println(pr.getProjectYear()+"  "+pr.getProjectName());
        
    }

}
