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
    public void tearDown() {
        Cds.clearAllCds();
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

    @Test
    public void AllCdsAreCorrectlyReturned_true() {
        Cds cds = new Cds("music");
        Cds otherCds = new Cds ("pair them");
        assertEquals(2, Cds.getAll().size());
    }

    @Test
    public void AllCdsAreCorrectlyCds_true() {
        Cds cds = new Cds ("music");
        Cds otherCds = new Cds ("pair them");
        assertTrue(Cds.getAll().contains(cds));
        assertTrue(Cds.getAll().contains(otherCds));
    }

}