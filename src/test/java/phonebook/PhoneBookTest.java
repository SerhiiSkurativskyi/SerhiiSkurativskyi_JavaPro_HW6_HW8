package phonebook;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook newPerson = new PhoneBook();
        newPerson.add(new Record("Tommy Shelby", "+380979839855"));
        assertEquals("Tommy Shelby", newPerson.getRecords().get(0).getName());
        assertEquals("+380979839855", newPerson.getRecords().get(0).getPhoneNumber());
    }

    @Test
    public void testFind() {
        PhoneBook newPerson = new PhoneBook();
        newPerson.add(new Record("Tommy Shelby", "+380979839855"));
        newPerson.add(new Record("Arthur Shelby", "+380972587468"));
        newPerson.add(new Record("John Shelby", "+380979874521"));
        assertEquals("+380972587468", newPerson.find("Arthur Shelby").getPhoneNumber());
    }

    @Test
    public void testFindAll() {
        PhoneBook newPerson = new PhoneBook();
        newPerson.add(new Record("Tommy Shelby", "+380979839855"));
        newPerson.add(new Record("Arthur Shelby", "+380972587468"));
        newPerson.add(new Record("Tommy Shelby", "+380976548964"));
        newPerson.add(new Record("John Shelby", "+380979874521"));
        newPerson.add(new Record("Tommy Shelby", "+380978549787"));

        assertEquals("+380979839855", newPerson.findAll("Tommy Shelby").get(0).getPhoneNumber());
        assertEquals("+380976548964", newPerson.findAll("Tommy Shelby").get(1).getPhoneNumber());
        assertEquals("+380978549787", newPerson.findAll("Tommy Shelby").get(2).getPhoneNumber());
    }
}