package learn.Collection;

//必须实现Comparable接口才能调用Collections.sort
//可以同时实现Comparator与Comparable
//public static <T> void sort(List<T> list, Comparator<? super T> c)

import java.util.Comparator;
import java.util.Objects;

public class Song implements Comparable<Song> {
    String title;
    String artist;
    String rating;
    String bpm;

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getRating() {
        return rating;
    }

    public String getBpm() {
        return bpm;
    }

    public Song(String title, String artist, String rating, String bpm) {
        this.title = title;
        this.artist = artist;
        this.rating = rating;
        this.bpm = bpm;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", rating='" + rating + '\'' +
                ", bpm='" + bpm + '\'' +
                '}';
    }

    @Override
    public int compareTo(Song o) {
        return title.compareTo(o.getTitle());
    }

 /*自定义判断对象是否相等时，必须同时覆写equals和hashCode方法
 *HashSet判断加入的对象是否已重复时，会先判断hashCode是否相等（引用相等性）
 *若hashCode相等，则会进一步调用equals方法判断对象是否相等（对象相等性）
 *若equals被覆盖过，则hashCode也必须被覆盖
 * hashCode的默认行为是对在堆上的对象产生独特的值
 * equals的默认行为是执行==比较，即测试两个引用是否对应堆上同一个对象
 * 注意String的equals方法会先执行==比较，若不是对同个对象的引用则会进一步比较字符串的字符是否相等！
 * 若equals没有被覆盖过，则两个对象永远无法被视为相同
 * hashcode是用来缩小寻找成本，但最终还是要用equals()来认定对象是否真的相等（哈希碰撞）*/
    @Override
    public boolean equals(Object o) {
        Song song = (Song) o;
        return getTitle().equals(song.getTitle());
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }
}
