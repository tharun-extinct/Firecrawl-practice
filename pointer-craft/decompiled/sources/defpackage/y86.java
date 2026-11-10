package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y86 implements Runnable {
    public final /* synthetic */ byte j;
    public final z56 t;

    public /* synthetic */ y86(z56 z56Var, byte b) {
        this.j = b;
        this.t = z56Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.j) {
            case 0:
                z56 z56Var = this.t;
                synchronized (z56Var) {
                    if (z56Var.g == 1) {
                        z56Var.g("Timed out while binding");
                    }
                    break;
                }
                return;
            case 1:
                z56 z56Var2 = this.t;
                while (true) {
                    synchronized (z56Var2) {
                        try {
                            if (z56Var2.g != 2) {
                                return;
                            }
                            if (z56Var2.n.isEmpty()) {
                                z56Var2.r();
                                return;
                            }
                            ej6 ej6Var = (ej6) z56Var2.n.poll();
                            z56Var2.v.put(ej6Var.g, ej6Var);
                            ((ScheduledExecutorService) z56Var2.x.r).schedule(new i26((Object) z56Var2, (Object) ej6Var, (byte) 26), 30L, TimeUnit.SECONDS);
                            if (Log.isLoggable("MessengerIpcClient", 3)) {
                                String strValueOf = String.valueOf(ej6Var);
                                StringBuilder sb = new StringBuilder(strValueOf.length() + 8);
                                sb.append("Sending ");
                                sb.append(strValueOf);
                                Log.d("MessengerIpcClient", sb.toString());
                            }
                            Context context = (Context) z56Var2.x.y;
                            Messenger messenger = z56Var2.y;
                            Message messageObtain = Message.obtain();
                            messageObtain.what = 1;
                            messageObtain.arg1 = ej6Var.g;
                            messageObtain.replyTo = messenger;
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("oneWay", false);
                            bundle.putString("pkg", context.getPackageName());
                            bundle.putBundle("data", ej6Var.r);
                            messageObtain.setData(bundle);
                            try {
                                ia6 ia6Var = z56Var2.r;
                                Messenger messenger2 = (Messenger) ia6Var.g;
                                if (messenger2 != null) {
                                    messenger2.send(messageObtain);
                                } else {
                                    iw5 iw5Var = (iw5) ia6Var.y;
                                    if (iw5Var == null) {
                                        throw new IllegalStateException("Both messengers are null");
                                    }
                                    iw5Var.r(messageObtain);
                                }
                            } catch (RemoteException e) {
                                z56Var2.g(e.getMessage());
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                break;
            default:
                this.t.g("Service disconnected");
                return;
        }
    }
}
