package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mi0 extends IllegalStateException {
    public mi0(String str) {
        super(str);
    }

    public static IllegalStateException g(nj6 nj6Var) {
        String strConcat;
        if (!nj6Var.j()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excX = nj6Var.x();
        if (excX != null) {
            strConcat = "failure";
        } else if (nj6Var.t()) {
            strConcat = "result ".concat(String.valueOf(nj6Var.l()));
        } else {
            strConcat = nj6Var.n ? "cancellation" : "unknown issue";
        }
        return new mi0("Complete with: ".concat(strConcat), excX);
    }
}
