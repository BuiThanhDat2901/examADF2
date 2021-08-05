import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
    private HashMap<String,Contact> map = new HashMap<>();

    public void addNewContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter name:");
        String name = scanner.nextLine();
        System.out.println("Please enter phone:");
        String phone = scanner.nextLine();
        Contact contact = new Contact(name, phone);
        map.put(name,contact);
    }

    public void findAContactByName(){
        System.out.println("Please enter name to search:");
        Scanner scanner = new Scanner(System.in);
        String nameSearch = scanner.nextLine();
        for (String key: map.keySet()) {
            String name = map.get(key).getName();
            if (name.equals(nameSearch)){
                System.out.printf("%10s%10s", "Contact Name", "Phone number");
                System.out.printf("%10s%10s",map.get(key).getName(), map.get(key).getPhone());
                System.out.println("\n");
            }
        }
    }

    public void displayContact(){
        for (String key: map.keySet()) {
            Contact contact = map.get(key);
            System.out.printf("%10s%10s", "Contact Name", "Phone number");
            System.out.printf("%10s%10s",map.get(key).getName(), map.get(key).getPhone());
            System.out.println("\n");
        }
    }

}
