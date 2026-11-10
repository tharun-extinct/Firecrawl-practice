package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t94 implements s65 {
    public static /* synthetic */ void g() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void j(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void l(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void n(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void r(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void v(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void x(String str, long j, Object obj) {
        throw new IllegalArgumentException((str + j + obj).toString());
    }

    public static /* synthetic */ void y(long j) {
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + j);
    }
}
