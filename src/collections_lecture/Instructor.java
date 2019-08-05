package collections_lecture;

public class Instructor extends Human implements Tasks{
    //passing
    private boolean job;
    private double experience;

    public Instructor(boolean speak, boolean logic, String name) {
        super(speak, logic, name);

    }

    public boolean isJob() {
        return job;
    }

    public void setJob(boolean job) {
        this.job = job;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperiense(double experience) {
        this.experience = experience;
    }



    //when you implement
    @Override
    public String[] teach() {
        return new String[0];// will give answer it later.
    }

    @Override
    public String answerQuestion(String question) {
        return null;//will give answer later on
    }


}
