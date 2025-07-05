package mokitoexample;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {
	@Test
    public void testExternalApi() {
        // Mock the ExternalApi
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub the method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Inject mock into service
        MyService service = new MyService(mockApi);

        // Call method and check result
        String result = service.fetchData();
        assertEquals("Mock Data", result);
    }
	
}
