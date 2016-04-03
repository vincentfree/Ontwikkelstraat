package nl.atos.ontwikkelstraat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by nerom on 31-3-2016.
 */
public class OntwikkelstraatApplicationTest {

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void mainApplication() {
        OntwikkelstraatApplication application = new OntwikkelstraatApplication();
        assertNotNull(application);

    }
}
