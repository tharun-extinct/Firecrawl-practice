package defpackage;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class ly3 {
    public static final HashMap v = new HashMap();
    public final boolean g;
    public FileChannel n;
    public final Lock r;
    public final File y;

    public ly3(String str, File file, boolean z) {
        Lock lock;
        this.g = z;
        this.y = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap map = v;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.r = lock;
    }

    public final void g(boolean z) {
        this.r.lock();
        if (z) {
            File file = this.y;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.n = channel;
            } catch (IOException e) {
                this.n = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e);
            }
        }
    }

    public final void y() {
        try {
            FileChannel fileChannel = this.n;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.r.unlock();
    }
}
