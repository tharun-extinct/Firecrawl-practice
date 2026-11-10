package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ky2 implements kz4 {
    public final /* synthetic */ byte j;
    public final String t;

    public /* synthetic */ ky2(String str, byte b) {
        this.j = b;
        this.t = str;
    }

    public String toString() {
        switch (this.j) {
            case 2:
                return "<" + this.t + '>';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.kz4
    public String y() {
        return this.t;
    }

    @Override // defpackage.kz4
    public void t(jz4 jz4Var) {
    }
}
