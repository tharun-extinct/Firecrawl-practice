package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class il implements Runnable {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Context t;

    public /* synthetic */ il(Context context, byte b) {
        this.j = b;
        this.t = context;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    @Override // java.lang.Runnable
    public final void run() {
        ux2 ux2VarN;
        Object systemService;
        Context context;
        byte b = this.j;
        Context context2 = this.t;
        switch (b) {
            case 0:
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i >= 33) {
                            or orVar = kl.c;
                            orVar.getClass();
                            lr lrVar = new lr(orVar);
                            while (true) {
                                if (lrVar.hasNext()) {
                                    kl klVar = (kl) ((WeakReference) lrVar.next()).get();
                                    if (klVar != null && (context = ((tl) klVar).p) != null) {
                                        systemService = context.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            if (systemService != null) {
                                ux2VarN = ux2.n(h2.l(systemService));
                            } else {
                                ux2VarN = ux2.y;
                            }
                        } else {
                            ux2VarN = kl.a;
                            if (ux2VarN == null) {
                                ux2VarN = ux2.y;
                            }
                        }
                        if (ux2VarN.g.g.isEmpty()) {
                            String strN = rs5.n(context2);
                            Object systemService2 = context2.getSystemService("locale");
                            if (systemService2 != null) {
                                h2.t(systemService2, LocaleList.forLanguageTags(strN));
                            }
                        }
                        context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                kl.w = true;
                break;
            default:
                aj6 aj6Var = new aj6((byte) 19);
                m32 m32Var = r14.g;
                jr2.q(context2, "Context must not be null");
                if (!vc6.x()) {
                    l0.z("Must be called on the UI thread");
                } else {
                    new hw5(context2, aj6Var).execute(new Void[0]);
                }
                break;
        }
    }
}
