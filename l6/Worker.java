public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("id:%d %s %s %d",id, firstName, lastName, salary);
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        var t = (Worker) obj;
        return id == t.id && firstName == t.firstName;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return id;
    }
}
