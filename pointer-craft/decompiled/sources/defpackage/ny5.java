package defpackage;

import android.os.Looper;
import android.system.Os;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ny5 {
    public static ClassLoader g;
    public static Thread y;
    public static final nm0 r = new nm0(-1766407685, false, new os(24));
    public static final nm0 n = new nm0(-1775447777, false, new sm0(0));
    public static final nm0 v = new nm0(-1198166746, false, new sm0(1));
    public static final nm0 x = new nm0(-1889710013, false, new sm0(2));
    public static final nm0 l = new nm0(651522087, false, new sm0(3));
    public static final nm0 j = new nm0(-1015165681, false, new sm0(4));
    public static final nm0 t = new nm0(131685612, false, new sm0(5));
    public static final nm0 a = new nm0(-1580657712, false, new os(25));
    public static final nm0 m = new nm0(1731621995, false, new os(26));
    public static final nm0 q = new nm0(1504106312, false, new os(27));
    public static final nm0 w = new nm0(-362652882, false, new at(8));
    public static final nm0 c = new nm0(-142418456, false, new os(28));
    public static final nm0 i = new nm0(75194541, false, new os(29));

    public static void g(ArrayList arrayList, char c2) {
        if (c2 == 12595) {
            arrayList.add((char) 12593);
            arrayList.add((char) 12613);
        }
        if (c2 == 12612) {
            arrayList.add((char) 12610);
            arrayList.add((char) 12613);
            return;
        }
        if (c2 == 12642) {
            arrayList.add((char) 12641);
            arrayList.add((char) 12643);
            return;
        }
        if (c2 == 12597) {
            arrayList.add((char) 12596);
            arrayList.add((char) 12616);
            return;
        }
        if (c2 == 12598) {
            arrayList.add((char) 12596);
            arrayList.add((char) 12622);
            return;
        }
        switch (c2) {
            case 12602:
                arrayList.add((char) 12601);
                arrayList.add((char) 12593);
                break;
            case 12603:
                arrayList.add((char) 12601);
                arrayList.add((char) 12609);
                break;
            case 12604:
                arrayList.add((char) 12601);
                arrayList.add((char) 12610);
                break;
            case 12605:
                arrayList.add((char) 12601);
                arrayList.add((char) 12613);
                break;
            case 12606:
                arrayList.add((char) 12601);
                arrayList.add((char) 12620);
                break;
            case 12607:
                arrayList.add((char) 12601);
                arrayList.add((char) 12621);
                break;
            case 12608:
                arrayList.add((char) 12601);
                arrayList.add((char) 12622);
                break;
            default:
                switch (c2) {
                    case 12632:
                        arrayList.add((char) 12631);
                        arrayList.add((char) 12623);
                        break;
                    case 12633:
                        arrayList.add((char) 12631);
                        arrayList.add((char) 12624);
                        break;
                    case 12634:
                        arrayList.add((char) 12631);
                        arrayList.add((char) 12643);
                        break;
                    default:
                        switch (c2) {
                            case 12637:
                                arrayList.add((char) 12636);
                                arrayList.add((char) 12627);
                                break;
                            case 12638:
                                arrayList.add((char) 12636);
                                arrayList.add((char) 12628);
                                break;
                            case 12639:
                                arrayList.add((char) 12636);
                                arrayList.add((char) 12643);
                                break;
                            default:
                                arrayList.add(Character.valueOf(c2));
                                break;
                        }
                        break;
                }
                break;
        }
    }

    public static final void n(nr3 nr3Var, Throwable th) throws Throwable {
        yy3 yy3Var = nr3Var.y;
        Thread threadCurrentThread = Thread.currentThread();
        long id = threadCurrentThread.getId();
        b95 b95VarX = yy3Var.q;
        b95 b95Var = yy3Var.w;
        if (b95VarX == null || b95VarX.m != id) {
            if (b95Var == null || b95Var.m != id) {
                b95VarX = yy3Var.x(id, Os.gettid(), threadCurrentThread.getName());
                yy3Var.w = yy3Var.q;
                yy3Var.q = b95VarX;
            } else {
                b95VarX = b95Var;
            }
        }
        xi1 xi1Var = b95VarX.j;
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            stackTraceElement.getClassName();
            stackTraceElement.getMethodName();
            stackTraceElement.getFileName();
            stackTraceElement.getLineNumber();
        }
        throw th;
    }

    public static void r(int i2, View view, AutofillManager autofillManager, boolean z) {
        autofillManager.notifyViewVisibilityChanged(view, i2, z);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00b8 A[Catch: all -> 0x00b4, PHI: r2
  0x00b8: PHI (r2v1 java.lang.Thread) = (r2v0 java.lang.Thread), (r2v11 java.lang.Thread) binds: [B:7:0x000c, B:47:0x00b0] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000e, B:46:0x00ae, B:62:0x00e7, B:12:0x0023, B:52:0x00b7, B:53:0x00b8, B:65:0x00eb, B:54:0x00b9, B:60:0x00e5, B:59:0x00c3, B:13:0x0024, B:15:0x0031, B:25:0x004b, B:26:0x0052, B:28:0x005d, B:34:0x0072, B:35:0x0079, B:43:0x008a, B:44:0x00ac, B:18:0x0040), top: B:77:0x0003, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static synchronized ClassLoader v() {
        ClassLoader classLoader;
        SecurityException e;
        Thread thread;
        ThreadGroup threadGroup;
        classLoader = g;
        if (classLoader == null) {
            Thread thread2 = y;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = y.getContextClassLoader();
                    } catch (SecurityException e2) {
                        String message = e2.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 41);
                        sb.append("Failed to get thread context classloader ");
                        sb.append(message);
                        Log.w("DynamiteLoaderV2CL", sb.toString());
                    }
                }
                classLoader = contextClassLoader;
                g = classLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i2 = 0;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i3];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i3++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i2 >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i2];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i2++;
                                }
                                if (thread == null) {
                                    try {
                                        vr vrVar = new vr(threadGroup, "GmsDynamite");
                                        try {
                                            vrVar.setContextClassLoader(null);
                                            vrVar.start();
                                            thread = vrVar;
                                        } catch (SecurityException e3) {
                                            e = e3;
                                            thread = vrVar;
                                            String message2 = e.getMessage();
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(message2).length() + 39);
                                            sb2.append("Failed to enumerate thread/threadgroup ");
                                            sb2.append(message2);
                                            Log.w("DynamiteLoaderV2CL", sb2.toString());
                                        }
                                    } catch (SecurityException e4) {
                                        e = e4;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (SecurityException e5) {
                            e = e5;
                            thread = null;
                        }
                    }
                    thread2 = thread;
                }
                y = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = y.getContextClassLoader();
                    }
                }
                classLoader = contextClassLoader;
                g = classLoader;
            }
        }
        return classLoader;
    }

    public static ArrayList y(char c2) {
        if ((4352 <= c2 && c2 < 4608) || (12592 <= c2 && c2 < 12688)) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = nk2.g;
            g(arrayList, c2);
            return arrayList;
        }
        if (44032 > c2 || c2 >= 55204) {
            return null;
        }
        ArrayList arrayList3 = new ArrayList();
        int i2 = c2 - 44032;
        Object obj = nk2.g.get(i2 / 588);
        obj.getClass();
        g(arrayList3, ((Character) obj).charValue());
        Object obj2 = nk2.y.get((i2 % 588) / 28);
        obj2.getClass();
        g(arrayList3, ((Character) obj2).charValue());
        int i3 = i2 % 28;
        if (i3 != 0) {
            Object obj3 = nk2.r.get(i3);
            obj3.getClass();
            g(arrayList3, ((Character) obj3).charValue());
        }
        return arrayList3;
    }
}
