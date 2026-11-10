package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class qf1 extends ra {
    public final /* synthetic */ byte J;

    public /* synthetic */ qf1(byte b) {
        this.J = b;
    }

    @Override // defpackage.ra
    public final float C(Object obj) {
        switch (this.J) {
            case 0:
                return ((View) obj).getAlpha();
            case 1:
                return ((View) obj).getScaleX();
            case 2:
                return ((View) obj).getScaleY();
            case 3:
                return ((View) obj).getRotation();
            case 4:
                return ((View) obj).getRotationX();
            default:
                return ((View) obj).getRotationY();
        }
    }

    @Override // defpackage.ra
    public final void T(Object obj, float f) {
        switch (this.J) {
            case 0:
                ((View) obj).setAlpha(f);
                break;
            case 1:
                ((View) obj).setScaleX(f);
                break;
            case 2:
                ((View) obj).setScaleY(f);
                break;
            case 3:
                ((View) obj).setRotation(f);
                break;
            case 4:
                ((View) obj).setRotationX(f);
                break;
            default:
                ((View) obj).setRotationY(f);
                break;
        }
    }
}
