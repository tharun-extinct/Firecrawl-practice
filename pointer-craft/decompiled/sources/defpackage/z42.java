package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class z42 {
    public final byte g;

    public static final boolean g(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z42) {
            return this.g == ((z42) obj).g;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g);
    }

    public final String toString() {
        byte b = this.g;
        if (b == 16) {
            return "Confirm";
        }
        if (b == 6) {
            return "ContextClick";
        }
        if (b == 13) {
            return "GestureEnd";
        }
        if (b == 23) {
            return "GestureThresholdActivate";
        }
        if (b == 3) {
            return "KeyboardTap";
        }
        if (b == 0) {
            return "LongPress";
        }
        if (b == 17) {
            return "Reject";
        }
        if (b == 27) {
            return "SegmentFrequentTick";
        }
        if (b == 26) {
            return "SegmentTick";
        }
        if (b == 9) {
            return "TextHandleMove";
        }
        if (b == 22) {
            return "ToggleOff";
        }
        if (b == 21) {
            return "ToggleOn";
        }
        return b == 1 ? "VirtualKey" : "Invalid";
    }
}
