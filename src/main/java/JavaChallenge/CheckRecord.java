package JavaChallenge;

public class CheckRecord {

    public static void main(String[] args) {

    }

    public static boolean checkRecord(String s) {

//         int absenceCounter = 0;
//         int lateCounter = 0;
//
//         for (int i = 0; i < s.length(); i++) {
//
//             if (s.charAt(i) == 'L'){
//                 lateCounter++;
//                 if (lateCounter == 3) return false;
//             }else{
//                 lateCounter = 0;
//             }
//
//             if (s.charAt(i) == 'A'){
//                 absenceCounter++;
//                  if (absenceCounter == 2) return false;
//             }
//         }
//         return true;

        return s.indexOf("A") == s.lastIndexOf("A") && !s.contains("LLL");


    }

}
