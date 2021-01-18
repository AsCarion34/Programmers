package hash.solution04;

import java.util.*;

public class Solution {
    class Song implements Comparable<Song> {
        int index;
        int played;
        String genre;

        public Song(int index, int played, String genre) {
            this.index = index;
            this.played = played;
            this.genre = genre;
        }

        @Override
        public int compareTo(Song s) {
            if(this.played == s.played) {
                return this.index - s.index;
            } else {
                return -(this.played - s.played);
            }
        }
    }
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        List<Song> songList = new ArrayList<>();    // 노래 리스트
        Map<String, Integer> genresPlayedMap = new HashMap<>();  // 장르 별 재생 횟수
        Map<String, Integer> albumMap = new HashMap<>();
        List<Integer> bestAlbum = new ArrayList<>();

        for(int i = 0; i < genres.length; i++) {
            songList.add(new Song(i, plays[i], genres[i]));
            genresPlayedMap.put(genres[i], genresPlayedMap.getOrDefault(genres[i], 0) + plays[i]);
        }
        // value 별 내림차순으로 sort.
        Collections.sort(songList, new Comparator<Song>() {
            @Override
            public int compare(Song o1, Song o2) {
                if(o1.genre.equals(o2.genre)) {
                    return o1.compareTo(o2);
                } else {
                    return -(genresPlayedMap.get(o1.genre) - genresPlayedMap.get(o2.genre));
                }
            }
        });

        for(Song song : songList) {
            if(!albumMap.containsKey(song.genre)) {
                albumMap.put(song.genre, 1);
                bestAlbum.add(song.index);
            } else {
                int genreCount = albumMap.get(song.genre);
                if(genreCount >= 2) continue;
                else {
                    albumMap.put(song.genre, genreCount + 1);
                    bestAlbum.add(song.index);
                }
            }
        }

        answer = new int[bestAlbum.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = bestAlbum.get(i);
        }

        return answer;
    }
}
