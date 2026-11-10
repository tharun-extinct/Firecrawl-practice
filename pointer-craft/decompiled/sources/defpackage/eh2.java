package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class eh2 extends CancellationException {
    public final transient nh2 j;

    public eh2(String str, Throwable th, nh2 nh2Var) {
        super(str);
        this.j = nh2Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eh2)) {
            return false;
        }
        eh2 eh2Var = (eh2) obj;
        if (!yf2.p(eh2Var.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = eh2Var.j;
        if (obj2 == null) {
            obj2 = mh3.t;
        }
        Object obj3 = this.j;
        if (obj3 == null) {
            obj3 = mh3.t;
        }
        return yf2.p(obj2, obj3) && yf2.p(eh2Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int iHashCode = message.hashCode() * 31;
        Object obj = this.j;
        if (obj == null) {
            obj = mh3.t;
        }
        int iHashCode2 = (obj.hashCode() + iHashCode) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.j;
        if (obj == null) {
            obj = mh3.t;
        }
        sb.append(obj);
        return sb.toString();
    }
}
