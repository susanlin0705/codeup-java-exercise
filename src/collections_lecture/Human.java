package collections_lecture;

public class Human {
    private boolean speak;
    private boolean logic;
    private String name;

    public Human(boolean speak, boolean logic, String name) {
        this.speak = speak;
        this.logic = logic;
        this.name= name;
    }

    public boolean isSpeak() {
        return speak;
    }

    public boolean isLogic() {
        return logic;
    }

    public void setSpeak(boolean speak) {
        this.speak = speak;
    }

    public void setLogic(boolean logic) {
        this.logic = logic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
