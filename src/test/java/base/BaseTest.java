package base;
import config.Configuration;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected RequestSpecification requestSpec;
    protected Configuration config;

    @BeforeClass
    public void setup() {
        config = ConfigFactory.create(Configuration.class);
        requestSpec = new RequestSpecBuilder()
                .setBaseUri(config.baseUrl())
                .addHeader("x-api-key","reqres-free-v1")
                .setContentType("application/json")
                .build();
    }
}

