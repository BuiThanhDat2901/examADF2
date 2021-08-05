import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        while (true){
            System.out.println("1. Add new contact");
            System.out.println("2. Find a contact by name");
            System.out.println("3. Display contacts");
            System.out.println("4. Exit");
            System.out.println("Please choice 1-4");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            boolean check = false;
            switch (choice){
                case 1:
                    addressBook.addNewContact();
                    break;
                case 2:
                    addressBook.findAContactByName();
                    break;
                case 3:
                    addressBook.displayContact();
                    break;
                case 4:
                    System.out.println("bye bye");
                    check = true;
                    break;
                default:
                    System.out.println("Please choose again");
                    break;
            }
            if (check){
                break;
            }

        }
    }
}