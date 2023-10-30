import java.util.ArrayList;
import java.util.List;

public class ManagerCandidate {
    private List<Candidate> candidate  ;
    public ManagerCandidate(){
        this.candidate = new ArrayList<>();
    }
    public void addCandidate (Candidate candidate){
        this.candidate.add(candidate);
    }
    public void showInfor(){
        this.candidate.forEach(o-> System.out.println(o.toString()));
    }
    public Candidate searchByID(String id){
        return this.candidate.stream().filter(o -> o.getID().equals(id)).findFirst().orElse(null);
    }
}
