package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class z56 implements ServiceConnection {
    public ia6 r;
    public final /* synthetic */ m46 x;
    public byte g = 0;
    public final Messenger y = new Messenger(new gw5(Looper.getMainLooper(), new ms4(this, 1)));
    public final ArrayDeque n = new ArrayDeque();
    public final SparseArray v = new SparseArray();

    public z56(m46 m46Var) {
        this.x = m46Var;
    }

    public final synchronized void g(String str) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String strValueOf = String.valueOf(str);
                Log.d("MessengerIpcClient", strValueOf.length() != 0 ? "Disconnected: ".concat(strValueOf) : new String("Disconnected: "));
            }
            byte b = this.g;
            if (b == 0) {
                throw new IllegalStateException();
            }
            if (b != 1 && b != 2) {
                if (b == 3) {
                    this.g = (byte) 4;
                    return;
                } else {
                    if (b == 4) {
                        return;
                    }
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("Unknown state: ");
                    sb.append((int) b);
                    throw new IllegalStateException(sb.toString());
                }
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.g = (byte) 4;
            fa4.C().M((Context) this.x.y, this);
            bt4 bt4Var = new bt4(str);
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                ((ej6) it.next()).g(bt4Var);
            }
            this.n.clear();
            int i = 0;
            while (true) {
                int size = this.v.size();
                SparseArray sparseArray = this.v;
                if (i >= size) {
                    sparseArray.clear();
                    return;
                } else {
                    ((ej6) sparseArray.valueAt(i)).g(bt4Var);
                    i++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.x.r).execute(new i26((Object) this, (Object) iBinder, (byte) 25));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.x.r).execute(new y86(this, (byte) 2));
    }

    public final synchronized void r() {
        try {
            if (this.g == 2 && this.n.isEmpty() && this.v.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.g = (byte) 3;
                fa4.C().M((Context) this.x.y, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean y(ej6 ej6Var) throws Throwable {
        z56 z56Var;
        Throwable th;
        try {
            try {
                byte b = this.g;
                byte b2 = 0;
                byte b3 = 1;
                try {
                    if (b != 0) {
                        if (b == 1) {
                            this.n.add(ej6Var);
                            return true;
                        }
                        if (b == 2) {
                            this.n.add(ej6Var);
                            ((ScheduledExecutorService) this.x.r).execute(new y86(this, b3));
                            return true;
                        }
                        if (b == 3 || b == 4) {
                            return false;
                        }
                        StringBuilder sb = new StringBuilder(26);
                        sb.append("Unknown state: ");
                        sb.append((int) b);
                        throw new IllegalStateException(sb.toString());
                    }
                    this.n.add(ej6Var);
                    try {
                        if (this.g == 0) {
                            if (Log.isLoggable("MessengerIpcClient", 2)) {
                                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                            }
                            this.g = (byte) 1;
                            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                            intent.setPackage("com.google.android.gms");
                            fa4 fa4VarC = fa4.C();
                            try {
                                Context context = (Context) this.x.y;
                                try {
                                    z56Var = this;
                                    try {
                                        if (fa4VarC.z0(context, context.getClass().getName(), intent, z56Var, 1, null)) {
                                            ((ScheduledExecutorService) z56Var.x.r).schedule(new y86(z56Var, b2), 30L, TimeUnit.SECONDS);
                                        } else {
                                            z56Var.g("Unable to bind to service");
                                        }
                                        return true;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    z56Var = this;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                z56Var = this;
                            }
                        } else {
                            z56Var = this;
                            try {
                                throw new IllegalStateException();
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                    th = th;
                } catch (Throwable th7) {
                    th = th7;
                    z56Var = this;
                }
            } catch (Throwable th8) {
                th = th8;
                th = th;
            }
        } catch (Throwable th9) {
            th = th9;
            z56Var = this;
            th = th;
        }
        throw th;
    }
}
