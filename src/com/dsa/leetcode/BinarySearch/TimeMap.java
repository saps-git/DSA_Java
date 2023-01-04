package com.dsa.leetcode.BinarySearch;

//Leetcode-981

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TimeMap {
    static class Pair {
        String val;
        int time;

        Pair(String val, int time) {
            this.val = val;
            this.time = time;
        }
    }

    HashMap<String, List<Pair>> map;
    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(new Pair(value, timestamp));
    }

    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        List<Pair> list = map.get(key);
        return search(list, key, timestamp);
    }

    public String search(List<Pair> list, String key, int timestamp) {
        int low = 0;
        int high = list.size()-1;
        String ans = "";
        while(low <= high) {
            int mid = low + (high - low)/2;
            Pair pair = list.get(mid);
            if(pair.time == timestamp) return pair.val;
            else if(pair.time < timestamp) {
                ans = pair.val;
                low = mid+1;
            }
            else high = mid-1;
        }
        return ans;
    }

    public static void main(String[] args) {
        TimeMap obj = new TimeMap();
        obj.set("foo", "bar", 1);
        String param_2 = obj.get("foo", 1);
        System.out.println(param_2);
        String param_3 = obj.get("foo", 3);
        System.out.println(param_3);
        obj.set("foo", "bar2", 4);
        String param_4 = obj.get("foo", 4);
        System.out.println(param_4);
        String param_5 = obj.get("foo", 5);
        System.out.println(param_5);
    }
}
