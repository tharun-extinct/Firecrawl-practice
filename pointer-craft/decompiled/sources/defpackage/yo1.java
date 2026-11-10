package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class yo1 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo1(String str) {
        super(str);
        jr2.a(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo1(String str, Throwable th) {
        super(str, th);
        jr2.a(str, "Detail message must not be empty");
    }
}
