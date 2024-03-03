package Java8;

public class EpamManagerialRound {
    public static void main(String[] args) {
        findFirstBadVersion(10);
    }

    public static int findFirstBadVersion(int n) {
        return checkFirstBadVersion(15, 100);
    }
    private static int checkFirstBadVersion(int first, int last) {
        if(last-first<=1){
            System.out.println(last);
            return last;
        }
        int mid = first + (last - first) / 2;
        if (isBadVersion(mid)) {
            checkFirstBadVersion(first, mid);
        }else {
            checkFirstBadVersion(mid,last);
        }
        return last;
    }
//    private static int checkFirstBadVersions(int first, int last, int res) {
//        int mid = (first + last) / 2;
//        if (isBadVersion(mid)) {
////            res=mid;
//            checkFirstBadVersion(first, mid, res);
//        } else {
//            if ((last - mid) <= 1) {
//                res = last;
//                return res;
//            }
//            checkFirstBadVersion(mid, last, res);
//        }
//        return res;
//    }

    public static boolean isBadVersion(int id) {
        return (id >= 15);
    }
}
//    The latest version of a software product fails the quality check. Since each version is developed upon the previous one, all the versions created after a bad version are also considered bad.
//    Suppose you have n versions with the IDs [1,2,...,n]
//        and you have access to an API function that returns TRUE if the argument is the ID of a bad version.
//
//        Find the first bad version that is causing all the later ones to be bad.
// n
//50 - it is bad  1,50
// 25 -bad