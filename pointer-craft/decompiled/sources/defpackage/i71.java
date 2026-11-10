package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class i71 {
    public final AssetManager g;
    public w81[] j;
    public boolean l = false;
    public final byte[] n;
    public final mz3 r;
    public byte[] t;
    public final File v;
    public final String x;
    public final Executor y;

    public i71(AssetManager assetManager, Executor executor, mz3 mz3Var, String str, File file) {
        byte[] bArr;
        this.g = assetManager;
        this.y = executor;
        this.r = mz3Var;
        this.x = str;
        this.v = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 24:
                case 25:
                    bArr = sd6.v;
                    break;
                case 26:
                    bArr = sd6.n;
                    break;
                case 27:
                    bArr = sd6.r;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = sd6.y;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = sd6.g;
        }
        this.n = bArr;
    }

    public final boolean g() {
        if (this.n == null) {
            n(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        File file = this.v;
        if (!file.exists()) {
            try {
                if (!file.createNewFile()) {
                    n(4, null);
                    return false;
                }
            } catch (IOException unused) {
                n(4, null);
                return false;
            }
        } else if (!file.canWrite()) {
            n(4, null);
            return false;
        }
        this.l = true;
        return true;
    }

    public final void n(int i, Serializable serializable) {
        this.y.execute(new h71((byte) 0, i, this, serializable));
    }

    public final i71 r() {
        FileInputStream fileInputStreamY;
        w81[] w81VarArrT;
        int i;
        AssetManager assetManager = this.g;
        mz3 mz3Var = this.r;
        i71 i71Var = null;
        if (!this.l) {
            l0.z("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
            return null;
        }
        byte[] bArr = this.n;
        if (bArr != null) {
            try {
                fileInputStreamY = y(assetManager, "dexopt/baseline.prof");
            } catch (FileNotFoundException e) {
                mz3Var.q(6, e);
                fileInputStreamY = null;
            } catch (IOException e2) {
                mz3Var.q(7, e2);
                fileInputStreamY = null;
            }
            try {
                if (fileInputStreamY != null) {
                    try {
                        try {
                            if (!Arrays.equals(rd6.g, hf6.x(fileInputStreamY, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            w81VarArrT = rd6.t(fileInputStreamY, hf6.x(fileInputStreamY, 4), this.x);
                            try {
                                fileInputStreamY.close();
                            } catch (IOException e3) {
                                mz3Var.q(7, e3);
                            }
                            this.j = w81VarArrT;
                        } catch (IOException e4) {
                            mz3Var.q(7, e4);
                            try {
                                fileInputStreamY.close();
                            } catch (IOException e5) {
                                mz3Var.q(7, e5);
                            }
                            w81VarArrT = null;
                        }
                    } catch (IllegalStateException e6) {
                        mz3Var.q(8, e6);
                        fileInputStreamY.close();
                        w81VarArrT = null;
                    }
                }
                w81[] w81VarArr = this.j;
                if (w81VarArr != null && ((i = Build.VERSION.SDK_INT) >= 31 || i == 24 || i == 25)) {
                    try {
                        FileInputStream fileInputStreamY2 = y(assetManager, "dexopt/baseline.profm");
                        if (fileInputStreamY2 != null) {
                            try {
                                if (!Arrays.equals(rd6.y, hf6.x(fileInputStreamY2, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                this.j = rd6.x(fileInputStreamY2, hf6.x(fileInputStreamY2, 4), bArr, w81VarArr);
                                fileInputStreamY2.close();
                                i71Var = this;
                            } catch (Throwable th) {
                                try {
                                    fileInputStreamY2.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } else if (fileInputStreamY2 != null) {
                            fileInputStreamY2.close();
                        }
                    } catch (FileNotFoundException e7) {
                        mz3Var.q(9, e7);
                    } catch (IOException e8) {
                        mz3Var.q(7, e8);
                    } catch (IllegalStateException e9) {
                        this.j = null;
                        mz3Var.q(8, e9);
                    }
                    if (i71Var != null) {
                        return i71Var;
                    }
                }
            } catch (Throwable th3) {
                try {
                    fileInputStreamY.close();
                } catch (IOException e10) {
                    mz3Var.q(7, e10);
                }
                throw th3;
            }
        }
        return this;
    }

    public final void v() {
        byte[] bArr;
        mz3 mz3Var = this.r;
        w81[] w81VarArr = this.j;
        if (w81VarArr == null || (bArr = this.n) == null) {
            return;
        }
        if (!this.l) {
            l0.z("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(rd6.g);
                byteArrayOutputStream.write(bArr);
                if (rd6.m(byteArrayOutputStream, bArr, w81VarArr)) {
                    this.t = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    this.j = null;
                } else {
                    mz3Var.q(5, null);
                    this.j = null;
                    byteArrayOutputStream.close();
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            mz3Var.q(7, e);
        } catch (IllegalStateException e2) {
            mz3Var.q(8, e2);
        }
    }

    public final boolean x() {
        byte[] bArr = this.t;
        if (bArr != null) {
            if (!this.l) {
                l0.z("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                return false;
            }
            try {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(this.v);
                        try {
                            FileChannel channel = fileOutputStream.getChannel();
                            try {
                                FileLock fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    try {
                                        if (fileLockTryLock.isValid()) {
                                            byte[] bArr2 = new byte[512];
                                            while (true) {
                                                int i = byteArrayInputStream.read(bArr2);
                                                if (i <= 0) {
                                                    n(1, null);
                                                    fileLockTryLock.close();
                                                    channel.close();
                                                    fileOutputStream.close();
                                                    byteArrayInputStream.close();
                                                    this.t = null;
                                                    this.j = null;
                                                    return true;
                                                }
                                                fileOutputStream.write(bArr2, 0, i);
                                            }
                                        }
                                    } catch (Throwable th) {
                                        if (fileLockTryLock != null) {
                                            try {
                                                fileLockTryLock.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                        }
                                        throw th;
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            } catch (Throwable th3) {
                                if (channel != null) {
                                    try {
                                        channel.close();
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                }
                                throw th3;
                            }
                        } catch (Throwable th5) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                            throw th5;
                        }
                    } catch (Throwable th7) {
                        try {
                            byteArrayInputStream.close();
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                        }
                        throw th7;
                    }
                } catch (FileNotFoundException e) {
                    n(6, e);
                    this.t = null;
                    this.j = null;
                    return false;
                } catch (IOException e2) {
                    n(7, e2);
                    this.t = null;
                    this.j = null;
                    return false;
                }
            } catch (Throwable th9) {
                this.t = null;
                this.j = null;
                throw th9;
            }
        }
        return false;
    }

    public final FileInputStream y(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.r.a();
            return null;
        }
    }
}
