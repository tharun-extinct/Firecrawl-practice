package defpackage;

import android.util.Log;
import android.util.Xml;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class tu2 implements Runnable {
    public final Object a;
    public final /* synthetic */ byte j;
    public Object t;

    public /* synthetic */ tu2(byte b, Object obj, Object obj2, boolean z) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        ((java.lang.Runnable) r10.t).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        defpackage.ik4.w.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.t), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r10.t = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.a     // Catch: java.lang.Throwable -> L58
            ik4 r2 = (defpackage.ik4) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.t     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.a     // Catch: java.lang.Throwable -> L20
            ik4 r0 = (defpackage.ik4) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.a     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
            goto L46
        L20:
            r10 = move-exception
            goto L7d
        L22:
            long r6 = r0.m     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.m = r6     // Catch: java.lang.Throwable -> L20
            r0.a = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.a     // Catch: java.lang.Throwable -> L20
            ik4 r4 = (defpackage.ik4) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.t     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.t = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r10 = r10.a     // Catch: java.lang.Throwable -> L20
            ik4 r10 = (defpackage.ik4) r10     // Catch: java.lang.Throwable -> L20
            r10.a = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.t     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
        L55:
            r10.t = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r10 = move-exception
            goto L7f
        L5a:
            r0 = move-exception
            goto L7a
        L5c:
            r3 = move-exception
            java.util.logging.Logger r4 = defpackage.ik4.w     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.t     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7a:
            r10.t = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r10     // Catch: java.lang.Throwable -> L58
        L7f:
            if (r1 == 0) goto L88
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L88:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tu2.g():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        Exception exc;
        boolean z;
        FileOutputStream fileOutputStream = null;
        switch (this.j) {
            case 0:
                int i = 0;
                while (true) {
                    try {
                        ((Runnable) this.t).run();
                    } catch (Throwable th) {
                        ae6.y(ni1.j, th);
                    }
                    try {
                        Runnable runnableS = ((uu2) this.a).S();
                        if (runnableS == null) {
                            return;
                        }
                        this.t = runnableS;
                        i++;
                        if (i >= 16) {
                            uu2 uu2Var = (uu2) this.a;
                            if (pw5.M(uu2Var.m, uu2Var)) {
                                uu2 uu2Var2 = (uu2) this.a;
                                pw5.L(uu2Var2.m, uu2Var2, this);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        uu2 uu2Var3 = (uu2) this.a;
                        synchronized (uu2Var3.c) {
                            uu2.i.decrementAndGet(uu2Var3);
                            throw th2;
                        }
                    }
                    break;
                }
                break;
            case 1:
                try {
                    g();
                    return;
                } catch (Error e) {
                    synchronized (((ik4) this.a).t) {
                        ((ik4) this.a).a = 1;
                        throw e;
                    }
                }
            case 2:
                lk4 lk4Var = (lk4) this.a;
                try {
                    ((Runnable) this.t).run();
                    return;
                } finally {
                    lk4Var.g();
                }
            case 3:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.a;
                ArrayList arrayList = (ArrayList) this.t;
                shortcutInfoCompatSaverImpl.r(arrayList);
                File file = shortcutInfoCompatSaverImpl.x;
                ro roVar = new ro(file);
                File file2 = (File) roVar.a;
                try {
                    FileOutputStream fileOutputStreamD0 = roVar.d0();
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStreamD0);
                        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                        xmlSerializerNewSerializer.setOutput(bufferedOutputStream, "UTF_8");
                        xmlSerializerNewSerializer.startDocument(null, Boolean.TRUE);
                        xmlSerializerNewSerializer.startTag(null, "share_targets");
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            v13.F(xmlSerializerNewSerializer, (hp4) obj);
                        }
                        xmlSerializerNewSerializer.endTag(null, "share_targets");
                        xmlSerializerNewSerializer.endDocument();
                        bufferedOutputStream.flush();
                        fileOutputStreamD0.flush();
                        try {
                            fileOutputStreamD0.getFD().sync();
                            z = true;
                        } catch (IOException unused) {
                            z = false;
                        }
                        if (!z) {
                            Log.e("AtomicFile", "Failed to sync file output stream");
                        }
                        try {
                            fileOutputStreamD0.close();
                            break;
                        } catch (IOException e2) {
                            Log.e("AtomicFile", "Failed to close file output stream", e2);
                        }
                        ro.U(file2, file);
                        return;
                    } catch (Exception e3) {
                        exc = e3;
                        fileOutputStream = fileOutputStreamD0;
                        Log.e("ShortcutInfoCompatSaver", "Failed to write to file " + file, exc);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.getFD().sync();
                            } catch (IOException unused2) {
                                Log.e("AtomicFile", "Failed to sync file output stream");
                            }
                            try {
                                fileOutputStream.close();
                            } catch (IOException e4) {
                                Log.e("AtomicFile", "Failed to close file output stream", e4);
                            }
                            if (!file2.delete()) {
                                Log.e("AtomicFile", "Failed to delete new file " + file2);
                            }
                            break;
                        }
                        t94.l("Failed to write to file ", file, exc);
                        return;
                    }
                } catch (Exception e5) {
                    exc = e5;
                }
                break;
            case 4:
                m74 m74Var = (m74) this.a;
                try {
                    ((m74) this.t).get();
                    m74Var.a(null);
                    return;
                } catch (Exception e6) {
                    m74Var.m(e6);
                    return;
                }
            case 5:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl2 = (ShortcutInfoCompatSaverImpl) this.a;
                mr mrVar = shortcutInfoCompatSaverImpl2.y;
                try {
                    ShortcutInfoCompatSaverImpl.n((File) this.t);
                    ShortcutInfoCompatSaverImpl.n(shortcutInfoCompatSaverImpl2.l);
                    mrVar.putAll(v13.z(shortcutInfoCompatSaverImpl2.x, shortcutInfoCompatSaverImpl2.g));
                    shortcutInfoCompatSaverImpl2.r(new ArrayList(mrVar.values()));
                    return;
                } catch (Exception e7) {
                    Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e7);
                    return;
                }
            case 6:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl3 = (ShortcutInfoCompatSaverImpl) this.a;
                shortcutInfoCompatSaverImpl3.y.clear();
                mr mrVar2 = shortcutInfoCompatSaverImpl3.r;
                Iterator it = ((kr) mrVar2.values()).iterator();
                while (it.hasNext()) {
                    ((vw2) it.next()).cancel(false);
                }
                mrVar2.clear();
                shortcutInfoCompatSaverImpl3.x((m74) this.t);
                return;
            case 7:
                if (((m74) this.a).j instanceof b1) {
                    return;
                }
                try {
                    ((Runnable) this.t).run();
                    ((m74) this.a).a(null);
                    return;
                } catch (Exception e8) {
                    ((m74) this.a).m(e8);
                    return;
                }
            case 8:
                o00 o00Var = (o00) this.t;
                q00 q00Var = (q00) this.a;
                x20 x20Var = b36.m;
                o00Var.G(24, 13, x20Var);
                q00Var.g(x20Var);
                return;
            case 9:
                Future future = (Future) this.a;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                Runnable runnable = (Runnable) this.t;
                future.cancel(true);
                i06.j("BillingClient", "Async task is taking too long, cancel it!");
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 10:
                o00 o00Var2 = (o00) this.t;
                q64 q64Var = (q64) this.a;
                x20 x20Var2 = b36.m;
                o00Var2.G(24, 7, x20Var2);
                vz5 vz5Var = a06.t;
                r06 r06Var = r06.q;
                el0 el0Var = (el0) q64Var.t;
                x20Var2.getClass();
                el0Var.f0(new kz3(x20Var2, r06Var));
                return;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                o00 o00Var3 = (o00) this.t;
                y22 y22Var = (y22) this.a;
                x20 x20Var3 = b36.m;
                o00Var3.G(24, 9, x20Var3);
                vz5 vz5Var2 = a06.t;
                y22Var.o(x20Var3, r06.q);
                return;
            case 12:
                try {
                    ((o00) ((wh4) this.t).t).F.g((x20) this.a);
                    return;
                } catch (Throwable th3) {
                    i06.t("BillingClient", "Exception calling onBillingSetupFinished.", th3);
                    return;
                }
            default:
                nj6 nj6Var = (nj6) this.t;
                try {
                    nj6Var.m(((Callable) this.a).call());
                    return;
                } catch (Exception e9) {
                    nj6Var.w(e9);
                    return;
                } catch (Throwable th4) {
                    nj6Var.w(new RuntimeException(th4));
                    return;
                }
        }
    }

    public String toString() {
        switch (this.j) {
            case 1:
                Runnable runnable = (Runnable) this.t;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                return "SequentialExecutorWorker{state=" + ei3.s(((ik4) this.a).a) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ tu2(Object obj, Object obj2, byte b) {
        this.j = b;
        this.a = obj;
        this.t = obj2;
    }

    public tu2(ik4 ik4Var) {
        this.j = (byte) 1;
        this.a = ik4Var;
    }
}
