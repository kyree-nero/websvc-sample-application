package sample;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.springframework.mock.jndi.SimpleNamingContextBuilder;

import sample.configuration.JdbcJndiTestSupport;

public abstract class AbstractPersistenceIT extends AbstractBaseIT{

	protected static SimpleNamingContextBuilder context = null;
	
	@BeforeClass
	public static void beforeClass() throws Exception {
		
		context = JdbcJndiTestSupport.initializeJNDI();
		
	}
	
	@AfterClass
	public static void afterClass() throws Exception {
		
		JdbcJndiTestSupport.cleanupJNDI();
		
	}
}
