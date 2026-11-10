package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
public final class b23 extends o {
    public final /* synthetic */ c23 j;

    public b23(c23 c23Var) {
        this.j = c23Var;
    }

    @Override // defpackage.o, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof z13) {
            return super.contains((z13) obj);
        }
        return false;
    }

    @Override // defpackage.o
    public final int g() {
        return this.j.g.groupCount() + 1;
    }

    @Override // defpackage.o, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        byte b = 1;
        return new h25(new ij0(new me2(0, g() - 1, 1), (byte) 0), new ll2(this, b), b).iterator();
    }

    public final z13 y(int i) {
        Matcher matcher = this.j.g;
        me2 me2VarK = xs2.K(matcher.start(i), matcher.end(i));
        if (me2VarK.j < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        strGroup.getClass();
        return new z13(strGroup, me2VarK);
    }
}
