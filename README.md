# Rest Assured Practice
Test HTTP request such as GET, PUT, POST, DELETE, PATCH and HEAD, using Rest Assured.
If you're using Maven, add the following entry to your pom.xml :

    <dependency>
            <groupId>io.rest-assured</groupId>
            <artifactId>rest-assured</artifactId>
            <version>3.0.2</version>
     </dependency>

Once you have the import of REST Assured set up, add the following static imports to your test class:

    import static io.restassured.RestAssured.*;
    import static org.hamcrest.Matchers.*;
    
and you're ready to create your first REST Assured test.