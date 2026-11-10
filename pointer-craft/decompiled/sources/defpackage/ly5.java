package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.g;

/* JADX INFO: loaded from: classes2.dex */
public final class ly5 extends uv5 {
    public final /* synthetic */ g g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly5(g gVar, Looper looper) {
        super(looper, (byte) 2);
        this.g = gVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        fw5 fw5Var;
        g gVar = this.g;
        int i = gVar.f.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (fw5Var = (fw5) message.obj) != null) {
                synchronized (fw5Var) {
                    fw5Var.g = null;
                }
                g gVar2 = fw5Var.r;
                synchronized (gVar2.m) {
                    gVar2.m.remove(fw5Var);
                }
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !gVar.w()) {
            fw5 fw5Var2 = (fw5) message.obj;
            if (fw5Var2 != null) {
                synchronized (fw5Var2) {
                    fw5Var2.g = null;
                }
                g gVar3 = fw5Var2.r;
                synchronized (gVar3.m) {
                    gVar3.m.remove(fw5Var2);
                }
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            gVar.z = new kq0(message.arg2, null, null);
            if (!gVar.h && !TextUtils.isEmpty(gVar.t()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(gVar.t());
                    if (!gVar.h) {
                        gVar.b(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            kq0 kq0Var = gVar.z;
            if (kq0Var == null) {
                kq0Var = new kq0(8, null, null);
            }
            gVar.t.q(kq0Var);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            kq0 kq0Var2 = gVar.z;
            if (kq0Var2 == null) {
                kq0Var2 = new kq0(8, null, null);
            }
            gVar.t.q(kq0Var2);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            gVar.t.q(new kq0(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            gVar.b(5, null);
            s25 s25Var = gVar.c;
            if (s25Var != null) {
                ((n32) s25Var.j).g(message.arg2);
            }
            System.currentTimeMillis();
            gVar.i(5, 1, null);
            return;
        }
        if (i4 == 2 && !gVar.q()) {
            fw5 fw5Var3 = (fw5) message.obj;
            if (fw5Var3 != null) {
                synchronized (fw5Var3) {
                    fw5Var3.g = null;
                }
                g gVar4 = fw5Var3.r;
                synchronized (gVar4.m) {
                    gVar4.m.remove(fw5Var3);
                }
                return;
            }
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 34);
            sb.append("Don't know how to handle message: ");
            sb.append(i5);
            Log.wtf("GmsClient", sb.toString(), new Exception());
            return;
        }
        fw5 fw5Var4 = (fw5) message.obj;
        synchronized (fw5Var4) {
            try {
                bool = fw5Var4.g;
                if (fw5Var4.y) {
                    String string = fw5Var4.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 47);
                    sb2.append("Callback proxy ");
                    sb2.append(string);
                    sb2.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb2.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            g gVar5 = fw5Var4.x;
            int i6 = fw5Var4.n;
            if (i6 != 0) {
                gVar5.b(1, null);
                Bundle bundle = fw5Var4.v;
                fw5Var4.y(new kq0(i6, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!fw5Var4.g()) {
                gVar5.b(1, null);
                fw5Var4.y(new kq0(8, null, null));
            }
        }
        synchronized (fw5Var4) {
            fw5Var4.y = true;
        }
        synchronized (fw5Var4) {
            fw5Var4.g = null;
        }
        g gVar6 = fw5Var4.r;
        synchronized (gVar6.m) {
            gVar6.m.remove(fw5Var4);
        }
    }
}
