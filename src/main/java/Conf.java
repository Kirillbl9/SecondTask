import com.google.inject.*;
import com.google.inject.matcher.Matchers;

public class Conf extends AbstractModule {

   @Override
   protected void configure() {
       bind(EnterMethod.class).to(WaiterImpl.class);
       MethodCall methodCall = new MethodCall();
       bindInterceptor(Matchers.any(), Matchers.annotatedWith(MethodCallLogging.class), methodCall);
   }
}