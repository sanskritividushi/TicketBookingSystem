package ticket.booking.entities;

import java.sql.Date;

public class Ticket {
    
    private String ticketId;
    private String userId;;
    private String source;
    private String dest;
    private Date dateOfTravel;
    
    private Train train;
    
    public Ticket(String ticketId, String userId, String source, String dest, Date dateOfTravel, Train train) {
        this.ticketId = ticketId;
        this.userId = userId;
        this.source = source;
        this.dest = dest;
        this.dateOfTravel = dateOfTravel;
        this.train = train;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public Date getDateOfTravel() {
        return dateOfTravel;
    }

    public void setDateOfTravel(Date dateOfTravel) {
        this.dateOfTravel = dateOfTravel;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }
    
    public String getTrainInfo() {
        return train.getTrainInfo();
    }
    
    public String getTrainNo() {
        return train.getTrainNo();
    }

    public String getTicketInfo() {
        return String.format("Ticket ID: %s belongs to User ID: %s from %s to %s on %s" , ticketId, userId , source, dest, dateOfTravel);
    }
}
