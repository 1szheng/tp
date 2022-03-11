package seedu.planitarium.person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonListTest {
    @Test
    public void getNumberOfMembers_newPersonList_returnZero() {
        PersonList list = new PersonList();
        assertEquals(0, list.getNumberOfMembers());
    }
}