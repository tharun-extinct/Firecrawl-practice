package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ej5 extends gj5 implements Iterable, vh2 {
    public final float a;
    public final List b;
    public final float c;
    public final float i;
    public final String j;
    public final float m;
    public final float q;
    public final ArrayList s;
    public final float t;
    public final float w;

    public ej5(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.j = str;
        this.t = f;
        this.a = f2;
        this.m = f3;
        this.q = f4;
        this.w = f5;
        this.c = f6;
        this.i = f7;
        this.b = list;
        this.s = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ej5)) {
            return false;
        }
        ej5 ej5Var = (ej5) obj;
        return yf2.p(this.j, ej5Var.j) && this.t == ej5Var.t && this.a == ej5Var.a && this.m == ej5Var.m && this.q == ej5Var.q && this.w == ej5Var.w && this.c == ej5Var.c && this.i == ej5Var.i && yf2.p(this.b, ej5Var.b) && this.s.equals(ej5Var.s);
    }

    public final int hashCode() {
        return this.s.hashCode() + ((this.b.hashCode() + fj.y(this.i, fj.y(this.c, fj.y(this.w, fj.y(this.q, fj.y(this.m, fj.y(this.a, fj.y(this.t, this.j.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new yr3(this);
    }
}
