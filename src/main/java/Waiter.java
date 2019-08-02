import javax.inject.Inject;
import lombok.Data;
@Data
public class Waiter {
    private EnterMethod enterMethod;

    @Inject
    public Waiter(EnterMethod enterMethod) {
        this.enterMethod = enterMethod;
    }
    @MethodCallLogging
    public void makeSpellCheck() {
        enterMethod.waitForInput();
    }
}
