package shikamic.shikamic_toppitchforkartistslist;

/**
 * Created by Chris Shikami on 11/03/2016.
 */

public class Artist {

    enum Genre { Rock, Rap, Pop, Electronic, Experimental }
    enum AlbumCover{ Leonard, Weyes, NxWorries, Solange, Jenny, Danny, Bon, Nicolas, Hamilton, Kaitlyn, Nick, Angel, Young, Frank}

    String albumName;
    AlbumCover albumCover;
    String artistName;
    Genre genre;
    String reviewerName;
    String date;
    String shortDescription;
    String longDescription;

    public Artist(String artistName, AlbumCover albumCover, String albumName, Genre genre, String reviewerName, String date, String shortDescription, String longDescription) {
        this.artistName = artistName;
        this.albumCover = albumCover;
        this.albumName = albumName;
        this.genre = genre;
        this.reviewerName = reviewerName;
        this.date = date;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public String getArtistName() { return artistName; }

    public void setArtistName(String artistName) { this.artistName = artistName; }

    public String getAlbumName() { return albumName; }

    public void setAlbumName(String albumName) { this.albumName = albumName; }

    public AlbumCover getAlbumCover() { return albumCover; }

    public void setAlbumName(AlbumCover albumCover) { this.albumCover = albumCover; }

    public static String getGenreResource(Genre genre) {
        switch(genre) {
            case Rock: return "Rock";
            case Rap: return "Rap";
            case Pop: return "Pop";
            case Electronic: return "Electronic";
            case Experimental: return "Experimental";
        }
        return null;
    }


    public Genre getGenre() { return genre; }

    public void setGenre(Genre genre) { this.genre = genre;}

    public String getReviewerName () { return reviewerName; }

    public void setReviewerName (String reviewerName) { this.reviewerName = reviewerName; }

    public String getDate() { return date; }

    public void setDate(String date) { this.date = date; }

    public String getShortDescription() { return shortDescription; }

    public void setShortDescription(String shortDescription) { this.shortDescription = shortDescription; }

    public String getLongDescription() { return longDescription; }

    public void setLongDescription(String longDescription) { this.longDescription = longDescription; }

    public String toString() {return artistName;}

    public static int getIconResource(AlbumCover albumCover) {
        switch (albumCover) {
            case Leonard: return R.drawable.leonard;
            case Weyes: return R.drawable.weyes;
            case NxWorries: return R.drawable.nxworries;
            case Solange: return R.drawable.solange;
            case Jenny: return R.drawable.jenny;
            case Danny: return R.drawable.danny;
            case Bon: return R.drawable.bon;
            case Nicolas: return R.drawable.nicolas;
            case Hamilton: return R.drawable.hamilton;
            case Kaitlyn: return R.drawable.kaitlyn;
            case Nick: return R.drawable.nick;
            case Angel: return R.drawable.angel;
            case Young: return R.drawable.young;
            case Frank: return R.drawable.frank;
        }
        return -1;
    }


}