package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yw5 implements Callable {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ o00 y;

    public /* synthetic */ yw5(o00 o00Var, Object obj, Object obj2, byte b) {
        this.g = b;
        this.y = o00Var;
        this.r = obj;
        this.n = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundleR;
        kx5 kx5Var;
        kx5 kx5Var2;
        kx5 kx5Var3;
        int i;
        String strX;
        switch (this.g) {
            case 0:
                o00 o00Var = this.y;
                String str = (String) this.r;
                String str2 = (String) this.n;
                try {
                    synchronized (o00Var.g) {
                        kx5Var = o00Var.t;
                        break;
                    }
                    if (kx5Var == null) {
                        return i06.r(b36.a, 107);
                    }
                    return ((gx5) kx5Var).j(o00Var.l.getPackageName(), str, str2);
                } catch (DeadObjectException e) {
                    x20 x20Var = b36.a;
                    String strG = m26.g(e);
                    bundleR = i06.r(x20Var, 5);
                    if (strG != null) {
                        bundleR.putString("ADDITIONAL_LOG_DETAILS", strG);
                    }
                    return bundleR;
                } catch (Exception e2) {
                    x20 x20Var2 = b36.j;
                    String strG2 = m26.g(e2);
                    bundleR = i06.r(x20Var2, 5);
                    if (strG2 != null) {
                        bundleR.putString("ADDITIONAL_LOG_DETAILS", strG2);
                    }
                    return bundleR;
                }
            case 1:
                o00 o00Var2 = this.y;
                v92 v92Var = (v92) this.r;
                h3 h3Var = (h3) this.n;
                try {
                    if (!o00Var2.B()) {
                        x20 x20Var3 = b36.a;
                        o00Var2.G(2, 3, x20Var3);
                        v92Var.M(x20Var3);
                    } else if (TextUtils.isEmpty(h3Var.g)) {
                        i06.j("BillingClient", "Please provide a valid purchase token.");
                        x20 x20Var4 = b36.l;
                        o00Var2.G(26, 3, x20Var4);
                        v92Var.M(x20Var4);
                    } else if (o00Var2.b) {
                        synchronized (o00Var2.g) {
                            kx5Var2 = o00Var2.t;
                            break;
                        }
                        if (kx5Var2 == null) {
                            o00Var2.a(v92Var, b36.a, 107, null);
                        } else {
                            String packageName = o00Var2.l.getPackageName();
                            String str3 = h3Var.g;
                            String str4 = o00Var2.r;
                            String str5 = o00Var2.n;
                            long jLongValue = o00Var2.H.longValue();
                            int i2 = i06.g;
                            Bundle bundle = new Bundle();
                            i06.y(bundle, str4, str5, jLongValue);
                            Bundle bundleX = ((gx5) kx5Var2).x(packageName, str3, bundle);
                            ((el0) v92Var.t).f0(b36.g(i06.x("BillingClient", bundleX), i06.g("BillingClient", bundleX)));
                        }
                    } else {
                        x20 x20Var5 = b36.g;
                        o00Var2.G(27, 3, x20Var5);
                        v92Var.M(x20Var5);
                    }
                } catch (DeadObjectException e3) {
                    o00Var2.a(v92Var, b36.a, 28, e3);
                } catch (Exception e4) {
                    o00Var2.a(v92Var, b36.j, 28, e4);
                }
                return null;
            default:
                o00 o00Var3 = this.y;
                fa4 fa4Var = (fa4) this.r;
                h3 h3Var2 = (h3) this.n;
                if (o00Var3.B()) {
                    String str6 = h3Var2.g;
                    try {
                        i06.l("BillingClient", "Consuming purchase with token: " + str6);
                        synchronized (o00Var3.g) {
                            kx5Var3 = o00Var3.t;
                            break;
                        }
                        if (kx5Var3 == null) {
                            o00Var3.m(fa4Var, str6, b36.a, 107, "Service has been reset to null.", null);
                        } else {
                            boolean z = o00Var3.b;
                            Context context = o00Var3.l;
                            if (z) {
                                String packageName2 = context.getPackageName();
                                boolean z2 = o00Var3.b;
                                String str7 = o00Var3.r;
                                String str8 = o00Var3.n;
                                long jLongValue2 = o00Var3.H.longValue();
                                Bundle bundle2 = new Bundle();
                                if (z2) {
                                    i06.y(bundle2, str7, str8, jLongValue2);
                                }
                                Bundle bundleL = ((gx5) kx5Var3).l(packageName2, str6, bundle2);
                                i = bundleL.getInt("RESPONSE_CODE");
                                strX = i06.x("BillingClient", bundleL);
                            } else {
                                String packageName3 = context.getPackageName();
                                gx5 gx5Var = (gx5) kx5Var3;
                                Parcel parcelG = gx5Var.g();
                                parcelG.writeInt(3);
                                parcelG.writeString(packageName3);
                                parcelG.writeString(str6);
                                Parcel parcelY = gx5Var.y(parcelG, 5);
                                i = parcelY.readInt();
                                parcelY.recycle();
                                strX = "";
                            }
                            x20 x20VarG = b36.g(strX, i);
                            if (i == 0) {
                                i06.l("BillingClient", "Successfully consumed purchase.");
                                fa4Var.I(x20VarG, str6);
                            } else {
                                o00Var3.m(fa4Var, str6, x20VarG, 23, "Error consuming purchase with token. Response code: " + i, null);
                            }
                        }
                    } catch (DeadObjectException e5) {
                        o00Var3.m(fa4Var, str6, b36.a, 29, "Error consuming purchase!", e5);
                    } catch (Exception e6) {
                        o00Var3.m(fa4Var, str6, b36.j, 29, "Error consuming purchase!", e6);
                    }
                } else {
                    x20 x20Var6 = b36.a;
                    o00Var3.G(2, 4, x20Var6);
                    fa4Var.I(x20Var6, h3Var2.g);
                }
                return null;
        }
    }
}
