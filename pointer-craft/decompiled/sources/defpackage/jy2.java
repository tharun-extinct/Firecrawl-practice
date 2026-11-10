package defpackage;

import android.bluetooth.BluetoothDevice;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class jy2 {
    public final ConcurrentLinkedQueue g = new ConcurrentLinkedQueue();
    public final AtomicInteger y = new AtomicInteger();
    public final long r = System.currentTimeMillis();

    public final void g(BluetoothDevice bluetoothDevice, String str) {
        bluetoothDevice.getClass();
        String address = bluetoothDevice.getAddress();
        address.getClass();
        y(str, "<" + address.substring(15) + ">");
    }

    public final void y(Object obj, String str) {
        String str2;
        String str3 = "[" + (System.currentTimeMillis() - this.r) + "] " + str + " " + obj + "\n";
        ConcurrentLinkedQueue concurrentLinkedQueue = this.g;
        concurrentLinkedQueue.add(str3);
        int length = str3.length();
        AtomicInteger atomicInteger = this.y;
        int iAddAndGet = atomicInteger.addAndGet(length);
        while (iAddAndGet > 100000 && (str2 = (String) concurrentLinkedQueue.poll()) != null) {
            iAddAndGet = atomicInteger.addAndGet(-str2.length());
        }
    }
}
