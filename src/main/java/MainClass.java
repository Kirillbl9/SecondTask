import com.google.inject.Guice;
import com.google.inject.Injector;
import com.sun.istack.internal.NotNull;

public final class MainClass {

    public static void main(@NotNull String[] args) {
        Injector injector = Guice.createInjector(new Conf());
        Waiter editor = injector.getInstance(Waiter.class);
        editor.makeSpellCheck();
    }
}




