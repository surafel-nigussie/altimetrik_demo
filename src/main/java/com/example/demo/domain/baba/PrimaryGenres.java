package com.example.demo.domain.baba;

import java.util.ArrayList;
import java.util.List;

public class PrimaryGenres {
    private MusicGenreList music_genre_list;

    public static class MusicGenreList {
        private List<MusicGenre> musicGenre  = new ArrayList<>();


    }

    public static class MusicGenre {
        private Integer musicGenreId;
        private Integer musicGenreParentId;
        private String musicGenreName;
        private String musicGenreNameExtended;
        private String musicGenreVanity;

        public Integer getMusicGenreId() {
            return musicGenreId;
        }

        public void setMusicGenreId(Integer musicGenreId) {
            this.musicGenreId = musicGenreId;
        }

        public Integer getMusicGenreParentId() {
            return musicGenreParentId;
        }

        public void setMusicGenreParentId(Integer musicGenreParentId) {
            this.musicGenreParentId = musicGenreParentId;
        }

        public String getMusicGenreName() {
            return musicGenreName;
        }

        public void setMusicGenreName(String musicGenreName) {
            this.musicGenreName = musicGenreName;
        }

        public String getMusicGenreNameExtended() {
            return musicGenreNameExtended;
        }

        public void setMusicGenreNameExtended(String musicGenreNameExtended) {
            this.musicGenreNameExtended = musicGenreNameExtended;
        }

        public String getMusicGenreVanity() {
            return musicGenreVanity;
        }

        public void setMusicGenreVanity(String musicGenreVanity) {
            this.musicGenreVanity = musicGenreVanity;
        }
    }


}
