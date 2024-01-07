package inputoutput;

import java.io.Serializable;
import java.util.Objects;

public class TestHouse implements Serializable {
    private String address, person;
    private int number;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestHouse testHouse = (TestHouse) o;
        return number == testHouse.number && Objects.equals(address, testHouse.address)
                && Objects.equals(person, testHouse.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, person, number);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public TestHouse(String address, String person, int number) {
        this.address = address;
        this.person = person;
        this.number = number;
    }
}