import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class libraryManager {
    private List<library> libraries = new ArrayList<>();
    private List<book> books = new ArrayList<>();
    private List<subscriber> subscribers = new ArrayList<>();
    private List<borrowing> borrowingRecords = new ArrayList<>();
    public void addLibrary(library newLibrary) {
        libraries.add(newLibrary);
    }
    public void addBook(book newBook) {
        books.add(newBook);
    }
    public void addSubcriber(subscriber newSubscriber) {
        subscribers.add(newSubscriber);
    }
    void borrowBook(int subscriberId, int contentId) {
        book newBook = findBookById(contentId);
        if (newBook != null && newBook.getCopies() > 0) {
            borrowing record = new borrowing(subscriberId, contentId, new Date());
            borrowingRecords.add(record);
            newBook.setCopies(newBook.getCopies() - 1);
            System.out.println("Book borrowed successfully.");
        }
        else {
            System.out.println("Book is not available.");
        }
    }
    private book findBookById(int BookId) {
        for (book newBook : books) {
            if (newBook.getId() == BookId) {
                return newBook;
            }
        }
        return null;
    }

    public void returnItem(int subscriberId, int contentId) {
        borrowing record = findBorrowingRecord(subscriberId, contentId);
        if (record != null && record.getReturnDate() == null) {
            Date currentDate = new Date();
            record.setReturnDate(currentDate);
            long diff = currentDate.getTime() - record.getBorrowDate().getTime();
            long daysBorrowed = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
            int maxBorrowDays = subscribers.stream().filter(s -> s.getId() == subscriberId).findFirst().get().getType().equals("golden") ? 90 : 21;
            if (daysBorrowed > maxBorrowDays) {
                double fee = (daysBorrowed - maxBorrowDays) * 1.0;
                record.setFee(fee);
                subscriber newSubscriber = subscribers.stream().filter(s -> s.getId() == subscriberId).findFirst().get();
                newSubscriber.setBalance(newSubscriber.getBalance() + fee);
            }

            System.out.println("Item returned successfully.");
        } else {
            System.out.println("No record found for this borrowing.");
        }
    }public void printOverdueReports() {
        Date currentDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Number of borrowing records: " + borrowingRecords.size());
        for (borrowing record : borrowingRecords) {
                long diff = currentDate.getTime() - record.getBorrowDate().getTime();
                long daysBorrowed = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
                int maxBorrowDays = subscribers.stream().filter(s -> s.getId() == record.getSubscriberId()).findFirst().get().getType().equals("golden") ? 90 : 21;
                System.out.println("Days borrowed: " + daysBorrowed);
                System.out.println("Max borrow days: " + maxBorrowDays);
                System.out.println("Subscriber ID: " + record.getSubscriberId() +
                        "\nContent ID: " + record.getContentId()  +
                        "\nBorrow Date: " + sdf.format(record.getBorrowDate()) +
                        "\nDays Lefts: " + (maxBorrowDays - daysBorrowed));
        }
    }


    private borrowing findBorrowingRecord(int subscriberId, int contentId) {
        for (borrowing record : borrowingRecords) {
            if (record.getSubscriberId() == subscriberId && record.getContentId() == contentId && record.getReturnDate() == null) {
                return record;
            }
        }
        return null;
    }
}
