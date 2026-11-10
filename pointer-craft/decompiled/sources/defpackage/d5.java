package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import io.appground.blek.R;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d5 implements s4, gm0, rd0 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ d5(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    @Override // defpackage.gm0
    public Object c(vl vlVar) {
        return new z11((Context) vlVar.g(Context.class), ((ro1) vlVar.g(ro1.class)).n(), vlVar.n(e24.g(d52.class)), vlVar.v(b41.class), (Executor) vlVar.j((e24) this.t));
    }

    @Override // defpackage.rd0
    public void g() {
        mv4 mv4Var = (mv4) this.t;
        CheckableImageButton checkableImageButton = mv4Var.m;
        ue5.u0(checkableImageButton, mv4Var.b, checkableImageButton.getContentDescription());
    }

    @Override // defpackage.s4
    public void r(Object obj) {
        Integer numValueOf;
        byte b = this.j;
        Object obj2 = this.t;
        switch (b) {
            case 0:
                ((xy1) ((ob3) obj2).getValue()).a(obj);
                break;
            default:
                av0 av0Var = (av0) obj2;
                Object obj3 = ((h84) obj).j;
                if (!(obj3 instanceof g84)) {
                    qr0.b(av0Var.T(), (String) obj3);
                }
                Throwable thG = h84.g(obj3);
                if (thG != null) {
                    if (thG instanceof uu4) {
                        numValueOf = ((uu4) thG).g();
                    } else {
                        Context contextM = av0Var.m();
                        KeyguardManager keyguardManager = contextM != null ? (KeyguardManager) contextM.getSystemService(KeyguardManager.class) : null;
                        numValueOf = (keyguardManager == null || !keyguardManager.isDeviceLocked()) ? null : Integer.valueOf(R.string.message_error_speech_device_lock);
                    }
                    if (numValueOf != null) {
                        qr0 qr0VarT = av0Var.T();
                        String string = qr0VarT.y.getString(numValueOf.intValue());
                        string.getClass();
                        qr0VarT.p(string, true);
                    }
                }
                break;
        }
    }

    public void y() {
        byte b = this.j;
        Object obj = this.t;
        switch (b) {
            case 6:
                m mVar = (m) obj;
                synchronized (it4.r) {
                    it4.t = cj0.v0(it4.t, mVar);
                }
                it4.r();
                return;
            default:
                bz1 bz1Var = (bz1) obj;
                synchronized (it4.r) {
                    it4.j = cj0.v0(it4.j, bz1Var);
                }
                return;
        }
    }
}
