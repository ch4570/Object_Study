package refactoring_ex;

import refactoring_ex.Audience;

/*
*       @Definition : 판매원을 구현한 클래스
* */
public class TicketSeller {

    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        ticketOffice.sellTicketTo(audience);
    }
}
