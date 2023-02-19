package phonebook;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPhoneBook {
    @Test
    public void testAdd() {
        PhoneBook newPerson = new PhoneBook();
        newPerson.add(new Record("Tommy Shelby", "+380979839855"));
        Assert.assertEquals("Tommy Shelby", newPerson.getRecords().get(0).getName());
        Assert.assertEquals("+380979839855", newPerson.getRecords().get(0).getPhoneNumber());
    }

    @Test
    public void testFind() {
        PhoneBook newPerson = new PhoneBook();
        newPerson.add(new Record("Tommy Shelby", "+380979839855"));
        newPerson.add(new Record("Arthur Shelby", "+380972587468"));
        newPerson.add(new Record("John Shelby", "+380979874521"));
        Assert.assertEquals("+380972587468", newPerson.find("Arthur Shelby").getPhoneNumber());
    }

    @Test
    public void testFindAll() {
        PhoneBook newPerson = new PhoneBook();
        newPerson.add(new Record("Tommy Shelby", "+380979839855"));
        newPerson.add(new Record("Arthur Shelby", "+380972587468"));
        newPerson.add(new Record("Tommy Shelby", "+380976548964"));
        newPerson.add(new Record("John Shelby", "+380979874521"));
        newPerson.add(new Record("Tommy Shelby", "+380978549787"));

        Assert.assertEquals(newPerson.findAll("Tommy Shelby").get(0).getPhoneNumber(), "+380979839855");
        Assert.assertEquals(newPerson.findAll("Tommy Shelby").get(1).getPhoneNumber(), "+380976548964");
        Assert.assertEquals(newPerson.findAll("Tommy Shelby").get(2).getPhoneNumber(), "+380978549787");
    }
}
