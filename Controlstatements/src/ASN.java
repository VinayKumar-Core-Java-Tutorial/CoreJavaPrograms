public class ASN {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 1 || j == 5 || i == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 4; space++)
                System.out.print("  ");
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || i == 1 && j != 5 || i == 3 && j != 5 || i == 5 && j != 5 || i == 2 && j == 5 || i == 4 && j == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 4; space++)
                System.out.print("  ");
            for (int k = 1; k <= 5; k++) {
                if (i == 1 && k != 1 || k == 1 && i != 1 && i != 5 || i == 5 && k != 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int l = 1; l <= 5; l++) {
                if (i == 1 && l != 5 || i == 5 && l != 5 || l == 1 || l == 5 && i != 5 && i != 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int m = 1; m <= 5; m++) {
                if (m == 1 || i == 1 || i == 3 || i == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int n = 1; n <= 5; n++) {
                if (n == 1 || i == 1 || i == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int o = 1; o <= 5; o++) {
                if (i == 1 || o == 1 || i == 5 || i == 3 && o != 2 || i == 4 && o % 5 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int p = 1; p <= 5; p++) {
                if (p == 1 || p == 5 || i == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int q = 1; q <= 5; q++) {
                if (i == 1 || i == 5 || q == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();


        for (int i1 = 1; i1 <= 5; i1++) {
            for (int r = 1; r <= 5; r++) {
                if (i1 == 1 || r == 3 || i1 == 4 && r == 1 || i1 == 5 && r == 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int s = 1; s <= 5; s++) {
                if (s == 1 || i1 == 1 && i1 + s == 5 || i1 == 2 && i1 + s == 5 || i1 == 3 && i1 + s == 5 || i1 == 4 && i1 + s == 7 || i1 == 5 && i1 + s == 9) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int t = 1; t <= 5; t++) {
                if (t == 1 || i1 == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int u = 1; u <= 5; u++) {
                if (u == 1 || i1 == 2 && u % 2 == 0 || u == 5 || i1 == 3 && u % 2 != 0) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int v = 1; v <= 5; v++) {
                if (v == 1 || v == 5 || i1 == v) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int w = 1; w <= 5; w++) {
                if (i1 == 1 && w == 2 || i1 == 1 && w == 3 || i1 == 1 && w == 4 || i1 == 2 && w == 1 || i1 == 2 && w == 5 || i1 == 3 && w == 1 || i1 == 3 && w == 5 ||
                        i1 == 4 && w == 1 || i1 == 4 && w == 5 || i1 == 5 && w == 2 || w == 5 && w == 3 || i1 == 5 && w == 4) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int x = 1; x <= 5; x++) {
                if (x == 1 || i1 == 1 && x != 5 || i1 == 3 && x != 5 || i1 == 2 && x == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int y = 1; y <= 5; y++) {
                if (i1 == 1 && y != 5 || i1 == 4 && y != 5 || y == 1 && i1 != 5 || y == 4 && i1 != 5 || i1 == 3 && y == 3 || i1 == 5 && y == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();


        for (int i2 = 1; i2 <= 5; i2++) {
            for (int z = 1; z <= 5; z++) {
                if (z == 1 || i2 == 1 && z != 5 || i2 == 3 && z != 5 || i2 == 2 && z == 5 || i2 == 4 && z == 3 || i2 == 5 && z == 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int a = 1; a <= 5; a++) {
                if (i2 == 1 && a != 1 || i2 == 3 && a != 1 && a != 5 || i2 == 5 && a != 5 || i2 == 2 && a == 1 || i2 == 4 && a == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int b = 1; b <= 5; b++) {
                if (i2 == 1 || b == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int c = 1; c <= 5; c++) {
                if (c == 1 && i2 != 5 || c == 5 && i2 != 5 || i2 == 5 && c != 1 && c != 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int d = 1; d <= 5; d++) {
                if (i2 == 2 && d == 1 || i2 == 2 && d == 5 || i2 == 3 && d == 2 || i2 == 3 && d == 4 || i2 == 4 && d == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int e = 1; e <= 5; e++) {
                if (e == 1 || e == 5 || i2 == 4 && e == 2 || i2 == 4 && e == 4 || i2 == 3 && e == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int f = 1; f <= 5; f++) {
                if (i2 == 1 && f == 1 || i2 == 1 && f == 5 || i2 == 2 && f == 2 || i2 == 2 && f == 4 || i2 == 3 && f == 3 ||
                        i2 == 4 && f == 2 || i2 == 4 && f == 4 || i2 == 5 && f == 1 || i2 == 5 && f == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int g = 1; g <= 5; g++) {
                if (i2 == 1 && g == 1 || i2 == 1 && g == 5 || i2 == 2 && g == 2 || i2 == 2 && g == 4 || i2 == 3 && g == 3 || i2 == 4 && g == 2 || i2 == 5 && g == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int g = 1; g <= 5; g++) {
                if (i2 == 1 || i2 == 5 || i2 == 2 && g == 4 || i2 == 3 && g == 3 || i2 == 4 && g == 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        for (int i3 = 1; i3 <= 5; i3++) {
            for (int h = 1; h <= 5; h++) {
                if (i3 == 1 && h != 1 && h != 4 && h != 5 || i3 == 2 && h != 2 && h != 3 && h != 5 || i3 == 3 && h != 2 && h != 3 && h != 5 ||
                        i3 == 4 && h != 1 && h != 5 || i3 == 5 && h == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int g = 1; g <= 5; g++) {
                if (g == 1 || i3 == 3 && g != 5 || i3 == 4 && g == 5 || i3 == 5 && g != 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int g = 1; g <= 5; g++) {
                if (i3 == 2 && g != 1 && g != 5 || g == 1 && i3 != 1 && i3 != 2 && i3 != 5 && i3 != 4 || i3 == 4 && g != 1 && g != 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int g = 1; g <= 5; g++) {
                if (g == 4 || i3 == 3 && g != 5 && g != 1 || i3 == 5 && g != 5 && g != 1 || i3 == 4 && g == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int g = 1; g <= 5; g++) {
                if (i3 == 1 && g != 1 && g != 5 || i3 == 3 && g != 5 || i3 == 5 && g != 1 || g == 1 && i3 != 1 && i3 != 5 || i3 == 2 && g == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int g = 1; g <= 5; g++) {
                if (i3 == 1 && g != 1 && g != 6 || g == 2 || i3 == 4 || i3 == 2 && g == 6) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int g = 1; g <= 5; g++) {
                if (i3 == 1 && g != 1 && g != 5 && g != 2 || i3 == 3 && g != 1 && g != 2 || i3 == 5 && g != 1 && g != 5 && g != 2 || i3 == 2 && g == 5 ||
                        i3 == 2 && g == 2 || i3 == 4 && g == 5 || i3 == 3 && g == 5 || i3 == 4 && g == 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int g = 1; g <= 5; g++) {
                if (g == 1 || i3 == 3 && g != 4 && g != 5 || i3 == 4 && g == 3 || i3 == 5 && g == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int g = 1; g <= 5; g++) {
                if (g == 3 && i3 != 2 || i3 == 6 && g != 1 && g != 2 || i3 == 5 && g == 6) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();


        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= 5; b++) {
                if (a == 1 && b == 3 || a == 3 && b == 3 || a == 4 && b == 3 || a == 5 && b == 3 || a == 5 && b == 2 || a == 4 && b == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int b = 1; b <= 5; b++) {
                if (b == 1 || a == 3 && b == 3 || a == 4 && b == 2 || a == 5 && b == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int b = 1; b <= 5; b++) {
                if (b == 3 || a == 5 && b == 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int b = 1; b <= 5; b++) {
                if (a == 2 && b != 3 || a == 3 && b != 2 && b != 4 || a == 4 && b != 2 && b != 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int b = 1; b <= 5; b++) {
                if (b == 1 && a != 1 && a != 2 || a == 2 && b != 5 && b != 1 || b == 5 && a != 1 && a != 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int b = 1; b <= 5; b++) {
                if (a == 1 && b != 1 && b != 5 || a == 2 && b == 1 || a == 2 && b == 5 || a == 3 && b == 1 || a == 3 && b == 5 || a == 4 && b != 1 && b != 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int b = 1; b <= 5; b++) {
                if (b == 1 && a != 1 || a == 2 && b != 4 && b != 5 || a == 4 && b != 4 && b != 5 || a == 3 && b == 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int b = 1; b <= 5; b++) {
                if (a == 2 && b == 2 || a == 2 && b == 3 || a == 3 && b == 1 || a == 4 && b == 2 || a == 4 && b == 3 || a == 3 && b == 4 ||
                        a == 3 && b == 3 || a == 5 && b == 5 || a == 4 && b == 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int b = 1; b <= 5; b++) {
                if (a == 1 && b != 2 && b != 3 && b != 4 || a == 2 && b == 2 || a == 2 && b == 4 ||
                        a == 3 && b == 3 || a == 4 && b == 2 || a == 4 && b == 4 || a == 5 && b != 1 && b != 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();


        for (int a = 1; a <= 5; a++) {

            for (int b = 1; b <= 5; b++) {
                if (a == 1 && b != 1 && b != 2 & b != 5 || a == 2 && b == 2 || a == 3 && b == 3 || a == 3 && b == 4 ||
                        a == 4 && b == 5 || a == 5 && b == 3 || a == 5 && b == 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int b = 1; b <= 5; b++) {
                if (b == 3 && a != 5 || a == 3 || a == 5 && b == 4 || a == 5 && b == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int b = 1; b <= 5; b++) {
                if (a == 2 && b == 2 || a == 2 && b == 5 || a == 3 && b == 2 || a == 3 && b == 5 || a == 4 && b == 3 || a == 4 && b == 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int b = 1; b <= 5; b++) {
                if (a == 2 && b == 1 || a == 2 && b == 5 || a == 3 && b == 2 || a == 3 && b == 4 || a == 4 && b == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int b = 1; b <= 5; b++) {
                if (b == 1 && a != 4 && a != 5 || b == 5 && a != 4 && a != 5 || a == 3 && b == 3 || a == 4 && b == 2 || a == 4 && b == 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int b = 1; b <= 5; b++) {
                if (a == 2 && b == 2 || a == 2 && b == 4 || b == 3 && a != 1 && a != 2 && a != 5 || a == 5 && b == 2 || a == 5 && b == 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int b = 1; b <= 5; b++) {
                if (a == 1 && b == 2 || a == 1 && b == 4 || a == 2 && b == 2 || a == 2 && b == 4 || a == 3 && b == 3 ||
                        a == 4 && b == 4 || a == 3 && b == 4 || a == 5 && b == 4 || a == 5 && b == 3 || a == 4 && b == 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int b = 1; b <= 5; b++) {
                if (a == 2 && b != 1 || a == 3 && b == 4 || a == 4 && b == 3 || a == 5 && b != 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();


        for (int e = 1; e <= 5; e++) {
            for (int r = 1; r <= 5; r++) {
                if (e == 1 && r == 2 || e == 1 && r == 3 || e == 1 && r == 4 || e == 2 && r == 1 || e == 2 && r == 5 || e == 3 && r == 1 || e == 3 && r == 5 ||
                        e == 4 && r == 1 || e == 4 && r == 5 || e == 5 && r == 2 || e == 5 && r == 3 || e == 5 && r == 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int r = 1; r <= 5; r++) {
                if (r == 3 || e == 2 && r == 2 || e == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int r = 1; r <= 5; r++) {
                if (e == 1 && r == 2 || e == 1 && r == 3 || e == 2 && r == 1 || e == 2 && r == 4 ||
                        e == 3 && r == 4 || e == 4 && r == 3 || e == 5 && r == 2 || e == 5 && r == 4 || e == 5 && r == 5 || e == 5 && r == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int r = 1; r <= 5; r++) {
                if (e == 1 && r == 2 || e == 1 && r == 3 || e == 1 && r == 1 || e == 2 && r == 4 || e == 3 && r == 3 ||
                        e == 4 && r == 4 || e == 5 && r == 2 || e == 5 && r == 3 || e == 5 && r == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int r = 1; r <= 5; r++) {
                if (r == 1 && e != 5 || e == 4 && r != 5 || e == 3 && r == 3 || e == 5 && r == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int r = 1; r <= 5; r++) {
                if (e == 1 && r != 1 && r != 5 || e == 2 && r == 2 || e == 3 && r != 1 && r != 5 || e == 4 && r == 5 || e == 5 && r != 1 && r != 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int e = 1; e <= 5; e++) {
            for (int r = 1; r <= 5; r++) {
                if (e == 1 && r != 1 && r != 5 && r != 2 || r == 2 && e != 5 && e != 1 || e == 5 && r == 3 || e == 5 && r == 4 ||
                        e == 4 && r == 5 || e == 3 && r != 1 && r != 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int r = 1; r <= 5; r++) {
                if (e == 1 && r != 5 || r == 4 || e == 3 && r != 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int r = 1; r <= 5; r++) {
                if (e == 1 && r != 1 && r != 5 || e == 2 && r != 1 && r != 3 && r != 5 || e == 3 && r == 3 ||
                        e == 4 && r != 1 && r != 3 && r != 5 || e == 5 && r != 1 && r != 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int r = 1; r <= 5; r++) {
                if (r == 4 || e == 1 && r == 3 || e == 2 && r == 1 || e == 3 && r == 3 || e == 1 && r == 2 || e == 3 && r == 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 1; space <= 5; space++)
                System.out.print("  ");
            for (int r = 1; r <= 5; r++) {
                if (r == 1 && e != 5 || e == 1 && r == 4 || e == 2 && r != 2 && r != 4 || e == 3 && r != 2 && r != 4 || e == 4 && r == 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}





