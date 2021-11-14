package lopputyo.student;

public class Student {

    private long StudentID;
    private String FirstName;
    private String LastName;


    public long getStudentID() {
        return this.StudentID;
    }

    public void setStudentID(long StudentID) {
        this.StudentID = StudentID;
    }

    public String getFirstName() {
        return this.FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return this.LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    @Override
    public String toString() {
        return getFirstName() + getLastName();
    }

    
}

    
