package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ku0 implements ox0 {
    public final fx0 j;

    public ku0(fx0 fx0Var) {
        this.j = fx0Var;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.j + ')';
    }

    @Override // defpackage.ox0
    public final fx0 w() {
        return this.j;
    }
}
