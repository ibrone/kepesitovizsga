package hu.nive.ujratervezes.kepesitovizsga.addigits;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AddDigits {



   int addDigits(String addDigits) {
       Map<Integer, Integer> numbers = new HashMap<>();
       char[] readedCharacters= addDigits.toCharArray();
//    if (numbers.size()< 1){
//        return Integer.parseInt(addDigits = "-1");
//    }
//    else
//       try {
//           char[] readedCharacters= addDigits.toCharArray();

           for (int i =0;i<readedCharacters.length;i++){
               int sum = 0;
               int[] intArray = Arrays.stream(addDigits.split(""))
                   .mapToInt(Integer::parseInt)
                   .toArray();
               sum =    sum + intArray[i];

//           for (int i = 1; i < intArray.length; i++) {
//               if (numbers.containsKey(intArray[i-1])) {
//                   for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
//                       if (entry.getValue().equals(intArray[i])) {
//                           entry.setValue(entry.getValue() + 1);
//                       }
//                   }
//               } else {
//                   if (intArray[i - 1] == intArray[i]) {
//                       numbers.put(intArray[i], 1);
//                   }
return sum;
               }


       return 0;
   }
       }

//catch
//
//   }


