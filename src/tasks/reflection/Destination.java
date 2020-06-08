package tasks.reflection;

public class Destination {
    private String string;
    private int integer;
    private char character;
    private boolean bool;
    private Student student;

    public Destination(String destinationString, int destinationInt, char destinationChar, boolean bool, Student student) {
        this.string = destinationString;
        this.integer = destinationInt;
        this.character = destinationChar;
        this.bool = bool;
        this.student = student;
    }

    public Destination() {

    }

    public boolean isBool() {
        return bool;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getInteger() {
        return integer;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }
}
