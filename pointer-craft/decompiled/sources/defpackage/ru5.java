package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ru5 implements jw {
    public final /* synthetic */ p32 g;

    public ru5(p32 p32Var) {
        this.g = p32Var;
    }

    @Override // defpackage.jw
    public final void g(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        uv5 uv5Var = this.g.w;
        uv5Var.sendMessage(uv5Var.obtainMessage(1, boolValueOf));
    }
}
