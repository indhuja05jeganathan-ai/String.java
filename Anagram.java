public class Anagram {
//     public static void main(String[] args) {

//         String st = "tea";
//         String st2 = "eat";

//         if (st.length() != st2.length()) {
//             System.out.println("Not Anagram");
//             return;
//         }

//         for (int i = 0; i < st.length(); i++) {

//             char ch = st.charAt(i);
//             int index = st2.indexOf(ch);

//             if (index == -1) {
//                 System.out.println("Not Anagram");
//                 return;
//             }

//             st2 = st2.substring(0, index) + st2.substring(index + 1);
//         }

//         System.out.println("Anagram");
//     }
// }
