import java.util.*;
import java.io.*;

public class AddressFile
{
    private String filename;

    public AddressFile(String file) {
        this.filename = file;
    }

    public String toLine(Address addr) throws AddressFileException {
        String output = "";

        output+= addr.getId() + ", " + addr.getName() + ", " + addr.getStreet() + ", " + addr.getZipCode() + ", " + addr.getCity();

        return output;
    }

    Address parseLine(String line) throws AddressFileException {
        String name, street, city;
        Address addr;
        int zipCode;
        int id;

        try {
            Scanner sc = new Scanner(line);
            sc.useDelimiter(",");

            id = Integer.parseInt(sc.next().trim());

            name = sc.next();
            name.trim();

            street = sc.next();
            street.trim();

            zipCode = Integer.parseInt(sc.next().trim());

            city = sc.next();
            city.trim();

            addr = new Address (id, name, street, zipCode, city);

        } catch (Exception e) {
            throw new AddressFileException("Invalid File");
        }  
        return addr;

    }

    void save(ArrayList<Address> addresses) throws IOException {
        PrintWriter file = new PrintWriter(
                new BufferedWriter(new FileWriter(this.filename)));

        for ( Address a : addresses) {
            try {
                file.println(this.toLine(a));
            } catch (AddressFileException e) {
                System.out.println("Invalid format");
            }
        }

        file.close();
    }

    ArrayList<Address> load() throws AddressFileException {
        String line;
        ArrayList<Address> list = new ArrayList<Address>();
        try {
            Scanner fileScan = new Scanner(new File(this.filename));
            while (fileScan.hasNextLine()) {
                line = fileScan.nextLine();
                list.add(this.parseLine(line));
            }
        } catch ( FileNotFoundException e ) {
            System.out.println("File not found");
        }

        return list;
    }
}
