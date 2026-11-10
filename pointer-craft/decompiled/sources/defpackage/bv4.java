package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bv4 {
    public static final /* synthetic */ int g = 0;

    static {
        Object g84Var;
        Object g84Var2;
        Exception exc = new Exception();
        String simpleName = rs5.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            g84Var = ix.class.getCanonicalName();
        } catch (Throwable th) {
            g84Var = new g84(th);
        }
        if (h84.g(g84Var) != null) {
            g84Var = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            g84Var2 = bv4.class.getCanonicalName();
        } catch (Throwable th2) {
            g84Var2 = new g84(th2);
        }
        if (h84.g(g84Var2) != null) {
            g84Var2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
