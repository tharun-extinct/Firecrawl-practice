package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g02 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object y;

    public /* synthetic */ g02(Object obj, byte b) {
        this.g = b;
        this.y = obj;
    }

    public final void g() {
        byte b = this.g;
        Object obj = this.y;
        switch (b) {
            case 0:
                ((h02) obj).A--;
                break;
            default:
                ((tt4) obj).m--;
                break;
        }
    }

    public final void y() {
        byte b = this.g;
        Object obj = this.y;
        switch (b) {
            case 0:
                ((h02) obj).A++;
                break;
            default:
                ((tt4) obj).m++;
                break;
        }
    }
}
