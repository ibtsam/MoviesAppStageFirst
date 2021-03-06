package islo.hawk.moviesappstage1.database;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "movie_table")
public class Movie implements Parcelable {


    @PrimaryKey(autoGenerate = true)
    private int id;
    private String movieTitle;
    private String releaseDate;
    private String voteAverage;
    private String overview;
    private String backdropImage;
    private String posterImage;

    public int getId() {
        return id;
    }

    protected Movie(Parcel in) {
        id = in.readInt();
        movieTitle = in.readString();
        releaseDate = in.readString();
        voteAverage = in.readString();
        overview = in.readString();
        backdropImage = in.readString();
        posterImage = in.readString();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    public String getPosterImage() {
        return posterImage;
    }

    public void setPosterImage(String posterImage) {
        this.posterImage = posterImage;
    }

    public Movie(int id,String movieTitle, String releaseDate, String voteAverage, String overview, String backdropImage, String posterImage) {
        this.id = id;
        this.movieTitle = movieTitle;
        this.releaseDate = releaseDate;
        this.voteAverage = voteAverage;
        this.overview = overview;
        this.backdropImage = backdropImage;
        this.posterImage = posterImage;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(String voteAverage) {
        this.voteAverage = voteAverage;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getBackdropImage() {
        return backdropImage;
    }

    public void setBackdropImage(String backdropImage) {
        this.backdropImage = backdropImage;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
       dest.writeInt(id);
        dest.writeString(movieTitle);
        dest.writeString(releaseDate);
        dest.writeString(voteAverage);
        dest.writeString(overview);
        dest.writeString(backdropImage);
        dest.writeString(posterImage);
    }
}
