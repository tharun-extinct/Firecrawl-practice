package defpackage;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* JADX INFO: loaded from: classes2.dex */
public final class p05 implements Runnable {
    public final /* synthetic */ byte j;
    public final r05 t;

    public /* synthetic */ p05(r05 r05Var, byte b) {
        this.j = b;
        this.t = r05Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0090 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:6:0x001b, B:8:0x001f, B:10:0x0044, B:13:0x004a, B:14:0x0051, B:15:0x0052, B:16:0x005c, B:20:0x0066, B:22:0x006e, B:23:0x0070, B:27:0x007a, B:29:0x0089, B:37:0x009b, B:33:0x008f, B:34:0x0090, B:36:0x0098, B:41:0x009f, B:24:0x0071, B:25:0x0077, B:17:0x005d, B:18:0x0063), top: B:64:0x001b, inners: #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0098 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:6:0x001b, B:8:0x001f, B:10:0x0044, B:13:0x004a, B:14:0x0051, B:15:0x0052, B:16:0x005c, B:20:0x0066, B:22:0x006e, B:23:0x0070, B:27:0x007a, B:29:0x0089, B:37:0x009b, B:33:0x008f, B:34:0x0090, B:36:0x0098, B:41:0x009f, B:24:0x0071, B:25:0x0077, B:17:0x005d, B:18:0x0063), top: B:64:0x001b, inners: #3, #4 }] */
    @Override // java.lang.Runnable
    public final void run() {
        r05 r05Var;
        p05 p05Var;
        boolean zIsEmpty;
        boolean zIsEmpty2;
        switch (this.j) {
            case 0:
                synchronized (this.t.i) {
                    r05 r05Var2 = this.t;
                    r05Var2.b = (Intent) r05Var2.i.get(0);
                    break;
                }
                Intent intent = this.t.b;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.t.b.getIntExtra("KEY_START_ID", 0);
                    iy2 iy2VarR = iy2.r();
                    String str = r05.p;
                    iy2VarR.g(str, String.format("Processing command %s, %s", this.t.b, Integer.valueOf(intExtra)), new Throwable[0]);
                    PowerManager.WakeLock wakeLockG = cn5.g(this.t.j, action + " (" + intExtra + ")");
                    byte b = 1;
                    try {
                        iy2.r().g(str, "Acquiring operation wake lock (" + action + ") " + wakeLockG, new Throwable[0]);
                        wakeLockG.acquire();
                        r05 r05Var3 = this.t;
                        r05Var3.w.r(intExtra, r05Var3, r05Var3.b);
                        iy2.r().g(str, "Releasing operation wake lock (" + action + ") " + wakeLockG, new Throwable[0]);
                        wakeLockG.release();
                        r05Var = this.t;
                        p05Var = new p05(r05Var, b);
                    } catch (Throwable th) {
                        try {
                            iy2 iy2VarR2 = iy2.r();
                            String str2 = r05.p;
                            iy2VarR2.y(str2, "Unexpected error in onHandleIntent", th);
                            iy2.r().g(str2, "Releasing operation wake lock (" + action + ") " + wakeLockG, new Throwable[0]);
                            wakeLockG.release();
                            r05Var = this.t;
                            p05Var = new p05(r05Var, b);
                        } catch (Throwable th2) {
                            iy2.r().g(r05.p, "Releasing operation wake lock (" + action + ") " + wakeLockG, new Throwable[0]);
                            wakeLockG.release();
                            r05 r05Var4 = this.t;
                            r05Var4.v(new p05(r05Var4, b));
                            throw th2;
                        }
                    }
                    r05Var.v(p05Var);
                    return;
                }
                return;
            default:
                r05 r05Var5 = this.t;
                iy2 iy2VarR3 = iy2.r();
                String str3 = r05.p;
                iy2VarR3.g(str3, "Checking if commands are complete.", new Throwable[0]);
                r05Var5.r();
                synchronized (r05Var5.i) {
                    try {
                        if (r05Var5.b != null) {
                            iy2.r().g(str3, String.format("Removing command %s", r05Var5.b), new Throwable[0]);
                            if (!((Intent) r05Var5.i.remove(0)).equals(r05Var5.b)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            r05Var5.b = null;
                        }
                        lk4 lk4Var = (lk4) r05Var5.t.g;
                        qk0 qk0Var = r05Var5.w;
                        synchronized (qk0Var.a) {
                            zIsEmpty = qk0Var.t.isEmpty();
                            break;
                        }
                        if (zIsEmpty && r05Var5.i.isEmpty()) {
                            synchronized (lk4Var.a) {
                                zIsEmpty2 = lk4Var.j.isEmpty();
                                break;
                            }
                            if (zIsEmpty2) {
                                iy2.r().g(str3, "No more commands & intents.", new Throwable[0]);
                                SystemAlarmService systemAlarmService = r05Var5.s;
                                if (systemAlarmService != null) {
                                    systemAlarmService.g();
                                }
                            } else if (!r05Var5.i.isEmpty()) {
                                r05Var5.x();
                            }
                        } else if (!r05Var5.i.isEmpty()) {
                            r05Var5.x();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }
}
