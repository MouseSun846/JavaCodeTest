package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Twitter {
    private List<HashMap<Integer,Integer>> map_twitter;
    private HashMap<Integer,List<Integer>> mapFollow_twitter;
    /** Initialize your data structure here. */
    public Twitter() {
        map_twitter = new ArrayList<>();
        mapFollow_twitter = new HashMap<>();
    }

    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        //如果所有的推文
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(userId,tweetId);
        map_twitter.add(0,map);
    }

    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> result = new ArrayList<>();
        List<Integer> user = mapFollow_twitter.get(userId);
        if(user == null){
            user = new ArrayList<>();
        }
        user.add(userId);
        for (HashMap<Integer, Integer> res:map_twitter){
            int keys = 0;
            for (int key:res.keySet()) {
                keys = key;
            }
            if (user.contains(keys))
            {
                if (result.size()<10){
                    result.add(res.get(keys));
                }else {
                    return result;
                }
            }
        }
        return result;
    }

    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
        //如果不存在用户
        if (!mapFollow_twitter.containsKey(followerId)){
//            创建用户对象
            List<Integer> user = new ArrayList<>();
            user.add(followeeId);
            mapFollow_twitter.put(followerId,user);
        }else {
            //用户存在,添加推文
            mapFollow_twitter.get(followerId).add(followeeId);
        }
    }

    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        if (mapFollow_twitter.containsKey(followerId)){
            List<Integer> res = mapFollow_twitter.get(followerId);
            if (res.contains(followeeId)){
                res.remove((Object)followeeId);
            }
        }
    }
}




