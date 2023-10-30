public class Candidate {
    protected String ID;
    protected String name;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    protected String address;
    protected int priority;

    public Candidate(String ID, String name ,String address ,int priority){
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.priority = priority;
    }
    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
