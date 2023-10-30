public class CandidateA extends  Candidate{
    private static final String Mon_Toan = "Toan";
    private static final String Mon_Ly  = "Ly";
    private static final String Mon_Hoa = "Hoa";


    public CandidateA(String ID, String name, String address, int priority) {
        super(ID, name, address, priority);
    }


    @Override
    public String toString() {
        return "CandidateA{" +
                "id='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority + ", Subject: " + Mon_Toan + " - " + Mon_Ly + " - " + Mon_Hoa +
                '}';
    }
}
