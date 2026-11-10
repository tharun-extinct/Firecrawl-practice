package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kq implements o14 {
    public final /* synthetic */ byte g;
    public final jq y;

    public /* synthetic */ kq(jq jqVar, byte b) {
        this.g = b;
        this.y = jqVar;
    }

    @Override // defpackage.p14
    public final Object get() {
        byte b = this.g;
        jq jqVar = this.y;
        switch (b) {
            case 0:
                return ue5.Q(jqVar.j);
            default:
                return jqVar.j;
        }
    }
}
