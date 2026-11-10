package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fp1 implements Runnable {
    public final /* synthetic */ byte j;
    public final /* synthetic */ gp1 t;

    public /* synthetic */ fp1(gp1 gp1Var, byte b) {
        this.j = b;
        this.t = gp1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wu wuVarS;
        wu wuVarX;
        boolean zM;
        byte b = this.j;
        gp1 gp1Var = this.t;
        switch (b) {
            case 0:
                gp1Var.g();
                return;
            case 1:
                gp1Var.g();
                return;
            default:
                Object obj = gp1.q;
                synchronized (obj) {
                    try {
                        ro1 ro1Var = gp1Var.g;
                        ro1Var.g();
                        cd2 cd2VarY = cd2.y(ro1Var.g);
                        try {
                            wuVarS = gp1Var.r.S();
                            if (cd2VarY != null) {
                                cd2VarY.G();
                            }
                        } catch (Throwable th) {
                            if (cd2VarY != null) {
                                cd2VarY.G();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    if (wuVarS.t() || wuVarS.q()) {
                        wuVarX = gp1Var.x(wuVarS);
                    } else if (!gp1Var.n.g(wuVarS)) {
                        return;
                    } else {
                        wuVarX = gp1Var.y(wuVarS);
                    }
                    synchronized (obj) {
                        try {
                            ro1 ro1Var2 = gp1Var.g;
                            ro1Var2.g();
                            cd2 cd2VarY2 = cd2.y(ro1Var2.g);
                            try {
                                gp1Var.r.I(wuVarX);
                                if (cd2VarY2 != null) {
                                    cd2VarY2.G();
                                }
                            } catch (Throwable th3) {
                                if (cd2VarY2 != null) {
                                    cd2VarY2.G();
                                }
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    synchronized (gp1Var) {
                        try {
                            if (!wuVarX.m() || TextUtils.isEmpty(wuVarX.g)) {
                                zM = false;
                            } else {
                                zM = true;
                                if (TextUtils.equals(wuVarS.g, wuVarX.g)) {
                                    zM = true ^ wuVarS.m();
                                }
                            }
                            if (zM) {
                                Iterator it = gp1Var.a.iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    if (wuVarX.m()) {
                        String str = wuVarX.g;
                        synchronized (gp1Var) {
                            gp1Var.t = str;
                        }
                    }
                    if (wuVarX.t()) {
                        gp1Var.l(new ip1());
                        return;
                    } else if (wuVarX.a()) {
                        gp1Var.l(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        gp1Var.j(wuVarX);
                        return;
                    }
                } catch (ip1 e) {
                    gp1Var.l(e);
                    return;
                }
        }
    }
}
