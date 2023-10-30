public class CandidateC extends Candidate{

    private static final String Mon_Van = "Van";
    private static final String Mon_Su =  "Su";
    private static final String Mon_Dia = "Dia";

    public CandidateC(String ID, String name, String address, int priority) {
        super(ID, name, address, priority);
    }
    @Override
    public String toString() {
        return "CandidateC{" +
                "id='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority + ", Subject: " + Mon_Van + " - " + Mon_Su + " - " + Mon_Dia +
                '}';
    }
}
