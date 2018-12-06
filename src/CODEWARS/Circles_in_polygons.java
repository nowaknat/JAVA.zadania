package CODEWARS;
//strictfp class TrigFun {
    public class Circles_in_polygons {
        public static int średnica(int ilośćBoków, int długośćBoku) {
            double rads, coTanA, S, obwód, promień;
            rads = 2 * 3.14 / ilośćBoków;
            coTanA = 1.0 / Math.tan(rads);
            S = 0.25 * ilośćBoków * długośćBoku * długośćBoku * coTanA;
            obwód = ilośćBoków * długośćBoku;
            promień = 2 * S / obwód;
            System.out.println(promień);
            System.out.println(Math.tan(rads));
            return 0;
        }
    }
