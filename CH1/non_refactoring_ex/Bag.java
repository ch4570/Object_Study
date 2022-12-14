package non_refactoring_ex;

/*
*       @Definition : 관람객이 소지품을 보관할 용도의 가방 클래스
* */
public class Bag {

    public Bag(long amount) {
        this(null, amount);
    }

    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public boolean hasInvitation() {
        return ticket != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

}
