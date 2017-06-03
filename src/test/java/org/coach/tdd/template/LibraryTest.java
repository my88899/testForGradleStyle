package org.coach.tdd.template;

import static org.junit.Assert.*;



import org.junit.Test;

public class LibraryTest {
    @Test
    public void shouldSomeLibraryMethodReturnTrue() {

        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
    @Test
    public void testReadyForTestString(){
        Library classUnderTest = new Library();
        assertEquals(classUnderTest.sometoString(3), "Bizz");
    }
    @Test
    public void testReadyForTestSingleNumberRight(){
        Library classUnderTest = new Library();
        assertEquals(classUnderTest.sometoString(3),"Bizz");
        assertEquals(classUnderTest.sometoString(5),"Pizz");
        assertEquals(classUnderTest.sometoString(30),"BizzPizz");
    }
}
