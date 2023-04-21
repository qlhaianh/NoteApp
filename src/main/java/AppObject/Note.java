package AppObject;

import java.util.Date;

public class Note {
    private int note_id;
    private String note_title;
    private String note_body;
    private Date created_at;
    private Date updated_at;
    private boolean liked;

    public int getNote_id() {
        return note_id;
    }

    public String getNote_title() {
        return note_title;
    }

    public void setNote_title(String note_title) {
        this.note_title = note_title;
    }

    public String getNote_body() {
        return note_body;
    }

    public void setNote_body(String note_body) {
        this.note_body = note_body;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }
}

