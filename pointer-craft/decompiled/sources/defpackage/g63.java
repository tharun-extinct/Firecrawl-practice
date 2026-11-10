package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class g63 extends Exception {
    public final int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g63(Exception exc) {
        super("Internal error has occurred when executing ML Kit tasks", exc);
        jr2.a("Internal error has occurred when executing ML Kit tasks", "Provided message must not be empty.");
        this.j = 13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g63(String str, int i) {
        super(str);
        jr2.a(str, "Provided message must not be empty.");
        this.j = i;
    }
}
