package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a23 extends p0 {
    public final /* synthetic */ c23 j;

    public a23(c23 c23Var) {
        this.j = c23Var;
    }

    @Override // defpackage.o, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // defpackage.o
    public final int g() {
        return this.j.g.groupCount() + 1;
    }

    @Override // java.util.List
    public final Object get(int i) {
        String strGroup = this.j.g.group(i);
        return strGroup == null ? "" : strGroup;
    }

    @Override // defpackage.p0, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // defpackage.p0, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
