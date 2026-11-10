package defpackage;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class do1 implements ii0 {
    public final File g;
    public final xh n;
    public final xp4 r;
    public final AtomicBoolean v;
    public final ec3 x;
    public final nk4 y;

    public do1(File file, nk4 nk4Var, xp4 xp4Var, xh xhVar) {
        xp4Var.getClass();
        this.g = file;
        this.y = nk4Var;
        this.r = xp4Var;
        this.n = xhVar;
        this.v = new AtomicBoolean(false);
        this.x = new ec3();
    }

    @Override // defpackage.ii0
    public final void close() {
        this.v.set(true);
        this.n.g();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x008c */
    /* JADX WARN: Code duplicated, block: B:31:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:58:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.tu0 r8, defpackage.ou0 r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.bo1
            if (r0 == 0) goto L13
            r0 = r9
            bo1 r0 = (defpackage.bo1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            bo1 r0 = new bo1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.b
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L38
            if (r1 != r2) goto L32
            boolean r7 = r0.w
            zn1 r8 = r0.q
            do1 r0 = r0.m
            defpackage.js2.o(r9)     // Catch: java.lang.Throwable -> L2c
            goto L6b
        L2c:
            r9 = move-exception
            r6 = r9
            r9 = r7
            r7 = r0
            r0 = r6
            goto L83
        L32:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.l0.z(r7)
            return r3
        L38:
            defpackage.js2.o(r9)
            java.util.concurrent.atomic.AtomicBoolean r9 = r7.v
            boolean r9 = r9.get()
            if (r9 != 0) goto L95
            ec3 r9 = r7.x
            boolean r9 = r9.v()
            zn1 r1 = new zn1     // Catch: java.lang.Throwable -> L8c
            java.io.File r4 = r7.g     // Catch: java.lang.Throwable -> L8c
            nk4 r5 = r7.y     // Catch: java.lang.Throwable -> L8c
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L80
            r0.m = r7     // Catch: java.lang.Throwable -> L80
            r0.q = r1     // Catch: java.lang.Throwable -> L80
            r0.w = r9     // Catch: java.lang.Throwable -> L80
            r0.b = r2     // Catch: java.lang.Throwable -> L80
            java.lang.Object r8 = r8.x(r1, r4, r0)     // Catch: java.lang.Throwable -> L80
            px0 r0 = defpackage.px0.j
            if (r8 != r0) goto L67
            return r0
        L67:
            r0 = r7
            r7 = r9
            r9 = r8
            r8 = r1
        L6b:
            r8.close()     // Catch: java.lang.Throwable -> L70
            r8 = r3
            goto L71
        L70:
            r8 = move-exception
        L71:
            if (r8 != 0) goto L7b
            if (r7 == 0) goto L7a
            ec3 r7 = r0.x
            r7.x(r3)
        L7a:
            return r9
        L7b:
            throw r8     // Catch: java.lang.Throwable -> L7c
        L7c:
            r8 = move-exception
            r9 = r7
            r7 = r0
            goto L8d
        L80:
            r8 = move-exception
            r0 = r8
            r8 = r1
        L83:
            r8.close()     // Catch: java.lang.Throwable -> L87
            goto L8b
        L87:
            r8 = move-exception
            defpackage.kf6.g(r0, r8)     // Catch: java.lang.Throwable -> L8c
        L8b:
            throw r0     // Catch: java.lang.Throwable -> L8c
        L8c:
            r8 = move-exception
        L8d:
            if (r9 == 0) goto L94
            ec3 r7 = r7.x
            r7.x(r3)
        L94:
            throw r8
        L95:
            java.lang.String r7 = "StorageConnection has already been disposed."
            defpackage.l0.z(r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.do1.g(tu0, ou0):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00da A[Catch: all -> 0x0115, IOException -> 0x0117, TRY_ENTER, TryCatch #1 {IOException -> 0x0117, blocks: (B:43:0x00da, B:45:0x00e0, B:47:0x00e8, B:51:0x00f4, B:52:0x0114, B:48:0x00ed, B:59:0x0120, B:66:0x012d, B:65:0x012a), top: B:78:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e0 A[Catch: all -> 0x0115, IOException -> 0x0117, TryCatch #1 {IOException -> 0x0117, blocks: (B:43:0x00da, B:45:0x00e0, B:47:0x00e8, B:51:0x00f4, B:52:0x0114, B:48:0x00ed, B:59:0x0120, B:66:0x012d, B:65:0x012a), top: B:78:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e8 A[Catch: all -> 0x0115, IOException -> 0x0117, TryCatch #1 {IOException -> 0x0117, blocks: (B:43:0x00da, B:45:0x00e0, B:47:0x00e8, B:51:0x00f4, B:52:0x0114, B:48:0x00ed, B:59:0x0120, B:66:0x012d, B:65:0x012a), top: B:78:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ed A[Catch: all -> 0x0115, IOException -> 0x0117, TryCatch #1 {IOException -> 0x0117, blocks: (B:43:0x00da, B:45:0x00e0, B:47:0x00e8, B:51:0x00f4, B:52:0x0114, B:48:0x00ed, B:59:0x0120, B:66:0x012d, B:65:0x012a), top: B:78:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f4 A[Catch: all -> 0x0115, IOException -> 0x0117, TryCatch #1 {IOException -> 0x0117, blocks: (B:43:0x00da, B:45:0x00e0, B:47:0x00e8, B:51:0x00f4, B:52:0x0114, B:48:0x00ed, B:59:0x0120, B:66:0x012d, B:65:0x012a), top: B:78:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0120 A[Catch: all -> 0x0115, IOException -> 0x0117, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x0117, blocks: (B:43:0x00da, B:45:0x00e0, B:47:0x00e8, B:51:0x00f4, B:52:0x0114, B:48:0x00ed, B:59:0x0120, B:66:0x012d, B:65:0x012a), top: B:78:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x00f4, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [cc3, int] */
    public final Object y(o01 o01Var, ou0 ou0Var) throws IOException {
        co1 co1Var;
        File file;
        cc3 cc3Var;
        bz1 bz1Var;
        fo1 fo1Var;
        Throwable th;
        fo1 fo1Var2;
        do1 do1Var;
        File file2;
        File file3;
        boolean zRenameTo;
        if (ou0Var instanceof co1) {
            co1Var = (co1) ou0Var;
            int i = co1Var.s;
            if ((i & Integer.MIN_VALUE) != 0) {
                co1Var.s = i - Integer.MIN_VALUE;
            } else {
                co1Var = new co1(this, ou0Var);
            }
        } else {
            co1Var = new co1(this, ou0Var);
        }
        Object obj = co1Var.i;
        ?? r2 = co1Var.s;
        px0 px0Var = px0.j;
        try {
            try {
                try {
                    try {
                        if (r2 == 0) {
                            js2.o(obj);
                            if (this.v.get()) {
                                l0.z("StorageConnection has already been disposed.");
                                return null;
                            }
                            File file4 = this.g;
                            File parentFile = file4.getCanonicalFile().getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                                if (!parentFile.isDirectory()) {
                                    throw new IOException("Unable to create parent directories of " + file4);
                                }
                            }
                            co1Var.m = this;
                            co1Var.q = o01Var;
                            ec3 ec3Var = this.x;
                            co1Var.w = ec3Var;
                            co1Var.s = 1;
                            if (ec3Var.y(co1Var) != px0Var) {
                                cc3Var = ec3Var;
                                bz1Var = o01Var;
                            }
                            return px0Var;
                        }
                        if (r2 != 1) {
                            if (r2 != 2) {
                                l0.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            fo1Var2 = co1Var.c;
                            File file5 = (File) co1Var.w;
                            cc3Var = (cc3) co1Var.q;
                            do1Var = co1Var.m;
                            try {
                                js2.o(obj);
                                file2 = file5;
                                try {
                                    fo1Var2.close();
                                    th = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (file2.exists()) {
                                    file3 = do1Var.g;
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        zRenameTo = rj.r(file2, file3);
                                    } else {
                                        zRenameTo = file2.renameTo(file3);
                                    }
                                    if (zRenameTo) {
                                        throw new IOException("Unable to rename " + file2 + " to " + do1Var.g + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                    }
                                }
                                cc3Var.x(null);
                                return og5.g;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    fo1Var2.close();
                                } catch (Throwable th4) {
                                    kf6.g(th, th4);
                                }
                                throw th;
                            }
                        }
                        cc3 cc3Var2 = (cc3) co1Var.w;
                        bz1 bz1Var2 = (bz1) co1Var.q;
                        do1 do1Var2 = co1Var.m;
                        js2.o(obj);
                        cc3Var = cc3Var2;
                        this = do1Var2;
                        bz1Var = bz1Var2;
                        co1Var.m = this;
                        co1Var.q = cc3Var;
                        co1Var.w = file;
                        co1Var.c = fo1Var;
                        co1Var.s = 2;
                        if (bz1Var.l(fo1Var, co1Var) != px0Var) {
                            do1Var = this;
                            file2 = file;
                            fo1Var2 = fo1Var;
                            fo1Var2.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (file2.exists()) {
                                file3 = do1Var.g;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    zRenameTo = rj.r(file2, file3);
                                } else {
                                    zRenameTo = file2.renameTo(file3);
                                }
                                if (zRenameTo) {
                                    throw new IOException("Unable to rename " + file2 + " to " + do1Var.g + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                }
                            }
                            cc3Var.x(null);
                            return og5.g;
                        }
                        return px0Var;
                    } catch (Throwable th5) {
                        th = th5;
                        fo1Var2 = fo1Var;
                        fo1Var2.close();
                        throw th;
                    }
                    fo1Var = new fo1(file, this.y);
                } catch (IOException e) {
                    e = e;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(this.g.getAbsolutePath() + ".tmp");
            } catch (IOException e2) {
                e = e2;
                file = o01Var;
            }
        } catch (Throwable th6) {
            r2.x(null);
            throw th6;
        }
    }
}
