package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vh6 extends ri6 {
    public final /* synthetic */ ri6 c;
    public final transient int q;
    public final transient int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh6(ri6 ri6Var, int i, int i2) {
        super((byte) 1);
        this.c = ri6Var;
        this.q = i;
        this.w = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        v13.N(i, this.w);
        return this.c.get(i + this.q);
    }

    @Override // defpackage.fx5
    public final int n() {
        return this.c.n() + this.q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.w;
    }

    @Override // defpackage.fx5
    public final Object[] v() {
        return this.c.v();
    }

    @Override // defpackage.ri6, java.util.List
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final ri6 subList(int i, int i2) {
        v13.O(i, i2, this.w);
        int i3 = this.q;
        return this.c.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.fx5
    public final int y() {
        return this.c.n() + this.q + this.w;
    }
}
