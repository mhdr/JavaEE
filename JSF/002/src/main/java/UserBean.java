import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean()
@SessionScoped
public class UserBean {

    private int counter=0;

    public String getOutputMessage() {
        return outputMessage;
    }

    public void setOutputMessage(String outputMessage) {
        this.outputMessage = outputMessage;
    }

    private String outputMessage;

    public void helloWorld()
    {
        counter++;
        this.outputMessage="Hello World " + counter;
    }
}
