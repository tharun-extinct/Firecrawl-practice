package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dj6 extends wh6 {
    public final /* synthetic */ ij6 i;

    public dj6(ij6 ij6Var) {
        this.i = ij6Var;
    }

    @Override // defpackage.wh6
    public final String r() {
        si6 si6Var = (si6) this.i.j.get();
        return si6Var == null ? "Completer object has been garbage collected, future will fail soon" : du4.i("tag=[", String.valueOf(si6Var.g), "]");
    }
}
