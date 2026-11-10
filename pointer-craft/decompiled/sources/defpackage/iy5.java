package defpackage;

import android.view.ViewStructure;
import android.view.autofill.AutofillValue;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iy5 {
    public static final nm0 g = new nm0(747788120, false, new os(21));
    public static final nm0 y = new nm0(-1663704063, false, new os(22));
    public static final nm0 r = new nm0(1295889504, false, new os(23));
    public static final nm0 n = new nm0(-1835018618, false, new at(7));

    public static int g(ViewStructure viewStructure) {
        return viewStructure.addChildCount(1);
    }

    public static CharSequence l(AutofillValue autofillValue) {
        return autofillValue.getTextValue();
    }

    public static List n(char c) {
        if (65281 <= c && c < 65375) {
            return pw5.k(Character.valueOf((char) (c - 65248)));
        }
        if (c == 12539) {
            return pw5.k('/');
        }
        if (c == 12540) {
            return pw5.k('-');
        }
        switch (c) {
            case 12288:
                return pw5.k(' ');
            case 12289:
                return pw5.k(',');
            case 12290:
                return pw5.k('.');
            default:
                switch (c) {
                    case 12300:
                        return pw5.k('[');
                    case 12301:
                        return pw5.k(']');
                    case 12302:
                        return pw5.k('[');
                    case 12303:
                        return pw5.k(']');
                    default:
                        switch (c) {
                            case 12353:
                                return pw5.d('l', 'a');
                            case 12354:
                                return pw5.k('a');
                            case 12355:
                                return pw5.d('l', 'i');
                            case 12356:
                                return pw5.k('i');
                            case 12357:
                                return pw5.d('l', 'u');
                            case 12358:
                                return pw5.k('u');
                            case 12359:
                                return pw5.d('l', 'e');
                            case 12360:
                                return pw5.k('e');
                            case 12361:
                                return pw5.d('l', 'o');
                            case 12362:
                                return pw5.k('o');
                            case 12363:
                                return pw5.d('k', 'a');
                            case 12364:
                                return pw5.d('g', 'a');
                            case 12365:
                                return pw5.d('k', 'i');
                            case 12366:
                                return pw5.d('g', 'i');
                            case 12367:
                                return pw5.d('k', 'u');
                            case 12368:
                                return pw5.d('g', 'u');
                            case 12369:
                                return pw5.d('k', 'e');
                            case 12370:
                                return pw5.d('g', 'e');
                            case 12371:
                                return pw5.d('k', 'o');
                            case 12372:
                                return pw5.d('g', 'o');
                            case 12373:
                                return pw5.d('s', 'a');
                            case 12374:
                                return pw5.d('z', 'a');
                            case 12375:
                                return pw5.d('s', 'h', 'i');
                            case 12376:
                                return pw5.d('j', 'i');
                            case 12377:
                                return pw5.d('s', 'u');
                            case 12378:
                                return pw5.d('z', 'u');
                            case 12379:
                                return pw5.d('s', 'e');
                            case 12380:
                                return pw5.d('z', 'e');
                            case 12381:
                                return pw5.d('s', 'o');
                            case 12382:
                                return pw5.d('z', 'o');
                            case 12383:
                                return pw5.d('t', 'a');
                            case 12384:
                                return pw5.d('d', 'a');
                            case 12385:
                                return pw5.d('c', 'h', 'i');
                            case 12386:
                                return pw5.d('d', 'i');
                            case 12387:
                                return pw5.d('l', 't', 'u');
                            case 12388:
                                return pw5.d('t', 's', 'u');
                            case 12389:
                                return pw5.d('d', 'u');
                            case 12390:
                                return pw5.d('t', 'e');
                            case 12391:
                                return pw5.d('d', 'e');
                            case 12392:
                                return pw5.d('t', 'o');
                            case 12393:
                                return pw5.d('d', 'o');
                            case 12394:
                                return pw5.d('n', 'a');
                            case 12395:
                                return pw5.d('n', 'i');
                            case 12396:
                                return pw5.d('n', 'u');
                            case 12397:
                                return pw5.d('n', 'e');
                            case 12398:
                                return pw5.d('n', 'o');
                            case 12399:
                                return pw5.d('h', 'a');
                            case 12400:
                                return pw5.d('b', 'a');
                            case 12401:
                                return pw5.d('p', 'a');
                            case 12402:
                                return pw5.d('h', 'i');
                            case 12403:
                                return pw5.d('b', 'i');
                            case 12404:
                                return pw5.d('p', 'i');
                            case 12405:
                                return pw5.d('f', 'u');
                            case 12406:
                                return pw5.d('b', 'u');
                            case 12407:
                                return pw5.d('p', 'u');
                            case 12408:
                                return pw5.d('h', 'e');
                            case 12409:
                                return pw5.d('b', 'e');
                            case 12410:
                                return pw5.d('p', 'e');
                            case 12411:
                                return pw5.d('h', 'o');
                            case 12412:
                                return pw5.d('b', 'o');
                            case 12413:
                                return pw5.d('p', 'o');
                            case 12414:
                                return pw5.d('m', 'a');
                            case 12415:
                                return pw5.d('m', 'i');
                            case 12416:
                                return pw5.d('m', 'u');
                            case 12417:
                                return pw5.d('m', 'e');
                            case 12418:
                                return pw5.d('m', 'o');
                            case 12419:
                                return pw5.d('l', 'y', 'a');
                            case 12420:
                                return pw5.d('y', 'a');
                            case 12421:
                                return pw5.d('l', 'y', 'u');
                            case 12422:
                                return pw5.d('y', 'u');
                            case 12423:
                                return pw5.d('l', 'y', 'o');
                            case 12424:
                                return pw5.d('y', 'o');
                            case 12425:
                                return pw5.d('r', 'a');
                            case 12426:
                                return pw5.d('r', 'i');
                            case 12427:
                                return pw5.d('r', 'u');
                            case 12428:
                                return pw5.d('r', 'e');
                            case 12429:
                                return pw5.d('r', 'o');
                            case 12430:
                                return pw5.d('l', 'w', 'a');
                            case 12431:
                                return pw5.d('w', 'a');
                            default:
                                switch (c) {
                                    case 12434:
                                        return pw5.d('w', 'o');
                                    case 12435:
                                        return pw5.d('n', 'n');
                                    case 12436:
                                        return pw5.d('v', 'u');
                                    default:
                                        switch (c) {
                                            case 12449:
                                                return pw5.d('l', 'a');
                                            case 12450:
                                                return pw5.k('a');
                                            case 12451:
                                                return pw5.d('l', 'i');
                                            case 12452:
                                                return pw5.k('i');
                                            case 12453:
                                                return pw5.d('l', 'u');
                                            case 12454:
                                                return pw5.k('u');
                                            case 12455:
                                                return pw5.d('l', 'e');
                                            case 12456:
                                                return pw5.k('e');
                                            case 12457:
                                                return pw5.d('l', 'o');
                                            case 12458:
                                                return pw5.k('o');
                                            case 12459:
                                                return pw5.d('k', 'a');
                                            case 12460:
                                                return pw5.d('g', 'a');
                                            case 12461:
                                                return pw5.d('k', 'i');
                                            case 12462:
                                                return pw5.d('g', 'i');
                                            case 12463:
                                                return pw5.d('k', 'u');
                                            case 12464:
                                                return pw5.d('g', 'u');
                                            case 12465:
                                                return pw5.d('k', 'e');
                                            case 12466:
                                                return pw5.d('g', 'e');
                                            case 12467:
                                                return pw5.d('k', 'o');
                                            case 12468:
                                                return pw5.d('g', 'o');
                                            case 12469:
                                                return pw5.d('s', 'a');
                                            case 12470:
                                                return pw5.d('z', 'a');
                                            case 12471:
                                                return pw5.d('s', 'h', 'i');
                                            case 12472:
                                                return pw5.d('j', 'i');
                                            case 12473:
                                                return pw5.d('s', 'u');
                                            case 12474:
                                                return pw5.d('z', 'u');
                                            case 12475:
                                                return pw5.d('s', 'e');
                                            case 12476:
                                                return pw5.d('z', 'e');
                                            case 12477:
                                                return pw5.d('s', 'o');
                                            case 12478:
                                                return pw5.d('z', 'o');
                                            case 12479:
                                                return pw5.d('t', 'a');
                                            case 12480:
                                                return pw5.d('d', 'a');
                                            case 12481:
                                                return pw5.d('c', 'h', 'i');
                                            case 12482:
                                                return pw5.d('d', 'i');
                                            case 12483:
                                                return pw5.d('l', 't', 'u');
                                            case 12484:
                                                return pw5.d('t', 's', 'u');
                                            case 12485:
                                                return pw5.d('d', 'u');
                                            case 12486:
                                                return pw5.d('t', 'e');
                                            case 12487:
                                                return pw5.d('d', 'e');
                                            case 12488:
                                                return pw5.d('t', 'o');
                                            case 12489:
                                                return pw5.d('d', 'o');
                                            case 12490:
                                                return pw5.d('n', 'a');
                                            case 12491:
                                                return pw5.d('n', 'i');
                                            case 12492:
                                                return pw5.d('n', 'u');
                                            case 12493:
                                                return pw5.d('n', 'e');
                                            case 12494:
                                                return pw5.d('n', 'o');
                                            case 12495:
                                                return pw5.d('h', 'a');
                                            case 12496:
                                                return pw5.d('b', 'a');
                                            case 12497:
                                                return pw5.d('p', 'a');
                                            case 12498:
                                                return pw5.d('h', 'i');
                                            case 12499:
                                                return pw5.d('b', 'i');
                                            case 12500:
                                                return pw5.d('p', 'i');
                                            case 12501:
                                                return pw5.d('f', 'u');
                                            case 12502:
                                                return pw5.d('b', 'u');
                                            case 12503:
                                                return pw5.d('p', 'u');
                                            case 12504:
                                                return pw5.d('h', 'e');
                                            case 12505:
                                                return pw5.d('b', 'e');
                                            case 12506:
                                                return pw5.d('p', 'e');
                                            case 12507:
                                                return pw5.d('h', 'o');
                                            case 12508:
                                                return pw5.d('b', 'o');
                                            case 12509:
                                                return pw5.d('p', 'o');
                                            case 12510:
                                                return pw5.d('m', 'a');
                                            case 12511:
                                                return pw5.d('m', 'i');
                                            case 12512:
                                                return pw5.d('m', 'u');
                                            case 12513:
                                                return pw5.d('m', 'e');
                                            case 12514:
                                                return pw5.d('m', 'o');
                                            case 12515:
                                                return pw5.d('l', 'y', 'a');
                                            case 12516:
                                                return pw5.d('y', 'a');
                                            case 12517:
                                                return pw5.d('l', 'y', 'u');
                                            case 12518:
                                                return pw5.d('y', 'u');
                                            case 12519:
                                                return pw5.d('l', 'y', 'o');
                                            case 12520:
                                                return pw5.d('y', 'o');
                                            case 12521:
                                                return pw5.d('r', 'a');
                                            case 12522:
                                                return pw5.d('r', 'i');
                                            case 12523:
                                                return pw5.d('r', 'u');
                                            case 12524:
                                                return pw5.d('r', 'e');
                                            case 12525:
                                                return pw5.d('r', 'o');
                                            case 12526:
                                                return pw5.d('l', 'w', 'a');
                                            case 12527:
                                                return pw5.d('w', 'a');
                                            default:
                                                switch (c) {
                                                    case 12530:
                                                        return pw5.d('w', 'o');
                                                    case 12531:
                                                        return pw5.d('n', 'n');
                                                    case 12532:
                                                        return pw5.d('v', 'u');
                                                    case 12533:
                                                        return pw5.d('l', 'k', 'a');
                                                    case 12534:
                                                        return pw5.d('l', 'k', 'e');
                                                    default:
                                                        return null;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public static AutofillValue r(boolean z) {
        return AutofillValue.forToggle(z);
    }

    public static ViewStructure v(ViewStructure viewStructure, int i) {
        return viewStructure.newChild(i);
    }

    public static final g64 x(long j, long j2, long j3, long j4, long j5, nv nvVar, float[] fArr) {
        gh3 gh3VarT = k33.T(nvVar, 2);
        um2 um2VarV = k33.V(nvVar);
        boolean zK = um2VarV.K();
        ah3 ah3Var = um2VarV.M;
        if (!zK) {
            return null;
        }
        if (ah3Var.n == gh3VarT) {
            return new g64(j, j2, j3, j4, j5, nvVar, fArr);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L);
        long j6 = gh3VarT.a;
        gh3 gh3Var = ah3Var.n;
        gh3Var.getClass();
        long jY = k33.Y(gh3Var.C(gh3VarT, jFloatToRawIntBits));
        return new g64(jY, (4294967295L & ((long) (((int) (jY & 4294967295L)) + ((int) (j6 & 4294967295L))))) | (((long) (((int) (jY >> 32)) + ((int) (j6 >> 32)))) << 32), j3, j4, j5, nvVar, fArr);
    }

    public static AutofillValue y(String str) {
        return AutofillValue.forText(py5.y(str));
    }
}
