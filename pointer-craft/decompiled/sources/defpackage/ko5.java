package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ko5 {
    public final int g;
    public long r;
    public long y;

    public ko5(int i) {
        this.g = i;
    }

    public static void y(ko5 ko5Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        synchronized (ko5Var) {
            try {
                if (j < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j2 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j3 = ko5Var.y + j;
                ko5Var.y = j3;
                long j4 = ko5Var.r + j2;
                ko5Var.r = j4;
                if (j4 > j3) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized long g() {
        return this.y - this.r;
    }

    public final String toString() {
        return "WindowCounter(streamId=" + this.g + ", total=" + this.y + ", acknowledged=" + this.r + ", unacknowledged=" + g() + ')';
    }
}
