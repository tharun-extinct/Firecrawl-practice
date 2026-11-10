package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class up1 {
    public List g;
    public int y;

    public static int g(int i) {
        if (i == 113) {
            return 1;
        }
        if (i == 114) {
            return 16;
        }
        if (i == 117) {
            return 8;
        }
        if (i == 118) {
            return 128;
        }
        switch (i) {
            case 57:
                return 4;
            case 58:
                return 64;
            case 59:
                return 2;
            case 60:
                return 32;
            default:
                return i;
        }
    }

    public byte[] y() {
        byte[] bArr = new byte[7];
        bArr[0] = (byte) this.y;
        Iterator it = this.g.iterator();
        int i = 2;
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (i >= 7) {
                break;
            }
            bArr[i] = (byte) iIntValue;
            i++;
        }
        return bArr;
    }
}
