package nl.atos.ontwikkelstraat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by nerom on 31-3-2016.
 */
public class OntwikkelstraatApplicationTest {

    OntwikkelstraatApplication application;
    @Before
    public void setUp() {
        application = new OntwikkelstraatApplication();
    }

    @After
    public void tearDown() {
        application = null;
    }

    @Test
    public void mainApplication() {

        assertNotNull(application);

    }
}
