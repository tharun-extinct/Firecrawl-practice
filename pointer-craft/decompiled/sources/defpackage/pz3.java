package defpackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class pz3 {
    public final int g;
    public final long n;
    public final long r;
    public final int y;

    public pz3(int i, int i2, long j, long j2) {
        this.g = i;
        this.y = i2;
        this.r = j;
        this.n = j2;
    }

    public static pz3 g(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            pz3 pz3Var = new pz3(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return pz3Var;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof pz3)) {
            pz3 pz3Var = (pz3) obj;
            if (this.y == pz3Var.y && this.r == pz3Var.r && this.g == pz3Var.g && this.n == pz3Var.n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.y), Long.valueOf(this.r), Integer.valueOf(this.g), Long.valueOf(this.n));
    }

    public final void y(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.g);
            dataOutputStream.writeInt(this.y);
            dataOutputStream.writeLong(this.r);
            dataOutputStream.writeLong(this.n);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
