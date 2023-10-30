import java.util.Scanner;

public class Main {
    public static Candidate createCandidate(Scanner sc  , String cate){
        System.out.print("Enter ID: ");
        String ID  = sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter address");
        String address  = sc.nextLine();
        System.out.print("Enter priority: ");
        int priority = sc.nextInt();
        sc.nextLine();
        if (cate.equals("a")) {
            return new CandidateA(ID, name,address,priority);
        } else if (cate.equals("b")) {
            return new CandidateB(ID, name,address,priority);
        } else {
            return new CandidateC(ID, name,address,priority);
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       ManagerCandidate  managerCandidate = new ManagerCandidate();
       while(true){
           System.out.println("Application Manager Candidate");
           System.out.println("Enter 1: To insert candidate");
           System.out.println("Enter 2: To show information of candidate");
           System.out.println("Enter 3: TO search candidate by id");
           System.out.println("Enter 4: To Exit");
           String line =  sc.nextLine();
           switch (line){
               case "1":{
                   System.out.println("Enter a: to insert Candidate A");
                   System.out.println("Enter b: to insert Candidate B");
                   System.out.println("Enter c: to insert Candidate C");
                   String type  = sc.nextLine();
                   switch (type){
                       case "a":
                           managerCandidate.addCandidate(createCandidate(sc,"a"));
                           break;
                       case "b":
                           managerCandidate.addCandidate(createCandidate(sc,"b"));
                           break;
                       case "c":
                           managerCandidate.addCandidate(createCandidate(sc,"c"));
                           break;
                       default:
                           System.out.println("Invalid");
                   }
               }
               case "2":
                   managerCandidate.showInfor();
                   break;
               case "3":
                   System.out.print("Enter ID: ");
                   String id  = sc.nextLine();
                   Candidate candidate  = managerCandidate.searchByID(id);
                   if (candidate == null) {
                       System.out.println("Not found");
                   } else {
                       System.out.println(candidate.toString());
                   }
                   break;
               case "4":
                   return;
               default:
                   System.out.println("Invalid");
                   continue;


           }
       }

    }
}