package collections_lecture;
import java.util.HashMap;

public class HashMapsAndHumans {

    public static void main(String[] args) {
        Instructor fer= new Instructor(true,true, "Fer");
        Instructor daniel= new Instructor(true, true, "Daniel");
        HashMap<Long, Instructor> payroll = new HashMap<>();
        payroll.put(12L,fer);
        payroll.put(18L,daniel);
        for(Instructor ins:payroll.values()){
            System.out.println("ins.getName() = " + ins.getName());
            System.out.println("ins.answerQuestion(\"Is this a question?\") = " + ins.answerQuestion("Is this a question?"));
        }
    }
}


