package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class x85 implements ex0 {
    public final ThreadLocal j;

    public x85(ThreadLocal threadLocal) {
        this.j = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x85) && yf2.p(this.j, ((x85) obj).j);
    }

    public final int hashCode() {
        return this.j.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.j + ')';
    }
}
