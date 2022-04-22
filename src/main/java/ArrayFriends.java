import java.util.*;

public class ArrayFriends {
    public static void checkFriends(String[][] friends) {
        /**
         * [0,1]
         * [0,3]
         * [1,2]
         * [3,4]
         * [4,0]
         * [4,1]
         */

        /**
         *
         *   [0]---[1]---[2]
         *   |  \   |
         *   |   \  |
         *   |    \ |
         *   [3]---[4]
         */

        int count = 0;
        for (int i = 0; i < friends.length; i++) {
            for (int j = 0; j < friends[0].length; j++) {
                if (friends[i][j].trim().equals("*") && friends[j][i].trim().equals("*")) {
                    count++;
                }
            }
        }

        System.out.println("pairs of friends : " + count / 2);
    }

    public static boolean findCommon(boolean[][] friends, int i, int j) {
        boolean common = false;
        Map<Integer, List<Integer>> friendsMap = new HashMap<>();
        for (int x = 0; x < friends.length; x++) {
            for (int z = 0; z < friends[0].length; z++) {
                if (friends[x][z]) {
                    List<Integer> list;
                    if (friendsMap.containsKey(x)) {
                        list = friendsMap.get(x);
                    } else {
                        list = new ArrayList<>();
                    }
                    list.add(z);
                    friendsMap.put(x, list);
                }
            }
        }
        List<Integer> iFriends = friendsMap.get(i);
        List<Integer> jFriends = friendsMap.get(j);
        for (Integer friend : iFriends) {
            if (jFriends.contains(friend)) {
                common = true;
            }
        }
        return common;
    }

    public static void random() {
        String[][] friends = new String[5][5];
        for (int i = 0; i < friends.length; i++) {
            for (int j = 0; j < friends[0].length; j++) {
                if(new Random().nextBoolean()){
                    friends[i][j] = "*";
                }else{
                    friends[i][j] = " ";
                }
            }
        }

        for (int i = 0; i < friends.length; i++) {
            for (int j = 0; j < friends[0].length; j++) {
                System.out.print(" "+ friends[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        String[][] friends = {
                /*       0    1    2    3    4 */
                /* 0 */{" ", "*", " ", "*", "*"},
                /* 1 */{"*", " ", "*", " ", "*"},
                /* 2 */{" ", "*", " ", " ", " "},
                /* 3 */{"*", " ", " ", " ", "*"},
                /* 4 */{"*", "*", " ", "*", " "}
        };

        boolean[][] friendsBoolean = {
                /*       0    1    2    3    4 */
                /* 0 */{false, true, false, true, true},
                /* 1 */{true, false, true, false, true},
                /* 2 */{false, true, false, false, false},
                /* 3 */{true, false, false, false, true},
                /* 4 */{true, true, false, true, false}
        };

        checkFriends(friends);
        System.out.println(findCommon(friendsBoolean, 0, 4)); // true
        System.out.println(findCommon(friendsBoolean, 1, 2)); // false
        random();
    }
}