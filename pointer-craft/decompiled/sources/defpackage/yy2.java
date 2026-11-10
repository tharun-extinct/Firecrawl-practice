package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class yy2 implements u33 {
    public final /* synthetic */ int g;
    public final /* synthetic */ xy1 n;
    public final /* synthetic */ Map r;
    public final /* synthetic */ xy1 v;
    public final /* synthetic */ zy2 x;
    public final /* synthetic */ int y;

    public yy2(int i, int i2, Map map, xy1 xy1Var, xy1 xy1Var2, zy2 zy2Var) {
        this.g = i;
        this.y = i2;
        this.r = map;
        this.n = xy1Var;
        this.v = xy1Var2;
        this.x = zy2Var;
    }

    @Override // defpackage.u33
    public final int g() {
        return this.y;
    }

    @Override // defpackage.u33
    public final void n() {
        this.v.a(this.x.f);
    }

    @Override // defpackage.u33
    public final Map r() {
        return this.r;
    }

    @Override // defpackage.u33
    public final xy1 x() {
        return this.n;
    }

    @Override // defpackage.u33
    public final int y() {
        return this.g;
    }
}
