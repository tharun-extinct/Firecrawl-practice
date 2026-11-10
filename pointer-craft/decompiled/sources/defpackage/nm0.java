package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class nm0 implements bz1, cz1, dz1, ez1, fz1, gz1, hz1, iz1, ny1, oy1, qy1, ry1, sy1, ty1, uy1, vy1, wy1, yy1, zy1 {
    public Object a;
    public final int j;
    public u34 m;
    public ArrayList q;
    public final boolean t;

    public nm0(int i, boolean z, Object obj) {
        this.j = i;
        this.t = z;
        this.a = obj;
    }

    public final void c(h02 h02Var) {
        u34 u34VarF;
        if (!this.t || (u34VarF = h02Var.f()) == null) {
            return;
        }
        u34VarF.y |= 1;
        u34 u34Var = this.m;
        if (u34Var == null || !u34Var.g() || u34Var == u34VarF || yf2.p(u34Var.r, u34VarF.r)) {
            this.m = u34VarF;
            return;
        }
        ArrayList arrayList = this.q;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.q = arrayList2;
            arrayList2.add(u34VarF);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            u34 u34Var2 = (u34) arrayList.get(i);
            if (u34Var2 == null || !u34Var2.g() || u34Var2 == u34VarF || yf2.p(u34Var2.r, u34VarF.r)) {
                arrayList.set(i, u34VarF);
                return;
            }
        }
        arrayList.add(u34VarF);
    }

    @Override // defpackage.dz1
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        return q(obj, obj2, (h02) obj3, ((Number) obj4).intValue());
    }

    public final Object j(Object obj, h02 h02Var, int i) {
        h02Var.Z(this.j);
        c(h02Var);
        int iD = h02Var.x(this) ? ue5.d(2, 1) : ue5.d(1, 1);
        Object obj2 = this.a;
        obj2.getClass();
        byte b = 3;
        ue5.f(3, obj2);
        Object objX = ((cz1) obj2).x(obj, h02Var, Integer.valueOf(iD | i));
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new tk(b, i, this, obj);
        }
        return objX;
    }

    @Override // defpackage.bz1
    public final /* bridge */ /* synthetic */ Object l(Object obj, Object obj2) {
        return n(((Number) obj2).intValue(), (h02) obj);
    }

    public final Object m(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, h02 h02Var, int i) {
        h02Var.Z(this.j);
        c(h02Var);
        int iD = h02Var.x(this) ? ue5.d(2, 6) : ue5.d(1, 6);
        Object obj5 = this.a;
        obj5.getClass();
        ue5.f(8, obj5);
        Object objY = ((hz1) obj5).y(obj, bool, obj2, obj3, obj4, h02Var, Integer.valueOf(i | iD));
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new g80(this, obj, bool, obj2, obj3, obj4, i);
        }
        return objY;
    }

    public final Object n(int i, h02 h02Var) {
        h02Var.Z(this.j);
        c(h02Var);
        int iD = i | (h02Var.x(this) ? ue5.d(2, 0) : ue5.d(1, 0));
        Object obj = this.a;
        obj.getClass();
        ue5.f(2, obj);
        Object objL = ((bz1) obj).l(h02Var, Integer.valueOf(iD));
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new mm0(2, this, nm0.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        }
        return objL;
    }

    public final Object q(Object obj, Object obj2, h02 h02Var, int i) {
        h02Var.Z(this.j);
        c(h02Var);
        int iD = h02Var.x(this) ? ue5.d(2, 2) : ue5.d(1, 2);
        Object obj3 = this.a;
        obj3.getClass();
        ue5.f(4, obj3);
        Object objI = ((dz1) obj3).i(obj, obj2, h02Var, Integer.valueOf(iD | i));
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new hg((Object) this, obj, obj2, i, (byte) 3);
        }
        return objI;
    }

    public final Object v(xy xyVar, Object obj, Object obj2, h02 h02Var, int i) {
        h02Var.Z(this.j);
        c(h02Var);
        int iD = h02Var.x(this) ? ue5.d(2, 3) : ue5.d(1, 3);
        Object obj3 = this.a;
        obj3.getClass();
        ue5.f(5, obj3);
        Object objW = ((ez1) obj3).w(xyVar, obj, obj2, h02Var, Integer.valueOf(iD | i));
        u34 u34VarP = h02Var.p();
        if (u34VarP != null) {
            u34VarP.n = new g6(this, xyVar, obj, obj2, i);
        }
        return objW;
    }

    @Override // defpackage.ez1
    public final /* bridge */ /* synthetic */ Object w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return v((xy) obj, obj2, obj3, (h02) obj4, ((Number) obj5).intValue());
    }

    @Override // defpackage.cz1
    public final /* bridge */ /* synthetic */ Object x(Object obj, Object obj2, Object obj3) {
        return j(obj, (h02) obj2, ((Number) obj3).intValue());
    }

    @Override // defpackage.hz1
    public final /* bridge */ /* synthetic */ Object y(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, h02 h02Var, Integer num) {
        return m(obj, bool, obj2, obj3, obj4, h02Var, num.intValue());
    }
}
