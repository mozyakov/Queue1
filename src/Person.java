public class Person {
    protected String firstname;
    protected String lastname;
    protected int tickets;

    public Person(String firstname, String lastname, int tickets) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.tickets = tickets;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getTickets() {
        return tickets;
    }

    public  void spendTicket() {
        tickets --;
    };

    public boolean hasMoreTicket() {
        return tickets > 0;
    }

}
