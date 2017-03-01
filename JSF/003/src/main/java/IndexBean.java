import javax.faces.bean.*;
import java.io.Serializable;

@ManagedBean
@ViewScoped
public class IndexBean implements Serializable{

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    String message;

    public void increaseCounter()
    {
        counter++;
        message="Hello World " + counter;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    int counter=0;
}
