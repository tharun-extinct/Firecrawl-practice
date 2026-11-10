package defpackage;

import android.bluetooth.BluetoothAdapter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ch6 {
    public static final int g(LogRecord logRecord) {
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
    }

    public static final String n(int i, int i2, BluetoothAdapter bluetoothAdapter) throws InterruptedException {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        bluetoothAdapter.getClass();
        try {
            numValueOf = Integer.valueOf(bluetoothAdapter.getScanMode());
        } catch (SecurityException unused) {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() == i) {
            return "already";
        }
        byte b = 1;
        if (i2 < 1) {
            i2 = 1;
        }
        for (fp3 fp3Var : pw5.d(new fp3("setScanMode(mode)", new i62(i, i2, bluetoothAdapter)), new fp3("setScanMode(mode,seconds)", new i62(bluetoothAdapter, i, i2, b)), new fp3("setScanMode(mode,millis)", new i62(bluetoothAdapter, i, i2, (byte) 2)))) {
            String str = (String) fp3Var.j;
            Object objG = ((my1) fp3Var.t).g();
            if (objG instanceof Boolean ? ((Boolean) objG).booleanValue() : objG instanceof Integer ? objG.equals(0) : false) {
                for (int i3 = 0; i3 < 6; i3++) {
                    try {
                        numValueOf3 = Integer.valueOf(bluetoothAdapter.getScanMode());
                    } catch (SecurityException unused2) {
                        numValueOf3 = null;
                    }
                    if (numValueOf3 != null && numValueOf3.intValue() == i) {
                        return str;
                    }
                    Thread.sleep(100L);
                }
            }
        }
        try {
            numValueOf2 = Integer.valueOf(bluetoothAdapter.getScanMode());
        } catch (SecurityException unused3) {
            numValueOf2 = null;
        }
        if (numValueOf2 != null && numValueOf2.intValue() == i) {
            return "unknown";
        }
        return null;
    }

    public static final Object r(BluetoothAdapter bluetoothAdapter, String str, List list) {
        try {
            ArrayList arrayList = new ArrayList(dj0.Y(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((Class) ((fp3) it.next()).j);
            }
            Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
            Method method = BluetoothAdapter.class.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            ArrayList arrayList2 = new ArrayList(dj0.Y(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((fp3) it2.next()).t);
            }
            Object[] array = arrayList2.toArray(new Object[0]);
            return method.invoke(bluetoothAdapter, Arrays.copyOf(array, array.length));
        } catch (Exception unused) {
            return null;
        }
    }

    public static final int y(c63 c63Var) {
        return System.identityHashCode(c63Var);
    }
}
