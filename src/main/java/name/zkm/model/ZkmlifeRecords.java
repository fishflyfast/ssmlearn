package name.zkm.model;

import java.io.Serializable;
import java.util.Date;

public class ZkmlifeRecords implements Serializable {

    private String noteid;
    private String noteDescription;
    private Date noteRecordTime;
    private String noteNote;
    private Date createTime;
    private Date updateTime;
    private String createPerson;
    private String updatePerson;
    private String isvalidate;
    private String noteState;
    private String notePartyid;

    public String getNoteid() {
        return noteid;
    }

    public void setNoteid(String noteid) {
        this.noteid = noteid;
    }

    public String getNoteDescription() {
        return noteDescription;
    }

    public void setNoteDescription(String noteDescription) {
        this.noteDescription = noteDescription;
    }

    public Date getNoteRecordTime() {
        return noteRecordTime;
    }

    public void setNoteRecordTime(Date noteRecordTime) {
        this.noteRecordTime = noteRecordTime;
    }

    public String getNoteNote() {
        return noteNote;
    }

    public void setNoteNote(String noteNote) {
        this.noteNote = noteNote;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    public String getUpdatePerson() {
        return updatePerson;
    }

    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson;
    }

    public String getIsvalidate() {
        return isvalidate;
    }

    public void setIsvalidate(String isvalidate) {
        this.isvalidate = isvalidate;
    }

    public String getNoteState() {
        return noteState;
    }

    public void setNoteState(String noteState) {
        this.noteState = noteState;
    }

    public String getNotePartyid() {
        return notePartyid;
    }

    public void setNotePartyid(String notePartyid) {
        this.notePartyid = notePartyid;
    }

    @Override
    public String toString() {
        return "ZkmlifeRecords{" +
                "noteid='" + noteid + '\'' +
                ", noteDescription='" + noteDescription + '\'' +
                ", noteRecordTime=" + noteRecordTime +
                ", noteNote='" + noteNote + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", createPerson='" + createPerson + '\'' +
                ", updatePerson='" + updatePerson + '\'' +
                ", isvalidate='" + isvalidate + '\'' +
                ", noteState='" + noteState + '\'' +
                ", notePartyid='" + notePartyid + '\'' +
                '}';
    }
}
