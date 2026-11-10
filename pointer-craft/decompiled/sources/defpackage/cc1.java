package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cc1 implements xy1 {
    public final /* synthetic */ byte j = 1;
    public final /* synthetic */ q54 t;

    public /* synthetic */ cc1(v92 v92Var, ec1 ec1Var, q54 q54Var) {
        this.t = q54Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        gd5 gd5Var = gd5.j;
        q54 q54Var = this.t;
        switch (b) {
            case 0:
                ec1 ec1Var = (ec1) obj;
                if (!ec1Var.h) {
                    return gd5.t;
                }
                if (ec1Var.f != null) {
                    mc2.y("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                ec1Var.f = null;
                q54Var.j = q54Var.j;
                return gd5Var;
            default:
                if (!((o72) obj).k) {
                    return gd5Var;
                }
                q54Var.j = false;
                return gd5.a;
        }
    }

    public /* synthetic */ cc1(q54 q54Var) {
        this.t = q54Var;
    }
}
