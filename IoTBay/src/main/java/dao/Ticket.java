/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author kingsleybyrne
 */
public class Ticket {
    private int ticketId;
    private String ticketDescription;
    private boolean ticketStatus;

    /**
     * @return the ticketId
     */
    public int getTicketId() {
        return ticketId;
    }

    /**
     * @param ticketId the ticketId to set
     */
    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    /**
     * @return the ticketDescription
     */
    public String getTicketDescription() {
        return ticketDescription;
    }

    /**
     * @param ticketDescription the ticketDescription to set
     */
    public void setTicketDescription(String ticketDescription) {
        this.ticketDescription = ticketDescription;
    }

    /**
     * @return the ticketStatus
     */
    public boolean isTicketStatus() {
        return ticketStatus;
    }

    /**
     * @param ticketStatus the ticketStatus to set
     */
    public void setTicketStatus(boolean ticketStatus) {
        this.ticketStatus = ticketStatus;
    }
}
