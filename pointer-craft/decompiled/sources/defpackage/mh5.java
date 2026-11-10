package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mh5 extends UnsupportedOperationException {
    public final tn1 j;

    public mh5(tn1 tn1Var) {
        this.j = tn1Var;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.j));
    }
}
