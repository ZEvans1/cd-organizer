package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CdsTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void newCdsObjectCorrectlyCreated_true() throws Exception {
        Cds cds = new Cds("music");
        assertEquals(true, cds instanceof Cds);
    }

    @Test
    public void CdsInstatiatesWIthContent_true() throws Exception {
        Cds cds = new Cds("music");
        assertEquals("music", cds.getContent());
    }

}