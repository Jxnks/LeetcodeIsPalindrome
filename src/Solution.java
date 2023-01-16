

class Solution {
    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        StringBuilder numberBackwards = new StringBuilder();


        for (int i = number.length(); i > 0; i--) {
            numberBackwards.append(number.charAt(i - 1));
        }
        //System.out.println("Number initially is: " + number);          // testing to see outcome
        //System.out.println("Number backwards is: " + numberBackwards);

        return number.equals(numberBackwards.toString());


    }

}