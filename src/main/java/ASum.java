/**
 * Your task is to construct a building which will be a pile of n cubes.
 * The cube at the bottom will have a volume of n^3, the cube above will have volume of (n-1)^3 and so on
 * until the top which will have a volume of 1^3.
 * <p>
 * You are given the total volume m of the building.
 * Being given m can you find the number n of cubes you will have to build?
 * <p>
 * The parameter of the function findNb (find_nb, find-nb, findNb, ...) will be an integer m
 * and you have to return the integer n such as n^3 + (n-1)^3 + ... + 1^3 = m if such a n exists or -1 if there is no such n.
 * <p>
 * Examples:
 * findNb(1071225) --> 45
 * findNb(91716553919377) --> -1
 * n -> number of cubes
 * m -> volume of the building
 * volume of a cube = side ^ 3
 * return the number of cubes required to create the building of volume m
 */

public class ASum {
    public static void main(String[] args) {
        System.out.println(findNb(2304422822859502500L));
//        System.out.println((long) Math.pow(1, 3));
    }

    public static long findNb(long m) {
        long n = 1;
        var volumeOfTopMostCube = (long) Math.pow(n, 3);
        var remainderVolume = m - volumeOfTopMostCube;

        for (int i = 0; i < remainderVolume; i++) {
            n++;
            volumeOfTopMostCube = volumeOfTopMostCube + (long) Math.pow(n, 3);
            remainderVolume = m - volumeOfTopMostCube;
        }
        if (remainderVolume != 0) {
            return -1;
        }

        return n;
    }

}
