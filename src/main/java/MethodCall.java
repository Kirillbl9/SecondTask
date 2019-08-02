import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class MethodCall implements MethodInterceptor {
    @Nullable
    @Override

    public Object invoke(@NotNull MethodInvocation invocation) throws Throwable {
        System.out.println("3-fold input:");

        if (Counter.score%3 == 0)
            System.out.println("3-fold input:");
            return invocation.proceed();
    }
}