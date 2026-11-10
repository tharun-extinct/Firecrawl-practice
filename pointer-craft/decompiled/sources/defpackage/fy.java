package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fy implements my1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ gy t;

    public /* synthetic */ fy(gy gyVar, byte b) {
        this.j = b;
        this.t = gyVar;
    }

    @Override // defpackage.my1
    public final Object g() {
        byte b = this.j;
        gy gyVar = this.t;
        switch (b) {
            case 0:
                return gyVar.M().t();
            case 1:
                return gyVar.M().l();
            case 2:
                return gyVar.M().x();
            case 3:
                return gyVar.M().t();
            case 4:
                return gyVar.M().l();
            case 5:
                return gyVar.M().x();
            case 6:
                return gyVar.M().t();
            case 7:
                return gyVar.M().l();
            default:
                return gyVar.M().x();
        }
    }
}
