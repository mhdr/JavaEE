import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class IndexBean implements Serializable {

    private int counter=0;
    private String message;
    private String messageVisibility="hidden";

    public String getMessageVisibility() {
        return messageVisibility;
    }

    public void setMessageVisibility(String messageVisibility) {
        this.messageVisibility = messageVisibility;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void increaseCounter()
    {
        counter++;

        if (counter>0)
        {
            this.setMessageVisibility("visible");
        }
        message = String.valueOf(counter);
    }

    @PostConstruct
    public void init()
    {
        if (counter>0)
        {
            this.setMessageVisibility("visible");
        }
    }
}
