package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ab1 implements my1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ boolean t;

    public /* synthetic */ ab1(byte b, Object obj, Object obj2, boolean z) {
        this.j = b;
        this.t = z;
        this.a = obj;
        this.m = obj2;
    }

    @Override // defpackage.my1
    public final Object g() {
        switch (this.j) {
            case 0:
                boolean z = this.t;
                ji jiVar = (ji) this.a;
                String str = (String) this.m;
                if (z) {
                    hd4 hd4Var = (hd4) jiVar.t;
                    synchronized (hd4Var.r) {
                    }
                }
                return og5.g;
            default:
                boolean z2 = this.t;
                we1 we1Var = (we1) this.a;
                ox0 ox0Var = (ox0) this.m;
                if (z2 && ((Boolean) we1Var.g.a(xe1.j)).booleanValue()) {
                    m50.T(ox0Var, null, new lo(we1Var, null, (byte) 2), 3);
                }
                return og5.g;
        }
    }
}
