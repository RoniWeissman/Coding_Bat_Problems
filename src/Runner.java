public class Runner {

    //your main containing tests and output
    public static void main(String[] args) {
        int[] x = {1, 2, 2, 3, 4, 4};
        int[] y = {1, 1, 2, 1, 1};
        int[] z = {1, 1, 1, 1, 1};

        System.out.println(countClumps(x));
        System.out.println(countClumps(y));
        System.out.println(countClumps(z));

    }

    public static String helloName(String name) {
        return "hi " + name;
    }

    // Warm Up 1
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(vacation) {
            return true;
        } else {
            if(weekday) {
                return false;
            } else {
                return true;
            }
        }
    }

    //warm up 2
    public static String stringTimes(String str, int n) {
        String repeat = "";
        for(int i=0; i < n; i++) {
            repeat += str;
        }
        return repeat;
    }

    //String-1
    public static String name(String firstName) {
        return "Hello " + firstName + "!";
    }

    //Array-1
    public static boolean firstLast6(int[] nums) {
        if(nums[0] == 6 || nums[nums.length] == 6) {
            return true;
        } else {
                return false;
        }
    }

    //logic-1
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        int ticket = 0;
        if(isBirthday) {
            if(speed <= 65) {
                ticket = 0;
            }
            if(speed > 65 && speed <= 85) {
                ticket = 1;
            }
            if(speed > 85) {
                ticket = 2;
            }
        } else {
            if(speed <= 60) {
                ticket = 0;
            }
            if(speed > 60 && speed <= 80) {
                ticket = 1;
            }
            if(speed > 80) {
                ticket = 2;
            }
        }
        return ticket;
    }

    //Logic-2
    public static int loneSum(int a, int b, int c) {
        int total = 0;
        if(a == b && b == c) {
            total = a;
        } else {
            if(a != b && b != c) {
                total = a + b + c;
            }
            if(a == b) {
                total = a + c;
            }
            if (a == c || b == c) {
                total = a + b;
            }
        }
        return total;
    }

    //String-2
    public static int countHi(String str) {
        int total = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'h') {
                if(str.charAt(i + 1) == 'i') {
                    total += 1;
                }
            }
        }
        return total;
    }


    //String-3
    public static boolean gHappy(String str) {
        int totalG = 0;
        int totalHappy = 0;
        for(int i = 0; i < str.length(); i ++) {
            if(str.charAt(i) == 'g') {
                totalG += 1;
                if(str.charAt(i + 1) == 'g' || str.charAt(i - 1) == 'g') {
                    totalHappy += 1;
                }
            }
        }
        if(totalHappy == totalG) {
            return true;
        } else {
            return false;
        }
    }

    //Array-2
    public static int countEvens(int[] nums) {
        int totalEven = 0;
        for(int i = 0; i < nums.length; i ++) {
            if(nums[i] % 2 == 0) {
                totalEven += 1;
            }
        }
        return totalEven;
    }

    //Array-3
    public static int countClumps(int[] nums) {
        boolean match = false;
        int count = 0;
        for(int i = 0; i < nums.length - 1; i++ ) {
        if(nums[i] == nums [i + 1] && !match) {
            match = true;
            count++;
        }
        else if(nums[i] != nums[i + 1]) {
            match = false;
        }
        }
        return count;
    }
    }



