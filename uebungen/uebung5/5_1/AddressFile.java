import java.util.*;

public class AddressFile
{
    public AddressFile(String file) {
        String filename = file;
    }

    public String toLine(Address addr) throws AddressFileException {
        String output;

        output+="," + addr.getName() + "," + addr.getStreet() + "," + addr.getZipCode() + "," + addr.getCity();

        return output;
    }

    Address parseLine(String line) {
        String name, street, city;
        int zipCode;
        int id = 1;
        try {
            Scanner sc = new Scanner(line);
            sc.useDelimiter(",");

            name = sc.next();
            name.trim();
            street = sc.next();
            street.trim();
            zipCode = sc.nextInt();
            city = sc.next();
            city.trim();

            Address addr = new Address(id, name, street, zipCode, city);
          
        } catch (AddressFileException e) {
            System.out.println("\n Invalid format. \n");
        }
    }

    void save(ArrayList<Address> addresses) {
        System.out.println("Save method");      
    }

    ArrayList<Address> load() {
        System.out.println("load method");
    }
}
