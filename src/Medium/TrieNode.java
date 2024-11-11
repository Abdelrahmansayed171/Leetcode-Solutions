package Medium;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    public Map<Character, TrieNode> children;
    public boolean fullWord;
    TrieNode(){
        children = new HashMap<>();
        fullWord = false;
    }
}
