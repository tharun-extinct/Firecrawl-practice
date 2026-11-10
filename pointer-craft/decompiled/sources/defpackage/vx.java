package defpackage;

import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes.dex */
public final class vx implements gr1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ gy t;

    public /* synthetic */ vx(gy gyVar, byte b) {
        this.j = b;
        this.t = gyVar;
    }

    @Override // defpackage.gr1
    public final Object c(Object obj, mu0 mu0Var) {
        CharSequence text;
        CharSequence text2;
        iv4 iv4Var;
        byte b = this.j;
        gy gyVar = this.t;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                fx4 fx4Var = (fx4) obj;
                tw1 tw1Var = gyVar.j0;
                tw1Var.getClass();
                MaterialCardView materialCardView = tw1Var.q;
                int i = fx4Var.g;
                int i2 = fx4Var.r;
                int i3 = fx4Var.y;
                materialCardView.setVisibility(i == 0 ? 8 : 0);
                tw1 tw1Var2 = gyVar.j0;
                tw1Var2.getClass();
                tw1Var2.c.setVisibility(i3 == 0 ? 8 : 0);
                tw1 tw1Var3 = gyVar.j0;
                tw1Var3.getClass();
                tw1Var3.w.setVisibility(i2 == 0 ? 8 : 0);
                tw1 tw1Var4 = gyVar.j0;
                tw1Var4.getClass();
                TextView textView = tw1Var4.i;
                int i4 = fx4Var.g;
                CharSequence text3 = "";
                if (i4 != 0) {
                    text = gyVar.c().getText(i4);
                    text.getClass();
                } else {
                    text = "";
                }
                textView.setText(text);
                tw1 tw1Var5 = gyVar.j0;
                tw1Var5.getClass();
                MaterialButton materialButton = tw1Var5.c;
                if (i3 != 0) {
                    text2 = gyVar.c().getText(i3);
                    text2.getClass();
                } else {
                    text2 = "";
                }
                materialButton.setText(text2);
                tw1 tw1Var6 = gyVar.j0;
                tw1Var6.getClass();
                MaterialButton materialButton2 = tw1Var6.w;
                if (i2 != 0) {
                    text3 = gyVar.c().getText(i2);
                    text3.getClass();
                }
                materialButton2.setText(text3);
                break;
            case 1:
                ql4 ql4Var = (ql4) obj;
                if (ql4Var != null) {
                    String str = ql4Var.k;
                    boolean z = str.equals("never") ? false : str.equals("always") ? true : ql4Var.F;
                    gy gyVar2 = this.t;
                    tw1 tw1Var7 = gyVar2.j0;
                    tw1Var7.getClass();
                    boolean z2 = ql4Var.F;
                    iv4 iv4Var2 = gyVar2.q0;
                    if (iv4Var2 != null) {
                        iv4Var2.x(null);
                    }
                    gyVar2.q0 = m50.T(mq2.a(gyVar2), null, new ey(z2, tw1Var7, z, gyVar2, null), 3);
                    gyVar2.p0 = ql4Var.d;
                    tw1 tw1Var8 = gyVar2.j0;
                    tw1Var8.getClass();
                    tw1Var8.a.setChecked(ql4Var.E);
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue) {
                    gyVar.M().setRequestedOrientation(14);
                } else {
                    gyVar.M().setRequestedOrientation(13);
                }
                if (zBooleanValue && ((iv4Var = gyVar.t0) == null || !iv4Var.y())) {
                    gyVar.t0 = m50.T(mq2.a(gyVar.b()), null, new dy(gyVar, (mu0) null, (byte) 0), 3);
                } else if (!zBooleanValue) {
                    iv4 iv4Var3 = gyVar.t0;
                    if (iv4Var3 != null) {
                        iv4Var3.x(null);
                    }
                    gyVar.t0 = null;
                }
                break;
        }
        return og5Var;
    }
}
