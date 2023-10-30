public class CandidateB extends  Candidate{
    private static  final String   Mon_Toan = "Toan";
    private static final String Mon_Hoa = "Hoa";
    private static final String Mon_Sinh = "Sinh";

    public CandidateB(String ID, String name, String address, int priority) {
        super(ID, name, address, priority);
    }
    @Override
    public String toString(){
        return "CandidateB{" +
                "id='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority + ", Subject: " + Mon_Toan + " - " + Mon_Sinh + " - " + Mon_Hoa +
                '}';
    }
}
