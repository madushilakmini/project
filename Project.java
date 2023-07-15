abstract class LibraryItem {
    private String title;
    private String itemID;
    private boolean checkedOut;

    public LibraryItem(String title, String itemID) {
        this.title = title;
        this.itemID = itemID;
        this.checkedOut = false;
    }

    public void checkOut() {
        checkedOut = true;
    }

    public void checkIn() {
        checkedOut = false;
    }

    public void displayItemDetails() {
        System.out.println("Title: " + title);
        System.out.println("Item ID: " + itemID);
    }
}

class Book extends LibraryItem {
    private String author;
    private int numPages;

    public Book(String title, String itemID, String author, int numPages) {
        super(title, itemID);
        this.author = author;
        this.numPages = numPages;
    }
}

class Magazine extends LibraryItem {
    private String issueDate;
    private String publisher;

    public Magazine(String title, String itemID, String issueDate, String publisher) {
        super(title, itemID);
        this.issueDate = issueDate;
        this.publisher = publisher;
    }
}

class LibraryMember {
    private String memberID;
    private String name;

    public LibraryMember(String memberID, String name) {
        this.memberID = memberID;
        this.name = name;
    }

    public void displayMemberDetails() {
        System.out.println("Member ID: " + memberID);
        System.out.println("Name: " + name);
    }
}

 class  Project{
    public static void main(String[] args) {
        Book book1 = new Book("The Catcher in the Rye", "B001", "J.D. Salinger", 240);
        Book book2 = new Book("To Kill a Mockingbird", "B002", "Harper Lee", 281);
        Book book3 = new Book("1984", "B003", "George Orwell", 328);
        Book book4 = new Book("Pride and Prejudice", "B004", "Jane Austen", 432);
        Book book5 = new Book("The Hobbit", "B005", "J.R.R. Tolkien", 320);

        Magazine magazine1 = new Magazine("National Geographic", "M001", "August 2023", "National Geographic Society");
        Magazine magazine2 = new Magazine("Time", "M002", "September 2023", "Time USA, LLC");
        Magazine magazine3 = new Magazine("Forbes", "M003", "June 2023", "Forbes Media");
        Magazine magazine4 = new Magazine("Vogue", "M004", "July 2023", "Condé Nast");
        Magazine magazine5 = new Magazine("Sports Illustrated", "M005", "July 2023", "Maven Coalition");

        LibraryMember member1 = new LibraryMember("L001", "John Doe");
        LibraryMember member2 = new LibraryMember("L002", "Jane Smith");
        LibraryMember member3 = new LibraryMember("L003", "David Johnson");
        LibraryMember member4 = new LibraryMember("L004", "Sarah Williams");
        LibraryMember member5 = new LibraryMember("L005", "Michael Brown");
		
        book1.checkOut();
        book1.checkIn();

        System.out.println("Books:");
        LibraryItem[] books = { book1, book2, book3, book4, book5 };
        for (LibraryItem item : books) {
            item.displayItemDetails();
            System.out.println();
        }

        System.out.println("Magazines:");
        LibraryItem[] magazines = { magazine1, magazine2, magazine3, magazine4, magazine5 };
        for (LibraryItem item : magazines) {
            item.displayItemDetails();
            System.out.println();
        }

        System.out.println("Library Members:");
        LibraryMember[] members = { member1, member2, member3, member4, member5 };
        for (LibraryMember member : members) {
            member.displayMemberDetails();
            System.out.println();
        }
    }
}
