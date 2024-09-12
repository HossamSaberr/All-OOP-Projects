import java.util.Date;
import java.time.LocalDate;
public class borrowing {
    private int subscriberId;
    private int contentId;
    private Date borrowDate;
    private Date returnDate;
    private double fee;
    public borrowing(int subscriberId) {
        this.subscriberId = subscriberId;
        this.fee = 0.0;
    }
    public borrowing(int subscriberId, int contentId) {
        this.subscriberId = subscriberId;
        this.contentId = contentId;
        this.fee = 0.0;
    }
    public borrowing(int subscriberId, int contentId, Date borrowDate) {
        this.subscriberId = subscriberId;
        this.contentId = contentId;
        this.borrowDate = borrowDate;
        this.fee = 0.0;
    }
    public borrowing(int subscriberId, int contentId, Date borrowDate , Date returnDate) {
        this.subscriberId = subscriberId;
        this.contentId = contentId;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.fee = 0.0;
    }
    public borrowing(int subscriberId, int contentId, Date borrowDate , Date returnDate , int fee) {
        this.subscriberId = subscriberId;
        this.contentId = contentId;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.fee = fee;
    }

    public int getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(int subscriberId) {
        this.subscriberId = subscriberId;
    }

    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
