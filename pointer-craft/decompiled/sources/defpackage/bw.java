package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bw implements va1 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object y;

    public /* synthetic */ bw(Object obj, Object obj2, byte b) {
        this.g = b;
        this.y = obj;
        this.r = obj2;
    }

    @Override // defpackage.va1
    public final void g() throws Exception {
        byte b = this.g;
        Object obj = this.r;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                ((wv) obj2).y((pn0) obj);
                break;
            case 1:
                ((mc3) obj2).p.x((i91) obj);
                break;
            case 2:
                ((gu2) obj2).a().x((bu2) obj);
                break;
            case 3:
                ob3 ob3Var = (ob3) obj2;
                mx3 mx3Var = (mx3) ob3Var.getValue();
                if (mx3Var != null) {
                    lx3 lx3Var = new lx3(mx3Var);
                    ja3 ja3Var = (ja3) obj;
                    if (ja3Var != null) {
                        ja3Var.r(lx3Var);
                    }
                    ob3Var.setValue(null);
                }
                break;
            default:
                ((o75) obj2).r.remove((xy1) obj);
                break;
        }
    }
}
