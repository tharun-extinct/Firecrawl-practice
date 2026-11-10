package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class vv {
    public Object g;
    public final Object y;

    public vv() {
        ArrayList arrayList = new ArrayList();
        this.y = arrayList;
        arrayList.add(new ye1());
    }

    public static float y(int i, int i2, int i3) {
        return js2.x((i - i2) / i3, 0.0f, 1.0f);
    }

    public abstract void a();

    public abstract void g();

    public abstract void m();

    public boolean n() {
        return ((uv) this.g).y && ((tv) this.y).n;
    }

    public abstract void q();

    public abstract void r();

    public abstract void t(ky kyVar);

    public abstract void x();

    public vv(lr2 lr2Var) {
        this.g = new uv(this, (byte) 0);
        this.y = new tv(this, lr2Var);
    }

    public void j() {
    }

    public void v() {
    }

    public void l(sv svVar) {
    }
}
