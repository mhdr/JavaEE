import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class GreetingResource {

    @GET
    @Path("hello")
    @Produces(MediaType.APPLICATION_JSON)
    public Person hello(String name,int age)
    {
        Person person=new Person();
        person.name=name;
        person.age=age;
        return person;
    }
}
