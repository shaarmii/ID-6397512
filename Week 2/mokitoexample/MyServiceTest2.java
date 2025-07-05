package mokitoexample;

import static org.mockito.Mockito.*;
import org.junit.Test;

public class MyServiceTest2 {
 
    @Test
    public void testVerifyInteraction() {
        // Step 1: Create a mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Pass the mock into the service
        MyService service = new MyService(mockApi);

        // Step 3: Call a method
        service.fetchData();

        // Step 4: Verify that mockApi.getData() was called
        verify(mockApi).getData();
    }
}
