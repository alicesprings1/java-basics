package learn.Collection;

import java.util.*;

public class JukeBox1 {
    public static void main(String[] args) {
        new JukeBox1().go();
    }
    public void go(){
        ArrayList<Song> songList=new ArrayList<>();
        songList.add(new Song("aaa","alice","good","123"));
        songList.add(new Song("ccc","bob","excellent","33"));
        songList.add(new Song("bb","candy","nice","324"));
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
        // 重载版sort，传入自定义的comparator覆盖默认的比较方法
        ArtistCompare artistCompare = new ArtistCompare();
        Collections.sort(songList,artistCompare);
        System.out.println(songList);
        HashSet<Song> songSet = new HashSet<>();
        songSet.addAll(songList);
        System.out.println(songSet);
        /*treeSet的作用：
        * 防止元素重复
        * 使用对象的compareTo()方法保持集合有序（也可以选择传入Comparator给TreeSet的构造函数）*/
        TreeSet<Song> songTreeSet = new TreeSet<>();
        songTreeSet.addAll(songList);
        System.out.println(songTreeSet);
    }
    class ArtistCompare implements Comparator<Song>{
        @Override
        public int compare(Song o1, Song o2) {
            return o1.getArtist().compareTo(o2.getArtist());
        }
    }
}
