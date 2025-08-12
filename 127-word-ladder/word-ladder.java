class Node{
    String str;
    int steps;
    Node(String str, int steps){
        this.str = str;
        this.steps = steps;
    }
}

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        if (!set.contains(endWord)) return 0;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(beginWord, 1));
        set.remove(beginWord);
        while(!queue.isEmpty()){
            Node newNode = queue.poll();
            String word = newNode.str;
            int steps = newNode.steps;

            for(int i = 0;i<word.length();i++){
                char replacedWord[] = word.toCharArray();
                for(char ch = 'a';ch<='z';ch++){
                    replacedWord[i] = ch;

                    String newStr = new String(replacedWord);
                    
                    if(newStr.equals(endWord)) return steps+1;

                    if(set.contains(newStr)){
                        queue.offer(new Node(newStr, steps+1));
                        set.remove(newStr);
                    }
                }
            }
        }
        return 0;
    }
}
