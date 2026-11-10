package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes.dex */
public final class a05 extends o73 {
    public final Object g;
    public final PointerInputEventHandler r;
    public final Object y;

    public a05(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj2 = (i & 2) != 0 ? null : obj2;
        this.g = obj;
        this.y = obj2;
        this.r = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a05)) {
            return false;
        }
        a05 a05Var = (a05) obj;
        return yf2.p(this.g, a05Var.g) && yf2.p(this.y, a05Var.y) && this.r == a05Var.r;
    }

    public final int hashCode() {
        Object obj = this.g;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.y;
        return this.r.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }

    @Override // defpackage.o73
    public final void j(i73 i73Var) {
        g05 g05Var = (g05) i73Var;
        Object obj = g05Var.o;
        Object obj2 = this.g;
        boolean z = !yf2.p(obj, obj2);
        g05Var.o = obj2;
        Object obj3 = g05Var.f;
        Object obj4 = this.y;
        if (!yf2.p(obj3, obj4)) {
            z = true;
        }
        g05Var.f = obj4;
        Class<?> cls = g05Var.k.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.r;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            g05Var.S0();
        }
        g05Var.k = pointerInputEventHandler;
    }

    @Override // defpackage.o73
    public final i73 l() {
        return new g05(this.g, this.y, this.r);
    }
}
