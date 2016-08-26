package unit.com.github.gyntools.rest;

import com.github.gyntools.rest.exceptions.api.RestException;
import com.github.gyntools.rest.handler.RestExceptionMapper;
import com.github.gyntools.test.AbstractBaseUnitTest;
import org.jboss.logging.Logger;
import org.jboss.resteasy.core.Dispatcher;
import org.jboss.resteasy.mock.MockDispatcherFactory;
import org.jboss.resteasy.mock.MockHttpRequest;
import org.jboss.resteasy.mock.MockHttpResponse;
import org.jboss.resteasy.plugins.server.resourcefactory.POJOResourceFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.ws.rs.ext.ExceptionMapper;

import static org.testng.Assert.*;

import java.net.URISyntaxException;

/**
 * Created by rafael on 8/26/16.
 */
public class ClientExceptionTest extends AbstractBaseUnitTest{

    Dispatcher dispatcher;
    POJOResourceFactory resource;
    MockHttpRequest request;
    MockHttpResponse response;
    Logger logger = Logger.getLogger(this.getClass());

    @BeforeClass
    public void setupClass(){
        dispatcher = MockDispatcherFactory.createDispatcher();
        resource = new POJOResourceFactory(DummyEndpoint.class);
        dispatcher.getProviderFactory().registerProvider(RestExceptionMapper.class);
        dispatcher.getRegistry().addResourceFactory(resource);
    }

    @BeforeMethod
    public void setupMethod() throws URISyntaxException {
        response = new MockHttpResponse();
    }

    @Test(dataProvider = "arrayStatus")
    public void shouldRespondAsExpected(String endpoint, int expectedStatusCode) throws URISyntaxException {
        request = MockHttpRequest.get(endpoint);
        dispatcher.invoke(request,response);
        assertEquals(response.getStatus(),expectedStatusCode);
        logger.infof("Got %s response status code",response.getStatus());
    }

    @DataProvider(name="arrayStatus")
    private Object[][] arrayStatus(){
        return new Object[][]{
            new Object[]{"/dummies/400",400},
            new Object[]{"/dummies/401f",401},
            new Object[]{"/dummies/401r",401},
            new Object[]{"/dummies/403",403},
            new Object[]{"/dummies/404",404},
            new Object[]{"/dummies/405",405},
            new Object[]{"/dummies/500",500},
            new Object[]{"/dummies/501",501},
        };
    }


}
