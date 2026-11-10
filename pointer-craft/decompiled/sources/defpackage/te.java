package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public class te implements wt4 {
    public static final cm1 v = new cm1(8);
    public final Class g;
    public final Method n;
    public final Method r;
    public final Method y;

    public te(Class cls) throws NoSuchMethodException {
        this.g = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.y = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.r = cls.getMethod("getAlpnSelectedProtocol", null);
        this.n = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // defpackage.wt4
    public final boolean g(SSLSocket sSLSocket) {
        return this.g.isInstance(sSLSocket);
    }

    @Override // defpackage.wt4
    public final void n(SSLSocket sSLSocket, String str, List list, fa0 fa0Var) {
        if (this.g.isInstance(sSLSocket)) {
            try {
                this.y.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.n;
                ys3 ys3Var = ys3.g;
                method.invoke(sSLSocket, tg1.r(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    @Override // defpackage.wt4
    public final String r(SSLSocket sSLSocket) {
        if (this.g.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.r.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, od0.g);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof NullPointerException) || !yf2.p(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e2);
                }
            }
        }
        return null;
    }

    @Override // defpackage.wt4
    public final boolean y() {
        boolean z = pd.v;
        return eh6.v();
    }
}
