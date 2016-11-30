import java.util.*;

public class AddressFileLabelled extends AddressFile 
{

    public AddressFileLabelled (String filename) {
        super (filename);
    }

    public String toLine(Address addr) /*throws AddressFileException */ {
        String output = "";
        
        output += "id: " + addr.getId() + "; name: " + addr.getName() + "; street: " + addr.getStreet() + "; zip: " + addr.getZipCode() + "; city: " + addr.getCity();

        return output;
    }

    public Address parseLine (String line) throws  AddressFileException {
        String name, street, city;
        String[] label = {"id", "name", "street", "zip", "city"};
        Address addr;
        int zipCode;
        int id;

        try {
            Scanner sc = new Scanner(line);

            sc.findInLine(label[0] + "[\\s]*:[\\s]*([^;]*)");
            id = Integer.parseInt(sc.match().group(1).trim());

            sc.findInLine(label[1] + "[\\s]*:[\\s]*([^;]*)");
            name = sc.match().group(1).trim();

            sc.findInLine(label[2] + "[\\s]*:[\\s]*([^;]*)");
            street = sc.match().group(1).trim();

            sc.findInLine(label[3] + "[\\s]*:[\\s]*([^;]*)");
            zipCode = Integer.parseInt(sc.match().group(1).trim());

            sc.findInLine(label[4] + "[\\s]*:[\\s]*([^;]*)");
            city = sc.match().group(1).trim();

            addr = new Address (id, name, street, zipCode, city);

        } catch (Exception e) {
            throw new AddressFileException("Invalid File");
        }
        return addr;


    }

}
